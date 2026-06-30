package bw5;

/* loaded from: classes11.dex */
public enum bq0 implements com.tencent.mm.protobuf.h {
    TingNetType_Unknown(0),
    TingNetType_Wifi(1),
    TingNetType_2G(2),
    TingNetType_3G(3),
    TingNetType_4G(4),
    TingNetType_5G(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f25796d;

    bq0(int i17) {
        this.f25796d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25796d;
    }
}
