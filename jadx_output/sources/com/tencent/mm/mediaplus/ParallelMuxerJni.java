package com.tencent.mm.mediaplus;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0082 J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082 J)\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0082 J!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082 J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 JN\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 ¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/mediaplus/ParallelMuxerJni;", "Lrj/m;", "", "nCreate", "nPtr", "", "ptsArray", "", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, "", "nAddVideoPtsArray", "size", "nAddVideoSoftPtsArray", "dtsArray", "nAddVideoDtsArray", "nAddAudioPtsArray", "", "", "h264Files", "aacPath", "outputPath", "frameCount", "suggestFps", "", "mute", "nMux", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFZ)I", "nRelease", "mediaplus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ParallelMuxerJni extends rj.m {

    /* renamed from: a, reason: collision with root package name */
    public long f68953a = -1;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("mediaplus");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mediaplus/ParallelMuxerJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mediaplus/ParallelMuxerJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private final native int nAddAudioPtsArray(long nPtr, long[] ptsArray);

    private final native int nAddVideoDtsArray(long nPtr, long[] dtsArray, float fps);

    private final native int nAddVideoPtsArray(long nPtr, long[] ptsArray, float fps);

    private final native int nAddVideoSoftPtsArray(long nPtr, long[] ptsArray, int size, float fps);

    private final native long nCreate();

    private final native int nMux(long nPtr, java.lang.String[] h264Files, java.lang.String aacPath, java.lang.String outputPath, long frameCount, float suggestFps, boolean mute);

    private final native int nRelease(long nPtr);

    public final int a(long[] ptsArray) {
        kotlin.jvm.internal.o.g(ptsArray, "ptsArray");
        return nAddAudioPtsArray(this.f68953a, ptsArray);
    }

    public final int b(long[] dtsArray, float f17) {
        kotlin.jvm.internal.o.g(dtsArray, "dtsArray");
        return nAddVideoDtsArray(this.f68953a, dtsArray, f17);
    }

    public final int c(long[] ptsArray, float f17) {
        kotlin.jvm.internal.o.g(ptsArray, "ptsArray");
        return nAddVideoPtsArray(this.f68953a, ptsArray, f17);
    }

    public final int d(long[] ptsArray, int i17, float f17) {
        kotlin.jvm.internal.o.g(ptsArray, "ptsArray");
        return nAddVideoSoftPtsArray(this.f68953a, ptsArray, i17, f17);
    }

    public final boolean e() {
        long nCreate = nCreate();
        this.f68953a = nCreate;
        return nCreate >= 0;
    }

    public final int f(java.lang.String[] h264Files, java.lang.String aacPath, java.lang.String outputPath, long j17, float f17, boolean z17) {
        kotlin.jvm.internal.o.g(h264Files, "h264Files");
        kotlin.jvm.internal.o.g(aacPath, "aacPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        return nMux(this.f68953a, h264Files, aacPath, outputPath, j17, f17, z17);
    }

    public final int g() {
        return nRelease(this.f68953a);
    }
}
