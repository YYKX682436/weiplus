package fn2;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f345901d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f345902e;

    /* renamed from: f, reason: collision with root package name */
    public final sf2.d3 f345903f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f345904g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f345905h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f345906i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f345907m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f345908n;

    /* renamed from: o, reason: collision with root package name */
    public final bm2.n7 f345909o;

    /* renamed from: p, reason: collision with root package name */
    public final bm2.o6 f345910p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f345911q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f345912r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f345913s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f345914t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f345915u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f345916v;

    /* renamed from: w, reason: collision with root package name */
    public final mm2.k5 f345917w;

    public s(android.view.View root, p3325xe03a0797.p3326xc267989b.y0 y0Var, sf2.d3 controller, int i17, fn2.u1 sourceScene, yz5.a onShowSearch, yz5.a onEndSearch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShowSearch, "onShowSearch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEndSearch, "onEndSearch");
        this.f345901d = root;
        this.f345902e = y0Var;
        this.f345903f = controller;
        this.f345904g = onShowSearch;
        this.f345905h = onEndSearch;
        this.f345911q = new java.util.LinkedHashSet();
        this.f345916v = "";
        this.f345917w = (mm2.k5) controller.m56788xbba4bfc0(mm2.k5.class);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.rft);
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(new fn2.l(this));
        }
        this.f345906i = (android.widget.EditText) root.findViewById(com.p314xaae8f345.mm.R.id.rju);
        this.f345908n = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.ole);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.rs6);
        this.f345907m = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(this);
        }
        android.widget.TextView textView = this.f345908n;
        if (textView != null) {
            textView.setOnClickListener(new fn2.m(this));
        }
        zl2.r4.f555483a.Z2(this.f345906i, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new fn2.o(this));
        android.widget.EditText editText = this.f345906i;
        if (editText != null) {
            editText.setOnEditorActionListener(new fn2.r(this));
        }
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "<get-context>(...)");
        bm2.n7 n7Var = new bm2.n7(c17, controller, y0Var);
        this.f345909o = n7Var;
        android.content.Context c18 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "<get-context>(...)");
        bm2.o6 o6Var = new bm2.o6(c18, controller, i17, sourceScene, y0Var);
        this.f345910p = o6Var;
        o6Var.f103732o = r45.y4.AddSongSourceType_Search;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.s3c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv((android.view.ViewGroup) findViewById, controller, y0Var, null);
        this.f345912r = dvVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dvVar.f199685e;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(n7Var);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        }
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.s3d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv((android.view.ViewGroup) findViewById2, controller, y0Var, null);
        this.f345913s = dvVar2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = dvVar2.f199685e;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(o6Var);
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba42.getContext()));
            ym5.a1.g(c1163xf1deaba42, new fn2.f(this));
        }
        fn2.g gVar = new fn2.g(this, null);
        fn2.h hVar = new fn2.h(this);
        dvVar2.f199695o = gVar;
        dvVar2.f199696p = hVar;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.k(this, null), 3, null);
        }
    }

    public static final void a(fn2.s sVar, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = sVar.f345912r;
        if (dvVar != null) {
            dvVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = sVar.f345913s;
        if (dvVar2 != null) {
            android.content.Context c17 = sVar.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "<get-context>(...)");
            java.lang.String string = c17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            dvVar2.c(list, string);
        }
    }

    public static final void b(fn2.s sVar) {
        sVar.getClass();
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408786o2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 2);
        jSONObject2.put("element", 1);
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final android.content.Context c() {
        return this.f345901d.getContext();
    }

    public final void d() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f345915u;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "<get-context>(...)");
        android.widget.EditText editText = this.f345906i;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c17.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        android.widget.EditText editText2 = this.f345906i;
        if (editText2 != null) {
            editText2.clearComposingText();
            editText2.clearFocus();
            editText2.setText("");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = this.f345912r;
        if (dvVar != null) {
            dvVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = this.f345913s;
        if (dvVar2 != null) {
            dvVar2.b();
        }
        bm2.n7 n7Var = this.f345909o;
        ((java.util.ArrayList) n7Var.f103697d).clear();
        n7Var.m8146xced61ae5();
        bm2.o6 o6Var = this.f345910p;
        ((java.util.ArrayList) o6Var.f103737t).clear();
        o6Var.m8146xced61ae5();
        android.widget.TextView textView = this.f345908n;
        if (textView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f345916v = "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.rs6) {
            android.widget.EditText editText = this.f345906i;
            if (editText != null) {
                editText.setText("");
            }
            d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
