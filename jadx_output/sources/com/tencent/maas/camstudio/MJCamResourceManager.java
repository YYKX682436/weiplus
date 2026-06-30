package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class MJCamResourceManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f47897a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJCamResourceManager(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f47897a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    public static boolean f(java.lang.String str, long j17, java.lang.String str2) {
        return nativeIsLocalTemplateExists(str, j17, str2);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeCancelAll();

    private native void nativeCancelLoad(int i17);

    private native void nativeCancelLoadMaterial(int i17);

    private native void nativeCancelLoadMaterialPack(int i17);

    private native void nativeCancelLoadMusic(int i17);

    private native void nativeCancelSelectAndLoadMusic();

    private native com.tencent.maas.camstudio.MJBeautyAdjustmentDesc nativeGetBeautyAdjustmentDesc(java.lang.String str);

    private native java.lang.String nativeGetMusicFilePath(java.lang.String str);

    private native com.tencent.maas.camstudio.MJCamTemplateInfo nativeGetTemplateInfo(java.lang.String str, long j17);

    private native boolean nativeHasAigcTimeline(java.lang.String str, long j17);

    private static native boolean nativeIsLocalTemplateExists(java.lang.String str, long j17, java.lang.String str2);

    private native boolean nativeIsMusicLoaded(java.lang.String str);

    private native boolean nativeIsTemplateLoaded(java.lang.String str, long j17);

    private native int nativeLoadBuiltinCommonResources(int i17);

    private native int nativeLoadLocalTemplateComponents(java.lang.String str, long j17, int i17, int i18);

    private native int nativeLoadMaterial(java.lang.String str, int i17, int i18);

    private native int nativeLoadMaterialByInfo(java.lang.String str, long j17, java.lang.String str2, int i17, int i18);

    private native int nativeLoadMaterialPack(int i17, int i18);

    private native int nativeLoadMusic(java.lang.String str, int i17, int i18);

    private native int nativeLoadTemplate(java.lang.String str, int i17, int i18, int i19);

    private native int nativeLoadTemplateByMeta(com.tencent.maas.model.MJTemplateMetadata mJTemplateMetadata, int i17, int i18, int i19);

    private native void nativeRegisterLocalMusic(com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str);

    private native void nativeRegisterLocalStickerMaterialIfNeeded(java.lang.String str, long j17, java.lang.String str2, int i17);

    private static native com.tencent.maas.instamovie.base.MJError nativeRegisterLocalTemplate(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3);

    private native boolean nativeRemoveTemplate(java.lang.String str, long j17);

    private native void nativeSelectAndLoadMusic(java.util.List<java.lang.String> list, int i17, int i18);

    public static com.tencent.maas.instamovie.base.MJError p(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        return nativeRegisterLocalTemplate(str, j17, str2, str3);
    }

    public void a() {
        nativeCancelAll();
    }

    public void b(int i17) {
        nativeCancelLoad(i17);
    }

    public com.tencent.maas.camstudio.MJBeautyAdjustmentDesc c(java.lang.String str) {
        return nativeGetBeautyAdjustmentDesc(str);
    }

    public java.lang.String d(java.lang.String str) {
        return nativeGetMusicFilePath(str);
    }

    public com.tencent.maas.camstudio.MJCamTemplateInfo e(java.lang.String str, long j17) {
        return nativeGetTemplateInfo(str, j17);
    }

    public boolean g(java.lang.String str, long j17) {
        return nativeIsTemplateLoaded(str, j17);
    }

    public int h(com.tencent.maas.camstudio.r rVar) {
        int i17;
        if (rVar != null) {
            i17 = this.f47897a.registerCallback(new com.tencent.maas.camstudio.v(this, rVar));
        } else {
            i17 = -1;
        }
        return nativeLoadBuiltinCommonResources(i17);
    }

    public int i(java.lang.String str, long j17, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar) {
        int[] registerProgressWithComplete = this.f47897a.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.v(this, rVar));
        return nativeLoadLocalTemplateComponents(str, j17, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int j(java.lang.String str, long j17, java.lang.String str2, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f47897a;
        if (uVar == null) {
            return nativeLoadMaterialByInfo(str, j17, str2, -1, rVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.v(this, rVar)) : -1);
        }
        int[] registerProgressWithComplete = nativeCallbackManager.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.v(this, rVar));
        return nativeLoadMaterialByInfo(str, j17, str2, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int k(java.lang.String str, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f47897a;
        if (uVar == null) {
            return nativeLoadMaterial(str, -1, rVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.v(this, rVar)) : -1);
        }
        int[] registerProgressWithComplete = nativeCallbackManager.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.v(this, rVar));
        return nativeLoadMaterial(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int l(com.tencent.maas.material.g gVar, com.tencent.maas.camstudio.s sVar) {
        int i17;
        if (sVar != null) {
            i17 = this.f47897a.registerCallback(new com.tencent.maas.camstudio.w(this, sVar));
        } else {
            i17 = -1;
        }
        return nativeLoadMaterialPack(gVar.f48248d, i17);
    }

    public int m(java.lang.String str, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar) {
        int[] registerProgressWithComplete = this.f47897a.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.x(this, rVar));
        return nativeLoadMusic(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int n(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar) {
        int[] registerProgressWithComplete = this.f47897a.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.v(this, rVar));
        return nativeLoadTemplate(str, qVar.f47982d, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public void o(com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str) {
        nativeRegisterLocalMusic(mJMusicInfo, str);
    }

    public void q() {
        this.mHybridData.resetNative();
    }

    public void r(java.util.List list, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.t tVar) {
        int[] registerProgressWithComplete = this.f47897a.registerProgressWithComplete(new com.tencent.maas.camstudio.y(this, uVar, false), new com.tencent.maas.camstudio.x(this, tVar));
        nativeSelectAndLoadMusic(list, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }
}
