package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes8.dex */
public final class n extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f152233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f152234b;

    public n(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, boolean z17) {
        this.f152233a = fVar;
        this.f152234b = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = this.f152233a.mo11468x92b714fd(bArr);
        this.f152233a = mo11468x92b714fd;
        if (mo11468x92b714fd instanceof r45.k66) {
            return ((r45.k66) mo11468x92b714fd).mo161589xb588696b();
        }
        if (mo11468x92b714fd instanceof r45.ny3) {
            o45.bh.b(this, ((r45.ny3) mo11468x92b714fd).mo11484xe92ab0a8());
            return ((r45.ny3) this.f152233a).mo11484xe92ab0a8().f458492d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommReqResp", "[fromProtoBuf] return 0; cmdId=%d", java.lang.Integer.valueOf(this.f152234b));
        return 0;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return this.f152234b;
    }
}
