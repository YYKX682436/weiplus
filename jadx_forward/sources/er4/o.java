package er4;

/* loaded from: classes14.dex */
public enum o implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VoIPMP_MEMBER_STATUS_UNKOWN(0),
    VoIPMP_MEMBER_STATUS_JOINED(1),
    VoIPMP_MEMBER_STATUS_CALLEE(2),
    VoIPMP_MEMBER_STATUS_ACKED(3),
    VoIPMP_MEMBER_STATUS_EXIT(4),
    VoIPMP_MEMBER_STATUS_CANCEL(5),
    VoIPMP_MEMBER_STATUS_BUSY(6),
    VoIPMP_MEMBER_STATUS_REJECT(7),
    VoIPMP_MEMBER_STATUS_NO_RESP(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f337679d;

    o(int i17) {
        this.f337679d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f337679d;
    }
}
