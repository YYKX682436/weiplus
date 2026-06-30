package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zal {
    private final android.util.SparseIntArray zaa;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a zab;

    public zal() {
        this(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b());
    }

    public final int zaa(android.content.Context context, int i17) {
        return this.zaa.get(i17, -1);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int zab(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1736x7877dfeb);
        int i17 = 0;
        if (!interfaceC1736x7877dfeb.mo17722xb7ac48d9()) {
            return 0;
        }
        int mo17560x352ce358 = interfaceC1736x7877dfeb.mo17560x352ce358();
        int zaa = zaa(context, mo17560x352ce358);
        if (zaa == -1) {
            int i18 = 0;
            while (true) {
                if (i18 >= this.zaa.size()) {
                    i17 = -1;
                    break;
                }
                int keyAt = this.zaa.keyAt(i18);
                if (keyAt > mo17560x352ce358 && this.zaa.get(keyAt) == 0) {
                    break;
                }
                i18++;
            }
            zaa = i17 == -1 ? this.zab.mo17631x402556f4(context, mo17560x352ce358) : i17;
            this.zaa.put(mo17560x352ce358, zaa);
        }
        return zaa;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a) {
        this.zaa = new android.util.SparseIntArray();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1706xe937257a);
        this.zab = c1706xe937257a;
    }
}
