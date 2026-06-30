package bw5;

/* loaded from: classes11.dex */
public enum m2 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    BLENotifyLoginAndConnectReq(1),
    BLEConnectResultResp(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f111584d;

    m2(int i17) {
        this.f111584d = i17;
    }

    public static bw5.m2 a(int i17) {
        if (i17 == 1) {
            return BLENotifyLoginAndConnectReq;
        }
        if (i17 != 2) {
            return null;
        }
        return BLEConnectResultResp;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f111584d;
    }
}
