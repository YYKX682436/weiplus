package qn2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446602d;

    public h(qn2.n nVar) {
        this.f446602d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.xy1 xy1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initRunningView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.n nVar = this.f446602d;
        int i17 = 0;
        long m75942xfb822ef2 = ((mm2.e1) nVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((on2.z2) nVar.P0(on2.z2.class)).f428630r.f451390d;
        long j18 = ((mm2.e1) nVar.P0(mm2.e1.class)).f410516m;
        java.lang.String str = ((mm2.e1) nVar.P0(mm2.e1.class)).f410525v;
        km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
        int m75939xb282bd08 = (zVar == null || (cz1Var2 = zVar.f390765d) == null || (xy1Var = (r45.xy1) cz1Var2.m75936x14adae67(5)) == null) ? 0 : xy1Var.m75939xb282bd08(0);
        int i18 = ek2.s0.f335063v;
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
        if (zVar2 != null && (cz1Var = zVar2.f390765d) != null) {
            i17 = cz1Var.m75939xb282bd08(6);
        }
        new ek2.s0(new ek2.t0(m75942xfb822ef2, j18, str, 0, "", m75939xb282bd08, "", 1, i17, j17, null, null, 0, null, null)).l().K(new qn2.j(nVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initRunningView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
