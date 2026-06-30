package bw5;

/* loaded from: classes2.dex */
public enum ol implements com.tencent.mm.protobuf.h {
    NET_NULL(0),
    NET_WIFI(1),
    NET_2G(2),
    NET_3G(3),
    NET_4G(4),
    NET_5G(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f31148d;

    ol(int i17) {
        this.f31148d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f31148d;
    }
}
