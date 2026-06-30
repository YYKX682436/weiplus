package sz4;

/* loaded from: classes12.dex */
public abstract class u extends sz4.a {

    /* renamed from: w, reason: collision with root package name */
    public static final int f495762w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f495763x;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f495764f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f495765g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f495766h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f495767i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f495768m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f495769n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f495770o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f495771p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f495772q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout f495773r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f495774s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f495775t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f495776u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f495777v;

    static {
        float f17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        f495762w = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        f495763x = (int) ((f17 * 40.0f) + 0.5f);
    }

    public u(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495777v = new sz4.y(this);
        this.f495764f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d67);
        this.f495771p = view.findViewById(com.p314xaae8f345.mm.R.id.f569077oy4);
        this.f495767i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kea);
        this.f495772q = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567698kf3);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.keb);
        this.f495768m = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ke9);
        this.f495769n = textView2;
        this.f495770o = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ke_);
        textView.setTextSize(16.0f);
        textView2.setTextSize(12.0f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567696kf1);
        this.f495773r = linearLayout;
        linearLayout.setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.keu)).setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ke8);
        this.f495775t = linearLayout2;
        linearLayout2.setVisibility(8);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kmx);
        this.f495776u = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        linearLayout3.setVisibility(8);
        linearLayout3.setOnClickListener(new sz4.v(this));
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kn7);
        linearLayout4.setBackgroundColor(1347529272);
        linearLayout4.setVisibility(4);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567749kn1);
        linearLayout5.setBackgroundColor(1347529272);
        linearLayout5.setVisibility(4);
        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.d77);
        this.f495774s = linearLayout6;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout6.getLayoutParams();
        layoutParams.width = f495762w - f495763x;
        layoutParams.height = -2;
        linearLayout6.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azq);
        this.f495766h = c19515x154ec45a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azt);
        this.f495765g = c19515x154ec45a2;
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.azr)).setOnClickListener(new sz4.w(this));
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.azu)).setOnClickListener(new sz4.x(this));
        c19515x154ec45a.m74974xf2d19fb3(2);
        c19515x154ec45a2.m74974xf2d19fb3(1);
        c19515x154ec45a2.E = this;
        c19515x154ec45a.E = this;
        if (j0Var.f414842q != 2 || !this.f495715d.f414843r) {
            c19515x154ec45a.setKeyListener(null);
            c19515x154ec45a.setEnabled(false);
            c19515x154ec45a.setFocusable(false);
            c19515x154ec45a2.setKeyListener(null);
            c19515x154ec45a2.setEnabled(false);
            c19515x154ec45a2.setFocusable(false);
        }
        this.f495715d.k(c19515x154ec45a2);
        this.f495715d.k(c19515x154ec45a);
    }

    @Override // sz4.a
    public void j(iz4.c cVar, final int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + m8186xceeefb69());
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f495765g;
        c19515x154ec45a.m74976xaf1e83df(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = this.f495766h;
        c19515x154ec45a2.m74976xaf1e83df(i17);
        if (nz4.y.M) {
            nz4.y.h().G(n(this.f3639x46306858), this.f3639x46306858, false);
        }
        cVar.f377639d = c19515x154ec45a;
        cVar.f377640e = c19515x154ec45a2;
        cVar.f377641f = null;
        o(cVar);
        android.widget.LinearLayout linearLayout = this.f495767i;
        if (linearLayout.getVisibility() == 0) {
            if (cVar.f377644i) {
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bbg);
            } else {
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bbf);
            }
        }
        if (k() != null) {
            int i19 = i();
            android.view.View k17 = k();
            android.content.Context context = k17.getContext();
            if (i19 == 20) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_r));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_r);
            } else if (i19 == 30) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1n));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1n);
            } else if (i19 == -3) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw9));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw9);
            } else if (i19 == -2) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aot));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aot);
            } else if (i19 == 2) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_f));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_f);
            } else if (i19 == 3) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_g));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_g);
            } else if (i19 == 4) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_s));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_s);
            } else if (i19 == 5) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_e));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_e);
            } else if (i19 == 6) {
                k17.setContentDescription(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_r));
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_r);
            }
        }
        android.view.View l17 = l();
        if (l17 != null) {
            l17.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: sz4.u$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    java.lang.Object obj = new java.lang.Object();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i27 = i17;
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", obj, array);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(i27));
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", obj2, array2);
                    nz4.y.h().y(i27, 0, i27, 0);
                    nz4.y.h().w();
                    yj0.a.i(true, new java.lang.Object(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    yj0.a.i(true, new java.lang.Object(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            });
        }
    }

    public android.view.View k() {
        return null;
    }

    public android.view.View l() {
        return null;
    }

    public nz4.g n(android.view.View view) {
        return nz4.z.a(view);
    }

    public void o(iz4.c cVar) {
        boolean z17 = cVar.f377637b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f495766h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = this.f495765g;
        if (z17) {
            if (cVar.f377643h) {
                c19515x154ec45a2.requestFocus();
                return;
            } else {
                c19515x154ec45a.requestFocus();
                return;
            }
        }
        if (c19515x154ec45a2.hasFocus()) {
            c19515x154ec45a2.clearFocus();
        }
        if (c19515x154ec45a.hasFocus()) {
            c19515x154ec45a.clearFocus();
        }
    }
}
