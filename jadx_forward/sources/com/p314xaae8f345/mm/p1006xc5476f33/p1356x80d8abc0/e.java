package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.f f178373e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.f fVar, int i17) {
        this.f178373e = fVar;
        this.f178372d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.f fVar = this.f178373e;
        android.app.ProgressDialog progressDialog = fVar.f178381a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f178372d;
        if (i17 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = fVar.f178382b ? "incremental" : "new";
            objArr[1] = java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - fVar.f178383c)) / 1.0E9f);
            str = java.lang.String.format("Database (%s) backup succeeded, elapsed %.2f seconds.", objArr);
        } else {
            str = i17 == 1 ? "Database backup canceled." : "Database backup failed.";
        }
        dp.a.m125854x26a183b(fVar.f178384d, str, 0).show();
    }
}
