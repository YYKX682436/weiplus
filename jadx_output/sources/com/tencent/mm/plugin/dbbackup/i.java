package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.j f96862e;

    public i(com.tencent.mm.plugin.dbbackup.j jVar, int i17) {
        this.f96862e = jVar;
        this.f96861d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.dbbackup.j jVar = this.f96862e;
        android.app.ProgressDialog progressDialog = jVar.f96863a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f96861d;
        dp.a.makeText(jVar.f96865c, i17 == 0 ? java.lang.String.format("Database recovery succeeded, elapsed %.2f seconds.", java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - jVar.f96864b)) / 1.0E9f)) : i17 == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
    }
}
