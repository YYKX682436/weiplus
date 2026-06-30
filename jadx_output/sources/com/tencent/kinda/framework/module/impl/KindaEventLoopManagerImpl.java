package com.tencent.kinda.framework.module.impl;

/* loaded from: classes15.dex */
public class KindaEventLoopManagerImpl implements com.tencent.kinda.gen.EventLoopManager {
    private com.tencent.kinda.gen.KEventLoop bgLoop;
    private com.tencent.kinda.gen.KEventLoop makeSureUILoop;
    private com.tencent.kinda.gen.KEventLoop uiLoop;

    @Override // com.tencent.kinda.gen.EventLoopManager
    public com.tencent.kinda.gen.KEventLoop getBackGroundEventLoop() {
        if (this.bgLoop == null) {
            this.bgLoop = new com.tencent.kinda.framework.module.impl.KindaUIEventLoop();
        }
        return this.bgLoop;
    }

    @Override // com.tencent.kinda.gen.EventLoopManager
    public com.tencent.kinda.gen.KEventLoop getMakeSureUIEventLoop() {
        if (this.makeSureUILoop == null) {
            this.makeSureUILoop = new com.tencent.kinda.framework.module.impl.KindaUIEventLoop();
        }
        return this.makeSureUILoop;
    }

    @Override // com.tencent.kinda.gen.EventLoopManager
    public com.tencent.kinda.gen.KEventLoop getUIEventLoop() {
        if (this.uiLoop == null) {
            this.uiLoop = new com.tencent.kinda.framework.module.impl.KindaUIEventLoop();
        }
        return this.uiLoop;
    }
}
