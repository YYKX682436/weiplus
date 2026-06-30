package com.tencent.maas.internal;

/* loaded from: classes5.dex */
public abstract class b {
    public final boolean callOnce;

    public b() {
        this.callOnce = true;
    }

    public abstract java.lang.Object invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs);

    public b(boolean z17) {
        this.callOnce = z17;
    }
}
