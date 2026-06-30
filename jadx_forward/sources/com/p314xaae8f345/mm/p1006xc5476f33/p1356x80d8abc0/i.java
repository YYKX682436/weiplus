package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.j f178395e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.j jVar, int i17) {
        this.f178395e = jVar;
        this.f178394d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.j jVar = this.f178395e;
        android.app.ProgressDialog progressDialog = jVar.f178396a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f178394d;
        dp.a.m125854x26a183b(jVar.f178398c, i17 == 0 ? java.lang.String.format("Database recovery succeeded, elapsed %.2f seconds.", java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - jVar.f178397b)) / 1.0E9f)) : i17 == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
    }
}
