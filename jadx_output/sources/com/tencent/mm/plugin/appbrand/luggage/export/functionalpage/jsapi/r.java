package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s f85630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f85631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f85632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f85633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s sVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        super(1);
        this.f85630d = sVar;
        this.f85631e = jSONObject;
        this.f85632f = lVar;
        this.f85633g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activity = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f85632f;
        int i17 = this.f85633g;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s sVar = this.f85630d;
        activity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.q(lVar, i17, sVar, activity));
        android.content.Intent C = sVar.C(this.f85631e);
        if (C == null) {
            if (lVar != null) {
                lVar.a(i17, sVar.o("fail:invalid data"));
            }
            activity.finish();
        } else {
            j45.l.n(activity, ya.b.LOCATION, ".ui.RedirectUI", C, cf.b.a(sVar));
        }
        return jz5.f0.f302826a;
    }
}
