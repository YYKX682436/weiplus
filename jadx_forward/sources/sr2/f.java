package sr2;

/* loaded from: classes2.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493083d;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f493084e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f493085f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f493086g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f493087h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f493088i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec f493089m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f493090n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f493091o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493083d = "";
        this.f493085f = new java.util.ArrayList();
    }

    public final void O6(java.lang.String str, java.lang.String str2) {
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = this.f493086g;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
            throw null;
        }
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = this.f493087h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity m80379x76847179 = m80379x76847179();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, str2));
    }

    public final void P6() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        ya2.b2 b2Var = this.f493084e;
        if (b2Var != null) {
            r45.xk b17 = ya2.d.b(b2Var, true);
            f0Var = jz5.f0.f384359a;
            if (b17 != null) {
                O6(b17.m75945x2fec8307(2), b17.m75945x2fec8307(1));
                android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564958as3);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                O6(b2Var.f69301x81118c51, b2Var.w0());
                android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564958as3);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "showContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.widget.ImageView imageView = this.f493086g;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            imageView.setVisibility(0);
            android.widget.TextView textView = this.f493087h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
            textView.setVisibility(0);
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView2 = this.f493086g;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(8);
            android.widget.TextView textView2 = this.f493087h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        m92.b t37;
        java.lang.String e17 = xy2.c.e(m158354x19263085());
        this.f493083d = e17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            this.f493084e = ya2.h.f542017a.b(this.f493083d);
        }
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("key_finder_post_can_switch_account", false);
        java.util.ArrayList arrayList = this.f493085f;
        if (booleanExtra) {
            g92.b bVar = g92.b.f351302e;
            m92.b j37 = g92.a.j3(bVar, this.f493083d, false, 2, null);
            if (j37 != null) {
                arrayList.add(j37);
            } else {
                if (this.f493083d.length() > 0) {
                    m92.b bVar2 = new m92.b(this.f493083d);
                    ya2.b2 b17 = ya2.h.f542017a.b(this.f493083d);
                    if (b17 != null) {
                        bVar2.f68693x81118c51 = b17.m176700xe5e0d2a0();
                        bVar2.f68710x21f9b213 = b17.w0();
                    }
                    arrayList.add(bVar2);
                }
            }
            if (j37 == null && (t37 = g92.a.t3(bVar, false, 1, null)) != null) {
                arrayList.add(t37);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostAccountUIC", "[initData] curUserName:" + this.f493083d + " account.size:" + arrayList.size());
        }
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567889l00);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f493086g = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.l0t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f493087h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.l1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f493088i = (android.widget.LinearLayout) findViewById3;
        P6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.widget.LinearLayout linearLayout = this.f493088i;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchLayout");
            throw null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, linearLayout, "switch_account", 0, 0, kz5.b1.e(new jz5.l("enter_scene", c19783xd9a946b7 != null ? java.lang.Integer.valueOf(c19783xd9a946b7.m76275xbcc8608a()) : null)), null, 44, null);
        if (arrayList.size() >= 2) {
            android.widget.LinearLayout linearLayout2 = this.f493088i;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchLayout");
                throw null;
            }
            linearLayout2.setVisibility(0);
            android.widget.LinearLayout linearLayout3 = this.f493088i;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchLayout");
                throw null;
            }
            linearLayout3.setOnClickListener(new sr2.e(this));
        } else {
            android.widget.LinearLayout linearLayout4 = this.f493088i;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchLayout");
                throw null;
            }
            linearLayout4.setVisibility(8);
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            android.view.View findViewById4 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ur8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
