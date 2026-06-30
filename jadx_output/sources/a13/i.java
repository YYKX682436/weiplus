package a13;

/* loaded from: classes14.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f552d;

    public i(a13.t tVar) {
        this.f552d = tVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        b13.m mVar = this.f552d.f577m;
        if (mVar != null) {
            if (mVar.f176388s) {
                mVar.j0(true);
            } else {
                mVar.j0(false);
            }
        }
    }
}
