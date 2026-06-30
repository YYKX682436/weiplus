package hr3;

/* loaded from: classes11.dex */
public class ji implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f365239d;

    public ji(hr3.ki kiVar, r35.e4 e4Var) {
        this.f365239d = e4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.e4 e4Var = this.f365239d;
        if (e4Var.f450635y != null) {
            gm0.j1.d().d(e4Var.f450635y);
        }
    }
}
