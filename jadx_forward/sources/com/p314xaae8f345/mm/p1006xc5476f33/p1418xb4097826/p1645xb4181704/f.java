package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f211772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f211773g;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        this.f211770d = o0Var;
        this.f211771e = c1163xf1deaba4;
        this.f211772f = i17;
        this.f211773g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f211770d.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f211771e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m0(this.f211773g, 0, c1163xf1deaba4.getContext());
        m0Var.f93582a = this.f211772f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.m8099x6305639d(m0Var);
        }
    }
}
