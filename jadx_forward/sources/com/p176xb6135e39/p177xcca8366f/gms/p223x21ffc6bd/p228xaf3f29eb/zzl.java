package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

/* loaded from: classes13.dex */
final class zzl extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzk {
    private final char zza;

    public zzl(char c17) {
        this.zza = c17;
    }

    /* renamed from: toString */
    public final java.lang.String m18814x9616526c() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i17 = this.zza;
        for (int i18 = 0; i18 < 4; i18++) {
            cArr[5 - i18] = "0123456789ABCDEF".charAt(i17 & 15);
            i17 >>= 4;
        }
        return "CharMatcher.is('" + java.lang.String.copyValueOf(cArr) + "')";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzo
    public final boolean zza(char c17) {
        return c17 == this.zza;
    }
}
