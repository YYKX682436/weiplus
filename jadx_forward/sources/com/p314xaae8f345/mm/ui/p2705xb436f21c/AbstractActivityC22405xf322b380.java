package com.p314xaae8f345.mm.ui.p2705xb436f21c;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "Landroid/app/Activity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.fluent.ViewFluentTransparentActivity */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC22405xf322b380 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f290142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f290143e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f290144f = new ug5.y(this);

    /* renamed from: g, reason: collision with root package name */
    public final ug5.z f290145g = new ug5.z(this);

    public abstract boolean K6(android.app.Activity activity);

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        java.lang.ref.WeakReference weakReference = this.f290143e;
        ug5.v vVar = weakReference != null ? (ug5.v) weakReference.get() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBackPressed isNeedFinishWhenResume: ");
        sb6.append(this.f290142d);
        sb6.append(" isCompleted: ");
        sb6.append(vVar != null ? java.lang.Boolean.valueOf(vVar.f509195e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", sb6.toString());
        if (this.f290142d) {
            return;
        }
        boolean z17 = false;
        if (vVar != null && !vVar.f509195e) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "[onConfigurationChanged] orientation=" + newConfig.orientation);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(0, 0);
        android.view.Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1024);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        super.onCreate(bundle);
        android.view.Window window2 = getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window2, "getWindow(...)");
        ug5.x.f(window2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "onCreate hashCode: " + hashCode());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.f290145g);
        }
        this.f290143e = new java.lang.ref.WeakReference(ug5.v.f509188g.b(this));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "onDestroy hashCode: " + hashCode());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f290145g);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "[onNewIntent]");
        this.f290142d = false;
        if (intent != null) {
            getIntent().putExtras(intent);
        }
        ug5.v b17 = ug5.v.f509188g.b(this);
        this.f290143e = new java.lang.ref.WeakReference(b17);
        if (b17 == null) {
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "[onWindowFocusChanged] hasFocus=" + z17 + " isNeedFinishWhenResume=" + this.f290142d);
        if (z17 && this.f290142d) {
            finish();
        } else {
            if (z17) {
                return;
            }
            this.f290142d = true;
        }
    }
}
