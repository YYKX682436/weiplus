package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class zb extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ac f83956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.ac acVar) {
        super(3);
        this.f83954d = c0Var;
        this.f83955e = i17;
        this.f83956f = acVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pj4.w wVar;
        int intValue = ((java.lang.Number) obj).intValue();
        pj4.r0 r0Var = (pj4.r0) obj3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (r0Var != null && (wVar = r0Var.f355273e) != null) {
            java.lang.String str = wVar.f355313f;
            if (!(str == null || r26.n0.N(str))) {
                jSONObject.put("tailType", wVar.f355313f);
            }
            java.lang.String str2 = wVar.f355314g;
            if (!(str2 == null || r26.n0.N(str2))) {
                jSONObject.put("tailUserName", wVar.f355314g);
            }
            java.lang.String str3 = wVar.f355315h;
            if (!(str3 == null || r26.n0.N(str3))) {
                jSONObject.put("tailPath", wVar.f355315h);
            }
            java.lang.String str4 = wVar.f355316i;
            if (!(str4 == null || r26.n0.N(str4))) {
                jSONObject.put("tailUrl", wVar.f355316i);
            }
        }
        this.f83954d.a(this.f83955e, this.f83956f.r(null, intValue != 0 ? intValue != 1 ? intValue != 2 ? jc1.f.f298915d : jc1.f.f298913b : jc1.f.f298928q : jc1.f.f298912a, jSONObject));
        return jz5.f0.f302826a;
    }
}
