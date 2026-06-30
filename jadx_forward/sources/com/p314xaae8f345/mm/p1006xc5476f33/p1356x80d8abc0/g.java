package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.h f178387e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.h hVar, int i17) {
        this.f178387e = hVar;
        this.f178386d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.h hVar = this.f178387e;
        android.app.ProgressDialog progressDialog = hVar.f178391a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f178386d;
        dp.a.m125854x26a183b(hVar.f178393c, i17 == 0 ? java.lang.String.format("Database recovery succeeded, elapsed %.2f seconds.", java.lang.Float.valueOf(((float) (java.lang.System.nanoTime() - hVar.f178392b)) / 1.0E9f)) : i17 == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
    }
}
