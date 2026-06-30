package as3;

/* loaded from: classes4.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 f95071d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 c16914xdd3f84a5) {
        this.f95071d = c16914xdd3f84a5;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView$setup$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            this.f95071d.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView$setup$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de m67688xfd37656d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView$setup$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        m67688xfd37656d = this.f95071d.m67688xfd37656d();
        m67688xfd37656d.y();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView$setup$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
