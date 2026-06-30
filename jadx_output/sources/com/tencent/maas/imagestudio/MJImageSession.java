package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageSession {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48073a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJImageSession(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f48073a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeAddScenes(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, int i17);

    private native boolean nativeApplyTemplate(java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeCalcPoint(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.base.Vec2 nativeCalcRenderCoord(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.base.Vec2 nativeCalcViewPoint(com.tencent.maas.base.Vec2 vec2);

    private native boolean nativeClearTemplate();

    private native void nativeCommitUpdate(int i17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeConnectToView(java.lang.Object obj);

    private native com.tencent.maas.imagestudio.MJImageScene nativeCurrentScene();

    private native int nativeFindHandleBoxRectCorner(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native java.lang.String nativeGetCurrentTemplateID();

    private native com.tencent.maas.imagestudio.MJImageScene nativeGetImageScene(java.lang.String str);

    private native java.lang.Object[] nativeGetImageScenes();

    private native boolean nativeIsHandleBoxEnabled();

    private native boolean nativeIsHandleBoxHitted(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native boolean nativeIsTemplateLoaded(com.tencent.maas.model.MJTemplateMetadata mJTemplateMetadata);

    private native java.lang.String nativeLayerIDAtLocation(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets);

    private native void nativeLoadTemplate(com.tencent.maas.model.MJTemplateMetadata mJTemplateMetadata, int i17, int i18, int i19);

    private native boolean nativeMoveScene(java.lang.String str, java.lang.String str2);

    private native void nativeRemoveAllHandleBoxButtons();

    private native void nativeRemoveAllHandleBoxTitles();

    private native void nativeRemoveHandleBox();

    private native boolean nativeRemoveScene(java.lang.String str, java.lang.String str2);

    private native void nativeSetOnHandleBoxSettingsChangeCallback(int i17);

    private native void nativeShowHandleBox(java.lang.String str, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxTitle> list2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle);

    private native void nativeStartExporting(java.lang.String str, com.tencent.maas.imagestudio.MJImageExportSettings mJImageExportSettings, int i17, int i18);

    private native void nativeStartPlaying(boolean z17, int i17);

    private native void nativeStartup(java.lang.Object obj, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.imagestudio.MJImageMaskStyle mJImageMaskStyle, com.tencent.maas.imagestudio.MJImageSessionStartupSettings mJImageSessionStartupSettings, int i17);

    private native void nativeStopPlaying(int i17);

    private native boolean nativeSwitchScene(java.lang.String str);

    private native void nativeTeardown(int i17);

    private native void nativeUpdateHandleBoxEnabled(boolean z17);

    public void a(java.util.List list, com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, com.tencent.maas.imagestudio.g gVar) {
        nativeAddScenes(list, mJAssetInfo, this.f48073a.registerCallback(new com.tencent.maas.imagestudio.k(this, gVar)));
    }

    public void b(com.tencent.maas.imagestudio.h hVar) {
        int i17;
        if (hVar != null) {
            i17 = this.f48073a.registerCallback(new com.tencent.maas.imagestudio.l(this, hVar));
        } else {
            i17 = -1;
        }
        nativeCommitUpdate(0, i17);
    }

    public com.tencent.maas.imagestudio.MJImageScene c() {
        return nativeCurrentScene();
    }

    public void d() {
        nativeUpdateHandleBoxEnabled(false);
    }

    public void e() {
        nativeUpdateHandleBoxEnabled(true);
    }

    public com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner f(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        return com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.fromInt(nativeFindHandleBoxRectCorner(vec2, rect2));
    }

    public boolean g(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        return nativeIsHandleBoxHitted(vec2, rect2);
    }

    public java.lang.String getCurrentTemplateID() {
        return nativeGetCurrentTemplateID();
    }

    public com.tencent.maas.imagestudio.MJImageScene[] getImageScenes() {
        java.lang.Object[] nativeGetImageScenes = nativeGetImageScenes();
        return (com.tencent.maas.imagestudio.MJImageScene[]) java.util.Arrays.copyOf(nativeGetImageScenes, nativeGetImageScenes.length, com.tencent.maas.imagestudio.MJImageScene[].class);
    }

    public java.lang.String h(com.tencent.maas.base.Vec2 vec2) {
        return nativeLayerIDAtLocation(vec2, new com.tencent.maas.model.MJEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f));
    }

    public boolean i(java.lang.String str, java.lang.String str2) {
        return nativeMoveScene(str, str2);
    }

    public boolean isHandleBoxEnabled() {
        return nativeIsHandleBoxEnabled();
    }

    public void j() {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48073a;
        nativeCallbackManager.removeAllCallback();
        nativeCallbackManager.removeAllCallbackWithReturnValue();
        this.mHybridData.resetNative();
    }

    public void k() {
        nativeRemoveHandleBox();
    }

    public boolean l(java.lang.String str, java.lang.String str2) {
        return nativeRemoveScene(str, str2);
    }

    public void m(java.lang.String str, java.util.List list, java.util.List list2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle) {
        nativeShowHandleBox(str, list, list2, mJEdgeInsets, mJHandleBoxBorderStyle);
    }

    public void n(java.lang.String str, com.tencent.maas.imagestudio.MJImageExportSettings mJImageExportSettings, com.tencent.maas.imagestudio.j jVar, com.tencent.maas.imagestudio.i iVar) {
        com.tencent.maas.imagestudio.n nVar = new com.tencent.maas.imagestudio.n(this, jVar, false);
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = this.f48073a;
        nativeStartExporting(str, mJImageExportSettings, nativeCallbackManager.registerCallback(nVar), nativeCallbackManager.registerCallback(new com.tencent.maas.imagestudio.m(this, iVar)));
    }

    public void o(android.view.SurfaceView surfaceView, java.util.List list, com.tencent.maas.imagestudio.MJImageMaskStyle mJImageMaskStyle, com.tencent.maas.imagestudio.MJImageSessionStartupSettings mJImageSessionStartupSettings, com.tencent.maas.imagestudio.h hVar) {
        int i17;
        if (!(surfaceView instanceof io.clipworks.displaysys.DSRenderView)) {
            throw new java.lang.IllegalArgumentException("renderView must be SDK DSRenderView");
        }
        io.clipworks.displaysys.DSViewProxy dSViewProxy = ((io.clipworks.displaysys.DSRenderView) surfaceView).getDSViewProxy();
        if (hVar != null) {
            i17 = this.f48073a.registerCallback(new com.tencent.maas.imagestudio.o(this, hVar));
        } else {
            i17 = -1;
        }
        nativeStartup(dSViewProxy, list, mJImageMaskStyle, mJImageSessionStartupSettings, i17);
    }

    public boolean p(java.lang.String str) {
        return nativeSwitchScene(str);
    }

    public void q(com.tencent.maas.imagestudio.h hVar) {
        int i17;
        if (hVar != null) {
            i17 = this.f48073a.registerCallback(new com.tencent.maas.imagestudio.p(this, hVar));
        } else {
            i17 = -1;
        }
        nativeTeardown(i17);
    }
}
