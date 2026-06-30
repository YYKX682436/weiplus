package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class MJMaterialManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48231a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJMaterialManager(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f48231a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeCancelAll();

    private native void nativeCancelLoadMaterial(int i17);

    private native void nativeCancelLoadMaterialPack(int i17);

    private native java.lang.Object[] nativeGetColorStyleMaterialInfos(java.lang.String str);

    private native com.tencent.maas.material.MJMaterialInfo nativeGetMaterialInfo(java.lang.String str);

    private native boolean nativeIsLocalMaterialLoaded(java.lang.String str);

    private native boolean nativeIsMaterialLoaded(java.lang.String str);

    private native int nativeLoadMaterial(java.lang.String str, int i17, int i18);

    private native int nativeLoadMaterialPack(int i17, java.util.Map<java.lang.String, java.lang.String> map, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeRegisterLocalStickerMaterial(java.lang.String str, long j17, java.lang.String str2);

    private native void nativeWaitLoadingLocalMaterial(int i17);

    public com.tencent.maas.material.MJMaterialInfo a(java.lang.String str) {
        return nativeGetMaterialInfo(str);
    }

    public void b() {
        nativeCancelAll();
    }

    public java.util.List c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] nativeGetColorStyleMaterialInfos = nativeGetColorStyleMaterialInfos(str);
        if (nativeGetColorStyleMaterialInfos != null) {
            for (java.lang.Object obj : nativeGetColorStyleMaterialInfos) {
                arrayList.add((com.tencent.maas.material.MJMaterialInfo) obj);
            }
        }
        return arrayList;
    }

    public boolean d(java.lang.String str) {
        return nativeIsLocalMaterialLoaded(str);
    }

    public boolean e(java.lang.String str) {
        return nativeIsMaterialLoaded(str);
    }

    public int f(java.lang.String str, com.tencent.maas.material.c cVar, com.tencent.maas.material.a aVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48231a;
        if (cVar == null) {
            return nativeLoadMaterial(str, -1, aVar != null ? nativeCallbackManager.registerCallback(new com.tencent.maas.material.d(this, aVar)) : -1);
        }
        int[] registerProgressWithComplete = nativeCallbackManager.registerProgressWithComplete(new com.tencent.maas.material.f(this, cVar, false), new com.tencent.maas.material.d(this, aVar));
        return nativeLoadMaterial(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int g(com.tencent.maas.material.g gVar, com.tencent.maas.material.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f48231a.registerCallback(new com.tencent.maas.material.e(this, bVar));
        } else {
            i17 = -1;
        }
        return nativeLoadMaterialPack(gVar.f48248d, new java.util.HashMap(), i17);
    }

    public com.tencent.maas.instamovie.base.MJError h(java.lang.String str, long j17, java.lang.String str2) {
        return nativeRegisterLocalStickerMaterial(str, j17, str2);
    }

    public void i() {
        this.mHybridData.resetNative();
    }
}
