package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class t0 extends eg.a implements sh1.f {

    /* renamed from: g, reason: collision with root package name */
    public kf.b f170479g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f170480h;

    /* renamed from: i, reason: collision with root package name */
    public sf.f f170481i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.a f170482m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.a();

    @Override // sh1.f
    public void a(int i17, java.lang.String event, java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNativeViewEvent component:");
        sf.f fVar = this.f170481i;
        sb6.append(fVar != null ? fVar.m() : null);
        sb6.append(" viewId:");
        sb6.append(i17);
        sb6.append(" event:");
        sb6.append(event);
        sb6.append(" params:");
        sb6.append(params);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sf.f fVar2 = this.f170481i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar2 != null ? fVar2.m() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m17 : null;
        if (n7Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.a aVar = this.f170482m;
            aVar.s("viewId", valueOf);
            aVar.s("event", event);
            try {
                aVar.s("param", new org.json.JSONObject(params));
            } catch (java.lang.Exception unused) {
                aVar.s("param", params);
            }
            n7Var.i(aVar, null);
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
        }
    }

    @Override // sh1.f
    public void d(java.lang.String event, java.lang.String data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        sf.f fVar = this.f170481i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar != null ? fVar.m() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m17 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", "onPublishEvent event:" + event + " data:" + data + " pageViewWC:" + n7Var);
        if (n7Var == null || (U1 = n7Var.U1()) == null) {
            return;
        }
        U1.g(event, data);
    }

    @Override // eg.a, eg.b
    public void e() {
    }

    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", "@@@handleJsApi invokeContext:" + invokeContext);
        if (invokeContext instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) invokeContext;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = bVar.m();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = bVar.f159554c;
            org.json.JSONObject jSONObject = bVar.f159553b;
            int i17 = bVar.f159552a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q(), k0Var.k(), jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.q0(k0Var, this, invokeContext, m17, i17, jSONObject);
            synchronized (this) {
                if (this.f170479g == null) {
                    this.f170480h = q0Var;
                    return null;
                }
                q0Var.run();
            }
        }
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
    }

    @Override // sh1.f
    public void j() {
        ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.r0(this));
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
    }

    @Override // sh1.f
    public void l() {
        ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.s0(this));
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(surfaceTexture, "null cannot be cast to non-null type com.tencent.luggage.skyline.wxa.nativeview.SkylineSurfaceTexture");
            this.f170479g = (kf.b) surfaceTexture;
            java.lang.Runnable runnable = this.f170480h;
            if (runnable != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.q0) runnable).run();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(this.f334030d);
        sb6.append(" handlePluginReady width:");
        kf.b bVar = this.f170479g;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f388692a) : null);
        sb6.append(" height:");
        kf.b bVar2 = this.f170479g;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.f388693b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
    }
}
