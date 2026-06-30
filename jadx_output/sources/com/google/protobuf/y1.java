package com.google.protobuf;

/* loaded from: classes6.dex */
public enum y1 implements com.google.protobuf.p6 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f45719d;

    static {
        values();
    }

    y1(int i17) {
        this.f45719d = i17;
    }

    public static com.google.protobuf.y1 a(int i17) {
        if (i17 == 0) {
            return JS_NORMAL;
        }
        if (i17 == 1) {
            return JS_STRING;
        }
        if (i17 != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f45719d;
    }
}
