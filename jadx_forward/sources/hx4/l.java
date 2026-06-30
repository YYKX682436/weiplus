package hx4;

/* loaded from: classes8.dex */
public final class l implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx4.j f367210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hx4.p f367211e;

    public l(lx4.j jVar, hx4.p pVar) {
        this.f367210d = jVar;
        this.f367211e = pVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        this.f367210d.setOnDismissListener(new hx4.k(this.f367211e));
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return true;
    }
}
