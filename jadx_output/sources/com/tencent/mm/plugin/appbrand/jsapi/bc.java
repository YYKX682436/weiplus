package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class bc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bc f79855d = new com.tencent.mm.plugin.appbrand.jsapi.bc();

    public bc() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.report.service.b1.f(it.getInt("businesstype"), it.getInt("datatype"));
        return jz5.f0.f302826a;
    }
}
