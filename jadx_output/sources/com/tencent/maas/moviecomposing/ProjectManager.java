package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class ProjectManager {
    private final com.facebook.jni.HybridData mHybridData;

    private ProjectManager(android.os.Handler handler) {
        this.mHybridData = initHybrid(handler, new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper()));
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeCancelPrepareProjectResource(com.tencent.maas.moviecomposing.Project project);

    private native void nativePrepareProjectResource(com.tencent.maas.moviecomposing.Project project, int i17, int i18, int i19);

    private native com.tencent.maas.moviecomposing.Project natvieLoadProject(java.nio.ByteBuffer byteBuffer);
}
