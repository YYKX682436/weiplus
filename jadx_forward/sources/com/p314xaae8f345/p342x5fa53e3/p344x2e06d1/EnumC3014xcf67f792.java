package com.p314xaae8f345.p342x5fa53e3.p344x2e06d1;

/* renamed from: com.tencent.ilink.base.IlinkErrorCode */
/* loaded from: classes.dex */
public enum EnumC3014xcf67f792 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ILINK_ERROR_NONE(0),
    ILINK_ERROR_HANDLE_RESPONSE(1),
    ILINK_ERROR_AEPROXY_UNKNOWN(11),
    ILINK_ERROR_AEPROXY_NO_DATA(12),
    ILINK_ERROR_SESSION_TIMEOUT(13),
    ILINK_ERROR_AEPROXY_SYS(14),
    ILINK_ERROR_AEPROXY_ARG(15),
    ILINK_ERROR_APP_UNKNOWN(21),
    ILINK_ERROR_APP_SESSION_TIMEOUT(22),
    ILINK_ERROR_APP_ECDH_DECRYPT(23),
    ILINK_ERROR_APP_UNPACK(24),
    ILINK_ERROR_APP_NO_DATA(25),
    ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT(26),
    ILINK_ERROR_MARS(31),
    ILINK_ERROR_SOCKET_DISCONNECTED(32),
    ILINK_ERROR_TASK_TIMEOUT(33),
    ILINK_ERROR_NETWORK_UNAVAILABLE(34),
    ILINK_ERROR_SEND_PACKAGE_TIMEOUT(35),
    ILINK_ERROR_SOCKET_CREATE(36),
    ILINK_ERROR_SOCKET_SHUTDOWN(37),
    ILINK_ERROR_SOCKET_READ(38),
    ILINK_ERROR_SOCKET_RECV(39),
    ILINK_ERROR_UNPACK_MXPKG(40),
    ILINK_ERROR_DNS_RESOLVE(41),
    ILINK_ERROR_LONGPOLLING_TIMEOUT(42);


    /* renamed from: ILINK_ERROR_AEPROXY_ARG_VALUE */
    public static final int f10549x776309a0 = 15;

    /* renamed from: ILINK_ERROR_AEPROXY_NO_DATA_VALUE */
    public static final int f10551x251cd952 = 12;

    /* renamed from: ILINK_ERROR_AEPROXY_SYS_VALUE */
    public static final int f10553x3625d8d7 = 14;

    /* renamed from: ILINK_ERROR_AEPROXY_UNKNOWN_VALUE */
    public static final int f10555x8f137094 = 11;

    /* renamed from: ILINK_ERROR_APP_ECDH_DECRYPT_VALUE */
    public static final int f10557xfd93d653 = 23;

    /* renamed from: ILINK_ERROR_APP_NO_DATA_VALUE */
    public static final int f10559xb92330e9 = 25;

    /* renamed from: ILINK_ERROR_APP_SESSION_TIMEOUT_VALUE */
    public static final int f10561x69d7b6f9 = 22;

    /* renamed from: ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT_VALUE */
    public static final int f10563x735ea289 = 26;

    /* renamed from: ILINK_ERROR_APP_UNKNOWN_VALUE */
    public static final int f10565x2319c82b = 21;

    /* renamed from: ILINK_ERROR_APP_UNPACK_VALUE */
    public static final int f10567x655181f5 = 24;

    /* renamed from: ILINK_ERROR_DNS_RESOLVE_VALUE */
    public static final int f10569xe9667955 = 41;

    /* renamed from: ILINK_ERROR_HANDLE_RESPONSE_VALUE */
    public static final int f10571xeba36537 = 1;

    /* renamed from: ILINK_ERROR_LONGPOLLING_TIMEOUT_VALUE */
    public static final int f10573x7b4ca428 = 42;

    /* renamed from: ILINK_ERROR_MARS_VALUE */
    public static final int f10575xc96d271a = 31;

    /* renamed from: ILINK_ERROR_NETWORK_UNAVAILABLE_VALUE */
    public static final int f10577x9ef9107e = 34;

    /* renamed from: ILINK_ERROR_NONE_VALUE */
    public static final int f10579x5558b93d = 0;

    /* renamed from: ILINK_ERROR_SEND_PACKAGE_TIMEOUT_VALUE */
    public static final int f10581xad0344b6 = 35;

    /* renamed from: ILINK_ERROR_SESSION_TIMEOUT_VALUE */
    public static final int f10583xdcb85d37 = 13;

    /* renamed from: ILINK_ERROR_SOCKET_CREATE_VALUE */
    public static final int f10585xfc0b4747 = 36;

    /* renamed from: ILINK_ERROR_SOCKET_DISCONNECTED_VALUE */
    public static final int f10587x185d3e86 = 32;

    /* renamed from: ILINK_ERROR_SOCKET_READ_VALUE */
    public static final int f10589xa7fa12a1 = 38;

    /* renamed from: ILINK_ERROR_SOCKET_RECV_VALUE */
    public static final int f10591x2fec96f1 = 39;

    /* renamed from: ILINK_ERROR_SOCKET_SHUTDOWN_VALUE */
    public static final int f10593x4eb7e2e1 = 37;

    /* renamed from: ILINK_ERROR_TASK_TIMEOUT_VALUE */
    public static final int f10595xf6c4904c = 33;

    /* renamed from: ILINK_ERROR_UNPACK_MXPKG_VALUE */
    public static final int f10597x3650f7d9 = 40;

    /* renamed from: value */
    public final int f10598x6ac9171;

    EnumC3014xcf67f792(int i17) {
        this.f10598x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3014xcf67f792 m23061x382ad972(int i17) {
        if (i17 == 0) {
            return ILINK_ERROR_NONE;
        }
        if (i17 == 1) {
            return ILINK_ERROR_HANDLE_RESPONSE;
        }
        switch (i17) {
            case 11:
                return ILINK_ERROR_AEPROXY_UNKNOWN;
            case 12:
                return ILINK_ERROR_AEPROXY_NO_DATA;
            case 13:
                return ILINK_ERROR_SESSION_TIMEOUT;
            case 14:
                return ILINK_ERROR_AEPROXY_SYS;
            case 15:
                return ILINK_ERROR_AEPROXY_ARG;
            default:
                switch (i17) {
                    case 21:
                        return ILINK_ERROR_APP_UNKNOWN;
                    case 22:
                        return ILINK_ERROR_APP_SESSION_TIMEOUT;
                    case 23:
                        return ILINK_ERROR_APP_ECDH_DECRYPT;
                    case 24:
                        return ILINK_ERROR_APP_UNPACK;
                    case 25:
                        return ILINK_ERROR_APP_NO_DATA;
                    case 26:
                        return ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT;
                    default:
                        switch (i17) {
                            case 31:
                                return ILINK_ERROR_MARS;
                            case 32:
                                return ILINK_ERROR_SOCKET_DISCONNECTED;
                            case 33:
                                return ILINK_ERROR_TASK_TIMEOUT;
                            case 34:
                                return ILINK_ERROR_NETWORK_UNAVAILABLE;
                            case 35:
                                return ILINK_ERROR_SEND_PACKAGE_TIMEOUT;
                            case 36:
                                return ILINK_ERROR_SOCKET_CREATE;
                            case 37:
                                return ILINK_ERROR_SOCKET_SHUTDOWN;
                            case 38:
                                return ILINK_ERROR_SOCKET_READ;
                            case 39:
                                return ILINK_ERROR_SOCKET_RECV;
                            case 40:
                                return ILINK_ERROR_UNPACK_MXPKG;
                            case 41:
                                return ILINK_ERROR_DNS_RESOLVE;
                            case 42:
                                return ILINK_ERROR_LONGPOLLING_TIMEOUT;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10598x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3014xcf67f792 m23062xdce0328(int i17) {
        return m23061x382ad972(i17);
    }
}
