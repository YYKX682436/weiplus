package rf2;

/* loaded from: classes10.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f476212a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.un f476213b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f476214c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f476215d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f476216e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f476217f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f476218g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.r f476219h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f476220i;

    public c2(android.view.View root, df2.un controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f476212a = root;
        this.f476213b = controller;
        this.f476214c = "Finder.MileStoneVoteWidget";
        this.f476216e = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rf2.c2 r22, rf2.d2 r23, java.lang.String r24, android.widget.TextView r25, java.lang.String r26, android.view.View r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.c2.a(rf2.c2, rf2.d2, java.lang.String, android.widget.TextView, java.lang.String, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(mm2.r4 r4Var, android.view.View view, android.widget.TextView textView) {
        boolean z17;
        java.lang.Object obj;
        if (r4Var == null) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.Iterator it = this.f476216e.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((rf2.d2) obj).f476228d.m75939xb282bd08(2) > 0) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        int i17 = r4Var.f410910b;
        if (!(1 <= i17 && i17 < 60) && !z18) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f476214c, "refreshVoteCountDownText selfVoted:" + z18 + ", showCountDown:" + z17 + ", data.localRemainTime:" + r4Var.f410910b);
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.p8v) : null;
        int i18 = r4Var.f410910b;
        android.view.View view2 = this.f476212a;
        if (i18 <= 0 && z18) {
            if (textView != null) {
                textView.setText("");
            }
            if (textView2 == null) {
                return;
            }
            textView2.setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpn));
            return;
        }
        if (!z17) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshCountDownText", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String a17 = no0.l.a(no0.m.f420263a, r4Var.f410910b, ":", false, false, false, 24, null);
        if (textView != null) {
            textView.setText(a17);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpr));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r26, boolean r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.c2.c(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(java.lang.String str, android.widget.TextView textView, android.view.View view, java.lang.String str2, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.String str4;
        java.util.ArrayList<rf2.d2> arrayList = this.f476216e;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((rf2.d2) obj2).f476228d.m75939xb282bd08(2) > 0) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        boolean z28 = obj2 != null;
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((rf2.d2) next).f476229e) {
                obj = next;
                break;
            }
        }
        boolean z29 = obj != null;
        mm2.r4 P6 = ((mm2.v4) this.f476213b.m56788xbba4bfc0(mm2.v4.class)).P6();
        boolean z37 = (P6 != null ? P6.f410909a : 1) == 1;
        java.lang.String str5 = this.f476214c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "refreshVoteState selfVoted:" + z28 + ", hasSelected:" + z29 + ", isRunning:" + z37);
        if (z28) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            java.lang.String str6 = str5;
            z19 = false;
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long j17 = 0;
            for (rf2.d2 d2Var : arrayList) {
                d2Var.f476230f = true;
                boolean z38 = d2Var.f476229e;
                r45.l30 l30Var = d2Var.f476228d;
                if (!z38) {
                    str4 = str6;
                } else if (l30Var.m75939xb282bd08(3) < 1) {
                    str4 = str6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "refreshVoteState " + d2Var.f476232h + " modify select_count to 1");
                    l30Var.set(3, 1);
                } else {
                    str4 = str6;
                }
                j17 += l30Var.m75939xb282bd08(3);
                str6 = str4;
            }
            java.lang.String str7 = str6;
            z18 = true;
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                ((rf2.d2) it7.next()).f476231g = j17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "refreshVoteState totalCount:" + j17);
            z27 = z28;
            str3 = str7;
        } else {
            z18 = true;
            z19 = false;
            textView.setVisibility(0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            z27 = z28;
            str3 = str5;
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((rf2.d2) it8.next()).f476230f = false;
            }
            android.view.View view2 = this.f476212a;
            if (z37) {
                if (z17) {
                    rf2.t.f(rf2.t.f476423a, str, 7, null, null, null, 28, null);
                }
                textView.setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dry));
                if (z29) {
                    boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.d(textView, 9, 8);
                    boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 8);
                    if (!d17 || !e17) {
                        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563268a50);
                        textView.setTextColor(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                    }
                } else {
                    boolean d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.d(textView, 7, 8);
                    boolean e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 6);
                    if (!d18 || !e18) {
                        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563269a51);
                        textView.setTextColor(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aeu));
                    }
                }
            } else {
                textView.setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqc));
                boolean d19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.d(textView, 7, 8);
                boolean e19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 6);
                if (!d19 || !e19) {
                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563269a51);
                    textView.setTextColor(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aeu));
                }
            }
        }
        java.lang.String str8 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "refresh onChoiceClickListener, lotteryId:" + str + ", voteId:" + str2);
        boolean z39 = z27;
        boolean z47 = z37;
        boolean z48 = z19;
        boolean z49 = z18;
        this.f476219h = new rf2.x1(this, str, textView, view, str2);
        if (z39 || !z47) {
            this.f476218g = z48;
            textView.setOnClickListener(rf2.y1.f476500d);
        } else {
            this.f476218g = z49;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "refresh enableChoiceClick:" + this.f476218g);
        if (!z17 || (c22849x81a93d25 = this.f476217f) == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }
}
