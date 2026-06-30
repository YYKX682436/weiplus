package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface EventLoopManager {
    com.tencent.kinda.gen.KEventLoop getBackGroundEventLoop();

    com.tencent.kinda.gen.KEventLoop getMakeSureUIEventLoop();

    com.tencent.kinda.gen.KEventLoop getUIEventLoop();
}
