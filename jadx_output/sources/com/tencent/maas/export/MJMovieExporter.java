package com.tencent.maas.export;

/* loaded from: classes5.dex */
public class MJMovieExporter {
    private final com.facebook.jni.HybridData mHybridData;

    public MJMovieExporter(android.os.Handler handler) {
        this.mHybridData = initHybrid(handler, new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper()));
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native com.tencent.maas.instamovie.base.MJError nativeCancelExporting(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativePauseExporting(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeResumeExporting(int i17);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartExporting(int i17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeTeardown(int i17);
}
