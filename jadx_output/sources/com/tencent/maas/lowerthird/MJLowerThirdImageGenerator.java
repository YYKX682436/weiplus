package com.tencent.maas.lowerthird;

/* loaded from: classes5.dex */
public class MJLowerThirdImageGenerator {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48213a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJLowerThirdImageGenerator(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f48213a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeGenerate(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.maas.base.Vec2 vec2, int i17, int i18);

    private native void nativeGenerateWithScaleFactor(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, float f17, float f18, int i17);

    private native java.lang.String[] nativeGetFontNamesForLowerThird(java.lang.String str);

    private native com.tencent.maas.instamovie.base.MJError nativeRegisterFont(java.lang.String str, java.lang.String str2);

    private native com.tencent.maas.instamovie.base.MJError nativeRegisterLowerThird(java.lang.String str, java.lang.String str2);

    public void a(java.lang.String str, java.util.Map map, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.lowerthird.a aVar, com.tencent.maas.lowerthird.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f48213a.registerCallback(new com.tencent.maas.lowerthird.c(this, bVar));
        } else {
            i17 = -1;
        }
        nativeGenerate(str, map, vec2, aVar.f48216d, i17);
    }

    public java.util.List b(java.lang.String str) {
        return java.util.Arrays.asList(nativeGetFontNamesForLowerThird(str));
    }

    public com.tencent.maas.instamovie.base.MJError c(java.lang.String str, java.io.File file) {
        return nativeRegisterFont(str, file.getAbsolutePath());
    }

    public com.tencent.maas.instamovie.base.MJError d(java.lang.String str, java.io.File file) {
        return nativeRegisterLowerThird(str, file.getAbsolutePath());
    }

    public void e() {
        this.mHybridData.resetNative();
    }
}
