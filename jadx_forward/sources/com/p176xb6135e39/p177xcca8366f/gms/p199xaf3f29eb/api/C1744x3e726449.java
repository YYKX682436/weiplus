package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.CommonStatusCodes */
/* loaded from: classes13.dex */
public class C1744x3e726449 {

    /* renamed from: API_NOT_CONNECTED */
    public static final int f5872x7b317ad8 = 17;

    /* renamed from: CANCELED */
    public static final int f5873x274e7499 = 16;

    /* renamed from: CONNECTION_SUSPENDED_DURING_CALL */
    public static final int f5874x4e5dfe77 = 20;

    /* renamed from: DEVELOPER_ERROR */
    public static final int f5875x75664d13 = 10;

    /* renamed from: ERROR */
    public static final int f5876x3f2d9e8 = 13;

    /* renamed from: INTERNAL_ERROR */
    public static final int f5877xe30e31e6 = 8;

    /* renamed from: INTERRUPTED */
    public static final int f5878xc3cc222 = 14;

    /* renamed from: INVALID_ACCOUNT */
    public static final int f5879x357673a5 = 5;

    /* renamed from: NETWORK_ERROR */
    public static final int f5880xcb8ee077 = 7;

    /* renamed from: RECONNECTION_TIMED_OUT */
    public static final int f5881x8968e898 = 22;

    /* renamed from: RECONNECTION_TIMED_OUT_DURING_UPDATE */
    public static final int f5882x6d946520 = 21;

    /* renamed from: REMOTE_EXCEPTION */
    public static final int f5883x5098a776 = 19;

    /* renamed from: RESOLUTION_REQUIRED */
    public static final int f5884x3cf969d2 = 6;

    /* renamed from: SERVICE_DISABLED */
    @java.lang.Deprecated
    public static final int f5885x18fd20e6 = 3;

    /* renamed from: SERVICE_VERSION_UPDATE_REQUIRED */
    @java.lang.Deprecated
    public static final int f5886x83982924 = 2;

    /* renamed from: SIGN_IN_REQUIRED */
    public static final int f5887xed6b3df7 = 4;

    /* renamed from: SUCCESS */
    public static final int f5888xbb80cbe3 = 0;

    /* renamed from: SUCCESS_CACHE */
    public static final int f5889x3a8e3006 = -1;

    /* renamed from: TIMEOUT */
    public static final int f5890xdc7ad941 = 15;

    /* renamed from: getStatusCodeString */
    public static java.lang.String m17735x30a6166(int i17) {
        switch (i17) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i17;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.f6097xbb18f1ea;
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
