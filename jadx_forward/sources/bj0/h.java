package bj0;

/* loaded from: classes11.dex */
public final class h implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f102642d;

    public h(com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263) {
        this.f102642d = c10717xfba6b263;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        bj0.f fVar = bj0.f.f102639f;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f102642d;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263.a(c10717xfba6b263, fVar);
        if (c10717xfba6b263.B == 0) {
            c10717xfba6b263.B = java.lang.System.currentTimeMillis();
            io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "mark snapshotRenderMills:" + c10717xfba6b263.B);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
