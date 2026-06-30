package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.o f76715a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.lifecycle.j0 f76716b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.i f76717c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.lifecycle.j0 f76718d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.i f76719e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.h f76720f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.h f76721g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.h f76722h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.g f76723i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashMap f76724j;

    static {
        com.tencent.mm.plugin.appbrand.av_device_usage.o oVar = new com.tencent.mm.plugin.appbrand.av_device_usage.o();
        f76715a = oVar;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.l5.Bi());
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "<init>, _isPhoneInUse: " + valueOf.booleanValue());
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(valueOf);
        f76716b = j0Var;
        f76717c = new com.tencent.mm.plugin.appbrand.av_device_usage.i(fb1.d.f260829d, j0Var);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(((lg0.n) i95.n0.c(lg0.n.class)) != null && (vq4.p0.d() || vq4.p0.c()) ? true : iq.b.H());
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "<init>, isVOIPInUse: " + valueOf2.booleanValue());
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0(valueOf2);
        f76718d = j0Var2;
        f76719e = new com.tencent.mm.plugin.appbrand.av_device_usage.i(fb1.d.f260830e, j0Var2);
        f76720f = new com.tencent.mm.plugin.appbrand.av_device_usage.h(fb1.d.f260831f, new com.tencent.mm.plugin.appbrand.av_device_usage.m(oVar));
        f76721g = new com.tencent.mm.plugin.appbrand.av_device_usage.h(fb1.d.f260832g, new com.tencent.mm.plugin.appbrand.av_device_usage.l(oVar));
        f76722h = new com.tencent.mm.plugin.appbrand.av_device_usage.h(fb1.d.f260833h, new com.tencent.mm.plugin.appbrand.av_device_usage.k(oVar));
        f76723i = new com.tencent.mm.plugin.appbrand.av_device_usage.g(fb1.d.f260834i);
        f76724j = new java.util.HashMap();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.av_device_usage.p0 p0Var = new com.tencent.mm.plugin.appbrand.av_device_usage.p0(context, com.tencent.mm.plugin.appbrand.av_device_usage.n.f76713d);
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "PhoneInUseObservable.enable");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.av_device_usage.l0(p0Var));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageDatas$1
            {
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback, event: ");
                am.v00 v00Var = event.f54942g;
                sb6.append(v00Var.f8161d);
                com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", sb6.toString());
                com.tencent.mm.plugin.appbrand.av_device_usage.o oVar2 = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a;
                int i17 = v00Var.f8161d;
                boolean z17 = true;
                if (7 == i17 || 2 == i17) {
                    com.tencent.mm.plugin.appbrand.av_device_usage.o.f76718d.postValue(java.lang.Boolean.TRUE);
                } else {
                    if (11 != i17 && 8 != i17 && 9 != i17) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mm.plugin.appbrand.av_device_usage.o.f76718d.postValue(java.lang.Boolean.FALSE);
                    }
                }
                return false;
            }
        }.alive();
    }

    public final com.tencent.mm.plugin.appbrand.av_device_usage.j a(fb1.d scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        int ordinal = scene.ordinal();
        if (ordinal == 0) {
            return f76717c;
        }
        if (ordinal == 1) {
            return f76719e;
        }
        if (ordinal == 2) {
            return f76720f;
        }
        if (ordinal == 3) {
            return f76721g;
        }
        if (ordinal == 4) {
            return f76722h;
        }
        if (ordinal == 5) {
            return f76723i;
        }
        throw new jz5.j();
    }
}
