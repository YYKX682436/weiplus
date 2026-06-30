package bw5;

/* loaded from: classes11.dex */
public enum p4 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    NormalState(0),
    ServerDelete(1),
    LocalDelete(2),
    Posting(3),
    Fail(4),
    Fail_Retry(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f112994d;

    p4(int i17) {
        this.f112994d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f112994d;
    }
}
