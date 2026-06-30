package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class k extends com.tencent.luggage.sdk.launching.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f82242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l f82244g;

    public k(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l lVar, com.tencent.luggage.sdk.jsapi.component.service.y yVar, int i17) {
        this.f82244g = lVar;
        this.f82242e = yVar;
        this.f82243f = i17;
    }

    @Override // com.tencent.luggage.sdk.launching.h
    public void a(android.os.Parcelable parcelable) {
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l lVar = this.f82244g;
        int i17 = this.f82243f;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f82242e;
        if (bundle == null) {
            yVar.a(i17, lVar.o("fail:internal error"));
            return;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.class.getClassLoader());
        if (bundle.get("KEY_PRECONDITION_RESULT") != null) {
            yVar.a(i17, lVar.o("ok"));
            return;
        }
        java.lang.String string = bundle.getString("KEY_PRECONDITION_ERR_REASON");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        yVar.a(i17, lVar.o("fail ".concat(string)));
    }
}
