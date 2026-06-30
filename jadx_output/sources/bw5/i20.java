package bw5;

/* loaded from: classes14.dex */
public enum i20 implements com.tencent.mm.protobuf.h {
    nullType(0),
    intType(1),
    floatType(2),
    boolType(3),
    stringType(4),
    bytesType(5),
    mapType(6),
    listType(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f28443d;

    i20(int i17) {
        this.f28443d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28443d;
    }
}
