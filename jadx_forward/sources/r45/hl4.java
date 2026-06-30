package r45;

/* loaded from: classes6.dex */
public enum hl4 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kMicReplayFail(1),
    kMicReplayPending(2),
    kMicReplayExpired(5),
    kMicReplaySuccess(3),
    kMicReplayDefault(0),
    kMicReplayFailed(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f457799d;

    hl4(int i17) {
        this.f457799d = i17;
    }

    public static r45.hl4 a(int i17) {
        if (i17 == 0) {
            return kMicReplayDefault;
        }
        if (i17 == 1) {
            return kMicReplayFail;
        }
        if (i17 == 2) {
            return kMicReplayPending;
        }
        if (i17 == 3) {
            return kMicReplaySuccess;
        }
        if (i17 == 4) {
            return kMicReplayFailed;
        }
        if (i17 != 5) {
            return null;
        }
        return kMicReplayExpired;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f457799d;
    }
}
