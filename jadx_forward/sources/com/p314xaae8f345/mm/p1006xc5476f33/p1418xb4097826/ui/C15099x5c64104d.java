package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* renamed from: com.tencent.mm.plugin.finder.ui.ViewBindUIC */
/* loaded from: classes.dex */
public final class C15099x5c64104d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f210363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f210364e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f210365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15099x5c64104d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f210363d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.um(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f210364e = arrayList;
        this.f210365f = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.ViewBindUIC$adapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type != 0) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.dm();
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d.this.m158358x197d1fc6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.SettingFragment");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0) m158358x197d1fc6);
            }
        }, arrayList, false);
    }

    public final void O6(java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        pf5.e.m158344xbe96bc24(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vm(this, data, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570323ag0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = ((vb2.i) ((jz5.n) this.f210363d).mo141623x754a37bb()).f516158b;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179()));
        c22849x81a93d25.mo7960x6cab2c8d(this.f210365f);
    }
}
