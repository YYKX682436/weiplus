package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.MMBaseActivity */
/* loaded from: classes14.dex */
public class ActivityC21397xf0b6eac0 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278420d;

    @Override // android.app.Activity
    public android.content.Intent getIntent() {
        android.content.Intent intent = super.getIntent();
        if (intent != null) {
            lk5.d.f400556a.f(intent);
        }
        return intent;
    }

    /* renamed from: getOriginalResources */
    public final android.content.res.Resources m78617x1800569e() {
        return super.getResources();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return tp.a.a(super.getWindowManager());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBaseActivity", th6.getMessage());
        }
        return super.getWindowManager();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.f278420d = true;
        super.onPause();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f278420d = false;
        super.onResume();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.d.a(this, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBaseActivity", "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", java.lang.Integer.valueOf(i17), this);
            return;
        }
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBaseActivity", th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        super.startActivity(intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.ui.b2.a(this, this.f278420d, intentArr, bundle)) {
            return;
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.ui.b2.a(this, this.f278420d, new android.content.Intent[]{intent}, java.lang.Integer.valueOf(i17), bundle)) {
            return;
        }
        if (intent != null) {
            lk5.d.f400556a.g(intent);
        }
        super.startActivityForResult(intent, i17, bundle);
    }
}
