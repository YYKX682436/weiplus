package nt4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt4.e f421351d;

    public b(nt4.e eVar) {
        this.f421351d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        nt4.e eVar = this.f421351d;
        android.app.Dialog dialog = eVar.f421354f;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        eVar.f421354f.dismiss();
    }
}
