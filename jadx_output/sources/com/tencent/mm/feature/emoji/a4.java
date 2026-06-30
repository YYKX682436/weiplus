package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f66029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f66030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(yz5.a aVar, java.lang.Long l17, java.lang.String str) {
        super(0);
        this.f66029d = aVar;
        this.f66030e = l17;
        this.f66031f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f66029d;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.Long l17 = this.f66030e;
        if (l17 != null) {
            com.tencent.mm.feature.emoji.v2 v2Var = com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66004h;
            long longValue = l17.longValue();
            java.lang.String md52 = this.f66031f;
            kotlin.jvm.internal.o.g(md52, "md5");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("canAdd", 0);
            jSONObject.put(md52, jSONObject2);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonJsApiDownloadModel", "callback: publish " + longValue + ", " + md52 + ' ' + jSONObject);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(longValue, "onSignleEmojiDownloadUpdate", jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
