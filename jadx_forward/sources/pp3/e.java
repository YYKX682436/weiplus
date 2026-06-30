package pp3;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h3 f439005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp3.j f439006e;

    public e(pp3.j jVar, db5.h3 h3Var) {
        this.f439006e = jVar;
        this.f439005d = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/patmsg/ui/PatHandler$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f439005d.B();
        op3.c cVar = this.f439006e.f439017c;
        yj0.a.h(this, "com/tencent/mm/plugin/patmsg/ui/PatHandler$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
