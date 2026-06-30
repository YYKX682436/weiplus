package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class h3 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90458c;

    public h3(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, long j17) {
        this.f90456a = str;
        this.f90457b = b3Var;
        this.f90458c = j17;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        long j17 = this.f90458c;
        java.lang.String str2 = this.f90456a;
        com.tencent.mm.plugin.appbrand.utils.b3 b3Var = this.f90457b;
        com.tencent.mm.plugin.appbrand.utils.d3.a(str2, b3Var, str, j17);
        if (b3Var instanceof com.tencent.mm.plugin.appbrand.utils.c3) {
            ((com.tencent.mm.plugin.appbrand.utils.c3) b3Var).a(k1Var);
        }
    }
}
