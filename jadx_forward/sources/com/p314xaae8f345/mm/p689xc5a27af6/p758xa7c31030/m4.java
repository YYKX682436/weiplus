package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class m4 implements uq3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n4 f149142a;

    public m4(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n4 n4Var) {
        this.f149142a = n4Var;
    }

    @Override // uq3.f
    public final java.util.Map a(java.lang.String str, int i17, java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (obj instanceof rh.c1) {
            rh.c1 c1Var = (rh.c1) obj;
            if (this.f149142a.a(c1Var)) {
                return null;
            }
            java.lang.String str2 = c1Var.f476870s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getScope(...)");
            linkedHashMap.put("scope", str2);
            if (obj instanceof gi.w0) {
                java.lang.String z17 = ((gi.w0) obj).z();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getModuleName(...)");
                linkedHashMap.put("module", z17);
            }
        }
        return linkedHashMap;
    }
}
