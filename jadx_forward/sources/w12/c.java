package w12;

/* loaded from: classes7.dex */
public final class c {
    public final java.util.HashMap a() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels;
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().heightPixels;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("abi", android.os.Build.CPU_ABI);
        hashMap.put("system", android.os.Build.VERSION.RELEASE);
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put("version", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).getClass();
        hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1)));
        hashMap.put("deviceOrientation", 2 == com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        hashMap.put("fontSizeSetting", java.lang.Float.valueOf(1.0f));
        hashMap.put("offsetTop", 0);
        hashMap.put("offsetBottom", 0);
        return hashMap;
    }
}
