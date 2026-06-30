package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f144983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f144984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f144985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f144986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.cx4 f144987h;

    public n1(long j17, int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        this.f144983d = j17;
        this.f144984e = i17;
        this.f144985f = bArr;
        this.f144986g = bArr2;
        this.f144987h = cx4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "dispatch Downstream: syncNum=" + this.f144983d + ", func=" + this.f144984e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.k1 k1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1) ((a25.v) i95.n0.c(a25.v.class))).f270194e;
        com.p314xaae8f345.mm.p642xad8b531f.x1 x1Var = com.p314xaae8f345.mm.p642xad8b531f.x1.f145125a;
        k1Var.g((com.p314xaae8f345.mm.p642xad8b531f.y0) com.p314xaae8f345.mm.p642xad8b531f.x1.f145127c.mo141623x754a37bb(), this.f144984e, this.f144985f, this.f144986g, this.f144987h);
    }
}
