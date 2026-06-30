package xf4;

/* loaded from: classes4.dex */
public final class d implements c01.q8 {
    public java.lang.String a(int i17, boolean z17) {
        if (i17 == 0) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.N());
        sb6.append("vuserpic_");
        sb6.append(java.lang.Integer.toHexString(i17));
        sb6.append(z17 ? "_HD" : "");
        sb6.append(".png");
        return sb6.toString();
    }

    public final java.lang.String b(int i17, boolean z17) {
        int i18;
        if (!c01.d9.b().E()) {
            return null;
        }
        if (i17 == 0) {
            i18 = -1;
        } else {
            i18 = 0;
            while (i18 < 32 && (i17 = (i17 >> 1) & Integer.MAX_VALUE) != 0) {
                i18++;
            }
        }
        int i19 = i18 != -1 ? 1 << i18 : 0;
        java.lang.String a17 = i19 == 0 ? null : a(i19, z17);
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            return a17;
        }
        if (c01.d9.b().E()) {
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(66051, null), 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (432000000 <= currentTimeMillis - k17) {
                c01.d9.b().p().w(66051, java.lang.Long.valueOf(currentTimeMillis));
                new xf4.c();
            }
        }
        return null;
    }

    public java.lang.String c(int i17) {
        return b(i17, true);
    }
}
