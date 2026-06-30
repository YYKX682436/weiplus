package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f98944a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f98945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98946c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f98947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f98948e;

    /* renamed from: f, reason: collision with root package name */
    public int f98949f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f98950g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rf4 f98951h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98952i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98953j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f98954k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f98955l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f98956m;

    /* renamed from: n, reason: collision with root package name */
    public final dn.k f98957n;

    public k(long j17, java.lang.String str) {
        this.f98944a = j17;
        this.f98945b = str;
        this.f98946c = 100;
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "create");
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMIotSendMsgFileSizeLimit", 100) * 1024 * 1024;
        this.f98946c = b17;
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "EX_DEVICE_MAX_SUPPORT_FILE_SIZE " + b17);
        this.f98950g = new java.util.concurrent.ConcurrentHashMap();
        this.f98954k = new java.util.concurrent.ConcurrentHashMap();
        this.f98955l = new com.tencent.mm.plugin.exdevice.model.i(this);
        this.f98956m = new com.tencent.mm.plugin.exdevice.model.g(this);
        this.f98957n = new com.tencent.mm.plugin.exdevice.model.f(this);
    }

    public final boolean a(r45.rf4 deviceMsg, com.tencent.mm.feature.exdevice.NetworkDeviceInfo deviceInfo) {
        kotlin.jvm.internal.o.g(deviceMsg, "deviceMsg");
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type: ");
        sb6.append(deviceMsg.f384809d);
        sb6.append(' ');
        sb6.append(deviceMsg.f384815m != null);
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", sb6.toString());
        int i17 = deviceMsg.f384809d;
        if ((i17 != 3 || deviceMsg.f384812g == null) && ((i17 != 4 || deviceMsg.f384813h == null) && (i17 != 6 || deviceMsg.f384815m == null))) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "directUpload type: " + deviceMsg.f384809d);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.exdevice.model.h(this, deviceInfo), "ExDeviceSendIotLogic");
        return true;
    }

    public final void b(r45.rf4 rf4Var, com.tencent.mm.feature.exdevice.NetworkDeviceInfo deviceInfo, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (rf4Var == null) {
            com.tencent.mars.xlog.Log.w("ExDeviceSendIotLogic", "deviceMsg null");
            return;
        }
        com.tencent.mm.network.s sVar = gm0.j1.d().f70764d;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.w("ExDeviceSendIotLogic", "dispatcher null");
        } else {
            new com.tencent.mm.plugin.exdevice.model.q2(rf4Var, deviceInfo).doScene(sVar, callback);
        }
    }
}
