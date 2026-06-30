package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class b0 extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79133d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79135f;

    /* renamed from: i, reason: collision with root package name */
    public int f79138i;

    /* renamed from: m, reason: collision with root package name */
    public int f79139m;

    /* renamed from: n, reason: collision with root package name */
    public int f79140n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79141o;

    /* renamed from: p, reason: collision with root package name */
    public int f79142p;

    /* renamed from: q, reason: collision with root package name */
    public double f79143q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f79146t;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f79136g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f79137h = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f79144r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f79145s = false;

    public b0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79133d = k0Var;
        this.f79134e = lVar;
        this.f79135f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    public void a() {
        int i17;
        n01.d d17 = n01.c.d(this.f79136g);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "audioState is null, audioId:%s", this.f79136g);
            this.f79145s = true;
            this.f79146t = "return parameter is invalid";
            b();
            return;
        }
        int i18 = d17.f333862a;
        if (i18 < 0 || (i17 = d17.f333863b) < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17.f333863b));
            this.f79145s = true;
            this.f79146t = "return parameter is invalid";
            b();
            return;
        }
        this.f79137h = i18;
        this.f79138i = i17;
        this.f79139m = d17.f333864c ? 1 : 0;
        this.f79141o = d17.f333867f;
        this.f79140n = d17.f333866e;
        this.f79142p = d17.f333868g;
        this.f79144r = d17.f333869h;
        n01.b c17 = n01.c.c(this.f79136g);
        if (c17 != null) {
            this.f79143q = c17.f333848m;
        }
        b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.a
    public void b() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79134e;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "service is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Integer.valueOf(this.f79137h));
        hashMap.put("currentTime", java.lang.Integer.valueOf(this.f79138i));
        hashMap.put("paused", java.lang.Boolean.valueOf(this.f79139m == 1));
        hashMap.put("buffered", java.lang.Integer.valueOf(this.f79140n));
        hashMap.put("src", this.f79141o);
        hashMap.put("startTime", java.lang.Integer.valueOf(this.f79142p));
        hashMap.put("playbackRate", java.lang.Double.valueOf(this.f79143q));
        hashMap.put("referrerPolicy", this.f79144r);
        java.lang.String str = android.text.TextUtils.isEmpty(this.f79146t) ? "" : this.f79146t;
        boolean z17 = this.f79145s;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79133d;
        int i17 = this.f79135f;
        if (!z17) {
            lVar.a(i17, k0Var.p("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState fail, err:%s", str);
        lVar.a(i17, k0Var.o("fail:" + str));
    }
}
