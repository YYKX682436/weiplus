package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e f270810a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f270811b = jz5.h.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c.f270777d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f270812c = jz5.h.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d.f270802d);

    public final int a() {
        return (gm0.j1.h() && gm0.j1.a()) ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f270811b).mo141623x754a37bb()).intValue();
    }

    public final java.lang.String b() {
        int i17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
        } else if (r75.d.f474791e == -100) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
            r75.d.f474791e = i17;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
            i17 = r75.d.f474791e;
        }
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc : "5g" : "4g" : "3g" : "2g" : "wifi" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    public final r45.dn c() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        byte[] j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        if (R.f("k_TimelinePersonalCenterSettingInfo") && (j17 = R.j("k_TimelinePersonalCenterSettingInfo")) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.dn.class.newInstance();
                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                    fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.dn) fVar;
            }
        }
        fVar = null;
        return (r45.dn) fVar;
    }

    public final r45.jm6 d() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        byte[] j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        if (R.f("k_TimelineSettingInfo") && (j17 = R.j("k_TimelineSettingInfo")) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.jm6.class.newInstance();
                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                    fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.jm6) fVar;
            }
        }
        fVar = null;
        return (r45.jm6) fVar;
    }

    public final boolean e() {
        xm1.h hVar = (xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        boolean l17 = hVar.l();
        boolean j17 = hVar.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommUtil", "isHeadsetOn isHeadsetPlugged:" + l17 + " isBluetoothOn:" + j17);
        return l17 || j17;
    }

    public final void f(boolean z17) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").putBoolean("k_CreationCenterNotifySwitch", z17);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizCommUtil", "setCreationCenterNotifySwitch ex %s", e17.getMessage());
        }
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommUtil", "setNotifyUnreadCount count:" + i17 + " uin:" + a());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("k_TimelineNotifyUnreadCount_");
        sb6.append(a());
        R.putInt(sb6.toString(), i17);
    }
}
