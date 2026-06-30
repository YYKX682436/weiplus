package jn2;

/* loaded from: classes5.dex */
public final class w implements android.view.View.OnClickListener {
    public boolean A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public int C;
    public java.lang.String D;
    public final java.util.Set E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f382253d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f382254e;

    /* renamed from: f, reason: collision with root package name */
    public final sf2.x f382255f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f382256g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f382257h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f382258i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f382259m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f382260n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f382261o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f382262p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f382263q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f382264r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f382265s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f382266t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f382267u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f382268v;

    /* renamed from: w, reason: collision with root package name */
    public jn2.z f382269w;

    /* renamed from: x, reason: collision with root package name */
    public jn2.c1 f382270x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f382271y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f382272z;

    public w(android.view.View root, p3325xe03a0797.p3326xc267989b.y0 y0Var, sf2.x controller, gk2.e liveData, yz5.a onShowSearch, yz5.a onEndSearch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShowSearch, "onShowSearch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEndSearch, "onEndSearch");
        this.f382253d = root;
        this.f382254e = y0Var;
        this.f382255f = controller;
        this.f382256g = onShowSearch;
        this.f382257h = onEndSearch;
        this.D = "";
        this.E = new java.util.LinkedHashSet();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.ssf);
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(new jn2.q(this));
        }
        this.f382258i = (android.widget.EditText) root.findViewById(com.p314xaae8f345.mm.R.id.t8k);
        this.f382260n = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.vhi);
        this.f382259m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.u6q);
        this.f382261o = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.uzz);
        this.f382262p = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.f568250v00);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f382261o;
        this.f382263q = c1073x7e08a7872 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c1073x7e08a7872.findViewById(com.p314xaae8f345.mm.R.id.f568599s71) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.f382262p;
        this.f382264r = c1073x7e08a7873 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c1073x7e08a7873.findViewById(com.p314xaae8f345.mm.R.id.f568599s71) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = this.f382261o;
        this.f382265s = c1073x7e08a7874 != null ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) c1073x7e08a7874.findViewById(com.p314xaae8f345.mm.R.id.rfs) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = this.f382261o;
        this.f382266t = c1073x7e08a7875 != null ? (android.widget.TextView) c1073x7e08a7875.findViewById(com.p314xaae8f345.mm.R.id.qgx) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = this.f382262p;
        this.f382267u = c1073x7e08a7876 != null ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) c1073x7e08a7876.findViewById(com.p314xaae8f345.mm.R.id.rfs) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7877 = this.f382262p;
        this.f382268v = c1073x7e08a7877 != null ? (android.widget.TextView) c1073x7e08a7877.findViewById(com.p314xaae8f345.mm.R.id.qgx) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f382259m;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(this);
        }
        android.widget.TextView textView = this.f382260n;
        if (textView != null) {
            textView.setOnClickListener(new jn2.r(this));
        }
        zl2.r4.f555483a.Z2(this.f382258i, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new jn2.t(this));
        android.widget.EditText editText = this.f382258i;
        if (editText != null) {
            editText.setOnEditorActionListener(new jn2.v(this));
        }
        android.content.Context d17 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-context>(...)");
        jn2.z zVar = new jn2.z(d17, new jn2.n(this));
        this.f382269w = zVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f382263q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(zVar);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        }
        android.content.Context d18 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "<get-context>(...)");
        jn2.c1 c1Var = new jn2.c1(d18, controller, liveData, y0Var, jn2.a2.f382084e, null, null, 96, null);
        this.f382270x = c1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f382264r;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(c1Var);
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba42.getContext()));
            ym5.a1.g(c1163xf1deaba42, new jn2.o(this));
            c1163xf1deaba42.i(new jn2.p(this));
        }
    }

    public static final void a(jn2.w wVar, java.util.List list) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = wVar.f382261o;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setEnabled(false);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = wVar.f382267u;
        if (c1073x7e08a7872 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1073x7e08a7872, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7872.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1073x7e08a7872, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = wVar.f382264r;
        if (c1163xf1deaba4 != null) {
            int i17 = list.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1163xf1deaba4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f382268v;
        if (textView != null) {
            int i18 = list.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = wVar.f382268v;
        if (textView2 != null) {
            android.content.Context d17 = wVar.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-context>(...)");
            java.lang.String string = d17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            textView2.setText(string);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = wVar.f382262p;
        if (c1073x7e08a7873 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c1073x7e08a7873, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c1073x7e08a7873, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSearchResult", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setEnabled(true);
        }
    }

    public static final void b(jn2.w wVar, java.util.List list) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = wVar.f382262p;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setEnabled(false);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = wVar.f382265s;
        if (c1073x7e08a7872 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1073x7e08a7872, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7872.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1073x7e08a7872, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = wVar.f382263q;
        if (c1163xf1deaba4 != null) {
            int i17 = list.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1163xf1deaba4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f382266t;
        if (textView != null) {
            int i18 = list.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = wVar.f382266t;
        if (textView2 != null) {
            android.content.Context d17 = wVar.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-context>(...)");
            java.lang.String string = d17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            textView2.setText(string);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = wVar.f382261o;
        if (c1073x7e08a7873 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c1073x7e08a7873, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c1073x7e08a7873, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hideLoadingAndShowSmartBox", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setEnabled(true);
        }
    }

    public static final void c(jn2.w wVar) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = wVar.f382261o;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setEnabled(false);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = wVar.f382267u;
        if (c1073x7e08a7872 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1073x7e08a7872, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7872.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1073x7e08a7872, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = wVar.f382264r;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1163xf1deaba4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = wVar.f382268v;
        if (textView != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = wVar.f382262p;
        if (c1073x7e08a7873 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c1073x7e08a7873, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c1073x7e08a7873, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSearchLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7873.setEnabled(true);
        }
    }

    public final android.content.Context d() {
        return this.f382253d.getContext();
    }

    public final void e() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f382261o;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setEnabled(false);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f382262p;
        if (c1073x7e08a7872 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1073x7e08a7872, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7872.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1073x7e08a7872, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a7872.setEnabled(false);
        }
    }

    public final void f() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f382272z;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.widget.EditText editText = this.f382258i;
        if (editText != null) {
            editText.clearComposingText();
            editText.clearFocus();
            editText.setText("");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f382259m;
        if (c22699x3dcdb352 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f382260n;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context d17 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-context>(...)");
        android.widget.EditText editText2 = this.f382258i;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) d17.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText2 != null ? editText2.getWindowToken() : null, 0);
        }
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.u6q) {
            android.widget.EditText editText = this.f382258i;
            if (editText != null) {
                editText.setText("");
            }
            e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
