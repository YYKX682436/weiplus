package bw5;

/* loaded from: classes6.dex */
public enum m implements com.tencent.mm.protobuf.h {
    AIMusicGenerationStatusIdle(0),
    AIMusicGenerationStatusGenerating(1),
    AIMusicGenerationStatusFinish(2),
    AIMusicGenerationStatusFail(3),
    AIMusicGenerationStatusCreating(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f30020d;

    m(int i17) {
        this.f30020d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30020d;
    }
}
