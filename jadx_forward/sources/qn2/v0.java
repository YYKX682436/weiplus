package qn2;

/* loaded from: classes3.dex */
public final class v0 {
    public final java.lang.Integer[] A;

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i0 f446709a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f446710b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f446711c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f446712d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f446713e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f446714f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f446715g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f446716h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f446717i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f446718j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f446719k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f446720l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f446721m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b f446722n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f446723o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f446724p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f446725q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f446726r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f446727s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f446728t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f446729u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f446730v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f446731w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f446732x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 f446733y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f446734z;

    public v0(qn2.i0 visitorCardPlugin, android.view.ViewGroup doneContainer, android.view.View cardContainer, android.view.View card) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitorCardPlugin, "visitorCardPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doneContainer, "doneContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardContainer, "cardContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        this.f446709a = visitorCardPlugin;
        this.f446710b = doneContainer;
        this.f446711c = cardContainer;
        this.f446712d = card;
        this.A = new java.lang.Integer[]{3, 5};
    }

    public static final void e(r45.cz1 cz1Var, qn2.v0 v0Var, r45.of1 of1Var) {
        r45.yy1 yy1Var = (r45.yy1) cz1Var.m75936x14adae67(13);
        android.widget.ImageView imageView = yy1Var != null && yy1Var.m75939xb282bd08(0) == 4 ? v0Var.f446725q : v0Var.f446715g;
        r45.yy1 yy1Var2 = (r45.yy1) cz1Var.m75936x14adae67(13);
        android.widget.TextView textView = yy1Var2 != null && yy1Var2.m75939xb282bd08(0) == 4 ? v0Var.f446726r : v0Var.f446716h;
        if (imageView != null) {
            int m75939xb282bd08 = of1Var.m75939xb282bd08(2);
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (m75939xb282bd08 == 3) {
                vo0.d a17 = g1Var.a();
                java.lang.String m75945x2fec8307 = of1Var.m75945x2fec8307(1);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                a17.c(new mn2.n(m75945x2fec8307 != null ? m75945x2fec8307 : "", null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
            } else {
                vo0.d l17 = g1Var.l();
                java.lang.String m75945x2fec83072 = of1Var.m75945x2fec8307(1);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                l17.c(new mn2.n(m75945x2fec83072 != null ? m75945x2fec83072 : "", null, 2, null), imageView, g1Var.h(mn2.f1.f411494o));
            }
            if (textView == null) {
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = v0Var.f446710b.getContext();
            java.lang.String m75945x2fec83073 = of1Var.m75945x2fec8307(0);
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83073));
        }
    }

    public final void a(android.widget.TextView textView, r45.yy1 claimMethod) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(claimMethod, "claimMethod");
        jz5.f0 f0Var = null;
        if (textView != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "set claim, text = " + claimMethod.m75945x2fec8307(2) + ", status = " + claimMethod.m75939xb282bd08(3));
            if (claimMethod.m75939xb282bd08(5) != 1) {
                java.lang.String m75945x2fec8307 = claimMethod.m75945x2fec8307(2);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                textView.setText(m75945x2fec8307);
                if (claimMethod.m75939xb282bd08(3) != 0) {
                    if (!kz5.z.G(this.A, java.lang.Integer.valueOf(claimMethod.m75939xb282bd08(0)))) {
                        textView.setBackground(null);
                        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90, null));
                        textView.setEnabled(false);
                    }
                }
                textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a09);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an, null));
                textView.setEnabled(true);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.p4 p4Var = ml2.p4.f409339t;
                int m75939xb282bd08 = claimMethod.m75939xb282bd08(0);
                ml2.r0.ek(r0Var, p4Var, m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? m75939xb282bd08 != 3 ? "1" : "4" : "3" : "2", null, 0, null, 28, null);
            } else {
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqh));
                textView.setBackground(null);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560603p1, null));
                textView.setEnabled(false);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LotteryUtil", "setClaim " + pm0.b0.g(claimMethod) + " but claimPrizeTip is null!");
        }
    }

    public final void b() {
        android.widget.TextView textView = this.f446713e;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f446714f;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = this.f446717i;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        c(false);
        android.widget.TextView textView4 = this.f446720l;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f446715g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.TextView textView5 = this.f446716h;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        android.view.View view = this.f446723o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f446724p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setDoneNoWinnerUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b c14429xe96c5f3b = this.f446722n;
        if (c14429xe96c5f3b != null) {
            c14429xe96c5f3b.setVisibility(8);
        }
        android.widget.TextView textView6 = this.f446721m;
        if (textView6 == null) {
            return;
        }
        textView6.setVisibility(8);
    }

    public final void c(boolean z17) {
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("VisitorLotteryCardDoneWidget", "setRainbowVisible visible:" + z17, new java.lang.Object[0]);
        }
        if (z17) {
            android.widget.ImageView imageView = this.f446718j;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = this.f446719k;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(0);
            return;
        }
        android.widget.ImageView imageView3 = this.f446718j;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.ImageView imageView4 = this.f446719k;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0577  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.cz1 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.v0.d(r45.cz1, boolean):void");
    }
}
