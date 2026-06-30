package com.tencent.map.tools.net.exception;

/* loaded from: classes7.dex */
public class NetCustomException extends java.lang.Exception {
    private static final long serialVersionUID = -5614711401833110994L;
    private java.lang.Exception exception;
    private int netCode;

    public NetCustomException() {
    }

    public java.lang.Exception getException() {
        return this.exception;
    }

    public int getNetCode() {
        return this.netCode;
    }

    public NetCustomException(java.lang.String str, java.lang.Exception exc, int i17) {
        super(str);
        this.exception = exc;
        this.netCode = i17;
    }
}
