package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes13.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.media.record.c0 f85803a = new com.tencent.mm.plugin.appbrand.media.record.b0();

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return "aac".equalsIgnoreCase(str) || "mp3".equalsIgnoreCase(str) || "wav".equalsIgnoreCase(str) || "pcm".equalsIgnoreCase(str) || "opus".equalsIgnoreCase(str);
    }

    public static boolean b(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordUtil", "new audio file");
                return r6Var.k();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", e17, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", e18, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordUtil", "delete audio file");
        r6Var.l();
        try {
            return r6Var.k();
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", e19, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordUtil", e27, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        }
    }
}
