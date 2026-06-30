package ft4;

/* loaded from: classes12.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab f348195d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab activityC19140xe76629ab) {
        this.f348195d = activityC19140xe76629ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19140xe76629ab activityC19140xe76629ab = this.f348195d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19140xe76629ab.mo55332x76847179();
        android.widget.TextView textView = activityC19140xe76629ab.f262013s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
            throw null;
        }
        int c17 = i65.a.c(mo55332x76847179, textView.getTop());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC19140xe76629ab.mo55332x76847179();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC19140xe76629ab.f262011q;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
        int c18 = i65.a.c(mo55332x768471792, c1163xf1deaba4.getBottom());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonUI", "detailListView.post textTop:" + c17 + " listBottom:" + c18);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activityC19140xe76629ab.f262011q;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonAdapter");
        ft4.r0 r0Var = (ft4.r0) mo7946xf939df19;
        if ((c18 - 30) + 16 <= c17) {
            android.widget.TextView textView2 = activityC19140xe76629ab.f262013s;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
                throw null;
            }
            textView2.setVisibility(0);
            android.view.View view = r0Var.f348221p;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView3 = activityC19140xe76629ab.f262013s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
            throw null;
        }
        textView3.setVisibility(8);
        android.view.View view2 = r0Var.f348221p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ft4.m1 m1Var = new ft4.m1(activityC19140xe76629ab);
        r0Var.f348223r = m1Var;
        android.view.View view3 = r0Var.f348221p;
        if (view3 != null) {
            view3.setOnClickListener(m1Var);
        }
    }
}
