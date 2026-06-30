package gp4;

/* loaded from: classes10.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355975d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        this.f355975d = c18801xf3fcf614;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.view.ViewGroup m72581x58804013;
        zu3.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "<anonymous parameter 0>");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355975d;
        m72581x58804013 = c18801xf3fcf614.m72581x58804013();
        m72581x58804013.removeView(c18801xf3fcf614.f257497y);
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
            itemChangeListener.mo146xb9724478(c18801xf3fcf614.f257497y);
        }
        c18801xf3fcf614.post(c18801xf3fcf614.I);
    }
}
