package at2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f95306d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f95307e;

    public x(long j17, java.lang.ref.WeakReference rMiniviewPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rMiniviewPlugin, "rMiniviewPlugin");
        this.f95306d = j17;
        this.f95307e = rMiniviewPlugin;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity;
        at2.y yVar;
        at2.b0 b0Var = (at2.b0) this.f95307e.get();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.content.Context context = b0Var != null ? b0Var.R0().getContext() : null;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayMiniViewPlugin", "isTopApp context:" + context + ",topActivity:" + activity);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context, activity);
        ws2.u0 u0Var = ws2.k1.f530599r;
        boolean z17 = u0Var.a().f530606e != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("excute delay task,liveId:");
        long j18 = this.f95306d;
        sb6.append(j18);
        sb6.append(",permission:");
        sb6.append(Ui);
        sb6.append(",isTopApp:");
        sb6.append(b17);
        sb6.append(",replayFullViewShow:");
        sb6.append(z17);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayMiniViewPlugin", sb6.toString());
        ct2.j jVar = b0Var != null ? (ct2.j) b0Var.P0(ct2.j.class) : null;
        if (jVar != null) {
            jVar.Y6(false);
        }
        if (b0Var != null && (yVar = (at2.y) ((jz5.n) b0Var.f95170q).mo141623x754a37bb()) != null) {
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(yVar);
        }
        if (Ui || b17) {
            return;
        }
        if (b0Var != null) {
            b0Var.R0().m57646xb4098c93();
        }
        if (z17) {
            return;
        }
        u0Var.a().l(10, j18, true);
    }
}
