package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class a3 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 f95827d;

    public a3(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var) {
        this.f95827d = b3Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f95827d.f95847r.post(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z2(this));
    }
}
