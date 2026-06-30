package bw5;

/* loaded from: classes7.dex */
public enum f5 implements com.tencent.mm.protobuf.h {
    UnknownPlatform(0),
    iOS(1),
    Android(2),
    OHOS(3),
    Mac(4),
    Windows(5),
    Linux(6),
    OHOS_PC(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f27156d;

    f5(int i17) {
        this.f27156d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27156d;
    }
}
