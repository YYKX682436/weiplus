package ax2;

/* loaded from: classes.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96612d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b) {
        this.f96612d = c15393xd4ca7d1b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setPkValueTaskContent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f96612d.f213377v;
        if (lVar != null) {
            lVar.mo146xb9724478("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setPkValueTaskContent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
