package nh5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f418661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29 f418662e;

    public c(com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29 viewOnLongClickListenerC22439x7c94dc29, android.app.ProgressDialog progressDialog) {
        this.f418662e = viewOnLongClickListenerC22439x7c94dc29;
        this.f418661d = progressDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f418662e.f290641o.getText().toString());
        java.lang.String str = this.f418662e.getExternalCacheDir() + "/" + r6Var.m82467xfb82e301() + ".zip";
        kk.x.a(r6Var, false, str);
        ((ku5.t0) ku5.t0.f394148d).B(new nh5.b(this, str));
    }
}
