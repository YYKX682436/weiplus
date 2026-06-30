package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v f85638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f85639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v vVar, com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        super(1);
        this.f85638d = vVar;
        this.f85639e = yVar;
        this.f85640f = i17;
        this.f85641g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activity = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.y yVar = this.f85639e;
        int i17 = this.f85640f;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v vVar = this.f85638d;
        activity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.t(yVar, i17, vVar, activity));
        db5.e1.Q(activity, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lbn), true, false, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f85641g);
        j45.l.o(activity, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(vVar), true);
        return jz5.f0.f302826a;
    }
}
