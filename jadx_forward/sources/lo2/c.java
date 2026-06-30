package lo2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14478xa545d043 f401640d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14478xa545d043 activityC14478xa545d043) {
        this.f401640d = activityC14478xa545d043;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberBanUI$initVisitant$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f401640d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberBanUI$initVisitant$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
