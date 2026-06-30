package com.tencent.map.tools.net.exception;

/* loaded from: classes7.dex */
public class NetDataEmptyException extends java.lang.Exception {
    private static final long serialVersionUID = -5614711401833110994L;

    public NetDataEmptyException() {
    }

    public NetDataEmptyException(java.lang.String str) {
        super(str);
    }

    public NetDataEmptyException(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }
}
