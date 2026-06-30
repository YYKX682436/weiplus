package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f84846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f84847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.sdk.platformtools.b4 b4Var, com.tencent.mm.plugin.appbrand.launching.q4 q4Var) {
        super(3);
        this.f84846d = atomicBoolean;
        this.f84847e = b4Var;
        this.f84848f = q4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        if (!this.f84846d.get()) {
            this.f84847e.d();
            com.tencent.mm.plugin.appbrand.launching.a6 a6Var = 4 == intValue ? com.tencent.mm.plugin.appbrand.launching.a6.f84493n : com.tencent.mm.plugin.appbrand.launching.a6.f84491i;
            yz5.p pVar = this.f84848f.f85065h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(intValue);
            sb6.append(',');
            sb6.append(intValue2);
            sb6.append(") ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            ((com.tencent.mm.plugin.appbrand.launching.j4) pVar).invoke(a6Var, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
