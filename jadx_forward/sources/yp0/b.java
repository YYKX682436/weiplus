package yp0;

/* loaded from: classes7.dex */
public final class b {
    public final java.util.HashMap a(wp0.c context, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 K0 = context.K0();
        int width = K0.getWidth() > 0 ? K0.getWidth() : 1;
        int height = K0.getHeight() > 0 ? K0.getHeight() : 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("abi", android.os.Build.CPU_ABI);
        hashMap.put("system", android.os.Build.VERSION.RELEASE);
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put("version", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).getClass();
        hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1)));
        hashMap.put("deviceOrientation", 2 == com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        hashMap.put("fontSizeSetting", 0);
        jz5.l H0 = context.H0();
        hashMap.put("offsetTop", java.lang.Integer.valueOf(ik1.w.e(((java.lang.Number) H0.f384366d).intValue())));
        hashMap.put("offsetBottom", java.lang.Integer.valueOf(ik1.w.e(((java.lang.Number) H0.f384367e).intValue())));
        return hashMap;
    }
}
