package yi2;

/* loaded from: classes10.dex */
public final class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.p f544049d;

    public i(yi2.p pVar) {
        this.f544049d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        yi2.p pVar = this.f544049d;
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) pVar.f544095b).a().a(mm2.o4.class)).Z;
        if ((u4Var != null ? u4Var.f315689c : 0) == 0) {
            if (!zl2.r4.f555483a.x1()) {
                return false;
            }
            pVar.r();
            return false;
        }
        if (pVar.o()) {
            return false;
        }
        dk2.u4 u4Var2 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) pVar.f544095b).a().a(mm2.o4.class)).Z;
        if ((u4Var2 != null ? u4Var2.f315689c : 0) <= 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f544096c, "coundDown");
        android.view.View view = pVar.f544103j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) pVar.f544095b;
        dk2.u4 u4Var3 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var3 != null) {
            pVar.h();
            int i17 = u4Var3.f315689c - 1;
            u4Var3.f315689c = i17;
            android.widget.TextView textView = pVar.f544112s;
            if (i17 < 10) {
                textView.setText("0" + u4Var3.f315689c);
                textView.setScaleX(1.5f);
                textView.setScaleY(1.5f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).start();
            } else {
                no0.l lVar = no0.m.f420263a;
                dk2.u4 u4Var4 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
                textView.setText(lVar.b(u4Var4 != null ? u4Var4.f315689c : 0, ":"));
            }
        }
        return true;
    }
}
