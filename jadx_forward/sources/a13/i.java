package a13;

/* loaded from: classes14.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f82085d;

    public i(a13.t tVar) {
        this.f82085d = tVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        b13.m mVar = this.f82085d.f82110m;
        if (mVar != null) {
            if (mVar.f257921s) {
                mVar.j0(true);
            } else {
                mVar.j0(false);
            }
        }
    }
}
