package fl1;

/* loaded from: classes4.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f345288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bg7 f345289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345291g;

    public f0(fl1.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, r45.bg7 bg7Var, java.lang.Runnable runnable) {
        this.f345291g = c1Var;
        this.f345288d = o6Var;
        this.f345289e = bg7Var;
        this.f345290f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f345291g;
        c1Var.i(this.f345288d, true, null, this.f345289e);
        c1Var.a();
        this.f345290f.run();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
