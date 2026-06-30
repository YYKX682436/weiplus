package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f180477a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f180478b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180479c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f180481e;

    /* renamed from: f, reason: collision with root package name */
    public int f180482f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f180483g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rf4 f180484h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180485i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f180486j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f180487k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f180488l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f180489m;

    /* renamed from: n, reason: collision with root package name */
    public final dn.k f180490n;

    public k(long j17, java.lang.String str) {
        this.f180477a = j17;
        this.f180478b = str;
        this.f180479c = 100;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "create");
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMIotSendMsgFileSizeLimit", 100) * 1024 * 1024;
        this.f180479c = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "EX_DEVICE_MAX_SUPPORT_FILE_SIZE " + b17);
        this.f180483g = new java.util.concurrent.ConcurrentHashMap();
        this.f180487k = new java.util.concurrent.ConcurrentHashMap();
        this.f180488l = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i(this);
        this.f180489m = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.g(this);
        this.f180490n = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f(this);
    }

    public final boolean a(r45.rf4 deviceMsg, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 deviceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceMsg, "deviceMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type: ");
        sb6.append(deviceMsg.f466342d);
        sb6.append(' ');
        sb6.append(deviceMsg.f466348m != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", sb6.toString());
        int i17 = deviceMsg.f466342d;
        if ((i17 != 3 || deviceMsg.f466345g == null) && ((i17 != 4 || deviceMsg.f466346h == null) && (i17 != 6 || deviceMsg.f466348m == null))) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "directUpload type: " + deviceMsg.f466342d);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h(this, deviceInfo), "ExDeviceSendIotLogic");
        return true;
    }

    public final void b(r45.rf4 rf4Var, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 deviceInfo, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (rf4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExDeviceSendIotLogic", "deviceMsg null");
            return;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.d().f152297d;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExDeviceSendIotLogic", "dispatcher null");
        } else {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.q2(rf4Var, deviceInfo).mo807x6c193ac1(sVar, callback);
        }
    }
}
