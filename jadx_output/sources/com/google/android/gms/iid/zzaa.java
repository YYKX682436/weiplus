package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzaa extends java.lang.Exception {
    private final int errorCode;

    public zzaa(int i17, java.lang.String str) {
        super(str);
        this.errorCode = i17;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
