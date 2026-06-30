package bw5;

/* loaded from: classes4.dex */
public enum z4 implements com.tencent.mm.protobuf.h {
    NET_NULL(0),
    NET_WIFI(1),
    NET_2G(2),
    NET_3G(3),
    NET_4G(4),
    NET_5G(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f35813d;

    z4(int i17) {
        this.f35813d = i17;
    }

    public static bw5.z4 a(int i17) {
        if (i17 == 0) {
            return NET_NULL;
        }
        if (i17 == 1) {
            return NET_WIFI;
        }
        if (i17 == 2) {
            return NET_2G;
        }
        if (i17 == 3) {
            return NET_3G;
        }
        if (i17 == 4) {
            return NET_4G;
        }
        if (i17 != 5) {
            return null;
        }
        return NET_5G;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35813d;
    }
}
