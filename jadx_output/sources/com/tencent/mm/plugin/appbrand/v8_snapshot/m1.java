package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.m1 f90782d = new com.tencent.mm.plugin.appbrand.v8_snapshot.m1();

    public m1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            cl.x.a();
            jSONObject.put("mmnodeVersion", com.eclipsesource.mmv8.V8.getNodeVersion());
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
