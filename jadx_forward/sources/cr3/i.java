package cr3;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303484d;

    public i(cr3.d0 d0Var) {
        this.f303484d = d0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f303484d.f303469i = true;
    }
}
