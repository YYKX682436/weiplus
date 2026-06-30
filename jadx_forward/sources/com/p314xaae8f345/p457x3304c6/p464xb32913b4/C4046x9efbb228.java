package com.p314xaae8f345.p457x3304c6.p464xb32913b4;

/* renamed from: com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg */
/* loaded from: classes16.dex */
public class C4046x9efbb228 extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

    /* renamed from: com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg$CompleteArg */
    /* loaded from: classes16.dex */
    public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4046x9efbb228 {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f15920x5c4d208;

        public CompleteArg(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f15920x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg$ProgressArg */
    /* loaded from: classes16.dex */
    public static class ProgressArg extends com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4046x9efbb228 {

        /* renamed from: progress */
        public final float f15921xc454c22d;

        public ProgressArg(float f17) {
            this.f15921xc454c22d = f17;
        }
    }

    /* renamed from: com.tencent.maas.export.MJMovieExporterCallback$MJMovieExporterCallbackArg$TaskProgressArg */
    /* loaded from: classes16.dex */
    public static class TaskProgressArg extends com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4046x9efbb228 {

        /* renamed from: progress */
        public final float f15922xc454c22d;

        /* renamed from: taskTracePBData */
        public final java.nio.ByteBuffer f15923x116e8b7c;

        /* renamed from: timestamp */
        public final double f15924x3492916;

        public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
            this.f15922xc454c22d = f17;
            this.f15924x3492916 = d17;
            this.f15923x116e8b7c = byteBuffer;
        }
    }
}
