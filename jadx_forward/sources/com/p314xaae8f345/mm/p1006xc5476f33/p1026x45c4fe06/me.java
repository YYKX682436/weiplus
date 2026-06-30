package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class me {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f167282d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f167283e;

    /* renamed from: a, reason: collision with root package name */
    public final ze.n f167284a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f167285b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 f167286c;

    public me(ze.n rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f167284a = rt6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didCreate appId:" + rt6.f156336n);
        this.f167285b = "";
        rt6.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ie(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.le leVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.le(this);
        java.lang.String str = rt6.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        leVar.mo146xb9724478(mVar);
        rt6.N.a(mVar);
        this.f167285b = "";
        this.f167286c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE;
    }

    public final void a(org.json.JSONObject eventData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        java.lang.String optString = eventData.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didDispatchEnterForegroundEvent appId:" + this.f167284a.f156336n + ", sessionId:" + optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        this.f167285b = optString;
    }

    public final int b() {
        int g27 = (f167283e && this.f167286c == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_NATIVE_PAGE) ? bb1.e.f4185x366c91de : this.f167284a.g2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "sessionScene.get() return " + g27 + ", kResetSceneAfterBackFromNativePage:" + f167283e);
        return g27;
    }
}
