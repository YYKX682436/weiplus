package k93;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.d4 f387456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k93.j f387457e;

    public o(k93.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        this.f387457e = jVar;
        this.f387456d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = this.f387456d;
        sb6.append(d4Var.f66585x70ce48ca);
        k93.j.x(this.f387457e, sb6.toString(), d4Var.f66586x7661fe9a);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
