package bw5;

/* loaded from: classes6.dex */
public enum i implements com.tencent.mm.protobuf.h {
    AIGenerationBillResultTypeIdle(0),
    AIGenerationBillResultTypeSuccess(1),
    AIGenerationBillResultTypeFail(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f28398d;

    i(int i17) {
        this.f28398d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28398d;
    }
}
