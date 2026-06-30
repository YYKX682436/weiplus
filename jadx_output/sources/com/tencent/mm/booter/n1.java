package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f63450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f63451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f63452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f63453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f63454h;

    public n1(long j17, int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        this.f63450d = j17;
        this.f63451e = i17;
        this.f63452f = bArr;
        this.f63453g = bArr2;
        this.f63454h = cx4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch Downstream: syncNum=" + this.f63450d + ", func=" + this.f63451e);
        com.tencent.mm.plugin.zero.k1 k1Var = ((com.tencent.mm.plugin.zero.m1) ((a25.v) i95.n0.c(a25.v.class))).f188661e;
        com.tencent.mm.booter.x1 x1Var = com.tencent.mm.booter.x1.f63592a;
        k1Var.g((com.tencent.mm.booter.y0) com.tencent.mm.booter.x1.f63594c.getValue(), this.f63451e, this.f63452f, this.f63453g, this.f63454h);
    }
}
