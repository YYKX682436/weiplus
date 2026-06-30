package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class y4 implements sh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud2.d f67045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh1.f f67046b;

    public y4(ud2.d dVar, sh1.f fVar) {
        this.f67045a = dVar;
        this.f67046b = fVar;
    }

    @Override // sh1.g
    public void a(int i17, int i18) {
        ud2.d dVar;
        com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", "updateSkylineNativeViewSize width:" + i17 + " height:" + i18);
        if (i17 <= 0 || i18 <= 0 || (dVar = this.f67045a) == null) {
            return;
        }
        ud2.c0 c0Var = dVar.f426612c;
        c0Var.f426593d = i17;
        c0Var.f426594e = i18;
        mn0.b0 b0Var = c0Var.f426598i;
        if (b0Var != null) {
            b0Var.A(i17, i18);
        }
    }

    @Override // sh1.g
    public void b(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // sh1.g
    public void c(java.lang.String params) {
        ig2.n c17;
        mn0.b0 b0Var;
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", this + " removeWithParams params:" + params);
        ud2.c0 c0Var = this.f67045a.f426612c;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i(c0Var.f426595f, c0Var + " dispose");
        c0Var.f426603n = false;
        mn0.b0 b0Var2 = c0Var.f426598i;
        if (b0Var2 != null) {
            mn0.b0.C(b0Var2, true, false, false, 6, null);
        }
        ig2.r rVar = c0Var.f426604o;
        if (rVar == null || (c17 = rVar.c()) == null || (b0Var = c17.f291409h) == null) {
            return;
        }
        mn0.b0.C(b0Var, true, false, false, 6, null);
    }

    @Override // sh1.g
    public void d(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(params);
            java.lang.String optString = jSONObject.optString("type");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
            com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", "on update, action = " + optString + ", width = " + (optJSONObject != null ? optJSONObject.optInt("width") : 0) + ", height = " + (optJSONObject != null ? optJSONObject.optInt("height") : 0));
            ud2.d dVar = this.f67045a;
            kotlin.jvm.internal.o.d(optString);
            sh1.f invoker = this.f67046b;
            dVar.getClass();
            kotlin.jvm.internal.o.g(invoker, "invoker");
            pm0.v.X(new ud2.b(dVar, optString, invoker));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveForSkylineService", e17, "parse update params failed", new java.lang.Object[0]);
        }
    }

    @Override // sh1.g
    public void onTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        motionEvent.toString();
    }

    @Override // sh1.g
    public void pause() {
        ud2.c0 c0Var = this.f67045a.f426612c;
        c0Var.f426603n = false;
        mn0.b0 b0Var = c0Var.f426598i;
        boolean z17 = b0Var != null && ((mn0.y) b0Var).b(false);
        java.lang.String str = c0Var.f426595f;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, c0Var + " on pause");
            mn0.b0 b0Var2 = c0Var.f426598i;
            if (b0Var2 != null) {
                mn0.b0.M(b0Var2, false, 1, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, c0Var + " on pause, but ain't playing");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", this + " pause");
    }

    @Override // sh1.g
    public void resume() {
        ud2.c0 c0Var = this.f67045a.f426612c;
        boolean z17 = c0Var.f426603n;
        java.lang.String str = c0Var.f426595f;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, c0Var + " on resume, but is already active");
        } else {
            c0Var.f426603n = true;
            com.tencent.mars.xlog.Log.i(str, c0Var + " on resume");
            v65.i.c(c0Var.f426597h, null, new ud2.b0(c0Var, null), 1, null);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveForSkylineService", this + " resume");
    }
}
