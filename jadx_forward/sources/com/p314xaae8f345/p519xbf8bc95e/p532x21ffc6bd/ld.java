package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ld {
    private static double a(int i17, int i18, int i19, float f17) {
        double d17 = 1.0d - f17;
        return (d17 * d17 * i17) + (2.0f * f17 * d17 * i18) + (f17 * f17 * i19);
    }

    private static float a(int i17, int i18, int i19, int i27, float f17) {
        float f18 = (i18 - i17) * 3.0f;
        float f19 = ((i19 - i18) * 3.0f) - f18;
        float f27 = ((i27 - i17) - f18) - f19;
        float f28 = f17 * f17;
        return (f27 * f28 * f17) + (f19 * f28) + (f18 * f17) + i17;
    }

    private static int a(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list, int[] iArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        int size;
        int i17 = 0;
        if (list == null || (size = list.size()) < 2) {
            return 0;
        }
        int i18 = 0;
        while (i17 < size - 1) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = list.get(i17);
            int i19 = i17 + 1;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = list.get(i19);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = eyVar.a(c4247x704e24df);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = eyVar.a(c4247x704e24df2);
            double d17 = a18.f131000a - a17.f131000a;
            double d18 = a18.f131001b - a17.f131001b;
            int sqrt = (int) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
            int max = sqrt / java.lang.Math.max(4, (sqrt / 500) * 4);
            iArr[i17] = max;
            i18 += max;
            i17 = i19;
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> a(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> r16, int r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ld.a(java.util.List, int):java.util.List");
    }

    private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list, float f17) {
        int size;
        if (list == null || list.isEmpty() || !((size = list.size()) == 3 || size == 4)) {
            return null;
        }
        if (size == 3) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = list.get(0);
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = list.get(1);
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = list.get(2);
            if (c4247x704e24df == null || c4247x704e24df2 == null || c4247x704e24df3 == null) {
                return null;
            }
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) a(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df3.m35331xbc3301f3(), f17), (int) a(c4247x704e24df.m35332x962aa94a(), c4247x704e24df2.m35332x962aa94a(), c4247x704e24df3.m35332x962aa94a(), f17));
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = list.get(0);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df5 = list.get(1);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df6 = list.get(2);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df7 = list.get(3);
        if (c4247x704e24df4 != null && c4247x704e24df5 != null && c4247x704e24df6 != null && c4247x704e24df7 != null) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) a(c4247x704e24df4.m35331xbc3301f3(), c4247x704e24df5.m35331xbc3301f3(), c4247x704e24df6.m35331xbc3301f3(), c4247x704e24df7.m35331xbc3301f3(), f17), (int) a(c4247x704e24df4.m35332x962aa94a(), c4247x704e24df5.m35332x962aa94a(), c4247x704e24df6.m35332x962aa94a(), c4247x704e24df7.m35332x962aa94a(), f17));
        }
        return null;
    }

    private static double a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2) {
        double d17 = fuVar2.f131000a - fuVar.f131000a;
        double d18 = fuVar2.f131001b - fuVar.f131001b;
        return java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
    }
}
