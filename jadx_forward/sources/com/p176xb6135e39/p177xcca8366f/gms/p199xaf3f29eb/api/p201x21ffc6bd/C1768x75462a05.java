package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.ApiKey */
/* loaded from: classes13.dex */
public final class C1768x75462a05<O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> {
    private final int zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api zab;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 zac;
    private final java.lang.String zad;

    private C1768x75462a05(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44 interfaceC1734x98b0cf44, java.lang.String str) {
        this.zab = api;
        this.zac = interfaceC1734x98b0cf44;
        this.zad = str;
        this.zaa = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(api, interfaceC1734x98b0cf44, str);
    }

    /* renamed from: getSharedApiKey */
    public static <O extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05<O> m17863x401c920(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<O> api, O o17, java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05<>(api, o17, str);
    }

    /* renamed from: equals */
    public final boolean m17864xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05) obj;
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zab, c1768x75462a05.zab) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zac, c1768x75462a05.zac) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zad, c1768x75462a05.zad);
    }

    /* renamed from: hashCode */
    public final int m17865x8cdac1b() {
        return this.zaa;
    }

    public final java.lang.String zaa() {
        return this.zab.zad();
    }
}
