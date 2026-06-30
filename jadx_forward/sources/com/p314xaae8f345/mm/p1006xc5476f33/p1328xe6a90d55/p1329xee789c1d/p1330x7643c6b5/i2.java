package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f177454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f177455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j2 f177457h;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j2 j2Var, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar, java.lang.String str) {
        this.f177457h = j2Var;
        this.f177453d = i17;
        this.f177454e = i18;
        this.f177455f = oVar;
        this.f177456g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j2 j2Var = this.f177457h;
        int i17 = this.f177454e;
        int i18 = this.f177453d;
        if (i18 == 0 && i17 == 0 && (fVar = this.f177455f.f152244b.f152233a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = j2Var.f177462c;
            long j17 = ((r45.t24) fVar).f467610d;
            p0Var.Y = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.b(p0Var, j17, j2Var.f177461b, j2Var.f177460a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: getroomId fail, errType:" + i18 + ",errCode:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var2 = j2Var.f177462c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = j2Var.f177460a;
        java.lang.String format = java.lang.String.format("join room failed. errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f177456g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        p0Var2.d(bVar, -10088, -10, format);
    }
}
