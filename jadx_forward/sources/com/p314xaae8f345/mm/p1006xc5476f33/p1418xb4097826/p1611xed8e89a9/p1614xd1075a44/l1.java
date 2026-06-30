package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class l1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f206140d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.k1.f206130d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f206141e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.h1.f206098d;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f206142f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.i1.f206106d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206143g;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var) {
        this.f206143g = s1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h32 h32Var;
        boolean z17;
        boolean z18;
        if ((m1Var instanceof db2.e5) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((db2.e5) m1Var).f309490h, this.f206142f.mo152xb9724478())) {
            gm0.j1.d().q(6276, this);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206143g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s1Var.f206254e.get(this.f206140d.mo152xb9724478());
                if (l2Var == null || (h32Var = l2Var.f205449e) == null) {
                    return;
                }
                r45.ov2 a17 = zl2.t.a(h32Var);
                if (a17 != null) {
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o7.a(a17)) {
                        a17 = null;
                    }
                    if (a17 != null) {
                        r45.l1 l1Var = (r45.l1) a17.m75936x14adae67(19);
                        if ((l1Var != null && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.a(l1Var) ? a17 : null) != null) {
                            zl2.g gVar = zl2.g.f555303a;
                            java.lang.String m75945x2fec8307 = a17.m75945x2fec8307(1);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                            gVar.d(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : "", false);
                        }
                        z17 = false;
                        z18 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed.f213532a, s1Var.f206251b, h32Var, h32Var.m75945x2fec8307(3), h32Var.m75939xb282bd08(0) * 1000, kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd(a17, (java.lang.String) this.f206142f.mo152xb9724478())), (java.lang.String) this.f206140d.mo152xb9724478(), false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.j1(a17, h32Var, s1Var, this), 128, null);
                        s1Var.l((java.lang.String) this.f206140d.mo152xb9724478(), h32Var, (!((java.lang.Boolean) this.f206141e.mo152xb9724478()).booleanValue() || s1Var.f206253d) ? z17 : z18);
                    }
                }
                z17 = false;
                z18 = true;
                s1Var.l((java.lang.String) this.f206140d.mo152xb9724478(), h32Var, (!((java.lang.Boolean) this.f206141e.mo152xb9724478()).booleanValue() || s1Var.f206253d) ? z17 : z18);
            }
        }
    }
}
