package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class y4 implements sh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud2.d f148578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh1.f f148579b;

    public y4(ud2.d dVar, sh1.f fVar) {
        this.f148578a = dVar;
        this.f148579b = fVar;
    }

    @Override // sh1.g
    public void a(int i17, int i18) {
        ud2.d dVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", "updateSkylineNativeViewSize width:" + i17 + " height:" + i18);
        if (i17 <= 0 || i18 <= 0 || (dVar = this.f148578a) == null) {
            return;
        }
        ud2.c0 c0Var = dVar.f508145c;
        c0Var.f508126d = i17;
        c0Var.f508127e = i18;
        mn0.b0 b0Var = c0Var.f508131i;
        if (b0Var != null) {
            b0Var.A(i17, i18);
        }
    }

    @Override // sh1.g
    public void b(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // sh1.g
    public void c(java.lang.String params) {
        ig2.n c17;
        mn0.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", this + " removeWithParams params:" + params);
        ud2.c0 c0Var = this.f148578a.f508145c;
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f508128f, c0Var + " dispose");
        c0Var.f508136n = false;
        mn0.b0 b0Var2 = c0Var.f508131i;
        if (b0Var2 != null) {
            mn0.b0.C(b0Var2, true, false, false, 6, null);
        }
        ig2.r rVar = c0Var.f508137o;
        if (rVar == null || (c17 = rVar.c()) == null || (b0Var = c17.f372942h) == null) {
            return;
        }
        mn0.b0.C(b0Var, true, false, false, 6, null);
    }

    @Override // sh1.g
    public void d(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(params);
            java.lang.String optString = jSONObject.optString("type");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", "on update, action = " + optString + ", width = " + (optJSONObject != null ? optJSONObject.optInt("width") : 0) + ", height = " + (optJSONObject != null ? optJSONObject.optInt("height") : 0));
            ud2.d dVar = this.f148578a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            sh1.f invoker = this.f148579b;
            dVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
            pm0.v.X(new ud2.b(dVar, optString, invoker));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveForSkylineService", e17, "parse update params failed", new java.lang.Object[0]);
        }
    }

    @Override // sh1.g
    /* renamed from: onTouchEvent */
    public void mo45013x667eb1da(android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        motionEvent.toString();
    }

    @Override // sh1.g
    /* renamed from: pause */
    public void mo45014x65825f6() {
        ud2.c0 c0Var = this.f148578a.f508145c;
        c0Var.f508136n = false;
        mn0.b0 b0Var = c0Var.f508131i;
        boolean z17 = b0Var != null && ((mn0.y) b0Var).b(false);
        java.lang.String str = c0Var.f508128f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, c0Var + " on pause");
            mn0.b0 b0Var2 = c0Var.f508131i;
            if (b0Var2 != null) {
                mn0.b0.M(b0Var2, false, 1, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, c0Var + " on pause, but ain't playing");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", this + " pause");
    }

    @Override // sh1.g
    /* renamed from: resume */
    public void mo45015xc84dc82d() {
        ud2.c0 c0Var = this.f148578a.f508145c;
        boolean z17 = c0Var.f508136n;
        java.lang.String str = c0Var.f508128f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, c0Var + " on resume, but is already active");
        } else {
            c0Var.f508136n = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, c0Var + " on resume");
            v65.i.c(c0Var.f508130h, null, new ud2.b0(c0Var, null), 1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", this + " resume");
    }
}
