package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a40 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f193326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f193327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 f193328c;

    public a40(cm2.b0 b0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var) {
        this.f193326a = b0Var;
        this.f193327b = z17;
        this.f193328c = c40Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        cm2.b0 b0Var = this.f193326a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = b0Var.f124864v;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var = this.f193328c;
        if (i17 == 0 && fVar.f152149b == 0 && (m75934xbce7f2f = ((r45.zs1) fVar.f152151d).m75934xbce7f2f(1)) != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            c19786x6a1e28622.mo11468x92b714fd(m75934xbce7f2f.g());
            if (((mm2.f6) c40Var.f193642e.a(mm2.f6.class)).f410582w instanceof cm2.b0) {
                gk2.e eVar = c40Var.f193642e;
                so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410582w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.PromoteOtherItem");
                if (((cm2.b0) j5Var).f124918d == b0Var.f124918d) {
                    b0Var.f124864v = c19786x6a1e28622;
                    ((mm2.f6) eVar.a(mm2.f6.class)).c7(b0Var);
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!this.f193327b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40.f193640m.a(c40Var.f193641d, b0Var);
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class)) == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("POST_PORTRAIT_DATA", b0Var.f124864v.mo14344x5f01b1f6());
        bundle.putInt("POST_PORTRAIT_DATA_TYPE", b0Var.f124865w);
        r60Var.p1("POST_PORTRAIT", bundle);
        return f0Var;
    }
}
