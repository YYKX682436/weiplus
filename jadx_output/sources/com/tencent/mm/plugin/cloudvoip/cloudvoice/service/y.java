package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class y extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 f96131d;

    public y(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 a0Var) {
        this.f96131d = a0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x(this));
    }
}
