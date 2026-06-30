package xu4;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final xu4.g f538820a = new xu4.g();

    public final java.lang.String a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(10).c();
        c(params);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(params));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final int b(int i17) {
        int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        if (i17 == 1) {
            return 71;
        }
        if (i17 == 2) {
            return 94;
        }
        if (i17 == 3) {
            return 107;
        }
        if (i17 == 4) {
            return 110;
        }
        if (i17 == 5) {
            return 127;
        }
        if (i17 == 6) {
            return 128;
        }
        if (i17 == 7) {
            return 155;
        }
        if (i17 >= 6500 && i17 <= 6600) {
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.EmojiSearchUILogic", "Invalid search source scene: " + i17);
        return 0;
    }

    public final void c(java.util.Map map) {
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getCurrentLanguage(...)");
        map.put("lang", f17);
        map.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        map.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(10)));
        map.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
        java.lang.String CLIENT_VERSION = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        map.put("wechatVersion", CLIENT_VERSION);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (q17 != 1.0f && q17 != 0.8f && q17 != 1.1f && q17 != 1.12f && q17 != 1.125f && q17 != 1.4f && q17 != 1.55f && q17 != 1.65f) {
            q17 = 1.0f;
        }
        map.put("fontRatio", java.lang.String.valueOf(q17));
    }
}
