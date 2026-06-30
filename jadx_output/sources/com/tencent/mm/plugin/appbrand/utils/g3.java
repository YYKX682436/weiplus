package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class g3 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90451c;

    public g3(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, long j17) {
        this.f90449a = str;
        this.f90450b = b3Var;
        this.f90451c = j17;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        long j17 = this.f90451c;
        java.lang.String str2 = this.f90449a;
        com.tencent.mm.plugin.appbrand.utils.b3 b3Var = this.f90450b;
        com.tencent.mm.plugin.appbrand.utils.d3.a(str2, b3Var, str, j17);
        if (b3Var instanceof com.tencent.mm.plugin.appbrand.utils.c3) {
            ((com.tencent.mm.plugin.appbrand.utils.c3) b3Var).a(k1Var);
        }
    }
}
