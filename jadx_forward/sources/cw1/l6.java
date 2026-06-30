package cw1;

/* loaded from: classes12.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f304639a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f304640b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f304641c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304642d;

    /* renamed from: e, reason: collision with root package name */
    public int f304643e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f304644f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f f304645g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f304646h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f304647i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f304648j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f304649k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f304650l;

    /* renamed from: m, reason: collision with root package name */
    public final yv1.g1 f304651m;

    /* renamed from: n, reason: collision with root package name */
    public final long f304652n;

    /* renamed from: o, reason: collision with root package name */
    public final int f304653o;

    /* renamed from: p, reason: collision with root package name */
    public long f304654p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f304655q;

    public l6(android.content.Context context, boolean z17, int i17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f304639a = context;
        this.f304640b = z17;
        this.f304641c = callback;
        this.f304642d = "";
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        this.f304644f = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2x, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lbl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304645g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566939u73);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f304646h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f304647i = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.oqc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f304648j = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565040sn2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f304649k = findViewById5;
        findViewById5.setOnClickListener(new cw1.d6(this));
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sm7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f304650l = findViewById6;
        findViewById6.setOnClickListener(new cw1.e6(this));
        y1Var.k(inflate);
        yv1.g1 b17 = yv1.g1.f547573p.b(i17);
        this.f304651m = b17;
        this.f304652n = z17 ? b17.f547582h : b17.f547580f;
        this.f304653o = z17 ? b17.f547583i : b17.f547581g;
    }

    public static final boolean a(cw1.l6 l6Var) {
        l6Var.getClass();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20282xb127cf56()) > 0) {
            return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20278x4b5ed5bb()) > 0;
        }
        return false;
    }

    public static final void b(cw1.l6 l6Var) {
        l6Var.f304645g.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = l6Var.f304646h;
        c22699x3dcdb352.setVisibility(0);
        c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78854xf80f04c7, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
        android.content.Context context = l6Var.f304639a;
        l6Var.f304647i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1f));
        long j17 = l6Var.f304652n;
        l6Var.f304648j.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572450d74, fp.n0.a(j17)));
        android.view.View view = l6Var.f304649k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = l6Var.f304650l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (l6Var.f304642d.length() > 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.String str = l6Var.f304642d;
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(l6Var.f304643e));
            lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(j17));
            lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(j17));
            lVarArr[4] = new jz5.l("storage_manage_sessionid", l6Var.f304651m.f547576b);
            ((cy1.a) rVar).Hj(str, "view_exp", kz5.c1.k(lVarArr), 32903);
        }
    }

    public static final void c(cw1.l6 l6Var, long j17, int i17) {
        int i18;
        yv1.h1.f(2, l6Var.f304655q);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (i17 <= 0 || currentTimeMillis <= 0 || (i18 = l6Var.f304653o) <= 0) {
            return;
        }
        float f17 = i17 / ((float) currentTimeMillis);
        int i19 = (int) (((l6Var.f304653o - i17) / f17) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.k6(l6Var, e06.p.f((i17 * 100) / i18, 0, 100), i19 >= 0 ? i19 : 0));
    }
}
