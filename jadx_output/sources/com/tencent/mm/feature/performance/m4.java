package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class m4 implements uq3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.n4 f67609a;

    public m4(com.tencent.mm.feature.performance.n4 n4Var) {
        this.f67609a = n4Var;
    }

    @Override // uq3.f
    public final java.util.Map a(java.lang.String str, int i17, java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (obj instanceof rh.c1) {
            rh.c1 c1Var = (rh.c1) obj;
            if (this.f67609a.a(c1Var)) {
                return null;
            }
            java.lang.String str2 = c1Var.f395337s;
            kotlin.jvm.internal.o.f(str2, "getScope(...)");
            linkedHashMap.put("scope", str2);
            if (obj instanceof gi.w0) {
                java.lang.String z17 = ((gi.w0) obj).z();
                kotlin.jvm.internal.o.f(z17, "getModuleName(...)");
                linkedHashMap.put("module", z17);
            }
        }
        return linkedHashMap;
    }
}
