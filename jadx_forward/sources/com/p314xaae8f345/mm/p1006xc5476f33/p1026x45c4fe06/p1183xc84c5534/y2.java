package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f169967e;

    public y2(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f169966d = str;
        this.f169967e = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.a(b3Var);
        java.lang.String str = this.f169966d;
        java.lang.String str2 = null;
        java.lang.String u17 = a17.u(str, null);
        if (u17 != null) {
            a17.W(str);
            str2 = u17;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        java.lang.String k17 = u46.l.k(new java.lang.String[]{str2, this.f169967e.f128809v, str, "2"}, ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "join(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.b(b3Var, k17);
    }
}
