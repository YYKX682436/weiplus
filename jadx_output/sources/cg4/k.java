package cg4;

/* loaded from: classes8.dex */
public abstract class k {
    public static void a(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceTransformTextReporter", "reportTransformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, result: %d, voiceLengthMs: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14220, 0, 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18 + i19), java.lang.Integer.valueOf(i27), str, java.lang.Integer.valueOf(i28));
    }
}
