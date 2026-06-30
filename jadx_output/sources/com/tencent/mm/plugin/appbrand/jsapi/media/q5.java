package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class q5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 733;
    public static final java.lang.String NAME = "compressVideo";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f82017g = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.media.r7 r7Var;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f82017g;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressVideo", "is compressing now");
            lVar.a(i17, o("fail:is compressing now"));
            return;
        }
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressVideo", "fail:component is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:data src is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!optString.startsWith("wxfile://")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:src path not supported");
            lVar.a(i17, o("fail:src path not be supported"));
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        if (fileSystem == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:runtime fileSystem is null");
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        com.tencent.mm.vfs.r6 absoluteFile = fileSystem.getAbsoluteFile(optString);
        if (absoluteFile == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:srcFile is null");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        java.lang.String o17 = absoluteFile.o();
        if (!com.tencent.mm.vfs.w6.j(o17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:filePath is null or without exist file");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        if (!jSONObject.has("quality") && !jSONObject.has(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) && !jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS) && !jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "no quality config");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!jSONObject.has("quality")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressVideo", "compress with advance config");
            float optDouble = (float) jSONObject.optDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, 1.0d);
            float round = (optDouble <= 0.0f || optDouble > 1.0f) ? 1.0f : (java.lang.Math.round(optDouble * 10.0f) * 1.0f) / 10.0f;
            com.tencent.mm.plugin.appbrand.jsapi.media.s7 c17 = com.tencent.mm.plugin.appbrand.jsapi.media.t7.c(o17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressVideo", "fail:videoInfo is null");
                lVar.a(i17, o("fail:can't get info from video file"));
                return;
            }
            int round2 = java.lang.Math.round(c17.f82055e * round);
            int round3 = java.lang.Math.round(c17.f82056f * round);
            int i18 = com.tencent.mm.plugin.appbrand.jsapi.media.t7.f82083a;
            int optInt = jSONObject.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, java.lang.Math.round((i18 * 1.0f) / 1000.0f)) * 1000;
            if (optInt <= 0 || optInt >= c17.f82057g) {
                optInt = i18;
            }
            float optDouble2 = (float) jSONObject.optDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, com.tencent.mm.plugin.sight.base.d.f162409d);
            if (optDouble2 < 1.0f || optDouble2 > c17.f82058h) {
                optDouble2 = com.tencent.mm.plugin.sight.base.d.f162409d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressVideo", "ratio: %f, bitrate: %d, fps: %f", java.lang.Float.valueOf(round), java.lang.Integer.valueOf(optInt), java.lang.Float.valueOf(optDouble2));
            com.tencent.mm.plugin.appbrand.jsapi.media.r7 r7Var2 = (round2 == 0 || round3 == 0) ? new com.tencent.mm.plugin.appbrand.jsapi.media.r7(o17, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH, 0, 0, optInt, optDouble2) : new com.tencent.mm.plugin.appbrand.jsapi.media.r7(o17, 0, 0, round2, round3, optInt, optDouble2);
            atomicBoolean.compareAndSet(false, true);
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.p5(this, r7Var2, lVar, i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressVideo", "compress with quality config");
        java.lang.String optString2 = jSONObject.optString("quality");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressVideo", "quality: %s", optString2);
        com.tencent.mm.plugin.appbrand.jsapi.media.s7 c18 = com.tencent.mm.plugin.appbrand.jsapi.media.t7.c(o17);
        int i19 = c18 == null ? com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH : c18.f82055e;
        int i27 = c18 == null ? com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH : c18.f82056f;
        optString2.getClass();
        char c19 = 65535;
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals(ya.b.MEDIUM)) {
                    c19 = 0;
                    break;
                }
                break;
            case 107348:
                if (optString2.equals("low")) {
                    c19 = 1;
                    break;
                }
                break;
            case 3202466:
                if (optString2.equals("high")) {
                    c19 = 2;
                    break;
                }
                break;
        }
        switch (c19) {
            case 0:
                r7Var = new com.tencent.mm.plugin.appbrand.jsapi.media.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.5f), java.lang.Math.round(i27 * 0.5f), java.lang.Math.round(com.tencent.mm.plugin.appbrand.jsapi.media.t7.f82083a * 1.5f), com.tencent.mm.plugin.sight.base.d.f162409d);
                break;
            case 1:
                r7Var = new com.tencent.mm.plugin.appbrand.jsapi.media.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.3f), java.lang.Math.round(i27 * 0.3f), com.tencent.mm.plugin.appbrand.jsapi.media.t7.f82083a, com.tencent.mm.plugin.sight.base.d.f162409d);
                break;
            case 2:
                r7Var = new com.tencent.mm.plugin.appbrand.jsapi.media.r7(o17, 0, 0, java.lang.Math.round(i19 * 0.8f), java.lang.Math.round(i27 * 0.8f), java.lang.Math.round(com.tencent.mm.plugin.appbrand.jsapi.media.t7.f82083a * 2.0f), com.tencent.mm.plugin.sight.base.d.f162409d);
                break;
            default:
                r7Var = null;
                break;
        }
        atomicBoolean.compareAndSet(false, true);
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.p5(this, r7Var, lVar, i17));
    }
}
