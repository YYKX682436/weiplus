package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
public class j implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k f79905c;

    public j(com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k kVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79905c = kVar;
        this.f79903a = lVar;
        this.f79904b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1000) {
            return false;
        }
        int i19 = this.f79904b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79903a;
        com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k kVar = this.f79905c;
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth ok");
            com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.C(kVar, lVar, i19, intent != null ? intent.getExtras() : null, "ok");
        } else if (i18 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth failed");
            com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.C(kVar, lVar, i19, intent != null ? intent.getExtras() : null, "fail");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartSoterAuthentication", "hy: soter user cancelled");
            com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.C(kVar, lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
        }
        return true;
    }
}
