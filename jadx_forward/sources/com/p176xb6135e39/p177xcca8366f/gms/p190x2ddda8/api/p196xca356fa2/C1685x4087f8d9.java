package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes */
/* loaded from: classes13.dex */
public final class C1685x4087f8d9 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449 {

    /* renamed from: SIGN_IN_CANCELLED */
    public static final int f5674xb2d061d9 = 12501;

    /* renamed from: SIGN_IN_CURRENTLY_IN_PROGRESS */
    public static final int f5675xa7e4b696 = 12502;

    /* renamed from: SIGN_IN_FAILED */
    public static final int f5676x70326095 = 12500;

    private C1685x4087f8d9() {
    }

    /* renamed from: getStatusCodeString */
    public static java.lang.String m17540x30a6166(int i17) {
        switch (i17) {
            case f5676x70326095 /* 12500 */:
                return "A non-recoverable sign in failure occurred";
            case f5674xb2d061d9 /* 12501 */:
                return "Sign in action cancelled";
            case f5675xa7e4b696 /* 12502 */:
                return "Sign-in in progress";
            default:
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(i17);
        }
    }
}
