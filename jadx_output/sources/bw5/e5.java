package bw5;

/* loaded from: classes6.dex */
public enum e5 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    SampleRate_None(-1),
    /* JADX INFO: Fake field, exist only in values array */
    SampleRate_OneTenth(0),
    SampleRate_OnePercent(1),
    /* JADX INFO: Fake field, exist only in values array */
    SampleRate_OneThousandth(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f26731d;

    e5(int i17) {
        this.f26731d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26731d;
    }
}
