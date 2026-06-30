package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.t9 f85117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.plugin.appbrand.launching.t9 t9Var) {
        super(1);
        this.f85117d = t9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.kf resp = (r45.kf) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        for (java.util.Map.Entry entry : this.f85117d.f85165c.entrySet()) {
            kotlin.jvm.internal.o.g(entry, "<this>");
            com.tencent.mm.plugin.appbrand.launching.z6 z6Var = (com.tencent.mm.plugin.appbrand.launching.z6) entry.getKey();
            yz5.l lVar = (yz5.l) ((jz5.l) entry.getValue()).f302833d;
            r45.me3[] a17 = com.tencent.mm.plugin.appbrand.launching.r4.a(resp, z6Var);
            kotlin.jvm.internal.o.d(a17);
            lVar.invoke(a17);
        }
        return jz5.f0.f302826a;
    }
}
