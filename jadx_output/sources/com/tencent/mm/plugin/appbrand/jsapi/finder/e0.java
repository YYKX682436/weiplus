package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class e0 implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g f81198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f81199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f81201d;

    public e0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar, com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, r45.br2 br2Var) {
        this.f81198a = gVar;
        this.f81199b = yVar;
        this.f81200c = str;
        this.f81201d = br2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar = this.f81198a;
        if (gVar != null) {
            gVar.a(z17, str);
        }
        if (z17) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            final java.lang.String str2 = this.f81200c;
            final r45.br2 br2Var = this.f81201d;
            final com.tencent.mm.plugin.appbrand.y yVar = this.f81199b;
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick>(str2, br2Var, a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f81167e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ r45.br2 f81168f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a0Var);
                    this.f81167e = str2;
                    this.f81168f = br2Var;
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = com.tencent.mm.plugin.appbrand.y.this.t3();
                    kotlin.jvm.internal.o.d(t37);
                    t37.N.a(new com.tencent.mm.plugin.appbrand.jsapi.finder.d0(this));
                    this.__eventId = -649149463;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick halfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick) {
                    com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick event = halfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick;
                    kotlin.jvm.internal.o.g(event, "event");
                    if (!kotlin.jvm.internal.o.b(event.f91142g, this.f81167e)) {
                        return false;
                    }
                    android.content.Context context = com.tencent.mm.plugin.appbrand.y.this.getContext();
                    com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest(this.f81168f);
                    java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                    com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest, null, null);
                    return true;
                }
            }.alive();
        }
    }
}
