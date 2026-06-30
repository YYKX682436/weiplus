package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160666d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f160668f;

    /* renamed from: i, reason: collision with root package name */
    public int f160671i;

    /* renamed from: m, reason: collision with root package name */
    public int f160672m;

    /* renamed from: n, reason: collision with root package name */
    public int f160673n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160674o;

    /* renamed from: p, reason: collision with root package name */
    public int f160675p;

    /* renamed from: q, reason: collision with root package name */
    public double f160676q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160679t;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160669g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f160670h = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160677r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f160678s = false;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160666d = k0Var;
        this.f160667e = lVar;
        this.f160668f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    public void a() {
        int i17;
        n01.d d17 = n01.c.d(this.f160669g);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiGetAudioState", "audioState is null, audioId:%s", this.f160669g);
            this.f160678s = true;
            this.f160679t = "return parameter is invalid";
            b();
            return;
        }
        int i18 = d17.f415395a;
        if (i18 < 0 || (i17 = d17.f415396b) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17.f415396b));
            this.f160678s = true;
            this.f160679t = "return parameter is invalid";
            b();
            return;
        }
        this.f160670h = i18;
        this.f160671i = i17;
        this.f160672m = d17.f415397c ? 1 : 0;
        this.f160674o = d17.f415400f;
        this.f160673n = d17.f415399e;
        this.f160675p = d17.f415401g;
        this.f160677r = d17.f415402h;
        n01.b c17 = n01.c.c(this.f160669g);
        if (c17 != null) {
            this.f160676q = c17.f415381m;
        }
        b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160667e;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiGetAudioState", "service is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Integer.valueOf(this.f160670h));
        hashMap.put("currentTime", java.lang.Integer.valueOf(this.f160671i));
        hashMap.put("paused", java.lang.Boolean.valueOf(this.f160672m == 1));
        hashMap.put("buffered", java.lang.Integer.valueOf(this.f160673n));
        hashMap.put("src", this.f160674o);
        hashMap.put("startTime", java.lang.Integer.valueOf(this.f160675p));
        hashMap.put("playbackRate", java.lang.Double.valueOf(this.f160676q));
        hashMap.put("referrerPolicy", this.f160677r);
        java.lang.String str = android.text.TextUtils.isEmpty(this.f160679t) ? "" : this.f160679t;
        boolean z17 = this.f160678s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160666d;
        int i17 = this.f160668f;
        if (!z17) {
            lVar.a(i17, k0Var.p("ok", hashMap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState fail, err:%s", str);
        lVar.a(i17, k0Var.o("fail:" + str));
    }
}
