package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class y5 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 f264061b;

    public y5(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 f6Var) {
        this.f264060a = str;
        this.f264061b = f6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadMediaFileHelp", " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.f264060a)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this);
        android.app.ProgressDialog progressDialog = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.f263918g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.f263918g = null;
        }
        this.f264061b.a(z17, str2, str3);
    }
}
