package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public class c implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f79865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.e f79866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bio.face.d f79869e;

    public c(com.tencent.mm.plugin.appbrand.jsapi.bio.face.d dVar, boolean z17, com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79869e = dVar;
        this.f79865a = z17;
        this.f79866b = eVar;
        this.f79867c = lVar;
        this.f79868d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f79865a) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) this.f79866b).a(true);
        }
        int intExtra = intent != null ? intent.getIntExtra("err_code", 90199) : 90199;
        int i19 = this.f79868d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79867c;
        com.tencent.mm.plugin.appbrand.jsapi.bio.face.d dVar = this.f79869e;
        if (i17 == 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFaceAsyncBase", "requestWxFacePictureVerify errCode: %d", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 0) {
                com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "ok");
            } else if (intExtra == 90100) {
                com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "fail");
            }
            return true;
        }
        if (i17 != 1001) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "ok");
        } else if (intExtra == 90100) {
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "fail");
        }
        return true;
    }
}
