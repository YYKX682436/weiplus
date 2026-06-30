package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public final class j1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j1 f263886d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String k17 = wo.w0.k();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17);
        nw4.g gVar = env.f422396d;
        if (K0) {
            gVar.e(msg.f422546c, "getOpenDeviceUUID:fail, deviceId is null!", null);
            return true;
        }
        try {
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            byte[] bytes = k17.getBytes(UTF_8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
            b17.f(16);
            java.lang.String str = "#Tencent#Wechat#" + ot5.e.b(b17.g());
            com.p3249xcbb51f6b.ndk.C28022x73d433fe m121931x9cf0d20b = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b();
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
            byte[] bytes2 = str.getBytes(UTF_82);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            byte[] sm32 = m121931x9cf0d20b.sm3(bytes2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_msg", "getOpenDeviceUUID:ok");
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(sm32);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "encodeHexString(...)");
            hashMap.put("sm3DeviceUUID", l17);
            gVar.e(msg.f422546c, "getOpenDeviceUUID:ok", hashMap);
            return true;
        } catch (java.lang.Exception unused) {
            gVar.e(msg.f422546c, "getOpenDeviceUUID:fail, JSON error!", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 511;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getOpenDeviceUUID";
    }
}
