package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes.dex */
public final class v2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f205810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f205811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f205813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f205814e;

    public v2(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var, yz5.l lVar, r45.ss4 ss4Var) {
        this.f205810a = c0Var;
        this.f205811b = linkedList;
        this.f205812c = j3Var;
        this.f205813d = lVar;
        this.f205814e = ss4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgi ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", ");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        int i17 = fVar.f152148a;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f205810a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.h51 h51Var = (r45.h51) fVar.f152151d;
            if ((h51Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2) : null) != null) {
                r45.h51 h51Var2 = (r45.h51) fVar.f152151d;
                if (h51Var2 != null && (m75941xfb821914 = h51Var2.m75941xfb821914(10)) != null) {
                    this.f205811b.addAll(m75941xfb821914);
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.u2(c0Var, this.f205812c, this.f205813d, this.f205814e));
                return jz5.f0.f384359a;
            }
        }
        c0Var.f391645d = false;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.u2(c0Var, this.f205812c, this.f205813d, this.f205814e));
        return jz5.f0.f384359a;
    }
}
