package bw5;

/* loaded from: classes2.dex */
public enum ld implements com.tencent.mm.protobuf.h {
    CollectionEnterType_Unknow(0),
    CollectionEnterType_Active(1),
    CollectionEnterType_Passive(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f29754d;

    ld(int i17) {
        this.f29754d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29754d;
    }
}
