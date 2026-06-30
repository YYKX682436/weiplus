package com.google.protobuf;

/* loaded from: classes16.dex */
public enum s1 implements com.google.protobuf.p6 {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f45485d;

    static {
        values();
    }

    s1(int i17) {
        this.f45485d = i17;
    }

    public static com.google.protobuf.s1 a(int i17) {
        if (i17 == 1) {
            return LABEL_OPTIONAL;
        }
        if (i17 == 2) {
            return LABEL_REQUIRED;
        }
        if (i17 != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f45485d;
    }
}
