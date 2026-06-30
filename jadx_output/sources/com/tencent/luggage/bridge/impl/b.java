package com.tencent.luggage.bridge.impl;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase f47201e;

    public b(com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase bridgedAndroidWebViewBase, java.lang.String str) {
        this.f47201e = bridgedAndroidWebViewBase;
        this.f47200d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f47201e.a(this.f47200d);
    }
}
