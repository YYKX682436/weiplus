package aw2;

/* loaded from: classes10.dex */
public final class n implements ya2.r1 {

    /* renamed from: d */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f96309d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f96310e;

    /* renamed from: f */
    public final java.lang.String f96311f;

    /* renamed from: g */
    public final rx2.p f96312g;

    /* renamed from: h */
    public android.os.Bundle f96313h;

    /* renamed from: i */
    public android.content.Intent f96314i;

    /* renamed from: m */
    public int f96315m;

    /* renamed from: n */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 f96316n;

    /* renamed from: o */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f96317o;

    public n(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.ui.p2740x696c9db.f5 keyboardHeightProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardHeightProvider, "keyboardHeightProvider");
        this.f96309d = activity;
        this.f96310e = keyboardHeightProvider;
        this.f96311f = "Finder.FinderExtendReadingWidget";
        this.f96316n = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31) activity.findViewById(com.p314xaae8f345.mm.R.id.dlj);
        this.f96312g = new rx2.p(activity, new aw2.b(this), new aw2.c(this));
    }

    public static void b(aw2.n nVar, java.lang.String link, java.lang.String title, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            z17 = false;
        }
        nVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (!z17) {
            r45.o21 o21Var = new r45.o21();
            o21Var.set(0, link);
            o21Var.set(1, title);
            o21Var.set(3, java.lang.Integer.valueOf(i17));
            android.os.Bundle bundle = nVar.f96313h;
            if (bundle != null) {
                bundle.putByteArray("post_extend_reading", o21Var.mo14344x5f01b1f6());
            }
        }
        android.content.Intent intent = nVar.f96314i;
        if (intent != null) {
            intent.putExtra("saveExtendReadingLink", link);
        }
        android.content.Intent intent2 = nVar.f96314i;
        if (intent2 != null) {
            intent2.putExtra("saveExtendReadingTitle", title);
        }
        android.content.Intent intent3 = nVar.f96314i;
        if (intent3 != null) {
            intent3.putExtra("saveExtendReadingStyle", i17);
        }
    }

    public static /* synthetic */ void f(aw2.n nVar, java.lang.String str, java.lang.String str2, int i17, int i18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        int i27 = i18;
        if ((i19 & 16) != 0) {
            c19786x6a1e2862 = null;
        }
        nVar.e(str, str2, i17, i27, c19786x6a1e2862);
    }

    public final void a(java.lang.String link, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        if (z17) {
            return;
        }
        this.f96316n.m62047xdfd30e4a(link);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f96317o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = this.f96309d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this.f96309d, "", string, true, false, null);
        this.f96317o = Q;
        if (Q != null) {
            Q.show();
        }
        java.util.Map map = db2.z4.f309792a;
        r45.qt2 d17 = xy2.c.d(this.f96309d);
        aw2.e eVar = new aw2.e(this);
        java.lang.String obj = r26.n0.u0(link).toString();
        java.util.Map map2 = db2.z4.f309792a;
        if (map2.containsKey(obj)) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) linkedHashMap.get(obj))) {
                java.lang.Object obj2 = linkedHashMap.get(obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                eVar.K(0, "", obj, obj2, 0, 2, null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify in cache ");
                sb6.append(obj);
                sb6.append(", ");
                java.lang.Object obj3 = linkedHashMap.get(obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                sb6.append((java.lang.String) obj3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderExtendReadingVerifier", sb6.toString());
                return;
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new db2.y4(obj, d17, eVar));
    }

    public final void c(r45.m66 cover, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cover, "cover");
        if (z17) {
            this.f96312g.a();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) cover.m75936x14adae67(3);
        java.lang.String m76523x98b23862 = c19786x6a1e2862 != null ? c19786x6a1e2862.m76523x98b23862() : null;
        if (m76523x98b23862 == null || m76523x98b23862.length() == 0) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f96309d;
            ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(abstractActivityC21394xb3d2c0cf));
            if (b17 != null) {
                r45.xk b18 = ya2.d.b(b17, true);
                str = b18 != null ? b18.m75945x2fec8307(1) : null;
                if (str == null) {
                    str = b17.w0();
                }
            } else {
                str = "";
            }
            m76523x98b23862 = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewt, str);
        }
        java.lang.String m75945x2fec8307 = cover.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) cover.m75936x14adae67(3);
        java.lang.String str2 = m75945x2fec8307;
        java.lang.String str3 = m76523x98b23862;
        b(this, str2, str3, 1, false, 8, null);
        f(this, str2, str3, 1, 0, c19786x6a1e28622, 8, null);
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31 = this.f96316n;
        android.widget.TextView textView = (android.widget.TextView) c15281x1c66dc31.f212588p.findViewById(com.p314xaae8f345.mm.R.id.dla);
        android.content.Context context = c15281x1c66dc31.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sr2.o1 o1Var = (sr2.o1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sr2.o1.class);
        boolean z17 = o1Var.T6() && !o1Var.R6();
        mv2.m mVar = mv2.m.f413138a;
        if (z17) {
            android.content.Context context2 = c15281x1c66dc31.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            if (mVar.c(xy2.c.e(context2))) {
                textView.setText(c15281x1c66dc31.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhy));
                return;
            } else {
                textView.setText(c15281x1c66dc31.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhz));
                return;
            }
        }
        android.content.Context context3 = c15281x1c66dc31.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        if (mVar.c(xy2.c.e(context3))) {
            textView.setText(c15281x1c66dc31.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572888li1));
        } else {
            textView.setText(c15281x1c66dc31.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572889li2));
        }
    }

    public final void e(java.lang.String link, java.lang.String title, int i17, int i18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(link) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(title)) {
            return;
        }
        this.f96315m = i17;
        if (i17 != 2) {
            b(this, link, title, i17, false, 8, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31 = this.f96316n;
            c15281x1c66dc31.getClass();
            c15281x1c66dc31.isVerifyState = false;
            c15281x1c66dc31.hasSet = true;
            android.view.View view = c15281x1c66dc31.f212588p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = c15281x1c66dc31.f212589q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = c15281x1c66dc31.f212590r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = c15281x1c66dc31.f212591s;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = c15281x1c66dc31.f212592t;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15281x1c66dc31.m62045x53bfe316(title);
            c15281x1c66dc31.m62041x764cdf7c(link);
            c15281x1c66dc31.m62042x53b6de6f(java.lang.Integer.valueOf(i17));
            c15281x1c66dc31.f212594v.setText(title);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15281x1c66dc31.f212595w;
            if (i17 == 0) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80145xebd70552);
                c22699x3dcdb352.m82040x7541828(i65.a.d(c15281x1c66dc31.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            } else if (i17 == 1) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79744xfb7cf51f);
                c22699x3dcdb352.m82040x7541828(i65.a.d(c15281x1c66dc31.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560530n1));
            }
            c15281x1c66dc31.f212591s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.l9(c15281x1c66dc31, link));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f96309d;
            if (i17 == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((dv2.a1) pf5.z.f435481a.a(activity).a(dv2.a1.class)).f325342g = c19786x6a1e2862;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((sr2.o1) pf5.z.f435481a.a(activity).a(sr2.o1.class)).W6();
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        rx2.p pVar = this.f96312g;
        pVar.getClass();
        ya2.h.f542017a.b(xy2.c.e(pVar.f482516d));
    }
}
