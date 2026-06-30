package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class l1 extends hg5.d {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 G = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8("暂不选择", "000000000", "000000");
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 H = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8("自动定位", "000000000", "000000");
    public final jz5.g A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 B;
    public int C;
    public java.util.List D;
    public i11.c E;
    public u60.e F;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f156110r;

    /* renamed from: s, reason: collision with root package name */
    public final int f156111s;

    /* renamed from: t, reason: collision with root package name */
    public final q71.f0 f156112t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f156113u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.l f156114v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f156115w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f156116x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f156117y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f156118z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context activity, java.lang.String initAddress, yz5.l callback, int i17, q71.f0 addrMgr, boolean z17, yz5.l lVar) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initAddress, "initAddress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addrMgr, "addrMgr");
        this.f156110r = callback;
        this.f156111s = i17;
        this.f156112t = addrMgr;
        this.f156113u = z17;
        this.f156114v = lVar;
        this.f156115w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.j1(this));
        this.f156116x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.g1(this));
        this.f156117y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.i1(this));
        this.f156118z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.h1(this));
        this.A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.f1(this));
        this.C = 1;
        this.C = java.lang.Math.min(1, i17);
        this.D = new java.util.ArrayList();
        java.util.List g17 = new r26.t("\\s+").g(initAddress, 0);
        if (g17.size() >= 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 h17 = addrMgr.h((java.lang.String) g17.get(0), (java.lang.String) g17.get(1), (java.lang.String) g17.get(2), g17.size() == 3 ? null : (java.lang.String) g17.get(3));
            this.B = h17;
            if (h17 != null) {
                this.D.add(h17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = this.B;
                java.lang.Integer valueOf = c11485x80cda4c8 != null ? java.lang.Integer.valueOf(c11485x80cda4c8.f155908h) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c17 = addrMgr.c(valueOf.intValue());
                while (c17 != null) {
                    this.D.add(0, c17);
                    c17 = this.f156112t.c(c17.f155908h);
                }
                q71.f0 f0Var = this.f156112t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c82 = this.B;
                if (((java.util.ArrayList) f0Var.e(c11485x80cda4c82 != null ? c11485x80cda4c82.f155905e : null)).size() == 0) {
                    this.C = java.lang.Math.min(this.D.size(), this.f156111s);
                } else {
                    this.C = java.lang.Math.min(this.D.size() + 1, this.f156111s);
                }
            }
        }
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f362936i;
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.w0(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d K = K();
        if (K != null) {
            K.mo79170x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x0(this));
        }
        android.widget.TextView[] textViewArr = {(android.widget.TextView) ((jz5.n) this.f156116x).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) this.f156117y).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) this.f156118z).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) this.A).mo141623x754a37bb()};
        int i17 = 0;
        int i18 = 0;
        while (i17 < 4) {
            android.widget.TextView textView = textViewArr[i17];
            int i19 = i18 + 1;
            if (textView != null) {
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.y0(this, i18));
            }
            i17++;
            i18 = i19;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d K2 = K();
        if (K2 != null) {
            K2.mo79164x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b1(this, hashMap, getContext()));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d K3 = K();
        if (K3 != null) {
            K3.m80845x940d026a(this.C - 1, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gqx);
        if (textView2 != null) {
            if (!this.f156113u) {
                java.lang.Object parent = textView2.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view2 = (android.view.View) parent;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308705w)) {
                        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
                        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.d1(this, textView2);
                        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.e1(gVar, this, textView2);
                        ((t60.e) gVar).getClass();
                        i11.h.e().j(this.E, false);
                        return;
                    }
                    java.lang.Object parent2 = textView2.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.View");
                    android.view.View view3 = (android.view.View) parent2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
            }
            java.lang.Object parent3 = textView2.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent3, "null cannot be cast to non-null type android.view.View");
            android.view.View view4 = (android.view.View) parent3;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
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

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d K() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) ((jz5.n) this.f156115w).mo141623x754a37bb();
    }

    @Override // hg5.d, android.app.Dialog
    public void show() {
        super.show();
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
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
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android:status:background", childAt.getTransitionName()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android:navigation:background", childAt.getTransitionName())) {
                    viewGroup = childAt;
                    break;
                }
                i17++;
            }
            if (viewGroup != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.k1(this));
        }
    }
}
