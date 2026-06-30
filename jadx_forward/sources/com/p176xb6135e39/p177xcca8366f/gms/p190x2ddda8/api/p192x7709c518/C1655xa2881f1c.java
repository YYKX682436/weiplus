package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes */
/* loaded from: classes13.dex */
public final class C1655xa2881f1c extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449 {

    /* renamed from: CHALLENGE_NOT_ALLOWED */
    public static final int f5476xd54d9e00 = 20503;

    /* renamed from: INVALID_REQUEST */
    public static final int f5477xbcf1dc07 = 20502;

    /* renamed from: NOT_ALLOWED_SECURITY */
    public static final int f5478x2461d423 = 20500;

    /* renamed from: NO_DATA_AVAILABLE */
    public static final int f5479x8c55fa92 = 20501;

    /* renamed from: SESSION_INACTIVE */
    public static final int f5480xb1f15414 = 20504;

    private C1655xa2881f1c() {
    }

    /* renamed from: getStatusCodeString */
    public static java.lang.String m17348x30a6166(int i17) {
        switch (i17) {
            case f5478x2461d423 /* 20500 */:
                return "NOT_ALLOWED_SECURITY";
            case f5479x8c55fa92 /* 20501 */:
                return "NO_DATA_AVAILABLE";
            case f5477xbcf1dc07 /* 20502 */:
                return "INVALID_REQUEST";
            case f5476xd54d9e00 /* 20503 */:
                return "CHALLENGE_NOT_ALLOWED";
            case f5480xb1f15414 /* 20504 */:
                return "SESSION_INACTIVE";
            default:
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(i17);
        }
    }
}
