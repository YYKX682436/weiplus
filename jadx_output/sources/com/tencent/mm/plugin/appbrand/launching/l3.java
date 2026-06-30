package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.n3 f84750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.appbrand.launching.n3 n3Var) {
        super(1);
        this.f84750d = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.kf batchResp = (r45.kf) obj;
        kotlin.jvm.internal.o.g(batchResp, "batchResp");
        java.util.Set<java.util.Map.Entry> entrySet = this.f84750d.f84801e.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            kotlin.jvm.internal.o.d(entry);
            com.tencent.mm.plugin.appbrand.launching.z6 z6Var = (com.tencent.mm.plugin.appbrand.launching.z6) entry.getKey();
            yz5.l lVar = (yz5.l) ((jz5.l) entry.getValue()).f302833d;
            kotlin.jvm.internal.o.d(z6Var);
            r45.me3[] a17 = com.tencent.mm.plugin.appbrand.launching.r4.a(batchResp, z6Var);
            kotlin.jvm.internal.o.d(a17);
            lVar.invoke(a17);
        }
        return jz5.f0.f302826a;
    }
}
