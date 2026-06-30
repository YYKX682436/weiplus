package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* loaded from: classes14.dex */
public final class b {
    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 a(java.util.List<com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421> list, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, int i17, int i18) {
        double d17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(i17, i18);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraSupervisor", "preview wanted: " + c3779x275421 + " cameraRotation:" + kVar);
        if (list == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("CameraSupervisor", "findBestMatchedPreviewSize getPreviewSizes null");
            return c3779x275421;
        }
        if (kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 || kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270) {
            c3779x275421.m29561x361193();
        }
        double m29554x41194293 = c3779x275421.m29554x41194293();
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754212 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(640, 640);
        int i19 = c3779x275421.f14764x6be2dc6;
        int i27 = c3779x2754212.f14764x6be2dc6;
        if (i19 <= i27 && c3779x275421.f14763xb7389127 <= c3779x2754212.f14763xb7389127) {
            c3779x2754212.set(c3779x275421);
        } else {
            int i28 = c3779x275421.f14763xb7389127;
            if (i19 > i28) {
                c3779x2754212.f14763xb7389127 = (i27 * i28) / i19;
            } else {
                c3779x2754212.f14764x6be2dc6 = (c3779x2754212.f14763xb7389127 * i19) / i28;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = Long.MAX_VALUE;
        for (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754213 : list) {
            sb6.append(c3779x2754213);
            sb6.append(", ");
            long round = (c3779x2754213.f14764x6be2dc6 < c3779x2754212.f14764x6be2dc6 || c3779x2754213.f14763xb7389127 < c3779x2754212.f14763xb7389127) ? Long.MAX_VALUE : java.lang.Math.round(java.lang.Math.abs(c3779x2754213.m29554x41194293() - m29554x41194293) * 10.0d);
            if (round < j17) {
                arrayList.clear();
                arrayList.add(c3779x2754213);
                j17 = round;
            } else if (round == j17) {
                arrayList.add(c3779x2754213);
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraSupervisor", "support preview size list: ".concat(java.lang.String.valueOf(sb6)));
        java.util.Collections.sort(arrayList, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.c.a());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754214 = (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421) arrayList.get(0);
        int m29556xfb7d3903 = c3779x275421.m29556xfb7d3903();
        java.util.Iterator it = arrayList.iterator();
        double d18 = Double.MAX_VALUE;
        while (it.hasNext()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754215 = (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421) it.next();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraSupervisor", "size in same buck ".concat(java.lang.String.valueOf(c3779x2754215)));
            if (m29554x41194293 > c3779x2754215.m29554x41194293()) {
                int i29 = c3779x2754215.f14764x6be2dc6;
                d17 = (i29 * i29) / m29554x41194293;
            } else {
                int i37 = c3779x2754215.f14763xb7389127;
                d17 = i37 * i37 * m29554x41194293;
            }
            double d19 = m29556xfb7d3903;
            if (d17 / d19 >= 0.9d) {
                double d27 = d17 - d19;
                if (java.lang.Math.abs(d27) < d18) {
                    d18 = java.lang.Math.abs(d27);
                    c3779x2754214 = c3779x2754215;
                }
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraSupervisor", "best match preview size ".concat(java.lang.String.valueOf(c3779x2754214)));
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(c3779x2754214.f14764x6be2dc6, c3779x2754214.f14763xb7389127);
    }

    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a a(com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a[] aVarArr, int i17, boolean z17) {
        if (aVarArr != null && aVarArr.length != 0) {
            int i18 = 0;
            for (com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a aVar : aVarArr) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("CameraSupervisor", "supported fps range: ".concat(java.lang.String.valueOf(aVar)));
            }
            if (z17) {
                java.util.Arrays.sort(aVarArr, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.d.a());
                int length = aVarArr.length;
                while (i18 < length) {
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a aVar2 = aVarArr[i18];
                    if (aVar2.f128523a >= i17) {
                        return aVar2;
                    }
                    i18++;
                }
            } else {
                java.util.Arrays.sort(aVarArr, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.e.a());
                int length2 = aVarArr.length;
                while (i18 < length2) {
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a aVar3 = aVarArr[i18];
                    if (aVar3.f128523a <= i17 && i17 <= aVar3.f128524b) {
                        return aVar3;
                    }
                    i18++;
                }
            }
        }
        return null;
    }
}
