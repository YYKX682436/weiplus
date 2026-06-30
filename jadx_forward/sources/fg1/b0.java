package fg1;

/* loaded from: classes7.dex */
public class b0 implements dg.e {

    /* renamed from: a, reason: collision with root package name */
    public bg.f f343375a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b f343376b;

    /* renamed from: c, reason: collision with root package name */
    public double f343377c;

    /* renamed from: d, reason: collision with root package name */
    public int f343378d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f343379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f343380f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f343381g = false;

    /* renamed from: h, reason: collision with root package name */
    public bg.b f343382h = null;

    /* renamed from: i, reason: collision with root package name */
    public tf.m0 f343383i = null;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        if (n5Var != null) {
            if (!(n5Var instanceof fg1.n0) && !(n5Var instanceof fg1.l0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r17 = n5Var.r(jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f343376b;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
                if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).i(r17, null);
                    return;
                } else {
                    m17.i(r17, null);
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17;
            e9Var.i(r17, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
            if (V0 != null) {
                V0.i(r17, null);
            }
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f343380f);
        return jSONObject;
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar;
        if (this.f343375a == null || (bVar = this.f343376b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
            return;
        }
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
        } else {
            a17.m(this.f343375a, z17);
        }
    }

    public void d(boolean z17) {
        try {
            org.json.JSONObject b17 = b();
            b17.put("playInBackground", z17);
            a(new fg1.e0(null), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoBackgroundPlaybackChange fail", e17);
        }
    }

    public void e(int i17, int i18, int i19) {
        try {
            org.json.JSONObject b17 = b();
            b17.put("width", i17);
            b17.put("height", i18);
            double d17 = (i19 * 1.0d) / 1000.0d;
            this.f343377c = d17;
            b17.put("duration", d17);
            a(new fg1.h0(null), b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData width = " + i17 + " height = " + i18 + " duration = " + i19);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData fail", e17);
        }
    }

    public void f(boolean z17) {
        try {
            a(new fg1.i0(null), b());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPause fail", e17);
        }
        k();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fg1.d0(this));
        c(false);
        tf.m0 m0Var = this.f343383i;
        if (m0Var != null) {
            if (z17) {
                m0Var.mo129542xc39f8281();
            } else {
                m0Var.mo129541xb01dfb57();
            }
        }
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar;
        this.f343381g = false;
        try {
            this.f343378d = 0;
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            a(new fg1.j0(null), b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoPlay isAutoPlay = " + z17);
            j();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fg1.c0(this));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPlay fail", e17);
        }
        if (this.f343375a == null || (bVar = this.f343376b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
        } else {
            tf1.f a17 = tf.k.a(bVar);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
            } else {
                a17.n(this.f343375a);
            }
        }
        tf.m0 m0Var = this.f343383i;
        if (m0Var != null) {
            m0Var.e(z17);
        }
    }

    public void h(int i17, int i18) {
        if (this.f343381g) {
            return;
        }
        try {
            if (java.lang.Math.abs(i17 - this.f343378d) < 250) {
                return;
            }
            bg.b bVar = this.f343382h;
            if (bVar != null) {
                ((fg1.y0) bVar).a(i17, i18);
            }
            this.f343378d = i17;
            double doubleValue = new java.math.BigDecimal((i17 * 1.0d) / 1000.0d).setScale(3, 4).doubleValue();
            org.json.JSONObject b17 = b();
            b17.put("position", doubleValue);
            b17.put("duration", (i18 * 1.0d) / 1000.0d);
            a(new fg1.n0(null), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoTimeUpdate fail", e17);
        }
    }

    public void i() {
        this.f343381g = true;
        try {
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            a(new fg1.p0(null), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoWaiting fail", e17);
        }
        tf.m0 m0Var = this.f343383i;
        if (m0Var != null) {
            m0Var.j();
        }
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer");
        if (this.f343379e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer, create new timer");
            this.f343379e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("AppBrandVideoEventHandler_HandlerThread#" + hashCode(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: fg1.b0$$a
                @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
                /* renamed from: onTimerExpired */
                public final boolean mo322xdd48fb9f() {
                    fg1.b0 b0Var = fg1.b0.this;
                    bg.f fVar = b0Var.f343375a;
                    if (fVar == null) {
                        return true;
                    }
                    ye1.e eVar = fVar.f101297h;
                    b0Var.h(eVar != null ? eVar.mo1851x9746038c() : 0, (int) (b0Var.f343377c * 1000.0d));
                    return true;
                }
            }, true);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f343379e;
        if (b4Var != null) {
            b4Var.c(0L, 250L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f343376b;
        if (bVar != null) {
            oe1.b2.a(bVar.f159556e);
        }
    }

    public final void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "stop video update timer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f343379e;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
