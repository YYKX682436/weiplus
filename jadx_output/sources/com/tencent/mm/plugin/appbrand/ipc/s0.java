package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.MainProcessTask f78436d;

    public s0(com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.a aVar, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask) {
        this.f78436d = mainProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78436d.z();
    }
}
