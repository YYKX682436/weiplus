package t53;

/* loaded from: classes8.dex */
public final class y implements u53.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f497372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t53.i f497373b;

    public y(android.app.ProgressDialog progressDialog, t53.i iVar, android.content.Context context) {
        this.f497372a = progressDialog;
        this.f497373b = iVar;
    }

    @Override // u53.v
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame isAssociate:%b,isOwnBlack:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        android.app.ProgressDialog progressDialog = this.f497372a;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f497372a.dismiss();
        }
        t53.i iVar = this.f497373b;
        if (iVar != null) {
            com.p314xaae8f345.mm.ui.mi miVar = (com.p314xaae8f345.mm.ui.mi) iVar;
            miVar.f290678a.f278613q.f373357a = java.lang.Boolean.valueOf(z18);
            miVar.f290678a.f278612p.f373357a = java.lang.Boolean.valueOf(z17);
            miVar.f290678a.runOnUiThread(new com.p314xaae8f345.mm.ui.li(miVar));
        }
    }
}
