package com.p314xaae8f345.mm.p2617xca9a2a67;

/* renamed from: com.tencent.mm.splash.SplashActivity */
/* loaded from: classes12.dex */
public class ActivityC21042xd7c5f6b6 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f275160h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Intent f275161d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275162e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f275163f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f275164g = false;

    public final void K6() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "Call requestPermissions.", new java.lang.Object[0]);
        ((com.p314xaae8f345.mm.p815xbe0af3c9.app.n0) com.p314xaae8f345.mm.p2617xca9a2a67.j.f275179e).f150043a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "ingore check permission on init");
        M6();
    }

    public void L6() {
        com.p314xaae8f345.mm.p2617xca9a2a67.d dVar = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275179e;
        if (dVar == null) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new java.lang.Object[0]);
            M6();
            return;
        }
        com.p314xaae8f345.mm.p2617xca9a2a67.k kVar = new com.p314xaae8f345.mm.p2617xca9a2a67.k(this);
        com.p314xaae8f345.mm.p815xbe0af3c9.app.n0 n0Var = (com.p314xaae8f345.mm.p815xbe0af3c9.app.n0) dVar;
        n0Var.getClass();
        if (((!gm0.j1.b().n() && c01.b9.f118602c.a("login_user_name", "").equals("")) && com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j) ? com.p314xaae8f345.mm.ui.vb.j(this, new com.p314xaae8f345.mm.p815xbe0af3c9.app.m0(n0Var, kVar)) : false) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "Waiting for GPRS permission permit.", new java.lang.Object[0]);
        } else {
            K6();
        }
    }

    public final void M6() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "Call splashFinished.", new java.lang.Object[0]);
        if (this.f275164g) {
            return;
        }
        this.f275164g = true;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "this.isFinishing() = %s.", java.lang.Boolean.valueOf(isFinishing()));
        if (isFinishing()) {
            onBackPressed();
        } else {
            if (l75.d1.f398478a) {
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI"));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            if (this.f275163f) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(this, this.f275162e);
                intent2.setAction(this.f275161d.getAction());
                intent2.putExtras(this.f275161d);
                intent2.setClipData(this.f275161d.getClipData());
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "mReplayRealActivity %s, mReplayIntent.getFlags() %x", this.f275162e, java.lang.Integer.valueOf(this.f275161d.getFlags()));
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    intent2.setIdentifier(this.f275161d.getIdentifier());
                }
                intent2.setSourceBounds(this.f275161d.getSourceBounds());
                intent2.setPackage(this.f275161d.getPackage());
                intent2.setDataAndType(this.f275161d.getData(), this.f275161d.getType());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559431em, com.p314xaae8f345.mm.R.C30854x2dc211.f559432en);
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p2617xca9a2a67.l(this), 300L);
            } else {
                setResult(-100);
                int intExtra = getIntent().getIntExtra("hashcode", 0);
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "target hashcode = %s.", java.lang.Integer.valueOf(intExtra));
                java.util.Iterator it = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275175a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2617xca9a2a67.ActivityC21044x3dec3d77 activityC21044x3dec3d77 = (com.p314xaae8f345.mm.p2617xca9a2a67.ActivityC21044x3dec3d77) it.next();
                    int hashCode = activityC21044x3dec3d77.hashCode();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = java.lang.Integer.valueOf(hashCode);
                    objArr[1] = java.lang.Boolean.valueOf(intExtra == hashCode);
                    com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "compare hashcode = %s, result: %s.", objArr);
                    if (intExtra == hashCode) {
                        com.p314xaae8f345.mm.p2617xca9a2a67.j.h(activityC21044x3dec3d77);
                        break;
                    }
                }
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p2617xca9a2a67.m(this), 50L);
            }
        }
        new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p2617xca9a2a67.n(this), 5000L);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        km0.c cVar;
        super.onCreate(bundle);
        ((java.util.HashSet) com.p314xaae8f345.mm.p2617xca9a2a67.j.f275182h).add(this);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "onCreate", new java.lang.Object[0]);
        this.f275161d = (android.content.Intent) getIntent().getParcelableExtra("replay_intent");
        this.f275162e = getIntent().getStringExtra("real_activity");
        this.f275163f = this.f275161d != null;
        if (!com.p314xaae8f345.mm.p2617xca9a2a67.j.f275183i) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "no need splash, finish", new java.lang.Object[0]);
            L6();
        }
        if (com.p314xaae8f345.mm.p2617xca9a2a67.j.f275188n == null || (cVar = com.p314xaae8f345.mm.p815xbe0af3c9.app.C10819x6f435d6d.f150018a) == null || !cVar.a() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.l()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.t();
        com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.m83866x8d670feb();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((java.util.HashSet) com.p314xaae8f345.mm.p2617xca9a2a67.j.f275182h).remove(this);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "onDestroy", new java.lang.Object[0]);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "onPause", new java.lang.Object[0]);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p2617xca9a2a67.d dVar = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275179e;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p815xbe0af3c9.app.n0) dVar).f150043a.a(this, i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashActivity", "onResume", new java.lang.Object[0]);
    }
}
