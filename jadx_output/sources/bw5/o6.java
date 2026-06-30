package bw5;

/* loaded from: classes6.dex */
public enum o6 implements com.tencent.mm.protobuf.h {
    EcsDecryptWordRespFlag_None(0),
    EcsDecryptWordRespFlag_IsSelf(1),
    EcsDecryptWordRespFlag_IsNotSelf(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f30988d;

    o6(int i17) {
        this.f30988d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30988d;
    }
}
