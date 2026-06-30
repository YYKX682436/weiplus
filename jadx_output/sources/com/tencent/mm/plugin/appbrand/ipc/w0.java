package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f78439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper f78440e;

    public w0(com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper resultReceiverFixLeak$ResultReceiverLifecycleWrapper, androidx.lifecycle.y yVar) {
        this.f78440e = resultReceiverFixLeak$ResultReceiverLifecycleWrapper;
        this.f78439d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78439d.mo133getLifecycle().a(this.f78440e);
    }
}
