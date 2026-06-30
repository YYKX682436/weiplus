package df2;

/* loaded from: classes3.dex */
public final class gm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.hm f311764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tb2 f311765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(df2.hm hmVar, r45.tb2 tb2Var) {
        super(0);
        this.f311764d = hmVar;
        this.f311765e = tb2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.tb2 tb2Var;
        int i17;
        df2.hm hmVar = this.f311764d;
        android.view.ViewGroup a76 = df2.hm.a7(hmVar);
        if (a76 != null) {
            android.view.View findViewById = a76.findViewById(com.p314xaae8f345.mm.R.id.gzp);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) a76.findViewById(com.p314xaae8f345.mm.R.id.gzq);
            android.widget.TextView textView = (android.widget.TextView) a76.findViewById(com.p314xaae8f345.mm.R.id.gzo);
            r45.tb2 tb2Var2 = this.f311765e;
            if (tb2Var2.m75942xfb822ef2(0) > 0) {
                textView.setText(zl2.r4.S(zl2.r4.f555483a, tb2Var2.m75942xfb822ef2(0), 0, 2, null));
            } else if (tb2Var2.m75939xb282bd08(1) == 2) {
                textView.setText(a76.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d59));
            } else {
                textView.setText(a76.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5_));
            }
            if (hmVar.f311870o != tb2Var2.m75939xb282bd08(1)) {
                hmVar.f311870o = tb2Var2.m75939xb282bd08(1);
                int m75939xb282bd08 = tb2Var2.m75939xb282bd08(1);
                if (m75939xb282bd08 == 1) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c22789xd23e9a9b.setVisibility(0);
                    tb2Var = tb2Var2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(hmVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.dm(c22789xd23e9a9b, null), 2, null);
                } else if (m75939xb282bd08 != 2) {
                    tb2Var = tb2Var2;
                    i17 = 2;
                    a76.setOnClickListener(new df2.rl((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tb2Var.m75936x14adae67(i17), hmVar, a76));
                    a76.post(new df2.fm(a76, hmVar));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c22789xd23e9a9b.setVisibility(8);
                    hmVar.f311871p = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(hmVar, null, null, new df2.em(tb2Var2, a76, hmVar, null), 3, null);
                    tb2Var = tb2Var2;
                }
                i17 = 2;
                a76.setOnClickListener(new df2.rl((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tb2Var.m75936x14adae67(i17), hmVar, a76));
                a76.post(new df2.fm(a76, hmVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
