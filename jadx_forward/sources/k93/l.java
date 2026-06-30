package k93;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.d5 f387447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f387448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k93.j f387449f;

    public l(k93.j jVar, f93.d5 d5Var, int i17) {
        this.f387449f = jVar;
        this.f387447d = d5Var;
        this.f387448e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f387449f.E.V(this.f387447d, this.f387448e);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
