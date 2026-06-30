package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class l1 extends hg5.d {
    public static final com.tencent.mm.plugin.address.model.RcptItem G = new com.tencent.mm.plugin.address.model.RcptItem("暂不选择", "000000000", "000000");
    public static final com.tencent.mm.plugin.address.model.RcptItem H = new com.tencent.mm.plugin.address.model.RcptItem("自动定位", "000000000", "000000");
    public final jz5.g A;
    public com.tencent.mm.plugin.address.model.RcptItem B;
    public int C;
    public java.util.List D;
    public i11.c E;
    public u60.e F;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f74577r;

    /* renamed from: s, reason: collision with root package name */
    public final int f74578s;

    /* renamed from: t, reason: collision with root package name */
    public final q71.f0 f74579t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f74580u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.l f74581v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f74582w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f74583x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f74584y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f74585z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context activity, java.lang.String initAddress, yz5.l callback, int i17, q71.f0 addrMgr, boolean z17, yz5.l lVar) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(initAddress, "initAddress");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(addrMgr, "addrMgr");
        this.f74577r = callback;
        this.f74578s = i17;
        this.f74579t = addrMgr;
        this.f74580u = z17;
        this.f74581v = lVar;
        this.f74582w = jz5.h.b(new com.tencent.mm.plugin.address.ui.j1(this));
        this.f74583x = jz5.h.b(new com.tencent.mm.plugin.address.ui.g1(this));
        this.f74584y = jz5.h.b(new com.tencent.mm.plugin.address.ui.i1(this));
        this.f74585z = jz5.h.b(new com.tencent.mm.plugin.address.ui.h1(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.address.ui.f1(this));
        this.C = 1;
        this.C = java.lang.Math.min(1, i17);
        this.D = new java.util.ArrayList();
        java.util.List g17 = new r26.t("\\s+").g(initAddress, 0);
        if (g17.size() >= 3) {
            com.tencent.mm.plugin.address.model.RcptItem h17 = addrMgr.h((java.lang.String) g17.get(0), (java.lang.String) g17.get(1), (java.lang.String) g17.get(2), g17.size() == 3 ? null : (java.lang.String) g17.get(3));
            this.B = h17;
            if (h17 != null) {
                this.D.add(h17);
                com.tencent.mm.plugin.address.model.RcptItem rcptItem = this.B;
                java.lang.Integer valueOf = rcptItem != null ? java.lang.Integer.valueOf(rcptItem.f74375h) : null;
                kotlin.jvm.internal.o.d(valueOf);
                com.tencent.mm.plugin.address.model.RcptItem c17 = addrMgr.c(valueOf.intValue());
                while (c17 != null) {
                    this.D.add(0, c17);
                    c17 = this.f74579t.c(c17.f74375h);
                }
                q71.f0 f0Var = this.f74579t;
                com.tencent.mm.plugin.address.model.RcptItem rcptItem2 = this.B;
                if (((java.util.ArrayList) f0Var.e(rcptItem2 != null ? rcptItem2.f74372e : null)).size() == 0) {
                    this.C = java.lang.Math.min(this.D.size(), this.f74578s);
                } else {
                    this.C = java.lang.Math.min(this.D.size() + 1, this.f74578s);
                }
            }
        }
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cjh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f281403i;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.address.ui.w0(this));
        }
        com.tencent.mm.ui.base.CustomViewPager K = K();
        if (K != null) {
            K.setOnPageChangeListener(new com.tencent.mm.plugin.address.ui.x0(this));
        }
        android.widget.TextView[] textViewArr = {(android.widget.TextView) ((jz5.n) this.f74583x).getValue(), (android.widget.TextView) ((jz5.n) this.f74584y).getValue(), (android.widget.TextView) ((jz5.n) this.f74585z).getValue(), (android.widget.TextView) ((jz5.n) this.A).getValue()};
        int i17 = 0;
        int i18 = 0;
        while (i17 < 4) {
            android.widget.TextView textView = textViewArr[i17];
            int i19 = i18 + 1;
            if (textView != null) {
                textView.setOnClickListener(new com.tencent.mm.plugin.address.ui.y0(this, i18));
            }
            i17++;
            i18 = i19;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.base.CustomViewPager K2 = K();
        if (K2 != null) {
            K2.setAdapter(new com.tencent.mm.plugin.address.ui.b1(this, hashMap, getContext()));
        }
        com.tencent.mm.ui.base.CustomViewPager K3 = K();
        if (K3 != null) {
            K3.setCurrentItem(this.C - 1, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gqx);
        if (textView2 != null) {
            if (!this.f74580u) {
                java.lang.Object parent = textView2.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view2 = (android.view.View) parent;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227172w)) {
                        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
                        this.F = new com.tencent.mm.plugin.address.ui.d1(this, textView2);
                        this.E = new com.tencent.mm.plugin.address.ui.e1(gVar, this, textView2);
                        ((t60.e) gVar).getClass();
                        i11.h.e().j(this.E, false);
                        return;
                    }
                    java.lang.Object parent2 = textView2.getParent();
                    kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.View");
                    android.view.View view3 = (android.view.View) parent2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
            }
            java.lang.Object parent3 = textView2.getParent();
            kotlin.jvm.internal.o.e(parent3, "null cannot be cast to non-null type android.view.View");
            android.view.View view4 = (android.view.View) parent3;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // hg5.d
    public void J() {
        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
        ((t60.e) gVar).getClass();
        i11.h.e().m(this.E);
        ((i11.g) ((t60.e) gVar).wi()).c(this.F);
        super.J();
    }

    public final com.tencent.mm.ui.base.CustomViewPager K() {
        return (com.tencent.mm.ui.base.CustomViewPager) ((jz5.n) this.f74582w).getValue();
    }

    @Override // hg5.d, android.app.Dialog
    public void show() {
        super.show();
        com.tencent.mm.ui.bk.k0(getWindow());
        android.view.Window window = getWindow();
        android.view.ViewGroup viewGroup = null;
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup2 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup2 != null) {
            int childCount = viewGroup2.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt = viewGroup2.getChildAt(i17);
                if (!kotlin.jvm.internal.o.b("android:status:background", childAt.getTransitionName()) && !kotlin.jvm.internal.o.b("android:navigation:background", childAt.getTransitionName())) {
                    viewGroup = childAt;
                    break;
                }
                i17++;
            }
            if (viewGroup != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.setOnApplyWindowInsetsListener(new com.tencent.mm.plugin.address.ui.k1(this));
        }
    }
}
