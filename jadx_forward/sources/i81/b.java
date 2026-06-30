package i81;

/* loaded from: classes7.dex */
public final class b implements al1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final al1.b f371054d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f371055e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.i f371056f;

    public b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        android.content.Context context2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ud s07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        al1.b bVar = new al1.b(context);
        this.f371054d = bVar;
        this.f371055e = c11510xdd90c2f2;
        android.view.View findViewById = bVar.findViewById(com.p314xaae8f345.mm.R.id.em9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        viewGroup.removeAllViews();
        if (c11510xdd90c2f2 == null || (s07 = c11510xdd90c2f2.s0()) == null || (context2 = s07.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, mi1.i.class)) == null) {
            context2 = bVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        }
        mi1.i iVar = new mi1.i(context2);
        this.f371056f = iVar;
        viewGroup.addView(iVar, new android.widget.FrameLayout.LayoutParams(-2, -2, 8388629));
        bVar.m2217x2f33e7ef(new i81.a(this));
    }

    public void a(boolean z17, al1.h0 h0Var) {
        this.f371054d.l(z17, h0Var);
    }

    @Override // al1.k0
    /* renamed from: getActionView */
    public android.view.View mo2206x5ca2d9f1() {
        return this.f371054d.mo2206x5ca2d9f1();
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public int getF87324d() {
        return this.f371054d.getF87324d();
    }

    @Override // al1.k0
    /* renamed from: setBackButtonClickListener */
    public void mo2215x1ae0b121(android.view.View.OnClickListener onClickListener) {
        this.f371054d.mo2215x1ae0b121(onClickListener);
    }

    @Override // al1.k0
    /* renamed from: setBackgroundColor */
    public void mo134899x67f06213(int i17) {
        this.f371054d.mo134899x67f06213(i17);
    }

    @Override // al1.k0
    /* renamed from: setCloseButtonClickListener */
    public void mo2218x262881b4(android.view.View.OnClickListener onClickListener) {
        this.f371054d.mo2218x262881b4(onClickListener);
    }

    @Override // al1.k0
    /* renamed from: setForegroundColor */
    public void mo2219xf502931e(int i17) {
        this.f371054d.mo2219xf502931e(i17);
    }

    @Override // al1.k0
    /* renamed from: setForegroundStyle */
    public void mo2220xf5e6816c(java.lang.String str) {
        this.f371054d.mo2220xf5e6816c(str);
    }

    @Override // al1.k0
    /* renamed from: setLoadingIconVisibility */
    public void mo2223x5b5c5185(boolean z17) {
        this.f371054d.mo2223x5b5c5185(z17);
    }

    @Override // al1.k0
    /* renamed from: setMainTitle */
    public void mo2224x4c2b09dd(java.lang.CharSequence charSequence) {
        this.f371054d.mo2224x4c2b09dd(charSequence);
    }

    @Override // al1.k0
    /* renamed from: setNavHidden */
    public void mo2227x506dbe6b(boolean z17) {
        this.f371054d.mo2227x506dbe6b(z17);
    }
}
