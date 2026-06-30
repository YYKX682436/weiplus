package hx4;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx4.b f367206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hx4.p f367207e;

    public i(lx4.b bVar, hx4.p pVar) {
        this.f367206d = bVar;
        this.f367207e = pVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("browserChooseDialog keyCode: ");
        sb6.append(i17);
        sb6.append(", event: ");
        sb6.append(keyEvent != null ? java.lang.Integer.valueOf(keyEvent.getAction()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", sb6.toString());
        if (i17 != 4) {
            return false;
        }
        this.f367206d.setOnDismissListener(new hx4.h(this.f367207e));
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return true;
    }
}
