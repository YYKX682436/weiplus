package lo2;

/* loaded from: classes2.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo2.g f401651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f401652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401653f;

    public f(lo2.g gVar, android.view.View view, int i17) {
        this.f401651d = gVar;
        this.f401652e = view;
        this.f401653f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI$MemberFansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f401651d.f401657f;
        if (pVar != null) {
            android.view.View clickArea = this.f401652e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clickArea, "$clickArea");
            pVar.mo149xb9724478(clickArea, java.lang.Integer.valueOf(this.f401653f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI$MemberFansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
