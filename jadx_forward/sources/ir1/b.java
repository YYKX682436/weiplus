package ir1;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.d f375467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f375468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f375469f;

    public b(ir1.d dVar, android.view.View view, int i17) {
        this.f375467d = dVar;
        this.f375468e = view;
        this.f375469f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f375467d.f375484f;
        if (pVar != null) {
            android.view.View clickArea = this.f375468e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clickArea, "$clickArea");
            pVar.mo149xb9724478(clickArea, java.lang.Integer.valueOf(this.f375469f));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
