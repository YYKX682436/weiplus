package yi2;

/* loaded from: classes10.dex */
public final class j0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.l0 f544072d;

    public j0(yi2.l0 l0Var) {
        this.f544072d = l0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        yi2.l0 l0Var = this.f544072d;
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) l0Var.f544077b).a().a(mm2.o4.class)).Z;
        if ((u4Var != null ? u4Var.f315689c : 0) == 0) {
            if (!zl2.r4.f555483a.x1()) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f544079d, "showCounting");
            android.view.View view = l0Var.f544080e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = l0Var.f544081f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0Var.mo177186xcd1079b0(0);
            return false;
        }
        dk2.u4 u4Var2 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) l0Var.f544077b).a().a(mm2.o4.class)).Z;
        if (!(u4Var2 != null && u4Var2.f315691e == 2)) {
            dk2.u4 u4Var3 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) l0Var.f544077b).a().a(mm2.o4.class)).Z;
            if (!(u4Var3 != null && u4Var3.f315691e == 8)) {
                return false;
            }
        }
        dk2.u4 u4Var4 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) l0Var.f544077b).a().a(mm2.o4.class)).Z;
        if ((u4Var4 != null ? u4Var4.f315689c : 0) <= 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f544079d, "coundDown");
        l0Var.mo177186xcd1079b0(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) l0Var.f544077b;
        dk2.u4 u4Var5 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var5 != null) {
            l0Var.g();
            u4Var5.f315689c--;
            l0Var.f544084i.setVisibility(0);
            android.view.View view3 = l0Var.f544081f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i17 = u4Var5.f315689c;
            android.widget.TextView textView = l0Var.f544083h;
            if (i17 < 10) {
                textView.setText("0" + u4Var5.f315689c);
                textView.setScaleX(1.5f);
                textView.setScaleY(1.5f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).start();
            } else {
                no0.l lVar = no0.m.f420263a;
                dk2.u4 u4Var6 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
                textView.setText(lVar.b(u4Var6 != null ? u4Var6.f315689c : 0, ":"));
            }
        }
        return true;
    }
}
