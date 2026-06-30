package r35;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f450674d;

    public j(r35.o oVar) {
        this.f450674d = oVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.o oVar = this.f450674d;
        android.app.ProgressDialog progressDialog = oVar.f450757p;
        if (progressDialog != null) {
            progressDialog.dismiss();
            oVar.f450757p = null;
        }
    }
}
