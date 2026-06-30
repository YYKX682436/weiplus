package bw5;

/* loaded from: classes4.dex */
public enum gd implements com.tencent.mm.protobuf.h {
    NET_NULL(0),
    NET_WIFI(1),
    NET_2G(2),
    NET_3G(3),
    NET_4G(4),
    NET_5G(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f27815d;

    gd(int i17) {
        this.f27815d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27815d;
    }
}
