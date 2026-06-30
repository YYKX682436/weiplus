package hr3;

/* loaded from: classes11.dex */
public class ch implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f364991d;

    public ch(hr3.dh dhVar, r35.e4 e4Var) {
        this.f364991d = e4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.e4 e4Var = this.f364991d;
        if (e4Var.f450635y != null) {
            gm0.j1.d().d(e4Var.f450635y);
        }
    }
}
