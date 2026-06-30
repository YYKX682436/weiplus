package lu1;

/* loaded from: classes15.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu1.q f402883d;

    public i(lu1.q qVar) {
        this.f402883d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f402883d.a();
    }
}
