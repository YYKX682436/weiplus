package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class p implements com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n f47513a;

    public p(com.tencent.luggage.sdk.jsapi.component.service.n nVar) {
        this.f47513a = nVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback
    public void onNetWeakChange(boolean z17) {
        be1.b.x(this.f47513a.F(), z17);
    }
}
