package gp4;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(0);
        this.f355967d = c18801xf3fcf614;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gp4.m m72582xd4d63606;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355967d;
        android.view.View.OnClickListener clickListener = c18801xf3fcf614.getClickListener();
        if (clickListener != null) {
            clickListener.onClick(c18801xf3fcf614.f257497y);
        }
        c18801xf3fcf614.removeCallbacks(c18801xf3fcf614.I);
        android.view.View view = c18801xf3fcf614.f257497y;
        if (view != null) {
            view.setActivated(false);
        }
        c18801xf3fcf614.f257497y = null;
        m72582xd4d63606 = c18801xf3fcf614.m72582xd4d63606();
        m72582xd4d63606.setVisibility(4);
        return jz5.f0.f384359a;
    }
}
