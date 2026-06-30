package k93;

/* loaded from: classes11.dex */
public class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.d5 f387450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f387451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k93.j f387452f;

    public m(k93.j jVar, f93.d5 d5Var, int i17) {
        this.f387452f = jVar;
        this.f387450d = d5Var;
        this.f387451e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f387452f.E.T(this.f387450d.f341848f, this.f387451e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
