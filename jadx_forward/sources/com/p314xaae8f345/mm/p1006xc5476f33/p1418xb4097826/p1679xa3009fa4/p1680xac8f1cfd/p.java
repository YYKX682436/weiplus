package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f217027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, r45.qt2 qt2Var, java.lang.String str2) {
        super(0);
        this.f217026d = str;
        this.f217027e = qt2Var;
        this.f217028f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ya2.g gVar = ya2.h.f542017a;
        java.lang.String str = this.f217026d;
        ya2.b2 b17 = gVar.b(str);
        boolean z17 = b17 != null && b17.f69313xcad4ef95 == ya2.b2.Q2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", str);
        jSONObject.put("follow_button_type", z17 ? 1 : 2);
        jSONObject.put("recommend_source_finder_username", this.f217028f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, this.f217027e, "frifollow_page_follow_button", 0, jSONObject, false, null, 48, null);
        return jz5.f0.f384359a;
    }
}
