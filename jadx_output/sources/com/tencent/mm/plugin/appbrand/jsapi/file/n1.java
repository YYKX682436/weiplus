package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class n1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 99;
    private static final java.lang.String NAME = "openDocument";

    /* renamed from: n, reason: collision with root package name */
    public static long f81100n = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f81101g;

    /* renamed from: h, reason: collision with root package name */
    public rh1.a f81102h;

    /* renamed from: i, reason: collision with root package name */
    public final kk3.b f81103i = new com.tencent.mm.plugin.appbrand.jsapi.file.l1(this);

    /* renamed from: m, reason: collision with root package name */
    public final kk3.b f81104m = new com.tencent.mm.plugin.appbrand.jsapi.file.m1(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f81100n < 1000) {
            lVar.a(i17, o("fail:document viewer already starting"));
            return;
        }
        f81100n = currentTimeMillis;
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("showMenu");
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null) {
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        this.f81101g = lVar.getAppId();
        java.lang.String c17 = s46.c.c(optString);
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest openFileRequest = new com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest();
        java.lang.String str = null;
        if (absoluteFile != null && lVar.getFileSystem() != null) {
            java.lang.String o17 = absoluteFile.o();
            if (!(o17 == null ? "" : o17).endsWith(c17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenDocument", "create new temp file for suffix");
                com.tencent.mm.vfs.r6 allocTempFile = lVar.getFileSystem().allocTempFile(java.lang.String.format("%s.%s", absoluteFile.getName(), c17));
                if (allocTempFile != null) {
                    if (!allocTempFile.m()) {
                        try {
                            allocTempFile.k();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    com.tencent.mm.vfs.w6.c(o17, allocTempFile.o());
                    if (allocTempFile.m() && allocTempFile.C() == absoluteFile.C()) {
                        str = allocTempFile.o();
                    }
                }
            }
            str = absoluteFile.o();
        }
        openFileRequest.f81019d = str;
        openFileRequest.f81020e = c17;
        openFileRequest.f81021f = this.f81101g;
        openFileRequest.f81022g = optBoolean;
        java.lang.String optString2 = jSONObject.optString("fileType");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            openFileRequest.f81020e = optString2;
        }
        com.tencent.mm.plugin.appbrand.ipc.d.b(context, openFileRequest, new com.tencent.mm.plugin.appbrand.jsapi.file.j1(this, lVar, context, i17));
        com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.file.k1(this, lVar));
    }
}
