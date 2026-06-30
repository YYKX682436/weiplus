package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.h f96854e;

    public g(com.tencent.mm.plugin.dbbackup.h hVar, int i17) {
        this.f96854e = hVar;
        this.f96853d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.dbbackup.h hVar = this.f96854e;
        android.app.ProgressDialog progressDialog = hVar.f96858a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f96853d;
        dp.a.makeText(hVar.f96860c, i17 == 0 ? java.lang.String.format("Database recovery succeeded, elapsed %.2f seconds.", java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - hVar.f96859b)) / 1.0E9f)) : i17 == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
    }
}
