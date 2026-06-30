package bw5;

/* loaded from: classes14.dex */
public enum x1 implements com.tencent.mm.protobuf.h {
    PCMFormatUnknown(0),
    PCMFormatS16LE(1),
    PCMFormatS16BE(2),
    PCMFormatS24LE(3),
    PCMFormatFloat32LE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f34906d;

    x1(int i17) {
        this.f34906d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f34906d;
    }
}
