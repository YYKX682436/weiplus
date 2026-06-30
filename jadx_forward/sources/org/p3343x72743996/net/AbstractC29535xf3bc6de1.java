package org.p3343x72743996.net;

/* renamed from: org.chromium.net.NetworkException */
/* loaded from: classes16.dex */
public abstract class AbstractC29535xf3bc6de1 extends org.p3343x72743996.net.AbstractC29501x119930f2 {

    /* renamed from: ERROR_ADDRESS_UNREACHABLE */
    public static final int f74188x9ed329f2 = 9;

    /* renamed from: ERROR_CONNECTION_CLOSED */
    public static final int f74189xa85e2b56 = 5;

    /* renamed from: ERROR_CONNECTION_REFUSED */
    public static final int f74190x70751606 = 7;

    /* renamed from: ERROR_CONNECTION_RESET */
    public static final int f74191x69576a05 = 8;

    /* renamed from: ERROR_CONNECTION_TIMED_OUT */
    public static final int f74192x45cbf7dc = 6;

    /* renamed from: ERROR_HOSTNAME_NOT_RESOLVED */
    public static final int f74193xe0af8d79 = 1;

    /* renamed from: ERROR_INTERNET_DISCONNECTED */
    public static final int f74194x18411762 = 2;

    /* renamed from: ERROR_NETWORK_CHANGED */
    public static final int f74195x53beed0c = 3;

    /* renamed from: ERROR_OTHER */
    public static final int f74196x85eeb5d9 = 11;

    /* renamed from: ERROR_QUIC_PROTOCOL_FAILED */
    public static final int f74197xd01c21ba = 10;

    /* renamed from: ERROR_TIMED_OUT */
    public static final int f74198x580da06f = 4;

    public AbstractC29535xf3bc6de1(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
    }

    /* renamed from: getCronetInternalErrorCode */
    public abstract int mo153434xe755eb65();

    /* renamed from: getErrorCode */
    public abstract int mo153435x130a215f();

    /* renamed from: immediatelyRetryable */
    public abstract boolean mo153436x442c64a4();
}
