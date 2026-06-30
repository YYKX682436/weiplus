package q14;

/* loaded from: classes5.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f441223d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f441224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eih;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6("");
        abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
        abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new q14.a(abstractActivityC21394xb3d2c0cf));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.ViewGroup viewGroup;
        android.view.ViewTreeObserver viewTreeObserver;
        if (this.f441224e == null || (viewGroup = this.f441223d) == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f441224e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f441223d = (android.view.ViewGroup) contentView;
        boolean Ri = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 viewOnClickListenerC22656xc0bc43c2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2) contentView.findViewById(com.p314xaae8f345.mm.R.id.f567681um3);
        if (viewOnClickListenerC22656xc0bc43c2 != null) {
            viewOnClickListenerC22656xc0bc43c2.m81497x52cfa5c6(Ri);
            viewOnClickListenerC22656xc0bc43c2.m81499xb3e0a10a(q14.b.f441221a);
        }
        this.f441224e = new q14.c(this);
        android.view.ViewGroup viewGroup = this.f441223d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f441224e);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50320, "page_in", kz5.c1.k(new jz5.l("one_clk_login_status", java.lang.Integer.valueOf(Ri ? 1 : 0)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())), 34575);
    }
}
