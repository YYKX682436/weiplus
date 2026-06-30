package z63;

/* loaded from: classes14.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.m f551952d;

    public j(z63.m mVar) {
        this.f551952d = mVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        z63.m mVar = this.f551952d;
        z63.m.a(mVar, false, 0, 0, 0);
        y9.i iVar = mVar.f551957d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }
}
