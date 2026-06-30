package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class zb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f165487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f165488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ac f165489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ac acVar) {
        super(3);
        this.f165487d = c0Var;
        this.f165488e = i17;
        this.f165489f = acVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pj4.w wVar;
        int intValue = ((java.lang.Number) obj).intValue();
        pj4.r0 r0Var = (pj4.r0) obj3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (r0Var != null && (wVar = r0Var.f436806e) != null) {
            java.lang.String str = wVar.f436846f;
            if (!(str == null || r26.n0.N(str))) {
                jSONObject.put("tailType", wVar.f436846f);
            }
            java.lang.String str2 = wVar.f436847g;
            if (!(str2 == null || r26.n0.N(str2))) {
                jSONObject.put("tailUserName", wVar.f436847g);
            }
            java.lang.String str3 = wVar.f436848h;
            if (!(str3 == null || r26.n0.N(str3))) {
                jSONObject.put("tailPath", wVar.f436848h);
            }
            java.lang.String str4 = wVar.f436849i;
            if (!(str4 == null || r26.n0.N(str4))) {
                jSONObject.put("tailUrl", wVar.f436849i);
            }
        }
        this.f165487d.a(this.f165488e, this.f165489f.r(null, intValue != 0 ? intValue != 1 ? intValue != 2 ? jc1.f.f380448d : jc1.f.f380446b : jc1.f.f380461q : jc1.f.f380445a, jSONObject));
        return jz5.f0.f384359a;
    }
}
