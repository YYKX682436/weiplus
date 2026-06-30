package mh2;

/* loaded from: classes10.dex */
public final class n extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f407941c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f407942d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407943e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f407944f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f407945g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f407946h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f407947i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f407948j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f407949k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f407950l;

    /* renamed from: m, reason: collision with root package name */
    public int f407951m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f407952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, android.view.ViewGroup root, ah2.f contentService, lj2.v0 pluginAbility) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f407941c = contentService;
        this.f407942d = pluginAbility;
        this.f407943e = "KTVFinishSingingWidget";
        android.view.View findViewById = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f407944f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.rp9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f407945g = textView;
        android.view.View findViewById3 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s97);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f407946h = textView2;
        android.view.View findViewById4 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s98);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f407947i = textView3;
        android.view.View findViewById5 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.rto);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f407948j = textView4;
        android.view.View findViewById6 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.rtp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f407949k = textView5;
        android.view.View findViewById7 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.ulg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f407950l = findViewById7;
        android.view.View findViewById8 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.uli);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.ulh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f407951m = -1;
        this.f407952n = "";
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView4);
        com.p314xaae8f345.mm.ui.fk.a(textView5);
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById9);
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById8);
        com.p314xaae8f345.mm.ui.fk.b(textView);
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mh2.a
    public void c(om2.d0 singState) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        r45.xn1 xn1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        this.f407951m = -1;
        this.f407952n = "";
        this.f407941c.b(new mh2.l(this));
        jz5.f0 f0Var = null;
        om2.c0 c0Var = singState instanceof om2.c0 ? (om2.c0) singState : null;
        lj2.v0 v0Var = this.f407942d;
        if (c0Var != null) {
            om2.o oVar = c0Var.f427813a;
            boolean z17 = oVar.f427899g;
            java.lang.String str = oVar.f427897e;
            android.content.Context context = this.f407824a;
            this.f407945g.setText(z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ora, str) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mja, str));
            r45.xn1 xn1Var2 = oVar.f427894b;
            b(this.f407944f, xn1Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0) : null);
            f(c0Var.f427815c);
            java.lang.String str2 = this.f407943e;
            om2.o oVar2 = c0Var.f427814b;
            if (oVar2 != null) {
                java.lang.String str3 = oVar2.f427897e;
                boolean z18 = true;
                if (str3.length() > 0) {
                    r45.xn1 xn1Var3 = oVar2.f427894b;
                    c19782x23db1cfa = xn1Var3 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0) : null;
                } else {
                    c19782x23db1cfa = null;
                    str3 = null;
                }
                if (c19782x23db1cfa == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) v0Var : null;
                    if (lVar != null) {
                        java.util.List list = ((om2.g) lVar.P0(om2.g.class)).f427844r;
                        r45.yx1 yx1Var = list != null ? (r45.yx1) kz5.n0.a0(list, 1) : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "state has no singer contact, fetch contact from LiveKTVSingSlice");
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (yx1Var == null || (xn1Var = yx1Var.f472996i) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        str3 = (yx1Var == null || (by1Var = yx1Var.f472999o) == null || (ay1Var = by1Var.f452676d) == null) ? null : ay1Var.f451884e;
                        c19782x23db1cfa = c19782x23db1cfa2;
                    }
                }
                if (str3 != null && str3.length() != 0) {
                    z18 = false;
                }
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (z18) {
                    android.view.View view = this.f407950l;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = this.f407950l;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f407950l;
                    android.widget.TextView textView = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ulh);
                    if (oVar.f427899g) {
                        textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ord, str3));
                    } else {
                        textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ore, str3));
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.ulj);
                    if (c19782x23db1cfa != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(imageView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        imageView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b(imageView, c19782x23db1cfa);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "finish singing view show next song name:" + str3 + " singer:" + c19782x23db1cfa.m76184x8010e5e4());
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(imageView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        imageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "finish singing view show next song name:" + str3 + " but singer contact is null");
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                android.view.View view4 = this.f407950l;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "nextSongInfo is null");
            }
        }
        lj2.w0 f17 = v0Var.f();
        lj2.w0 w0Var = lj2.w0.f400492e;
        android.view.View view5 = this.f407825b;
        if (f17 == w0Var) {
            view5.setTranslationY(i65.a.b(view5.getContext(), 40));
        } else {
            view5.setTranslationY(0.0f);
        }
    }

    @Override // mh2.a
    public void d(r45.x84 ktvData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvData, "ktvData");
        r45.ia4 ia4Var = ktvData.f471403i;
        if (ia4Var != null) {
            f(ia4Var);
        }
    }

    public final void f(r45.ia4 ia4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407943e, "total_score: " + ia4Var.f458408m + " level: " + ia4Var.f458409n);
        if (ia4Var.f458408m == this.f407951m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407952n, ia4Var.f458409n)) {
            return;
        }
        pm0.v.X(new mh2.m(this, ia4Var));
    }
}
