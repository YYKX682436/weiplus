package gp4;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(0);
        this.f355965d = c18801xf3fcf614;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355965d;
        android.view.KeyEvent.Callback callback = c18801xf3fcf614.f257497y;
        if (callback != null && (callback instanceof cw3.s)) {
            yz5.l timeEditClickListener = c18801xf3fcf614.getTimeEditClickListener();
            if (timeEditClickListener != null) {
                timeEditClickListener.mo146xb9724478(((cw3.s) callback).mo122948x9174bead());
            }
            c18801xf3fcf614.removeCallbacks(c18801xf3fcf614.I);
            android.view.View view = c18801xf3fcf614.f257497y;
            if (view != null) {
                c18801xf3fcf614.q(view, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
