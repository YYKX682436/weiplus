package com.tencent.liteav.videobase.egl;

/* loaded from: classes14.dex */
public final class d extends java.io.IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    public final int mErrorCode;
    private final java.lang.String mErrorMessage;

    public d(int i17) {
        this(i17, "");
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + ", " + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode + ", " + super.getMessage();
    }

    public d(int i17, java.lang.String str) {
        super(str);
        this.mErrorCode = i17;
        this.mErrorMessage = str;
    }

    public d(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.mErrorCode = i17;
        this.mErrorMessage = str;
    }
}
