package lj2;

/* loaded from: classes10.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f400458d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f400459e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f400460f;

    /* renamed from: g, reason: collision with root package name */
    public final zh2.c f400461g;

    /* renamed from: h, reason: collision with root package name */
    public int f400462h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f400463i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f400464m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f400465n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f400466o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f400467p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f400468q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f400469r;

    public r0(android.content.Context context, gk2.e liveData, android.view.View parentRoot, zh2.c pluginAbility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f400458d = context;
        this.f400459e = liveData;
        this.f400460f = parentRoot;
        this.f400461g = pluginAbility;
        this.f400462h = 1;
        android.view.View findViewById = parentRoot.findViewById(com.p314xaae8f345.mm.R.id.tm8);
        this.f400463i = findViewById;
        android.view.View findViewById2 = findViewById != null ? findViewById.findViewById(com.p314xaae8f345.mm.R.id.tmb) : null;
        this.f400464m = findViewById2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = findViewById != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tmc) : null;
        android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tmd) : null;
        android.view.View findViewById3 = findViewById != null ? findViewById.findViewById(com.p314xaae8f345.mm.R.id.tm9) : null;
        this.f400465n = findViewById3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = findViewById != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tm_) : null;
        android.widget.TextView textView2 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tma) : null;
        android.view.View findViewById4 = findViewById != null ? findViewById.findViewById(com.p314xaae8f345.mm.R.id.tme) : null;
        this.f400466o = findViewById4;
        java.util.Map k17 = kz5.c1.k(new jz5.l(1, new lj2.z0(findViewById2, c22699x3dcdb352, textView)), new jz5.l(3, new lj2.z0(findViewById3, c22699x3dcdb3522, textView2)), new jz5.l(2, new lj2.z0(findViewById4, findViewById != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tmf) : null, findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.tmg) : null)));
        this.f400467p = k17;
        this.f400468q = jz5.h.b(new lj2.q0(this));
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSetMicModeWidget", "root is null");
        }
        java.util.Iterator it = k17.entrySet().iterator();
        while (it.hasNext()) {
            android.view.View view = ((lj2.z0) ((java.util.Map.Entry) it.next()).getValue()).f400501a;
            if (view != null) {
                view.setOnClickListener(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj2.r0.a(int):void");
    }

    public final void b(int i17) {
        android.content.Context context = this.f400458d;
        int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.adg);
        int d18 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
        int d19 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289);
        java.util.Map map = this.f400467p;
        for (lj2.z0 z0Var : map.values()) {
            android.view.View view = z0Var.f400501a;
            if (view != null) {
                view.setBackground(null);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = z0Var.f400502b;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(d17);
            }
            android.widget.TextView textView = z0Var.f400503c;
            if (textView != null) {
                textView.setTextColor(d17);
            }
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView);
            }
        }
        lj2.z0 z0Var2 = (lj2.z0) map.get(java.lang.Integer.valueOf(i17));
        if (z0Var2 != null) {
            android.view.View view2 = z0Var2.f400501a;
            if (view2 != null) {
                view2.setBackgroundColor(d19);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = z0Var2.f400502b;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(d18);
            }
            android.widget.TextView textView2 = z0Var2.f400503c;
            if (textView2 != null) {
                textView2.setTextColor(d18);
            }
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.b(textView2);
            }
        }
        jz5.g gVar = this.f400468q;
        if (i17 == 2 || i17 == 3) {
            ((lj2.n) ((jz5.n) gVar).mo141623x754a37bb()).c();
            this.f400469r = true;
        } else {
            ((lj2.n) ((jz5.n) gVar).mo141623x754a37bb()).a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f400464m)) {
            a(1);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f400465n)) {
            a(3);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f400466o)) {
            a(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
