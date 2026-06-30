package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.f f96840e;

    public e(com.tencent.mm.plugin.dbbackup.f fVar, int i17) {
        this.f96840e = fVar;
        this.f96839d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.dbbackup.f fVar = this.f96840e;
        android.app.ProgressDialog progressDialog = fVar.f96848a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f96839d;
        if (i17 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = fVar.f96849b ? "incremental" : "new";
            objArr[1] = java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - fVar.f96850c)) / 1.0E9f);
            str = java.lang.String.format("Database (%s) backup succeeded, elapsed %.2f seconds.", objArr);
        } else {
            str = i17 == 1 ? "Database backup canceled." : "Database backup failed.";
        }
        dp.a.makeText(fVar.f96851d, str, 0).show();
    }
}
