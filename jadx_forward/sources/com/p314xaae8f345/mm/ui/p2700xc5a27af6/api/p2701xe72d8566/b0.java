package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class b0 extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f289993d;

    public b0(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var) {
        this.f289993d = j1Var;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.app.Activity activity2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f289993d;
        java.lang.ref.WeakReference weakReference = j1Var.f290035h;
        if (weakReference == null || (activity2 = (android.app.Activity) weakReference.get()) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, activity2)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onActivityDestroyed");
        activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
        j1Var.Di(activity2);
        j1Var.f290036i = null;
        j1Var.f290035h = null;
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x xVar = j1Var.f290034g;
        if (xVar != null) {
            xVar.b();
        }
        j1Var.f290034g = null;
        j1Var.f290037m = null;
    }
}
