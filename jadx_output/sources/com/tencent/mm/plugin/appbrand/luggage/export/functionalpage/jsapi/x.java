package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f85646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y f85647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f85648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f85649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Intent intent, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y yVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        super(1);
        this.f85646d = intent;
        this.f85647e = yVar;
        this.f85648f = d0Var;
        this.f85649g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activity = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f85648f;
        int i17 = this.f85649g;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y yVar = this.f85647e;
        activity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.w(d0Var, i17, yVar, activity));
        db5.e1.Q(activity, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lbn), true, false, null);
        j45.l.o(activity, "webview", ".ui.tools.WebViewUI", this.f85646d, cf.b.a(yVar), true);
        return jz5.f0.f302826a;
    }
}
