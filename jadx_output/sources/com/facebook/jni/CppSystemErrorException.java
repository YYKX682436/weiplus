package com.facebook.jni;

/* loaded from: classes16.dex */
public class CppSystemErrorException extends com.facebook.jni.CppException {
    int errorCode;

    public CppSystemErrorException(java.lang.String str, int i17) {
        super(str);
        this.errorCode = i17;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
