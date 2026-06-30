package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.d f178365e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.d dVar, int i17) {
        this.f178365e = dVar;
        this.f178364d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.d dVar = this.f178365e;
        android.app.ProgressDialog progressDialog = dVar.f178368b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f178364d;
        db5.e1.i(dVar.f178369c, i17 != -3 ? i17 != -2 ? i17 != 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.hul : com.p314xaae8f345.mm.R.C30867xcad56011.hup : com.p314xaae8f345.mm.R.C30867xcad56011.huo : com.p314xaae8f345.mm.R.C30867xcad56011.hun, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
    }
}
