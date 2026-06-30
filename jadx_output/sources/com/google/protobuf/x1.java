package com.google.protobuf;

/* loaded from: classes6.dex */
public enum x1 implements com.google.protobuf.p6 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f45671d;

    static {
        values();
    }

    x1(int i17) {
        this.f45671d = i17;
    }

    public static com.google.protobuf.x1 a(int i17) {
        if (i17 == 0) {
            return STRING;
        }
        if (i17 == 1) {
            return CORD;
        }
        if (i17 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f45671d;
    }
}
