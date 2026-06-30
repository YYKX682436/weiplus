package ax2;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f96608e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b, java.util.LinkedList linkedList) {
        this.f96607d = c15393xd4ca7d1b;
        this.f96608e = linkedList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f96607d.f213377v;
        if (lVar != null) {
            r45.zh5 zh5Var = (r45.zh5) kz5.n0.Z(this.f96608e);
            if (zh5Var == null || (str = zh5Var.m75945x2fec8307(3)) == null) {
                str = "";
            }
            lVar.mo146xb9724478(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
