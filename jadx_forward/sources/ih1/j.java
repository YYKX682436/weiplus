package ih1;

/* loaded from: classes7.dex */
public final class j implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ih1.m f373033b;

    public j(ih1.u uVar, ih1.m mVar) {
        this.f373032a = uVar;
        this.f373033b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373032a.f373063a + "], getViewAttributeFromData: " + data);
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        java.lang.String optString = data.optString("frameSetName", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        java.lang.String optString2 = data.optString("frameSetRootPath", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        return new ih1.f(optString, optString2, new tp0.j(optJSONObject != null ? optJSONObject.optInt("left", -1) : -1, optJSONObject != null ? optJSONObject.optInt("top", -1) : -1, optJSONObject != null ? optJSONObject.optInt("width", -1) : -1, optJSONObject != null ? optJSONObject.optInt("height", -1) : -1, -1, data.has("hide") ? data.optBoolean("hide") : -1));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f373032a;
        sb6.append(uVar.f373063a);
        sb6.append("], onRequestRemoveCoverView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((android.widget.FrameLayout) ((jz5.n) uVar.f373066d).mo141623x754a37bb()).removeView(view);
        jc3.k.b(callback, lc3.x.f399467a, null, 2, null);
        ih1.m mVar = this.f373033b;
        ih1.v vVar = (ih1.v) mVar.f373043d.get(java.lang.Integer.valueOf(view.hashCode()));
        if (vVar != null) {
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str = vVar.f373075a;
            java.lang.String a17 = vVar.f373076b.a();
            java.lang.String str2 = vVar.f373077c;
            ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f412048g, true, str2, kz5.b1.e(new jz5.l("appId", uVar.f373063a)));
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new ih1.i(this.f373033b, this.f373032a);
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        ih1.f viewAttribute = (ih1.f) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f373033b.f373043d.put(java.lang.Integer.valueOf(view.hashCode()), new ih1.v("MagicAdMiniProgram", new iq0.e(viewAttribute.f373023b, "", 0, 0, 12, null), viewAttribute.f373022a, view.getVisibility() == 0));
        c(view, viewAttribute, callback);
    }

    @Override // jc3.m
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(android.view.View view, ih1.f viewAttribute, jc3.k callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.widget.FrameLayout.LayoutParams(0, 0);
        }
        tp0.j jVar = viewAttribute.f373024c;
        int i17 = jVar.f502555c;
        if (i17 >= 0) {
            marginLayoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i17));
        }
        int i18 = jVar.f502556d;
        if (i18 >= 0) {
            marginLayoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
        }
        int i19 = jVar.f502553a;
        if (i19 >= 0) {
            marginLayoutParams.leftMargin = vp0.b.b(java.lang.Integer.valueOf(i19));
        }
        int i27 = jVar.f502554b;
        if (i27 >= 0) {
            marginLayoutParams.topMargin = vp0.b.b(java.lang.Integer.valueOf(i27));
        }
        view.setLayoutParams(marginLayoutParams);
        jc3.k.b(callback, lc3.x.f399467a, null, 2, null);
    }
}
