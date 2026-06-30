package at2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f13773d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f13774e;

    public x(long j17, java.lang.ref.WeakReference rMiniviewPlugin) {
        kotlin.jvm.internal.o.g(rMiniviewPlugin, "rMiniviewPlugin");
        this.f13773d = j17;
        this.f13774e = rMiniviewPlugin;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity;
        at2.y yVar;
        at2.b0 b0Var = (at2.b0) this.f13774e.get();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        android.content.Context context = b0Var != null ? b0Var.R0().getContext() : null;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        com.tencent.mars.xlog.Log.i("ReplayMiniViewPlugin", "isTopApp context:" + context + ",topActivity:" + activity);
        boolean b17 = kotlin.jvm.internal.o.b(context, activity);
        ws2.u0 u0Var = ws2.k1.f449066r;
        boolean z17 = u0Var.a().f449073e != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("excute delay task,liveId:");
        long j18 = this.f13773d;
        sb6.append(j18);
        sb6.append(",permission:");
        sb6.append(Ui);
        sb6.append(",isTopApp:");
        sb6.append(b17);
        sb6.append(",replayFullViewShow:");
        sb6.append(z17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("ReplayMiniViewPlugin", sb6.toString());
        ct2.j jVar = b0Var != null ? (ct2.j) b0Var.P0(ct2.j.class) : null;
        if (jVar != null) {
            jVar.Y6(false);
        }
        if (b0Var != null && (yVar = (at2.y) ((jz5.n) b0Var.f13637q).getValue()) != null) {
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(yVar);
        }
        if (Ui || b17) {
            return;
        }
        if (b0Var != null) {
            b0Var.R0().finish();
        }
        if (z17) {
            return;
        }
        u0Var.a().l(10, j18, true);
    }
}
