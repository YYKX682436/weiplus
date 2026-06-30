package bw5;

/* loaded from: classes6.dex */
public enum u implements com.tencent.mm.protobuf.h {
    ADDR_TYPE_WIFI(0),
    ADDR_TYPE_AWDL(1),
    ADDR_TYPE_WIFI_DIRECT(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f33670d;

    u(int i17) {
        this.f33670d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f33670d;
    }
}
