package v41;

/* loaded from: classes15.dex */
public final class j implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v41.m f514748d;

    public j(v41.m mVar) {
        this.f514748d = mVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        v41.m mVar = this.f514748d;
        mVar.j(new v41.i(mVar));
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return true;
    }
}
