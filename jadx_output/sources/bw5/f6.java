package bw5;

/* loaded from: classes9.dex */
public enum f6 implements com.tencent.mm.protobuf.h {
    RESULT_SUCCESS(0),
    RESULT_FAILED(1),
    RESULT_USE_CACHE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f27169d;

    f6(int i17) {
        this.f27169d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27169d;
    }
}
