package bw5;

/* loaded from: classes11.dex */
public enum jn0 implements com.tencent.mm.protobuf.h {
    STATUS_UNKNOWN(0),
    STATUS_ME_PROFILE(1),
    STATUS_ME_PROFILE_PULL_DOWN(2),
    STATUS_SQUARE_CARD(3),
    STATUS_HISTORY_CARD(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f29056d;

    jn0(int i17) {
        this.f29056d = i17;
    }

    public static bw5.jn0 a(int i17) {
        if (i17 == 0) {
            return STATUS_UNKNOWN;
        }
        if (i17 == 1) {
            return STATUS_ME_PROFILE;
        }
        if (i17 == 2) {
            return STATUS_ME_PROFILE_PULL_DOWN;
        }
        if (i17 == 3) {
            return STATUS_SQUARE_CARD;
        }
        if (i17 != 4) {
            return null;
        }
        return STATUS_HISTORY_CARD;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29056d;
    }
}
