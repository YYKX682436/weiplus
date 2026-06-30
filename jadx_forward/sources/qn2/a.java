package qn2;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f446563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f446565f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(km2.z zVar, qn2.n nVar, boolean z17) {
        super(0);
        this.f446563d = zVar;
        this.f446564e = nVar;
        this.f446565f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String string;
        r45.vd4 vd4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b c14429xe96c5f3b;
        km2.z zVar = this.f446563d;
        r45.cz1 cz1Var = zVar.f390765d;
        if (cz1Var != null) {
            int i17 = zVar.f390762a;
            int i18 = zVar.f390763b;
            qn2.n nVar = this.f446564e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.B, "anchorOpenCard lotteryInfo:" + pm0.b0.g(cz1Var) + ", status:" + i17 + ",statusChange:" + this.f446565f + ",haveLottering:" + zVar.f390764c + ",,localRemainTime:" + i18);
            if (i17 == 1) {
                nVar.A1(0);
                int m75939xb282bd08 = cz1Var.m75939xb282bd08(1);
                int m75939xb282bd082 = cz1Var.m75939xb282bd08(2);
                int m75939xb282bd083 = cz1Var.m75939xb282bd08(3);
                if (i18 < 0 || i18 >= m75939xb282bd082 - m75939xb282bd08) {
                    i18 = zl2.r4.f555483a.G0(m75939xb282bd08, m75939xb282bd082, m75939xb282bd083);
                }
                int i19 = i18;
                android.widget.TextView textView = nVar.H;
                android.view.ViewGroup viewGroup = nVar.f446856d;
                if (textView != null) {
                    java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dps);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{no0.l.a(no0.m.f420263a, i19, ":", false, false, false, 24, null)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    textView.setText(format);
                }
                if (cz1Var.m75939xb282bd08(7) > 0) {
                    android.widget.TextView textView2 = nVar.I;
                    if (textView2 != null) {
                        java.lang.String string3 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dop);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(7))}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                        textView2.setText(format2);
                    }
                    android.widget.TextView textView3 = nVar.f446650J;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    android.widget.TextView textView4 = nVar.I;
                    if (textView4 != null) {
                        textView4.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573168dr1));
                    }
                    android.widget.TextView textView5 = nVar.f446650J;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                }
                nVar.B1(nVar.G, cz1Var);
                android.widget.TextView textView6 = nVar.K;
                if (textView6 != null) {
                    on2.l3.f428499a.f(textView6);
                }
                r45.gz1 gz1Var = (r45.gz1) cz1Var.m75936x14adae67(14);
                if (gz1Var != null && gz1Var.m75939xb282bd08(0) == 2) {
                    android.view.View view = nVar.W;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView7 = nVar.G;
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                    }
                    r45.gz1 gz1Var2 = (r45.gz1) cz1Var.m75936x14adae67(14);
                    java.lang.Integer num = null;
                    if (gz1Var2 != null && (c14429xe96c5f3b = nVar.V) != null) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1554x2e7b10.C14429xe96c5f3b.f202360i;
                        c14429xe96c5f3b.b(gz1Var2, null);
                    }
                    android.widget.TextView textView8 = nVar.X;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                    }
                    r45.gz1 gz1Var3 = (r45.gz1) cz1Var.m75936x14adae67(14);
                    if (gz1Var3 != null && (vd4Var = (r45.vd4) gz1Var3.m75936x14adae67(2)) != null) {
                        num = java.lang.Integer.valueOf(vd4Var.m75939xb282bd08(0));
                    }
                    if (num != null && num.intValue() == 1) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lim);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    } else {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lin);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    }
                    android.widget.TextView textView9 = nVar.X;
                    if (textView9 != null) {
                        textView9.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572991li5, string, java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(6))));
                    }
                } else {
                    android.view.View view2 = nVar.W;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView10 = nVar.G;
                    if (textView10 != null) {
                        textView10.setVisibility(0);
                    }
                }
                nVar.K0(0);
            } else if (i17 == 2) {
                nVar.x1(zVar, cz1Var, i17, nVar.f446651p0);
            } else if (i17 == 3) {
                nVar.x1(zVar, cz1Var, i17, nVar.f446652x0);
            } else if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.B, "anchorLotteryCancelled id:" + cz1Var.m75945x2fec8307(0));
                nVar.K0(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
