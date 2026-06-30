package st2;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f493974a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h1 f493975b;

    /* renamed from: c, reason: collision with root package name */
    public final gk2.e f493976c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f493977d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f493978e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f493979f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f493980g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EditText f493981h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f493982i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f493983j;

    /* renamed from: k, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f493984k;

    /* renamed from: l, reason: collision with root package name */
    public final tt2.f1 f493985l;

    /* renamed from: m, reason: collision with root package name */
    public long f493986m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f493987n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f493988o;

    public s1(android.view.View rootView, st2.h1 internal, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internal, "internal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f493974a = rootView;
        this.f493975b = internal;
        this.f493976c = buContext;
        this.f493977d = "FinderLiveShoppingListSearchPage";
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.s3y);
        this.f493978e = findViewById;
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mdg);
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 15.0f, 0.0f, 8, null);
        this.f493979f = textView;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rfz);
        this.f493980g = findViewById2;
        android.widget.EditText editText = (android.widget.EditText) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568294s40);
        boolean z17 = true;
        editText.setTextSize(1, 17.0f);
        this.f493981h = editText;
        this.f493982i = rootView.findViewById(com.p314xaae8f345.mm.R.id.rnd);
        this.f493983j = rootView.findViewById(com.p314xaae8f345.mm.R.id.rna);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.mff);
        this.f493984k = c1163xf1deaba4;
        if (!zl2.r4.f555483a.w1() && !((mm2.c1) buContext.a(mm2.c1.class)).T) {
            z17 = false;
        }
        android.content.Context context2 = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        tt2.f1 f1Var = new tt2.f1(context2, z17, buContext);
        this.f493985l = f1Var;
        findViewById.setOnClickListener(new st2.j1(this));
        findViewById2.setOnClickListener(new st2.k1(this));
        textView.setOnClickListener(new st2.l1(this));
        editText.addTextChangedListener(new st2.r1(this));
        editText.setOnEditorActionListener(new st2.m1(this));
        editText.setOnFocusChangeListener(new st2.n1(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(rootView.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(f1Var);
        f1Var.f503424v = internal;
        internal.H(f1Var);
    }

    public static final void a(st2.s1 s1Var) {
        java.lang.Object systemService = s1Var.f493974a.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(s1Var.f493981h, 1);
        }
    }

    public final void b(java.lang.String str) {
        this.f493985l.c0(new qm0.a(kz5.p0.f395529d, null));
        android.view.View view = this.f493982i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f493984k.setVisibility(4);
        android.view.View view2 = this.f493983j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f493976c;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        r45.v82 v82Var = new r45.v82();
        v82Var.set(0, str);
        v82Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
        v82Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        v82Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivesearchproduct", 17688, v82Var, ld2Var, null).l().K(new st2.o1(h0Var, this, str));
    }

    public final void c(boolean z17) {
        android.view.View view = this.f493974a;
        if (view.getVisibility() == 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f408987y0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("total_duration", c01.id.c() - this.f493986m);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, this.f493987n, 7928, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "hideSearchPage " + z17);
        if (z17) {
            view.animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(this.f493975b.q().getWidth()).setListener(new st2.p1(this)).start();
        } else {
            android.view.View view2 = this.f493974a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "hide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "hide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d();
    }

    public final void d() {
        java.lang.Object systemService = this.f493974a.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f493981h.getWindowToken(), 0);
        }
    }

    public final void e() {
        this.f493981h.setText("");
        android.view.View view = this.f493983j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f493984k.setVisibility(4);
    }
}
