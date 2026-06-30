package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public class e implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f79870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.e f79871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bio.face.f f79874e;

    public e(com.tencent.mm.plugin.appbrand.jsapi.bio.face.f fVar, boolean z17, com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79874e = fVar;
        this.f79870a = z17;
        this.f79871b = eVar;
        this.f79872c = lVar;
        this.f79873d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f79870a) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) this.f79871b).a(true);
        }
        int intExtra = intent != null ? intent.getIntExtra("err_code", 90199) : 90199;
        if (i17 != 1000 && i17 != 1001) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFaceAsyncBaseV2", "requestFacialVerify V2 errCode: %d", java.lang.Integer.valueOf(intExtra));
        int i19 = this.f79873d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79872c;
        com.tencent.mm.plugin.appbrand.jsapi.bio.face.f fVar = this.f79874e;
        if (intExtra == 0) {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "ok");
        } else if (intExtra == 90100) {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
        } else {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "fail");
        }
        return true;
    }
}
