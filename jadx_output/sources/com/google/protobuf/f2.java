package com.google.protobuf;

/* loaded from: classes6.dex */
public enum f2 implements com.google.protobuf.p6 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f45073d;

    static {
        values();
    }

    f2(int i17) {
        this.f45073d = i17;
    }

    public static com.google.protobuf.f2 a(int i17) {
        if (i17 == 1) {
            return SPEED;
        }
        if (i17 == 2) {
            return CODE_SIZE;
        }
        if (i17 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f45073d;
    }
}
