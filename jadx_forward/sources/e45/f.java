package e45;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.h f330913d;

    public f(e45.h hVar) {
        this.f330913d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.ProgressDialog progressDialog;
        if (e45.a.f330902e == this.f330913d.f330932x || (progressDialog = this.f330913d.f330919h) == null) {
            return;
        }
        progressDialog.show();
    }
}
