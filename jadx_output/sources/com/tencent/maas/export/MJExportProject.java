package com.tencent.maas.export;

/* loaded from: classes5.dex */
public class MJExportProject {
    private com.facebook.jni.HybridData mHybridData;

    private MJExportProject(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private static native com.facebook.jni.HybridData nativeCreate(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.instamovie.MJExportSettings mJExportSettings);

    private native java.lang.String nativeGetClipbundlePath();

    private native com.tencent.maas.instamovie.MJExportSettings nativeGetExportSettings();

    private native com.tencent.maas.model.time.MJTimeRange nativeGetExportTimerange();

    private native java.lang.String nativeGetOutputPath();

    private native java.lang.String nativeGetProjectPath();

    private static native com.facebook.jni.HybridData nativeOpenExist(java.lang.String str);
}
