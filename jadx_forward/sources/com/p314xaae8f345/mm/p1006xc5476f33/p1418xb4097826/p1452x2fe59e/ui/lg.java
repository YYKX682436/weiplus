package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class lg extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj {

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f191805r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f191806s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f191807t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f191808u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f191805r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ig(context));
        this.f191806s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.eg(context));
        this.f191807t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jg(context));
        this.f191808u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kg(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void q(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.q(data);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17 = o();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188501d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570709bk2, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        o17.m82701x7344efcb(inflate);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o18 = o();
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bs8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        o18.m82697xe136b7d8(inflate2);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.ghe);
        stickTopLoadingLayout.setPadding(0, ((java.lang.Number) ((jz5.n) this.f191805r).mo141623x754a37bb()).intValue() + (((java.lang.Number) ((jz5.n) this.f191806s).mo141623x754a37bb()).intValue() / 2), 0, 0);
        o().m82707x9a17759f(stickTopLoadingLayout);
        int dimension = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi);
        o().m82696x5dd8f4d3(dimension - ((int) ((java.lang.Number) ((jz5.n) this.f191808u).mo141623x754a37bb()).floatValue()));
        o().m82702xfa5d1e8f(-dimension);
        o().m82686x6e84640(1.6f);
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f567991la3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) c1163xf1deaba4;
            if (c13728x20aad6ea.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c13728x20aad6ea.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea.i1(c13728x20aad6ea, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager, null, 2, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void u() {
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fg(this));
    }
}
