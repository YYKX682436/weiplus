package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.IdentityProviders */
/* loaded from: classes13.dex */
public final class C1669x1eaa9d64 {

    /* renamed from: FACEBOOK */
    public static final java.lang.String f5595x4c478ac6 = "https://www.facebook.com";

    /* renamed from: GOOGLE */
    public static final java.lang.String f5596x7da65239 = "https://accounts.google.com";

    /* renamed from: LINKEDIN */
    public static final java.lang.String f5597x75db80fe = "https://www.linkedin.com";

    /* renamed from: MICROSOFT */
    public static final java.lang.String f5598xa07a40ce = "https://login.live.com";

    /* renamed from: PAYPAL */
    public static final java.lang.String f5599x8c4152f3 = "https://www.paypal.com";

    /* renamed from: TWITTER */
    public static final java.lang.String f5600xf42d3653 = "https://twitter.com";

    /* renamed from: YAHOO */
    public static final java.lang.String f5601x504d020 = "https://login.yahoo.com";

    private C1669x1eaa9d64() {
    }

    /* renamed from: getIdentityProviderForAccount */
    public static final java.lang.String m17447x8a13ff49(android.accounts.Account account) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(account, "account cannot be null");
        if ("com.google".equals(account.type)) {
            return f5596x7da65239;
        }
        if ("com.facebook.auth.login".equals(account.type)) {
            return f5595x4c478ac6;
        }
        return null;
    }
}
