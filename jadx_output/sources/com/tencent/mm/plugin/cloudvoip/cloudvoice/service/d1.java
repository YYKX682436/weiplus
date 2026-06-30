package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e1 f95887e;

    public d1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e1 e1Var, int i17) {
        this.f95887e = e1Var;
        this.f95886d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e1 e1Var = this.f95887e;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = e1Var.f95894a;
        boolean z17 = p0Var.R;
        int i17 = this.f95886d;
        if (z17) {
            p0Var.h();
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = e1Var.f95894a;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = p0Var2.J1;
            if (bVar != null) {
                p0Var2.d(bVar, -10086, -6, "join room failed, now is callend: " + i17);
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var3 = e1Var.f95894a;
        if (p0Var3.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: current not in room");
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var4 = e1Var.f95894a;
            p0Var4.Y = -1L;
            p0Var4.i();
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar2 = p0Var3.B;
        if (bVar2 != null) {
            bVar2.a(-10087, i17, "call end", p0Var3.f96025p);
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var5 = e1Var.f95894a;
        p0Var5.Y = -1L;
        p0Var5.f96024o = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.NotInRoom;
        p0Var5.i();
    }
}
