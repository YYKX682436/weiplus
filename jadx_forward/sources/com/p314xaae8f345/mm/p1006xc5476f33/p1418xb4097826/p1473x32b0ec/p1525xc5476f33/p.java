package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f195339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r f195340b;

    public p(cm2.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar) {
        this.f195339a = h0Var;
        this.f195340b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        cm2.h0 h0Var = this.f195339a;
        r45.k92 k92Var = h0Var.f124881v;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar = this.f195340b;
        if (i17 == 0 && fVar.f152149b == 0 && (m75934xbce7f2f = ((r45.zs1) fVar.f152151d).m75934xbce7f2f(1)) != null) {
            k92Var = new r45.k92();
            k92Var.mo11468x92b714fd(m75934xbce7f2f.g());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f195598i, "getJumpInfo uxinfo = " + k92Var.m75945x2fec8307(8));
            h0Var.f124881v = k92Var;
            h0Var.f124882w = k92Var.m75942xfb822ef2(0);
            h0Var.f124883x = (r45.n3) k92Var.m75936x14adae67(1);
            h0Var.f124884y = k92Var.m75945x2fec8307(2);
            h0Var.f124885z = k92Var.m75945x2fec8307(3);
            h0Var.A = k92Var.m75945x2fec8307(4);
            k92Var.m75945x2fec8307(5);
            h0Var.B = k92Var.m75945x2fec8307(6);
            k92Var.m75939xb282bd08(7);
            h0Var.getClass();
            java.lang.String m75945x2fec83072 = k92Var.m75945x2fec8307(8);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            h0Var.C = m75945x2fec83072;
            h0Var.D = k92Var.m75939xb282bd08(10);
            h0Var.E = k92Var.m75942xfb822ef2(11);
            gk2.e eVar = rVar.f195594e;
            if (((mm2.f6) eVar.a(mm2.f6.class)).f410582w instanceof cm2.h0) {
                so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410582w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowAdItem");
                if (((cm2.h0) j5Var).f124882w == h0Var.f124882w) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).c7(h0Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r.f195592n;
        android.view.ViewGroup viewGroup = rVar.f195599m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mVar.a(context, rVar.f195594e, rVar.f195598i, h0Var);
        if (rVar.f195595f.mo11219xd0598cf8() == 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f408965f;
            java.lang.String valueOf = java.lang.String.valueOf(k92Var.m75942xfb822ef2(0));
            r45.n3 n3Var = (r45.n3) k92Var.m75936x14adae67(1);
            java.lang.String str = (n3Var == null || (m75945x2fec8307 = n3Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
            java.lang.String valueOf2 = java.lang.String.valueOf(k92Var.m75942xfb822ef2(0));
            java.lang.String m75945x2fec83073 = k92Var.m75945x2fec8307(8);
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, str, valueOf2, m75945x2fec83073 == null ? "" : m75945x2fec83073, k92Var.m75939xb282bd08(10), k92Var.m75942xfb822ef2(11), null, null, null, null, false, null, 16128, null);
        }
        return jz5.f0.f384359a;
    }
}
