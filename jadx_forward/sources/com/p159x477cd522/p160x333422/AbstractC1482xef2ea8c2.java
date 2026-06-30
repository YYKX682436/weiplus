package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8ScriptException */
/* loaded from: classes7.dex */
public abstract class AbstractC1482xef2ea8c2 extends com.p159x477cd522.p160x333422.C1479xdecf3e19 {

    /* renamed from: contextTag */
    private final int f4817x10517f6b;

    /* renamed from: endColumn */
    private final int f4818x4453f811;

    /* renamed from: fileName */
    private final java.lang.String f4819xd425c627;

    /* renamed from: jsMessage */
    private final java.lang.String f4820xaaa0b67e;

    /* renamed from: jsStackTrace */
    private final java.lang.String f4821x1e335c6;

    /* renamed from: lineNumber */
    private final int f4822xec61b05d;

    /* renamed from: sourceLine */
    private final java.lang.String f4823xbdbd06af;

    /* renamed from: startColumn */
    private final int f4824x752e3258;

    public AbstractC1482xef2ea8c2(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, int i27, java.lang.String str4, java.lang.Throwable th6) {
        this.f4817x10517f6b = i17;
        this.f4819xd425c627 = str;
        this.f4822xec61b05d = i18;
        this.f4820xaaa0b67e = str2;
        this.f4823xbdbd06af = str3;
        this.f4824x752e3258 = i19;
        this.f4818x4453f811 = i27;
        this.f4821x1e335c6 = str4;
        if (th6 != null) {
            initCause(th6);
        }
    }

    /* renamed from: createCharSequence */
    private char[] m16442xd7ef1453(int i17, char c17) {
        char[] cArr = new char[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            cArr[i18] = c17;
        }
        return cArr;
    }

    /* renamed from: createJSStackDetails */
    private java.lang.String m16443x97554e7f() {
        if (this.f4821x1e335c6 == null) {
            return "";
        }
        return "\n" + this.f4821x1e335c6;
    }

    /* renamed from: createMessageDetails */
    private java.lang.String m16444x453fc857() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f4823xbdbd06af;
        if (str != null && !str.isEmpty()) {
            sb6.append('\n');
            sb6.append(this.f4823xbdbd06af);
            sb6.append('\n');
            int i17 = this.f4824x752e3258;
            if (i17 >= 0) {
                sb6.append(m16442xd7ef1453(i17, ' '));
                sb6.append(m16442xd7ef1453(this.f4818x4453f811 - this.f4824x752e3258, '^'));
            }
        }
        return sb6.toString();
    }

    /* renamed from: createMessageLine */
    private java.lang.String m16445xf91099ff() {
        return this.f4819xd425c627 + ":" + this.f4822xec61b05d + ": " + this.f4820xaaa0b67e;
    }

    /* renamed from: getContextTag */
    public int m16446xfe923761() {
        return this.f4817x10517f6b;
    }

    /* renamed from: getEndColumn */
    public int m16447x43c1695b() {
        return this.f4818x4453f811;
    }

    /* renamed from: getFileName */
    public java.lang.String m16448x5000039d() {
        return this.f4819xd425c627;
    }

    /* renamed from: getJSMessage */
    public java.lang.String m16449xade88be8() {
        return this.f4820xaaa0b67e;
    }

    /* renamed from: getJSStackTrace */
    public java.lang.String m16450xc63f701c() {
        return this.f4821x1e335c6;
    }

    /* renamed from: getLineNumber */
    public int m16451xdaa26853() {
        return this.f4822xec61b05d;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return m16445xf91099ff();
    }

    /* renamed from: getSourceLine */
    public java.lang.String m16452xabfdbea5() {
        return this.f4823xbdbd06af;
    }

    /* renamed from: getStartColumn */
    public int m16453x4f047922() {
        return this.f4824x752e3258;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return m16445xf91099ff() + m16444x453fc857() + m16443x97554e7f() + "\n" + getClass().getName();
    }
}
