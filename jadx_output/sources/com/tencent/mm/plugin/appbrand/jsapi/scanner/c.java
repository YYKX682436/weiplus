package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82946e;

    public c(java.util.List list, yz5.l lVar) {
        this.f82945d = list;
        this.f82946e = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList jsApiDetectImageCode$A8KeyRespDataList = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList) obj;
        int size = this.f82945d.size();
        int size2 = jsApiDetectImageCode$A8KeyRespDataList.f82931d.size();
        yz5.l lVar = this.f82946e;
        if (size != size2) {
            lVar.invoke(null);
        } else {
            lVar.invoke(jsApiDetectImageCode$A8KeyRespDataList.f82931d);
        }
    }
}
