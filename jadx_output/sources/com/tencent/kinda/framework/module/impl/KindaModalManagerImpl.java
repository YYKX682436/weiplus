package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaModalManagerImpl implements com.tencent.kinda.gen.KindaModalManager {
    public static final java.lang.String TAG = "MicroMsg.KindaModalManagerImpl";

    @Override // com.tencent.kinda.gen.KindaModalManager
    public void addModalView(com.tencent.kinda.gen.IUIModal iUIModal) {
        com.tencent.mars.xlog.Log.i(TAG, "kinda call addModalView, modal: %s, %s", iUIModal.getReportUrl(), java.lang.Integer.valueOf(iUIModal.hashCode()));
        com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIModal(iUIModal);
    }

    public com.tencent.kinda.gen.IUIPagePlatformDelegate getPlatformDelegate() {
        return new com.tencent.kinda.gen.IUIPagePlatformDelegate() { // from class: com.tencent.kinda.framework.module.impl.KindaModalManagerImpl.2
            @Override // com.tencent.kinda.gen.IUIPagePlatformDelegate
            public com.tencent.kinda.gen.Platform currentPlatform() {
                return com.tencent.kinda.gen.Platform.ANDROID;
            }
        };
    }

    @Override // com.tencent.kinda.gen.KindaModalManager
    public void removeAllModalViews() {
        com.tencent.kinda.framework.widget.tools.ActivityController.removeAll();
    }

    @Override // com.tencent.kinda.gen.KindaModalManager
    public void removeModalViewImpl(com.tencent.kinda.gen.IUIModal iUIModal, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "kinda call reremoveModalView, modal: %s, %s", iUIModal.getReportUrl(), java.lang.Integer.valueOf(iUIModal.hashCode()));
        com.tencent.kinda.framework.widget.tools.ActivityController.remove(iUIModal);
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.KindaModalManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        });
    }
}
