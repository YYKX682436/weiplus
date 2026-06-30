package zu2;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f557253a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f557254b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.i33 f557255c;

    /* renamed from: d, reason: collision with root package name */
    public final zu2.q f557256d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f557257e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f557258f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f557259g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f557260h;

    /* renamed from: i, reason: collision with root package name */
    public int f557261i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f557262j;

    public o(android.app.Activity context, android.view.View root, r45.i33 miniAppAdInfo, zu2.q reporter) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.view.View findViewById4;
        android.view.View findViewById5;
        android.view.View findViewById6;
        android.view.View findViewById7;
        android.view.View findViewById8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(miniAppAdInfo, "miniAppAdInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        this.f557253a = context;
        this.f557254b = root;
        this.f557255c = miniAppAdInfo;
        this.f557256d = reporter;
        this.f557257e = "Finder.WxaAdUIC";
        this.f557261i = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f557262j = arrayList;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.e0v);
        this.f557258f = viewGroup;
        android.view.View findViewById9 = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.e0r) : null;
        this.f557259g = findViewById9;
        android.view.View findViewById10 = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.e0s) : null;
        this.f557260h = findViewById10;
        root.findViewById(com.p314xaae8f345.mm.R.id.f564156jl).setOnClickListener(new zu2.f(this));
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new zu2.g(this));
        }
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(zu2.h.f557246d);
        }
        if (findViewById9 != null && (findViewById8 = findViewById9.findViewById(com.p314xaae8f345.mm.R.id.lkp)) != null) {
            findViewById8.setOnClickListener(new zu2.i(this));
        }
        if (findViewById9 != null && (findViewById7 = findViewById9.findViewById(com.p314xaae8f345.mm.R.id.lkt)) != null) {
            findViewById7.setOnClickListener(new zu2.j(this));
        }
        if (findViewById9 != null && (findViewById6 = findViewById9.findViewById(com.p314xaae8f345.mm.R.id.gdv)) != null) {
            findViewById6.setOnClickListener(new zu2.k(this));
        }
        android.widget.TextView textView = findViewById9 != null ? (android.widget.TextView) findViewById9.findViewById(com.p314xaae8f345.mm.R.id.f564191kg) : null;
        if (textView != null) {
            textView.setText(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(miniAppAdInfo.m75945x2fec8307(9)) ? miniAppAdInfo.m75945x2fec8307(9) : context.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.ckb));
        }
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(zu2.l.f557250d);
        }
        if (findViewById10 != null && (findViewById5 = findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkq)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkr) : null, findViewById5));
            findViewById5.setOnClickListener(new zu2.m(this));
        }
        if (findViewById10 != null && (findViewById4 = findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkl)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkm) : null, findViewById4));
            findViewById4.setOnClickListener(new zu2.n(this));
        }
        if (findViewById10 != null && (findViewById3 = findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkj)) != null) {
            arrayList.add(new jz5.l(findViewById10 != null ? (android.widget.TextView) findViewById10.findViewById(com.p314xaae8f345.mm.R.id.lkk) : null, findViewById3));
            findViewById3.setOnClickListener(new zu2.c(this));
        }
        if (findViewById10 != null && (findViewById2 = findViewById10.findViewById(com.p314xaae8f345.mm.R.id.dz6)) != null) {
            findViewById2.setOnClickListener(new zu2.d(this));
        }
        if (findViewById10 == null || (findViewById = findViewById10.findViewById(com.p314xaae8f345.mm.R.id.f566589ge0)) == null) {
            return;
        }
        findViewById.setOnClickListener(new zu2.e(this));
    }

    public static final void a(zu2.o oVar, int i17) {
        android.app.Activity activity;
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f557257e, "clickUninterest " + i17);
        java.util.ArrayList arrayList = oVar.f557262j;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activity = oVar.f557253a;
            if (!hasNext) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = (android.widget.TextView) lVar.f384366d;
            if (textView != null) {
                textView.setTextColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
            android.view.View view = (android.view.View) lVar.f384367e;
            if (view != null) {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563061vn);
            }
        }
        if (oVar.f557261i == i17) {
            oVar.f557261i = -1;
        } else {
            oVar.f557261i = i17;
            jz5.l lVar2 = (jz5.l) kz5.n0.a0(arrayList, i17);
            if (lVar2 != null) {
                android.widget.TextView textView2 = (android.widget.TextView) lVar2.f384366d;
                if (textView2 != null) {
                    textView2.setTextColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                }
                android.view.View view2 = (android.view.View) lVar2.f384367e;
                if (view2 != null) {
                    view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo);
                }
            }
        }
        if (oVar.f557261i >= 0) {
            android.view.View view3 = oVar.f557260h;
            android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.dz6) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "clickUninterest", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public static final void b(zu2.o oVar) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goExposeUrl ");
        r45.i33 i33Var = oVar.f557255c;
        sb6.append(i33Var != null ? i33Var.m75945x2fec8307(7) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f557257e, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        if (i33Var == null || (str = i33Var.m75945x2fec8307(7)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        j45.l.j(oVar.f557253a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void c() {
        android.view.ViewGroup viewGroup = this.f557258f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
