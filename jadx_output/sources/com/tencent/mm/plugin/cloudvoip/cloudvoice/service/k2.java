package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l2 f95935d;

    public k2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l2 l2Var) {
        this.f95935d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l2 l2Var = this.f95935d;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = l2Var.f95943b;
        if (p0Var.f96024o == com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.NotInRoom) {
            p0Var.f96024o = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.SdkInRoom;
        }
        p0Var.H1 = true;
        p0Var.y(l2Var.f95942a);
    }
}
