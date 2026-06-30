package fl1;

/* loaded from: classes4.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345374d;

    public p0(fl1.c1 c1Var) {
        this.f345374d = c1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user cancel evaluate dialog");
        this.f345374d.f345263b = false;
    }
}
