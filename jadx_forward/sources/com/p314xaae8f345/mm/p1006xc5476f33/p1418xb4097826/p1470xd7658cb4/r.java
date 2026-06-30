package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u f192996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f192997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f192998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar, in5.s0 s0Var, xc2.p0 p0Var) {
        super(0);
        this.f192996d = uVar;
        this.f192997e = s0Var;
        this.f192998f = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m77226x96bac258;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m77226x96bac2582;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar = this.f192996d;
        in5.s0 s0Var = this.f192997e;
        uVar.f193001d = s0Var;
        if (s0Var != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.s(uVar);
            uVar.f193005h = sVar;
            c15196x85976f5f.t(sVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.t(uVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = uVar.f193003f;
        pVar.f192988b = tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawerUIC", "add highlight progress listener to drawer");
        xc2.p0 p0Var = this.f192998f;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = p0Var.f534767a.m76506x42318aa0();
        if (m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 56) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862.m76506x42318aa0();
            if (((m76506x42318aa02 == null || (m77226x96bac2582 = m76506x42318aa02.m77226x96bac258()) == null) ? 0 : m77226x96bac2582.f273689a.length) > 0) {
                r45.hb1 hb1Var = new r45.hb1();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa03 = c19786x6a1e2862.m76506x42318aa0();
                byte[] g17 = (m76506x42318aa03 == null || (m77226x96bac258 = m76506x42318aa03.m77226x96bac258()) == null) ? null : m77226x96bac258.g();
                if (g17 != null) {
                    try {
                        hb1Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                pVar.getClass();
                java.util.LinkedList<r45.gb1> m75941xfb821914 = hb1Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfo_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.gb1 gb1Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gb1Var);
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d(gb1Var));
                }
                java.util.ArrayList arrayList2 = pVar.f192989c;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = pVar.f192991e;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                c22848x6ddd90cf.m8146xced61ae5();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = uVar.f193002e;
                if (c14161x3a122e13 != null) {
                    if (s0Var != null) {
                        s0Var.m8183xf806b362();
                    }
                    c14161x3a122e13.r(true, true, 0);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
