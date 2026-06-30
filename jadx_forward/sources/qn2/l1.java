package qn2;

/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i0 f446624a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f446625b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f446626c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f446627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f446628e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f446629f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f446630g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f446631h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f446632i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f446633j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f446634k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f446635l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f446636m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f446637n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f446638o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f446639p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f446640q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f446641r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f446642s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f446643t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f446644u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b f446645v;

    public l1(qn2.i0 visitorCardPlugin, android.view.ViewGroup runningContainer, android.view.View cardContainer, android.view.View card) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitorCardPlugin, "visitorCardPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningContainer, "runningContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardContainer, "cardContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        this.f446624a = visitorCardPlugin;
        this.f446625b = runningContainer;
        this.f446626c = cardContainer;
        this.f446627d = card;
        this.f446628e = "VisitorLotteryCardRunningUI";
        this.f446629f = jz5.h.b(qn2.j1.f446616d);
        this.f446630g = jz5.h.b(qn2.b1.f446578d);
        this.f446631h = jz5.h.b(qn2.k1.f446620d);
        this.f446632i = jz5.h.b(qn2.d1.f446586d);
        this.f446633j = jz5.h.b(qn2.c1.f446583d);
    }

    public static void e(qn2.l1 l1Var, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            num = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        if ((i17 & 8) != 0) {
            num3 = null;
        }
        if ((i17 & 16) != 0) {
            num4 = null;
        }
        android.view.View view = l1Var.f446642s;
        java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
        }
    }

    public static void f(qn2.l1 l1Var, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            num2 = null;
        }
        if ((i17 & 4) != 0) {
            num3 = null;
        }
        if ((i17 & 8) != 0) {
            num4 = null;
        }
        android.widget.TextView textView = l1Var.f446641r;
        java.lang.Object layoutParams = textView != null ? textView.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
        }
    }

    public final java.util.Map a(int i17) {
        qn2.i0 i0Var = this.f446624a;
        if (i17 != 4) {
            if (i17 == 5 && ((mm2.n2) i0Var.P0(mm2.n2.class)).f410811f) {
                i17 = 7;
            }
        } else if (((mm2.d) i0Var.P0(mm2.d.class)).N6()) {
            i17 = 6;
        }
        return kz5.c1.l(new jz5.l("lottery_attend_type", java.lang.Integer.valueOf(i17)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.l1.b():void");
    }

    public final void c(int i17) {
        android.view.ViewGroup viewGroup = this.f446625b;
        android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(i17);
        drawable.setBounds(0, 0, i65.a.b(viewGroup.getContext(), 21), i65.a.b(viewGroup.getContext(), 20));
        android.widget.TextView textView = this.f446639p;
        if (textView != null) {
            textView.setCompoundDrawablePadding(i65.a.b(viewGroup.getContext(), 4));
        }
        android.widget.TextView textView2 = this.f446639p;
        if (textView2 != null) {
            textView2.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public final void d(java.lang.String desc, r45.gz1 prizeMethod) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prizeMethod, "prizeMethod");
        int m75939xb282bd08 = prizeMethod.m75939xb282bd08(0);
        if (m75939xb282bd08 == 1) {
            android.widget.TextView textView = this.f446634k;
            if (textView != null) {
                textView.setText(desc);
            }
            android.widget.TextView textView2 = this.f446634k;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        if (m75939xb282bd08 == 2) {
            android.widget.TextView textView3 = this.f446634k;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        android.widget.TextView textView4 = this.f446634k;
        if (textView4 != null) {
            textView4.setText(desc);
        }
        android.widget.TextView textView5 = this.f446634k;
        if (textView5 == null) {
            return;
        }
        textView5.setVisibility(0);
    }

    public final void g(r45.cz1 lotteryInfo) {
        r45.cz1 cz1Var;
        r45.gz1 gz1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        qn2.i0 i0Var = this.f446624a;
        km2.z zVar = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
        if (zVar != null && (cz1Var = zVar.f390765d) != null && (gz1Var = (r45.gz1) cz1Var.m75936x14adae67(14)) != null) {
            java.lang.String m75945x2fec8307 = lotteryInfo.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            d(m75945x2fec8307, gz1Var);
        }
        android.view.View view = this.f446627d;
        if (view != null) {
            android.widget.TextView textView = this.f446634k;
            view.setTag(com.p314xaae8f345.mm.R.id.e6g, textView != null ? textView.getText() : null);
        }
        android.widget.TextView textView2 = this.f446635l;
        android.view.ViewGroup viewGroup = this.f446625b;
        if (textView2 != null) {
            textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573155dp2, java.lang.Integer.valueOf(lotteryInfo.m75939xb282bd08(6))));
        }
        if (lotteryInfo.m75939xb282bd08(7) > 0) {
            android.widget.TextView textView3 = this.f446637n;
            if (textView3 != null) {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dop);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(lotteryInfo.m75939xb282bd08(7))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                textView3.setText(format);
            }
            android.widget.TextView textView4 = this.f446637n;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.view.View view2 = this.f446638o;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate$7", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate$7", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                android.widget.TextView textView5 = this.f446637n;
                view.setTag(com.p314xaae8f345.mm.R.id.e6h, textView5 != null ? textView5.getText() : null);
            }
        } else {
            android.widget.TextView textView6 = this.f446637n;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.view.View view3 = this.f446638o;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate$7", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate$7", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.e6h, "");
            }
        }
        android.widget.TextView textView7 = this.f446636m;
        if (textView7 != null) {
            textView7.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dok));
        }
        if (view != null) {
            android.widget.TextView textView8 = this.f446636m;
            view.setTag(com.p314xaae8f345.mm.R.id.e6i, textView8 != null ? textView8.getText() : null);
        }
        if (pm0.v.z(lotteryInfo.m75939xb282bd08(9), 1)) {
            android.widget.TextView textView9 = this.f446640q;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            android.widget.TextView textView10 = this.f446640q;
            if (textView10 != null) {
                textView10.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6_));
            }
            if (view != null) {
                android.widget.TextView textView11 = this.f446640q;
                view.setTag(com.p314xaae8f345.mm.R.id.e6e, textView11 != null ? textView11.getText() : null);
            }
            android.widget.TextView textView12 = this.f446639p;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
        } else {
            android.widget.TextView textView13 = this.f446640q;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.e6e, "");
            }
            b();
            android.widget.TextView textView14 = this.f446639p;
            if (textView14 != null) {
                textView14.setVisibility(0);
            }
            android.widget.TextView textView15 = this.f446639p;
            if (textView15 != null) {
                textView15.setEnabled(false);
            }
            android.widget.TextView textView16 = this.f446639p;
            if (textView16 != null) {
                textView16.setCompoundDrawablePadding(0);
            }
            android.widget.TextView textView17 = this.f446639p;
            if (textView17 != null) {
                textView17.setCompoundDrawables(null, null, null, null);
            }
            android.widget.TextView textView18 = this.f446639p;
            if (textView18 != null) {
                textView18.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77632xb498d0de));
            }
        }
        android.view.View view4 = this.f446626c;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i0Var.K0(0);
    }
}
