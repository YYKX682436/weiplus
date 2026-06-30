package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class j0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f81857a;

    public j0(km5.b bVar) {
        this.f81857a = bVar;
    }

    @Override // nf.j
    public final void onResult(int i17, android.content.Intent intent) {
        km5.b bVar = this.f81857a;
        if (intent == null || i17 == 0) {
            bVar.c(com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a);
            return;
        }
        com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
        if (sightCaptureResult == null) {
            bVar.c(new com.tencent.mm.plugin.appbrand.jsapi.media.y("get null sight capture result"));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = new com.tencent.mm.plugin.appbrand.jsapi.media.z(kz5.b0.c(new com.tencent.mm.vfs.r6(sightCaptureResult.f148807e ? sightCaptureResult.f148815p : sightCaptureResult.f148809g)), 2);
        bVar.c(objArr);
    }
}
