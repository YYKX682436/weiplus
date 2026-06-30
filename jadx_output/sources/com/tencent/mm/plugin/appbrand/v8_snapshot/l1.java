package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.n1 f90768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.appbrand.v8_snapshot.n1 n1Var) {
        super(0);
        this.f90768d = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            this.f90768d.getClass();
            jSONObject.put("v8Flag", "");
            jSONObject.put("keepCompiledData", com.tencent.mm.plugin.appbrand.v8_snapshot.o1.f90795a);
            cl.x.a();
            jSONObject.put("mmv8Version", com.eclipsesource.mmv8.V8.getV8Version());
            jSONObject.put("compress", false);
            jSONObject.put("snapshotHarmonyShippingFeatures", true);
            jSONObject.put("v8Debug", false);
            jSONObject.put("mmj2v8Version", "1.0.24");
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
