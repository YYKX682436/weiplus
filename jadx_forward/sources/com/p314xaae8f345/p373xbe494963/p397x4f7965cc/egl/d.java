package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl;

/* loaded from: classes14.dex */
public final class d extends java.io.IOException {

    /* renamed from: serialVersionUID */
    private static final long f14918x3a3ed56c = 2723743254380545567L;

    /* renamed from: mErrorCode */
    public final int f14919x8e53fa28;

    /* renamed from: mErrorMessage */
    private final java.lang.String f14920xdf4d05ec;

    public d(int i17) {
        this(i17, "");
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        if (this.f14920xdf4d05ec != null) {
            return "EGL error code: " + this.f14919x8e53fa28 + ", " + this.f14920xdf4d05ec;
        }
        return "EGL error code: " + this.f14919x8e53fa28 + ", " + super.getMessage();
    }

    public d(int i17, java.lang.String str) {
        super(str);
        this.f14919x8e53fa28 = i17;
        this.f14920xdf4d05ec = str;
    }

    public d(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.f14919x8e53fa28 = i17;
        this.f14920xdf4d05ec = str;
    }
}
