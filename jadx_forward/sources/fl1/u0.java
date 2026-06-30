package fl1;

/* loaded from: classes4.dex */
public class u0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345407e;

    public u0(fl1.c1 c1Var, java.lang.Runnable runnable) {
        this.f345407e = c1Var;
        this.f345406d = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user dismiss evaluate dialog");
        fl1.c1 c1Var = this.f345407e;
        if (!c1Var.f345263b) {
            c1Var.getClass();
            r45.et6 et6Var = new r45.et6();
            java.lang.String str = c1Var.f345262a;
            et6Var.f455257d = str;
            et6Var.f455258e = 4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "reportSkipEvaluate, userName:%s", str);
            c1Var.j(et6Var);
        }
        c1Var.getClass();
        java.lang.Runnable runnable = this.f345406d;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 100L);
        }
    }
}
