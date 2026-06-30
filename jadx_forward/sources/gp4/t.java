package gp4;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(0);
        this.f355969d = c18801xf3fcf614;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup m72577xb3ec4739;
        gp4.m m72582xd4d63606;
        yz5.l readTextListener;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355969d;
        m72577xb3ec4739 = c18801xf3fcf614.m72577xb3ec4739();
        m72577xb3ec4739.setVisibility(8);
        c18801xf3fcf614.removeCallbacks(c18801xf3fcf614.I);
        m72582xd4d63606 = c18801xf3fcf614.m72582xd4d63606();
        m72582xd4d63606.setVisibility(4);
        android.view.KeyEvent.Callback callback = c18801xf3fcf614.f257497y;
        cw3.s sVar = callback instanceof cw3.s ? (cw3.s) callback : null;
        if (sVar != null && (readTextListener = c18801xf3fcf614.getReadTextListener()) != null) {
            readTextListener.mo146xb9724478(sVar.mo122948x9174bead());
        }
        return jz5.f0.f384359a;
    }
}
