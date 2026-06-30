package com.tencent.map.tools.net.exception;

/* loaded from: classes7.dex */
public class NetCanceledException extends java.io.IOException {
    private static final long serialVersionUID = -7835439581999472741L;

    public NetCanceledException() {
    }

    public NetCanceledException(java.lang.String str) {
        super(str);
    }

    public NetCanceledException(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }
}
