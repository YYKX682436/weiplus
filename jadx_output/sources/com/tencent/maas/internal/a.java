package com.tencent.maas.internal;

/* loaded from: classes5.dex */
public abstract class a {
    public final boolean callOnce;

    public a() {
        this.callOnce = true;
    }

    public abstract void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs);

    public a(boolean z17) {
        this.callOnce = z17;
    }
}
