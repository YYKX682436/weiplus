package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class s0 implements ob0.w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.s0 f88399a = new com.tencent.mm.plugin.appbrand.report.s0();

    @Override // ob0.w2
    public java.lang.String a() {
        java.lang.String str;
        m91.f fVar = m91.f.f324951a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                str = ((m91.c) kz5.n0.h0(keySet)).f324944e;
            } else {
                str = "";
            }
        }
        return r26.i0.t(str, ",", " ", true);
    }

    @Override // ob0.w2
    public java.lang.String b() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = com.tencent.mm.plugin.appbrand.appcache.e8.f75515a;
        java.lang.String W0 = iCommLibReader != null ? iCommLibReader.W0() : null;
        return W0 == null ? com.eclipsesource.mmv8.Platform.UNKNOWN : W0;
    }

    @Override // ob0.w2
    public java.lang.String c() {
        java.lang.String str;
        m91.f fVar = m91.f.f324951a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                str = ((m91.c) kz5.n0.h0(keySet)).f324943d;
            } else {
                str = "";
            }
        }
        return str;
    }

    @Override // ob0.w2
    public java.lang.String d() {
        int i17;
        java.lang.String valueOf = java.lang.String.valueOf(org.xwalk.core.XWalkEnvironment.d());
        m91.f fVar = m91.f.f324951a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                i17 = ((m91.c) kz5.n0.h0(keySet)).f324948i;
            } else {
                i17 = 0;
            }
        }
        if (i17 == 0) {
            return valueOf;
        }
        return valueOf + "(skyline)";
    }

    @Override // ob0.w2
    public java.lang.String extra() {
        java.lang.String sb6;
        m91.f fVar = m91.f.f324951a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f324953c;
        synchronized (linkedHashMap) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (linkedHashMap.size() > 0) {
                for (java.lang.Object obj : linkedHashMap.keySet()) {
                    kotlin.jvm.internal.o.f(obj, "next(...)");
                    sb7.append(((m91.c) obj).f324943d);
                    sb7.append(';');
                }
            }
            sb6 = sb7.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
        }
        return sb6;
    }

    @Override // ob0.v2
    public java.util.Map getExtra() {
        return kz5.c1.k(new jz5.l("CurrentAppIdList", extra()), new jz5.l("XWalkVersion", d()), new jz5.l("WxaRuntimeVersion", b()), new jz5.l("TopAppId", c()), new jz5.l("TopAppName", a()));
    }

    @Override // ob0.v2
    public java.lang.String getTag() {
        return "AppBrand";
    }
}
