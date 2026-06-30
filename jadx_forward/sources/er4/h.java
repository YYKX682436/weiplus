package er4;

/* loaded from: classes14.dex */
public enum h implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VOIPMP_FINISH_REASON_UNKNOWN(0),
    VOIPMP_FINISH_REASON_ERROR(1),
    VOIPMP_FINISH_REASON_INVITE_TIMEOUT(2),
    VOIPMP_FINISH_REASON_CANCEL(3),
    VOIPMP_FINISH_REASON_REJECT(4),
    VOIPMP_FINISH_REASON_ANOTHER_REJECT(5),
    VOIPMP_FINISH_REASON_BUSY(6),
    VOIPMP_FINISH_REASON_ANOTHER_HANGUP(7),
    VOIPMP_FINISH_REASON_ANOTHER_CANCEL(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f337631d;

    h(int i17) {
        this.f337631d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f337631d;
    }
}
