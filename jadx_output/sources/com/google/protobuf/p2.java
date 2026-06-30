package com.google.protobuf;

/* loaded from: classes6.dex */
public enum p2 implements com.google.protobuf.p6 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f45380d;

    static {
        values();
    }

    p2(int i17) {
        this.f45380d = i17;
    }

    public static com.google.protobuf.p2 a(int i17) {
        if (i17 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i17 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i17 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f45380d;
    }
}
