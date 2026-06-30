package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class g extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f241465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f241466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e f241467c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.e eVar, java.lang.Integer num, yz5.l lVar) {
        this.f241467c = eVar;
        this.f241465a = num;
        this.f241466b = lVar;
    }

    @Override // qt5.f
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retryOpenCameraDelay ");
        sb6.append(this.f241465a);
        sb6.append("s: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = this.f241467c.f241459a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116.A;
        sb6.append(((qt5.c) c17345xe981d116.f296835e).f448190b);
        sb6.append(", cameraFacing:");
        sb6.append(((qt5.c) this.f241467c.f241459a.f296835e).f448206r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardRectView", sb6.toString());
        this.f241466b.mo146xb9724478(java.lang.Boolean.valueOf(((qt5.c) this.f241467c.f241459a.f296835e).f448190b));
    }
}
