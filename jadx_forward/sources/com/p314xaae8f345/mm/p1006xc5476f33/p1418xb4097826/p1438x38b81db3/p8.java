package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class p8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.f1 f185777a;

    public p8(so2.f1 f1Var) {
        this.f185777a = f1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        bu2.j jVar = bu2.j.f106067a;
        so2.f1 f1Var = this.f185777a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = jVar.h(f1Var.mo2128x1ed62e84());
        if (h17 == null || (feedObject = h17.getFeedObject()) == null) {
            num = null;
        } else {
            nv2.h1 h1Var = nv2.n1.f422083g;
            num = java.lang.Integer.valueOf(nv2.n1.f422084h.l(feedObject));
        }
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("like_cnt", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        lVarArr[1] = new jz5.l("thx_to_uin", f1Var.f491869d.m75945x2fec8307(5));
        lVarArr[2] = new jz5.l("feed_id", f1Var.f491870e);
        return kz5.c1.k(lVarArr);
    }
}
