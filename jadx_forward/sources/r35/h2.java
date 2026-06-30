package r35;

/* loaded from: classes11.dex */
public class h2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r35.k2 f450659f;

    public h2(r35.k2 k2Var, android.view.ViewGroup viewGroup, int i17) {
        this.f450659f = k2Var;
        this.f450657d = viewGroup;
        this.f450658e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean a17 = this.f450659f.f450701g.a(this.f450657d, view, this.f450658e);
        yj0.a.i(a17, this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return a17;
    }
}
