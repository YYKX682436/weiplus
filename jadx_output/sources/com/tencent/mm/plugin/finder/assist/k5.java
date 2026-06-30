package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.app.Activity activity, java.lang.String str, int i17) {
        super(0);
        this.f102313d = activity;
        this.f102314e = str;
        this.f102315f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        java.lang.String exportId = this.f102314e;
        kotlin.jvm.internal.o.f(exportId, "$exportId");
        n5Var.e(this.f102313d, exportId, 1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exportId", exportId);
        jSONObject.put("type", this.f102315f);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj("wxalite17bb73d0180cae18320aefbf49ecd90d", "finderOriginalStateDeclareRetAction", jSONObject.toString());
        return jz5.f0.f302826a;
    }
}
