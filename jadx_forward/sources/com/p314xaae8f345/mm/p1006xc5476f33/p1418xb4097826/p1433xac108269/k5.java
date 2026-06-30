package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f183846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.app.Activity activity, java.lang.String str, int i17) {
        super(0);
        this.f183846d = activity;
        this.f183847e = str;
        this.f183848f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5 n5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a;
        java.lang.String exportId = this.f183847e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exportId, "$exportId");
        n5Var.e(this.f183846d, exportId, 1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exportId", exportId);
        jSONObject.put("type", this.f183848f);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj("wxalite17bb73d0180cae18320aefbf49ecd90d", "finderOriginalStateDeclareRetAction", jSONObject.toString());
        return jz5.f0.f384359a;
    }
}
