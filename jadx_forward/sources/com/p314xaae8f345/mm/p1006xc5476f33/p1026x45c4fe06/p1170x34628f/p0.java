package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 f168512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f168513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f168515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 f168516e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str, android.widget.TextView textView) {
        this.f168516e = c12494xc37d1f72;
        this.f168512a = o1Var;
        this.f168513b = o6Var;
        this.f168514c = str;
        this.f168515d = textView;
    }

    public void a(java.lang.String str) {
        l01.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168516e;
        c12494xc37d1f72.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c12494xc37d1f72.f167891r.setVisibility(8);
        } else {
            c12494xc37d1f72.f167891r.setText(str);
            c12494xc37d1f72.f167891r.setVisibility(0);
        }
    }

    public void b(final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a, boolean z17, boolean z18) {
        r45.fk6 fk6Var;
        java.util.LinkedList linkedList;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168516e;
        java.lang.String str = this.f168512a.f168473a.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f168513b;
        c12494xc37d1f72.f167892s.setVisibility(0);
        if (c12494xc37d1f72.E.getVisibility() == 0) {
            android.view.View view = c12494xc37d1f72.f167899z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showTradeCommentInfo", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Lcom/tencent/mm/protocal/protobuf/AppCommentModule;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showTradeCommentInfo", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Lcom/tencent/mm/protocal/protobuf/AppCommentModule;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = c12494xc37d1f72.f167892s;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d d17 = o6Var.f156354z.d();
            boolean z19 = d17.f172569g;
            d17.f172569g = false;
            if (z19) {
                int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560193pd);
                android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), 0, java.lang.Integer.valueOf(color));
                ofObject.setDuration(300L);
                ofObject.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c0(c12494xc37d1f72, linearLayout));
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 1);
                ofInt.setDuration(1000L);
                android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), 0);
                ofObject2.setDuration(300L);
                ofObject2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d0(c12494xc37d1f72, linearLayout));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playSequentially(ofObject, ofInt, ofObject2);
                animatorSet.start();
            }
        }
        if (android.text.TextUtils.isEmpty(c19777x35cb352a.f38892x498b6261)) {
            l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u0(c12494xc37d1f72), com.p314xaae8f345.mm.ui.bk.C() ? c19777x35cb352a.f38891xff0e20ff : c19777x35cb352a.f38890x3a18593f, null);
        } else {
            c12494xc37d1f72.f167883g.setText(c19777x35cb352a.f38892x498b6261);
            c12494xc37d1f72.a(true);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38897x7eea9304)) {
            c12494xc37d1f72.a(true);
            c12494xc37d1f72.f167883g.setText(c19777x35cb352a.f38893x7199dff8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38886x15b48d92) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38894x3af610bc) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38889x6c168fd7)) {
                c12494xc37d1f72.f167889p.setVisibility(0);
                c12494xc37d1f72.f167883g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
        } else {
            c12494xc37d1f72.f167885i.setVisibility(0);
            c12494xc37d1f72.f167885i.setText(java.lang.String.format("%.1f", java.lang.Float.valueOf(c19777x35cb352a.f38896x7eea8059 / 100.0f)));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                c12494xc37d1f72.f167886m.setVisibility(0);
            } else {
                c12494xc37d1f72.f167886m.setVisibility(8);
            }
        }
        r45.y9 y9Var = c19777x35cb352a.f38895xc2906e41;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$b
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                l01.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.G;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f722 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.this;
                c12494xc37d1f722.getClass();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a2 = c19777x35cb352a;
                c12494xc37d1f722.b(c19777x35cb352a2.f38886x15b48d92, c19777x35cb352a2.f38887x6c14aecf, c19777x35cb352a2.f38888x1698235e);
                return null;
            }
        };
        if (c12494xc37d1f72.c(y9Var)) {
            c12494xc37d1f72.A.setVisibility(8);
        } else if (y9Var == null || (fk6Var = y9Var.f472407e) == null || (linkedList = fk6Var.f455948d) == null || linkedList.size() == 0) {
            c12494xc37d1f72.A.setVisibility(8);
        } else {
            c12494xc37d1f72.A.setVisibility(0);
            c12494xc37d1f72.A.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h0(c12494xc37d1f72, y9Var, aVar, str));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c12494xc37d1f72.f167881e.getContext());
            c1162x665295de.Q(0);
            c12494xc37d1f72.A.mo7967x900dcbe1(c1162x665295de);
            c12494xc37d1f72.A.setNestedScrollingEnabled(false);
            c12494xc37d1f72.A.setOverScrollMode(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(str, 1, 4, 1);
        }
        r45.y9 y9Var2 = c19777x35cb352a.f38895xc2906e41;
        if (c12494xc37d1f72.c(y9Var2)) {
            c12494xc37d1f72.C.setVisibility(0);
            c12494xc37d1f72.C.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f0(c12494xc37d1f72, y9Var2, str));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c12494xc37d1f72.f167881e.getContext());
            c1162x665295de2.Q(1);
            c12494xc37d1f72.C.mo7967x900dcbe1(c1162x665295de2);
            c12494xc37d1f72.C.setNestedScrollingEnabled(false);
            c12494xc37d1f72.C.setOverScrollMode(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.l(str, 1, 6, 1, "" + y9Var2.f472409g.f469527d.size());
        } else {
            c12494xc37d1f72.C.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38894x3af610bc)) {
            c12494xc37d1f72.f167894u.setVisibility(8);
        } else if (c12494xc37d1f72.c(c19777x35cb352a.f38895xc2906e41)) {
            c12494xc37d1f72.f167894u.setVisibility(8);
        } else {
            c12494xc37d1f72.f167894u.setVisibility(0);
            c12494xc37d1f72.f167890q.setVisibility(0);
            java.lang.String str2 = c19777x35cb352a.f38894x3af610bc;
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572171n40);
            java.lang.String str3 = str2 != null ? str2 : "";
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) string);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) str3);
            c12494xc37d1f72.f167890q.setText(spannableStringBuilder);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(str, 1, 2, 1);
        }
        java.lang.String str4 = c19777x35cb352a.f38889x6c168fd7;
        java.lang.String str5 = c19777x35cb352a.f38886x15b48d92;
        java.lang.String str6 = c19777x35cb352a.f38887x6c14aecf;
        java.lang.String str7 = c19777x35cb352a.f38888x1698235e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2d);
        }
        c12494xc37d1f72.f167887n.setText(str4);
        c12494xc37d1f72.f167887n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i0(c12494xc37d1f72, str5, str6, str7, str));
        c12494xc37d1f72.f167888o.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38885xe73b2085) ? 8 : 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38885xe73b2085)) {
            c12494xc37d1f72.f167888o.setText(c19777x35cb352a.f38885xe73b2085);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a0(c12494xc37d1f72, c19777x35cb352a, str);
        c12494xc37d1f72.f167893t.setOnClickListener(a0Var);
        c12494xc37d1f72.f167894u.setOnClickListener(a0Var);
        r45.s04 s04Var = c19777x35cb352a.f38884xa65aec24;
        if (s04Var != null) {
            c12494xc37d1f72.f167895v.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(str, 1, 3, 1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s04Var.f466900i)) {
                c12494xc37d1f72.f167896w.setVisibility(0);
                c12494xc37d1f72.f167896w.setText(s04Var.f466895d);
                c12494xc37d1f72.f167897x.setText(s04Var.f466896e);
            } else {
                c12494xc37d1f72.f167897x.setText(s04Var.f466900i);
                c12494xc37d1f72.f167896w.setVisibility(8);
            }
            c12494xc37d1f72.f167897x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b0(c12494xc37d1f72, s04Var, str));
        } else {
            c12494xc37d1f72.f167895v.setVisibility(8);
        }
        if (z18) {
            c12494xc37d1f72.f167894u.setVisibility(8);
            c12494xc37d1f72.A.setVisibility(8);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19777x35cb352a.f38889x6c168fd7)) {
                c12494xc37d1f72.f167898y.setVisibility(8);
            } else {
                c12494xc37d1f72.f167898y.setVisibility(0);
                c12494xc37d1f72.f167898y.setText(c19777x35cb352a.f38889x6c168fd7);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(this.f168512a.f168473a.f156336n, 1, 1, 1);
    }
}
