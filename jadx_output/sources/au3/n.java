package au3;

/* loaded from: classes10.dex */
public final class n implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f14132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView f14133e;

    public n(android.view.View view, com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView) {
        this.f14132d = view;
        this.f14133e = editVideoSeekBarView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f14132d.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f14133e.getRecyclerThumbSeekBar().b() > 0.001f) {
            com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = this.f14133e;
            editVideoSeekBarView.c(editVideoSeekBarView.recyclerThumbSeekBar.c(), editVideoSeekBarView.recyclerThumbSeekBar.b());
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSeekBarEditorView", "run delay branch");
        ku5.u0 u0Var = ku5.t0.f312615d;
        au3.m mVar = new au3.m(this.f14133e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(mVar, 100L, false);
        return true;
    }
}
