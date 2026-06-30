package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class f0 extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f202746e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f202747f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f202748g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f202749h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f202750i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f202751m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f202752n;

    /* renamed from: o, reason: collision with root package name */
    public int f202753o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f202752n = "";
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.f0 f0Var, android.view.View view, yz5.l lVar, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 U6;
        android.view.View view2 = (i17 & 1) != 0 ? null : view;
        yz5.l lVar2 = (i17 & 2) != 0 ? null : lVar;
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.o0) uVar.b(f0Var.m80379x76847179()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.o0.class);
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 n0Var = o0Var.f202799d;
            if (n0Var != null) {
                n0Var.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 n0Var2 = o0Var.f202800e;
            if (n0Var2 != null) {
                n0Var2.a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1) uVar.b(f0Var.m80379x76847179()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1.class);
        if (w1Var != null && (U6 = w1Var.U6()) != null) {
            U6.u();
        }
        eo2.b bVar = (eo2.b) uVar.b(f0Var.m80379x76847179()).e(eo2.b.class);
        int i18 = bVar != null ? bVar.f337091d : 0;
        go2.a1 a1Var = (go2.a1) uVar.b(f0Var.m80379x76847179()).e(go2.a1.class);
        if (a1Var != null) {
            r45.tr0 tr0Var = (r45.tr0) f0Var.f337113d;
            java.lang.Integer valueOf = tr0Var != null ? java.lang.Integer.valueOf(tr0Var.f468263n) : null;
            r45.tr0 tr0Var2 = (r45.tr0) f0Var.f337113d;
            java.lang.Integer valueOf2 = tr0Var2 != null ? java.lang.Integer.valueOf(tr0Var2.f468269t) : null;
            r45.tr0 tr0Var3 = (r45.tr0) f0Var.f337113d;
            a1Var.R6(valueOf, valueOf2, tr0Var3 != null ? java.lang.Integer.valueOf(tr0Var3.f468271v) : null, f0Var.f202752n, view2, i18, f0Var.f202753o, lVar2);
        }
    }

    @Override // eo2.j
    public void O6() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f202752n = stringExtra;
        this.f202753o = m158359x1e885992().getIntExtra("key_member_preview_mode", 0);
        ya2.h.f542017a.b(this.f202752n);
    }

    @Override // eo2.j
    public void P6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kqj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f202746e = mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rzt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.f202747f = (android.view.ViewGroup) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.krf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f03;
        this.f202749h = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kqh)).getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kqw)).getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f202749h;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payTipsTitle");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.krd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f04, "findViewById(...)");
        this.f202748g = (android.widget.TextView) mo144222x4ff8c0f04;
        android.view.View mo144222x4ff8c0f05 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kr6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f05, "findViewById(...)");
        this.f202750i = (android.widget.TextView) mo144222x4ff8c0f05;
        android.view.View mo144222x4ff8c0f06 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kqi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f06, "findViewById(...)");
        this.f202751m = mo144222x4ff8c0f06;
        mo144222x4ff8c0f06.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.d0(this));
        android.widget.TextView textView3 = this.f202750i;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payPrice");
            throw null;
        }
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((pg0.s3) h0Var).getClass();
        textView3.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(m158354x19263085, 4));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.view.View view = this.f202746e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payContainer");
                throw null;
            }
            view.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0));
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f202751m;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "become_member");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f202751m;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f202751m;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[6];
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f337091d : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(m80379x76847179());
        lVarArr[1] = new jz5.l("comment_scene", e17 != null ? java.lang.Integer.valueOf(e17.f216913n) : null);
        lVarArr[2] = new jz5.l("finder_username", this.f202752n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(m80379x76847179());
        lVarArr[3] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(m80379x76847179());
        lVarArr[4] = new jz5.l("finder_context_id", e19 != null ? e19.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(m80379x76847179());
        lVarArr[5] = new jz5.l("behaviour_session_id", e27 != null ? e27.f216918q : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        android.widget.TextView textView4 = this.f202748g;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payTips");
            throw null;
        }
        textView4.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        android.widget.TextView textView5 = this.f202748g;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payTips");
            throw null;
        }
        textView5.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(m80379x76847179()));
        java.lang.String string = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.emq, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string2, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.e0(this)), L, string.length() + L, 17);
        android.widget.TextView textView6 = this.f202748g;
        if (textView6 != null) {
            textView6.setText(spannableString);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payTips");
            throw null;
        }
    }

    @Override // eo2.j
    public void U6() {
        r45.tr0 tr0Var = (r45.tr0) this.f337113d;
        if (tr0Var != null) {
            if (tr0Var.A == 1) {
                android.view.ViewGroup viewGroup = this.f202747f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payTipsLayout");
                    throw null;
                }
            }
            if (tr0Var.f468259g == 0) {
                android.view.View view = this.f202746e;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    android.view.View view2 = this.f202746e;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payContainer");
                        throw null;
                    }
                    view2.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0));
                }
            }
            int i17 = tr0Var.f468269t;
            if (i17 <= 0 || tr0Var.f468271v != 1) {
                i17 = tr0Var.f468263n;
            }
            android.widget.TextView textView = this.f202750i;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i17));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payPrice");
                throw null;
            }
        }
    }
}
