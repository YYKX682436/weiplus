package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public class i implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f79875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.e f79876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bio.face.j f79879e;

    public i(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j jVar, boolean z17, com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79879e = jVar;
        this.f79875a = z17;
        this.f79876b = eVar;
        this.f79877c = lVar;
        this.f79878d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", "onResult");
        if (this.f79875a) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) this.f79876b).a(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.bio.face.j jVar = this.f79879e;
        int i19 = this.f79878d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79877c;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartFaceAction", "mmOnActivityResult NULL data, appId[%s], callbackId[%d]", lVar.getAppId(), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.C(jVar, lVar, i19, null, "fail:internal error");
            return true;
        }
        int a17 = com.tencent.mm.plugin.facedetect.model.k0.a(intent.getIntExtra("err_code", 0));
        int intExtra = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra2 = intent.getIntExtra("countFace", 0);
        long longExtra = intent.getLongExtra("totalTime", 0L);
        int intExtra3 = intent.getIntExtra("err_type", 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", "errCode:%s，scene:%s,countFace:%s,totalTime:%s,errorType:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra3));
        if (i17 != 63) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", "REQUEST_FACE_VERIFY_FOR_PAY resultCode: %d", java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 0, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, 0, java.lang.Integer.valueOf(a17));
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.C(jVar, lVar, i19, intent.getExtras(), "ok");
            return true;
        }
        if (i18 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 3, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, java.lang.Integer.valueOf(intExtra3), java.lang.Integer.valueOf(a17));
            com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.C(jVar, lVar, i19, intent.getExtras(), "fail");
            return true;
        }
        if (i18 != 0) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 2, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, 1, java.lang.Integer.valueOf(a17));
        com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.C(jVar, lVar, i19, intent.getExtras(), "cancel");
        return true;
    }
}
