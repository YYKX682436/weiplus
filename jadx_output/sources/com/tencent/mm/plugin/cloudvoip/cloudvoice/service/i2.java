package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f95922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j2 f95924h;

    public i2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j2 j2Var, int i17, int i18, com.tencent.mm.modelbase.o oVar, java.lang.String str) {
        this.f95924h = j2Var;
        this.f95920d = i17;
        this.f95921e = i18;
        this.f95922f = oVar;
        this.f95923g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j2 j2Var = this.f95924h;
        int i17 = this.f95921e;
        int i18 = this.f95920d;
        if (i18 == 0 && i17 == 0 && (fVar = this.f95922f.f70711b.f70700a) != null) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = j2Var.f95929c;
            long j17 = ((r45.t24) fVar).f386077d;
            p0Var.Y = j17;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.b(p0Var, j17, j2Var.f95928b, j2Var.f95927a);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: getroomId fail, errType:" + i18 + ",errCode:" + i17);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = j2Var.f95929c;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = j2Var.f95927a;
        java.lang.String format = java.lang.String.format("join room failed. errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f95923g);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var3 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var2.d(bVar, -10088, -10, format);
    }
}
