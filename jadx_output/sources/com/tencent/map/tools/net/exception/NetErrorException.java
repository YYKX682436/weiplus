package com.tencent.map.tools.net.exception;

/* loaded from: classes13.dex */
public class NetErrorException extends java.io.IOException {
    public int errorCode;
    public int statusCode;

    public NetErrorException() {
    }

    public NetErrorException(java.lang.String str) {
        super(str);
    }

    public NetErrorException(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }
}
