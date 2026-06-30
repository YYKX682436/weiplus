package fl1;

/* loaded from: classes7.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f345321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dg7 f345322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345324g;

    public i0(fl1.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, r45.dg7 dg7Var, java.lang.Runnable runnable) {
        this.f345324g = c1Var;
        this.f345321d = o6Var;
        this.f345322e = dg7Var;
        this.f345323f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ch1.a aVar = ch1.b.f122809a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f345321d;
        java.lang.String str = o6Var.u0().f158811d;
        long j17 = o6Var.u0().L;
        long j18 = o6Var.u0().M;
        r45.dg7 dg7Var = this.f345322e;
        aVar.a(str, j17, j18, 2L, 2L, dg7Var.f453993n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "openGameLiteApp, " + dg7Var.f453991i);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Mj(dg7Var.f453991i, "", new fl1.h0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
