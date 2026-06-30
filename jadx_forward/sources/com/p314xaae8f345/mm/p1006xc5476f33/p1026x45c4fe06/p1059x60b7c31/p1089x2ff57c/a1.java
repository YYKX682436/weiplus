package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f162571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f162572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f162573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f162574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f162575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b1 f162576i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(org.json.JSONArray jSONArray, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b1 b1Var) {
        super(1);
        this.f162571d = jSONArray;
        this.f162572e = interfaceC11702x4ae7c33;
        this.f162573f = tVar;
        this.f162574g = v5Var;
        this.f162575h = i17;
        this.f162576i = b1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONArray jSONArray = this.f162571d;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(jSONArray.length());
        cf.d dVar = new cf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.z0(arrayMap, this.f162574g, this.f162575h, this.f162576i), jSONArray.length());
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null || obj2.length() == 0) {
            dVar.a();
        } else {
            java.lang.String M = this.f162572e.M(obj2);
            if (M == null || M.length() == 0) {
                arrayMap.put(obj2, "file not exists");
                dVar.a();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(this.f162573f, new java.net.URL("https", com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj), obj2), M, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.y0(arrayMap, obj2, dVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
