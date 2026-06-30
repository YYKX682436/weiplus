package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class y2 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f90622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f90625d;

    public y2(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, long j18) {
        this.f90622a = j17;
        this.f90623b = str;
        this.f90624c = b3Var;
        this.f90625d = j18;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        if (k1Var.sourceLength <= 0) {
            k1Var.sourceLength = (int) this.f90622a;
        }
        java.lang.String str2 = this.f90623b;
        long j17 = this.f90625d;
        com.tencent.mm.plugin.appbrand.utils.b3 b3Var = this.f90624c;
        com.tencent.mm.plugin.appbrand.utils.d3.a(str2, b3Var, str, j17);
        if (b3Var instanceof com.tencent.mm.plugin.appbrand.utils.c3) {
            ((com.tencent.mm.plugin.appbrand.utils.c3) b3Var).a(k1Var);
        }
    }
}
