package com.tencent.maas.export;

/* loaded from: classes16.dex */
public class MJMovieExporterCallback$MJMovieExporterCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes16.dex */
    public static class CompleteArg extends com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes16.dex */
    public static class ProgressArg extends com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg {
        public final float progress;

        public ProgressArg(float f17) {
            this.progress = f17;
        }
    }

    /* loaded from: classes16.dex */
    public static class TaskProgressArg extends com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg {
        public final float progress;
        public final java.nio.ByteBuffer taskTracePBData;
        public final double timestamp;

        public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
            this.progress = f17;
            this.timestamp = d17;
            this.taskTracePBData = byteBuffer;
        }
    }
}
