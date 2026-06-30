package rn2;

/* loaded from: classes15.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f479339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f479340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f479341f;

    public o(rn2.w wVar, rn2.h3 h3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f479339d = wVar;
        this.f479340e = h3Var;
        this.f479341f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.h3 h3Var = this.f479340e;
        java.util.LinkedList x17 = h3Var.x();
        rn2.w wVar = this.f479339d;
        rn2.t2 t2Var = wVar.f479435a;
        rn2.f fVar = t2Var.f479387f;
        r45.gz1 gz1Var = fVar != null ? ((rn2.c1) fVar).f479216z : null;
        java.lang.String str = wVar.f479436b;
        if (gz1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "saveLotteryGiftSelectorResult but prizeMethod is null");
        }
        if (gz1Var != null && gz1Var.m75939xb282bd08(0) == 2) {
            rn2.f fVar2 = t2Var.f479387f;
            if (fVar2 != null) {
                r45.vd4 vd4Var = (r45.vd4) gz1Var.m75936x14adae67(2);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(vd4Var != null ? vd4Var.m75939xb282bd08(0) : 0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : x17) {
                    if (((rn2.y2) obj).f479459a) {
                        arrayList2.add(obj);
                    }
                }
                ((rn2.c1) fVar2).C(valueOf, arrayList2);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveLotteryGiftSelectorResult but prize_type:");
            sb6.append(gz1Var != null ? java.lang.Integer.valueOf(gz1Var.m75939xb282bd08(0)) : null);
            sb6.append(" is error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        }
        rn2.f fVar3 = wVar.f479435a.f479387f;
        wVar.b(fVar3 != null ? ((rn2.c1) fVar3).f479216z : null, h3Var.x());
        this.f479341f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
