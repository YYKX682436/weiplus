package com.tencent.ilink.base;

/* loaded from: classes.dex */
public enum IlinkErrorCode implements com.tencent.mm.protobuf.h {
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

    public static final int ILINK_ERROR_AEPROXY_ARG_VALUE = 15;
    public static final int ILINK_ERROR_AEPROXY_NO_DATA_VALUE = 12;
    public static final int ILINK_ERROR_AEPROXY_SYS_VALUE = 14;
    public static final int ILINK_ERROR_AEPROXY_UNKNOWN_VALUE = 11;
    public static final int ILINK_ERROR_APP_ECDH_DECRYPT_VALUE = 23;
    public static final int ILINK_ERROR_APP_NO_DATA_VALUE = 25;
    public static final int ILINK_ERROR_APP_SESSION_TIMEOUT_VALUE = 22;
    public static final int ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT_VALUE = 26;
    public static final int ILINK_ERROR_APP_UNKNOWN_VALUE = 21;
    public static final int ILINK_ERROR_APP_UNPACK_VALUE = 24;
    public static final int ILINK_ERROR_DNS_RESOLVE_VALUE = 41;
    public static final int ILINK_ERROR_HANDLE_RESPONSE_VALUE = 1;
    public static final int ILINK_ERROR_LONGPOLLING_TIMEOUT_VALUE = 42;
    public static final int ILINK_ERROR_MARS_VALUE = 31;
    public static final int ILINK_ERROR_NETWORK_UNAVAILABLE_VALUE = 34;
    public static final int ILINK_ERROR_NONE_VALUE = 0;
    public static final int ILINK_ERROR_SEND_PACKAGE_TIMEOUT_VALUE = 35;
    public static final int ILINK_ERROR_SESSION_TIMEOUT_VALUE = 13;
    public static final int ILINK_ERROR_SOCKET_CREATE_VALUE = 36;
    public static final int ILINK_ERROR_SOCKET_DISCONNECTED_VALUE = 32;
    public static final int ILINK_ERROR_SOCKET_READ_VALUE = 38;
    public static final int ILINK_ERROR_SOCKET_RECV_VALUE = 39;
    public static final int ILINK_ERROR_SOCKET_SHUTDOWN_VALUE = 37;
    public static final int ILINK_ERROR_TASK_TIMEOUT_VALUE = 33;
    public static final int ILINK_ERROR_UNPACK_MXPKG_VALUE = 40;
    public final int value;

    IlinkErrorCode(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.base.IlinkErrorCode forNumber(int i17) {
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.base.IlinkErrorCode valueOf(int i17) {
        return forNumber(i17);
    }
}
