package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.d f96832e;

    public c(com.tencent.mm.plugin.dbbackup.d dVar, int i17) {
        this.f96832e = dVar;
        this.f96831d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.dbbackup.d dVar = this.f96832e;
        android.app.ProgressDialog progressDialog = dVar.f96835b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int i17 = this.f96831d;
        db5.e1.i(dVar.f96836c, i17 != -3 ? i17 != -2 ? i17 != 0 ? com.tencent.mm.R.string.hul : com.tencent.mm.R.string.hup : com.tencent.mm.R.string.huo : com.tencent.mm.R.string.hun, com.tencent.mm.R.string.f490573yv);
    }
}
