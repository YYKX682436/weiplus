package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KTimerService {
    void dispatchAfterImpl(float f17, com.tencent.kinda.gen.VoidCallback voidCallback);

    void dispatchAsyncInBgThreadImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void dispatchAsyncInMainThreadImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void initIntervalAndCheckedCallbackImpl(float f17, com.tencent.kinda.gen.VoidCallback voidCallback);

    double now();

    void startTimeCheck();

    void stopTimeCheck();

    void throttleImpl(float f17, com.tencent.kinda.gen.VoidCallback voidCallback);
}
