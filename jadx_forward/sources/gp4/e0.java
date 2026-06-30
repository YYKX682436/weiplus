package gp4;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355933d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        this.f355933d = c18801xf3fcf614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup m72581x58804013;
        zu3.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355933d;
        m72581x58804013 = c18801xf3fcf614.m72581x58804013();
        m72581x58804013.removeView(c18801xf3fcf614.f257496x);
        android.view.View view = c18801xf3fcf614.f257497y;
        zu3.x xVar = view instanceof zu3.x ? (zu3.x) view : null;
        if (xVar != null) {
            zu3.y yVar = xVar.f557395m;
            if (yVar != null && (rVar = yVar.f557408q) != null) {
                rVar.b();
            }
            xVar.f557396n = false;
        }
        yz5.l itemChangeListener = c18801xf3fcf614.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.mo146xb9724478(c18801xf3fcf614.f257496x);
        }
        c18801xf3fcf614.f257496x = null;
        c18801xf3fcf614.f257497y = null;
    }
}
