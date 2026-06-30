package bw5;

/* loaded from: classes11.dex */
public enum m2 implements com.tencent.mm.protobuf.h {
    BLENotifyLoginAndConnectReq(1),
    BLEConnectResultResp(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f30051d;

    m2(int i17) {
        this.f30051d = i17;
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30051d;
    }
}
