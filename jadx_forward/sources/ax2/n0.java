package ax2;

/* loaded from: classes.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96610d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b) {
        this.f96610d = c15393xd4ca7d1b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.LinearLayout m62581xd437bdd9;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b = this.f96610d;
        m62581xd437bdd9 = c15393xd4ca7d1b.m62581xd437bdd9();
        android.view.View childAt = m62581xd437bdd9.getChildAt(0);
        java.lang.Object tag = childAt != null ? childAt.getTag() : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = "";
        }
        yz5.l lVar = c15393xd4ca7d1b.f213377v;
        if (lVar != null) {
            lVar.mo146xb9724478(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
