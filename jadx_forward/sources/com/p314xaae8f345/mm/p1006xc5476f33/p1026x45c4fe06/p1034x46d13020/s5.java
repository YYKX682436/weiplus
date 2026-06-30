package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u5 f158094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f158095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158096c;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u5 u5Var, int i17, long j17) {
        this.f158094a = u5Var;
        this.f158095b = i17;
        this.f158096c = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (this.f158094a != null && !th1.a.b(fVar) && (w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)) != null) {
            w2Var.mo142179xf35bbb4("batch", 3, null);
        }
        if (fVar == null) {
            return null;
        }
        int i17 = this.f158095b;
        int i18 = fVar.f152148a;
        int i19 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = fVar.f152152e;
        java.lang.Object mo47948x7f0c4558 = m1Var != null ? m1Var.mo47948x7f0c4558() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.i(i17, i18, i19, str, mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null, java.lang.Long.valueOf(this.f158096c));
        return fVar;
    }
}
