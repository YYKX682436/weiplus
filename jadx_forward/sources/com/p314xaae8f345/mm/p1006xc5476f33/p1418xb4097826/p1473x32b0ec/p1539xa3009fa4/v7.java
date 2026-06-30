package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class v7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f199014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199016f;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, java.lang.String str, java.lang.String str2) {
        this.f199014d = b8Var;
        this.f199015e = str;
        this.f199016f = str2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        if (g4Var.z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f199014d.f198470e;
            if (lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f410604i) == null || (n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null || (str = z53Var.m75945x2fec8307(20)) == null) {
                str = "";
            }
            boolean z17 = str.length() == 0;
            java.lang.String str2 = this.f199015e;
            if (z17) {
                g4Var.f(1, str2);
            } else {
                g4Var.o(1, str2, str);
            }
            g4Var.f(2, this.f199016f);
        }
    }
}
