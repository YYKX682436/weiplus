package fl1;

/* loaded from: classes7.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f345296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dg7 f345297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345299g;

    public g0(fl1.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, r45.dg7 dg7Var, java.lang.Runnable runnable) {
        this.f345299g = c1Var;
        this.f345296d = o6Var;
        this.f345297e = dg7Var;
        this.f345298f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ch1.b.f122809a.a(this.f345296d.u0().f158811d, r0.u0().L, r0.u0().M, 3L, 2L, this.f345297e.f453993n);
        this.f345299g.a();
        this.f345298f.run();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
