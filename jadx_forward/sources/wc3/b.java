package wc3;

/* loaded from: classes7.dex */
public class b extends lc3.e implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f526039d = kz5.p1.d(new yc3.c(), new yc3.b(), new vd3.d(), new vd3.f(), new ce3.a("MagicBrushDemo"));

    /* renamed from: e, reason: collision with root package name */
    public jc3.j0 f526040e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f526041f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f526042g;

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity = this.f526042g;
        if (activity != null) {
            return activity;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("activityContext");
        throw null;
    }

    public final void C0(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "start");
        this.f526042g = context;
        if (this instanceof wc3.d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "publicServiceLogic");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "magicBrushLogic");
        }
        jc3.j0 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi("MagicBrushDemo");
        rc3.w0 w0Var = (rc3.w0) wi6;
        w0Var.w(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229361r = this;
        c16416x87606a7b.a(this.f526039d);
        w0Var.W(c16416x87606a7b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "MagicBrush setUp");
        this.f526040e = wi6;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "onCanvasViewCreated canvasId:" + i17);
        android.view.ViewGroup viewGroup = this.f526041f;
        if (viewGroup != null) {
            viewGroup.addView(view);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i27;
        marginLayoutParams.height = i28;
        marginLayoutParams.topMargin = i19;
        marginLayoutParams.leftMargin = i18;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushDemoLogic", "onJSException msg:".concat(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "onCanvasViewDestroy canvasId:" + i17);
        android.view.ViewGroup viewGroup = this.f526041f;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.u
    public void b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushDemoLogic", "onConnException");
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
    }

    /* renamed from: destroy */
    public void mo173457x5cd39ffa() {
        jc3.j0 j0Var = this.f526040e;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
        ((rc3.w0) j0Var).m162151x5cd39ffa();
        android.view.ViewGroup viewGroup = this.f526041f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.u
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "onMainScriptInjected");
        jc3.j0 j0Var = this.f526040e;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        jSONObject.put("height", i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        jSONObject.put("top", 0);
        jSONObject.put("left", 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((rc3.w0) j0Var).k("createCanvas", jSONObject2);
    }

    @Override // jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoLogic", "onCreated");
        jc3.j0 j0Var = this.f526040e;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162153x68ac462();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
    }

    @Override // jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
    }

    @Override // jc3.u
    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
    }

    @Override // jc3.u
    /* renamed from: onResume */
    public void mo127085x57429eec() {
    }
}
