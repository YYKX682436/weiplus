package bw5;

/* loaded from: classes11.dex */
public enum p4 implements com.tencent.mm.protobuf.h {
    NormalState(0),
    ServerDelete(1),
    LocalDelete(2),
    Posting(3),
    Fail(4),
    Fail_Retry(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f31461d;

    p4(int i17) {
        this.f31461d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f31461d;
    }
}
