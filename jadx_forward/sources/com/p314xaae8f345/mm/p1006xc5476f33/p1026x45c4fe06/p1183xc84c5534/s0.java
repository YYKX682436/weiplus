package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class s0 implements ob0.w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.s0 f169932a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.s0();

    @Override // ob0.w2
    public java.lang.String a() {
        java.lang.String str;
        m91.f fVar = m91.f.f406484a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                str = ((m91.c) kz5.n0.h0(keySet)).f406477e;
            } else {
                str = "";
            }
        }
        return r26.i0.t(str, ",", " ", true);
    }

    @Override // ob0.w2
    public java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a;
        java.lang.String W0 = interfaceC11702x4ae7c33 != null ? interfaceC11702x4ae7c33.W0() : null;
        return W0 == null ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : W0;
    }

    @Override // ob0.w2
    public java.lang.String c() {
        java.lang.String str;
        m91.f fVar = m91.f.f406484a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                str = ((m91.c) kz5.n0.h0(keySet)).f406476d;
            } else {
                str = "";
            }
        }
        return str;
    }

    @Override // ob0.w2
    public java.lang.String d() {
        int i17;
        java.lang.String valueOf = java.lang.String.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        m91.f fVar = m91.f.f406484a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                i17 = ((m91.c) kz5.n0.h0(keySet)).f406481i;
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
    /* renamed from: extra */
    public java.lang.String mo52485x5c79410() {
        java.lang.String sb6;
        m91.f fVar = m91.f.f406484a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        synchronized (linkedHashMap) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (linkedHashMap.size() > 0) {
                for (java.lang.Object obj : linkedHashMap.keySet()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "next(...)");
                    sb7.append(((m91.c) obj).f406476d);
                    sb7.append(';');
                }
            }
            sb6 = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "toString(...)");
        }
        return sb6;
    }

    @Override // ob0.v2
    /* renamed from: getExtra */
    public java.util.Map mo52486x74653a5a() {
        return kz5.c1.k(new jz5.l("CurrentAppIdList", mo52485x5c79410()), new jz5.l("XWalkVersion", d()), new jz5.l("WxaRuntimeVersion", b()), new jz5.l("TopAppId", c()), new jz5.l("TopAppName", a()));
    }

    @Override // ob0.v2
    /* renamed from: getTag */
    public java.lang.String mo52487xb5887064() {
        return "AppBrand";
    }
}
