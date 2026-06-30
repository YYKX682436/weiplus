package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.jsapi.component.service.s1 f47540a = new com.tencent.luggage.sdk.jsapi.component.service.s1(null);

    public static final java.lang.String a(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        if (kotlin.jvm.internal.o.b("FLAVOR_RED", com.tencent.mm.sdk.platformtools.z.f193124t.a("FEATURE_ID"))) {
            java.lang.String str = (java.lang.String) com.tencent.luggage.sdk.jsapi.component.service.q1.f47522b.get(libName);
            if (!(str == null || str.length() == 0)) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().nativeLibraryDir + '/' + str;
            }
        } else {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_ae0cf48a", libName);
            if (Ui != null) {
                return Ui.getPath();
            }
        }
        return null;
    }
}
