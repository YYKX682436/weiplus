package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes6.dex */
public enum y1 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f127252d;

    static {
        m20961xcee59d22();
    }

    y1(int i17) {
        this.f127252d = i17;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y1 a(int i17) {
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f127252d;
    }
}
