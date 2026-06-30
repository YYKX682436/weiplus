package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class b4 implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.c4 f81725c;

    public b4(com.tencent.mm.plugin.appbrand.jsapi.media.c4 c4Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f81725c = c4Var;
        this.f81723a = d0Var;
        this.f81724b = i17;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMessageFile", "resultCode:%d filePaths:%s", java.lang.Integer.valueOf(i17), arrayList);
        if (i17 == -1) {
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.a4(this, arrayList));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.c4 c4Var = this.f81725c;
        int i18 = this.f81724b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f81723a;
        if (i17 == 0) {
            d0Var.a(i18, c4Var.o("fail:cancel"));
            return;
        }
        if (i17 != 1) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            d0Var.a(i18, c4Var.o("fail"));
            return;
        }
        d0Var.a(i18, c4Var.o("fail:" + str));
    }
}
