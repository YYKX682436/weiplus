package os3;

/* loaded from: classes8.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.v0 f429709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f429710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.v1 f429711f;

    public q1(os3.v1 v1Var, ks3.v0 v0Var, android.widget.LinearLayout linearLayout) {
        this.f429711f = v1Var;
        this.f429709d = v0Var;
        this.f429710e = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.e1.n(this.f429711f.f429755d, com.p314xaae8f345.mm.R.C30867xcad56011.hjn, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new os3.p1(this), null);
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
