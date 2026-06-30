package r35;

/* loaded from: classes11.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r35.k2 f450680f;

    public j2(r35.k2 k2Var, android.view.ViewGroup viewGroup, int i17) {
        this.f450680f = k2Var;
        this.f450678d = viewGroup;
        this.f450679e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lz.h hVar = this.f450680f.f450700f;
        if (hVar != null) {
            ((r35.s1) hVar).a(this.f450678d, view, this.f450679e);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
