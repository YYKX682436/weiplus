package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1;

/* renamed from: com.tencent.thumbplayer.core.player.TPNativePlayerUtils */
/* loaded from: classes13.dex */
public class C26420xce765a9d {
    /* renamed from: isTPNativePlayerSurface */
    public static boolean m102742x7f191caf(android.view.Surface surface) {
        return surface instanceof com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26415xa2ae6b99;
    }

    /* renamed from: tpMapStringToStringArray */
    public static java.lang.String[] m102743x8779895c(java.util.Map<java.lang.String, java.lang.String> map) {
        int i17 = 0;
        if (map == null || map.isEmpty()) {
            return new java.lang.String[0];
        }
        java.lang.String[] strArr = new java.lang.String[map.size() * 2];
        for (java.lang.String str : map.keySet()) {
            int i18 = i17 * 2;
            strArr[i18] = str;
            strArr[i18 + 1] = map.get(str);
            i17++;
        }
        return strArr;
    }
}
