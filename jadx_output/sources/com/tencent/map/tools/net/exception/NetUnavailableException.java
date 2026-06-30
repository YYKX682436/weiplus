package com.tencent.map.tools.net.exception;

/* loaded from: classes13.dex */
public class NetUnavailableException extends com.tencent.map.tools.net.exception.NetErrorException {
    private static final long serialVersionUID = 2783283891376573878L;

    public NetUnavailableException() {
    }

    public NetUnavailableException(java.lang.String str) {
        super(str);
    }

    public NetUnavailableException(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }
}
