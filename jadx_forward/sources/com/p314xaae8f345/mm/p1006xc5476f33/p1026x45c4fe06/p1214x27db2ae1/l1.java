package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.n1 f172301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.n1 n1Var) {
        super(0);
        this.f172301d = n1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            this.f172301d.getClass();
            jSONObject.put("v8Flag", "");
            jSONObject.put("keepCompiledData", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.o1.f172328a);
            cl.x.a();
            jSONObject.put("mmv8Version", com.p159x477cd522.p160x333422.V8.m16074x88682140());
            jSONObject.put("compress", false);
            jSONObject.put("snapshotHarmonyShippingFeatures", true);
            jSONObject.put("v8Debug", false);
            jSONObject.put("mmj2v8Version", "1.0.24");
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
