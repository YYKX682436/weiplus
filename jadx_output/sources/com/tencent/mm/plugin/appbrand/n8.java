package com.tencent.mm.plugin.appbrand;

/* loaded from: classes8.dex */
public class n8 implements xa1.b {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.handoff.model.HandOff f86055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86056c;

    public n8(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mm.plugin.handoff.model.HandOff handOffMP;
        this.f86056c = o6Var;
        kotlin.jvm.internal.o.g(o6Var, "<this>");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        java.lang.String str = u07.f77280f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = u07.f77279e;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = u07.f77278d;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = u07.f47278x;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = u07.f77283i;
        java.lang.String str10 = str9 == null ? "" : str9;
        if (u07.g()) {
            i95.m c17 = i95.n0.c(b70.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String key = com.tencent.mm.plugin.handoff.model.HandOff.Companion.a(4, 1);
            kotlin.jvm.internal.o.g(key, "key");
            handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffMG(str2, str4, str6, str10, str8, 1, "", "", key);
        } else {
            i95.m c18 = i95.n0.c(b70.e.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            java.lang.String key2 = com.tencent.mm.plugin.handoff.model.HandOff.Companion.a(3, 1);
            kotlin.jvm.internal.o.g(key2, "key");
            handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffMP(str2, str4, str6, str10, str8, 1, "", "", key2);
        }
        this.f86055b = handOffMP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xa1.b
    public void a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86056c;
        if (o6Var.u0() == null || o6Var.u0().f77292e2) {
            return;
        }
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f86055b;
        handOff.setHandOffType(i17);
        ((b70.f) handOff).setPageOfAppEntry(str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(handOff);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xa1.b
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86056c;
        if (o6Var.a2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not handoff");
        } else {
            if (o6Var.u0() == null || o6Var.u0().f77292e2) {
                return;
            }
            com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f86055b;
            ((b70.f) handOff).setPageOfAppEntry(str);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(handOff);
        }
    }

    @Override // xa1.b
    public void c() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86056c;
        if (o6Var.a2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not delete handoff");
        } else {
            if (o6Var.u0() == null || o6Var.u0().f77292e2) {
                return;
            }
            ((d73.i) i95.n0.c(d73.i.class)).A8(this.f86055b.getKey());
        }
    }
}
