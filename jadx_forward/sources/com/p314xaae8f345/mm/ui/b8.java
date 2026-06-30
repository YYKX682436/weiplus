package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class b8 implements com.p314xaae8f345.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f278752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.c8 f278753b;

    public b8(com.p314xaae8f345.mm.ui.c8 c8Var, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f278753b = c8Var;
        this.f278752a = onDismissListener;
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, error happened.");
        android.app.ProgressDialog progressDialog = this.f278753b.f279616b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 i17 = db5.e1.i(this.f278753b.f279617c, com.p314xaae8f345.mm.R.C30867xcad56011.f574957k44, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        if (i17 != null) {
            i17.setOnDismissListener(this.f278752a);
        }
        synchronized (com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278353f) {
            com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278352e = false;
        }
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        if (i17 != 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, ipxx progress:%d", java.lang.Integer.valueOf(i17));
            android.app.ProgressDialog progressDialog = this.f278753b.f279616b;
            if (progressDialog != null) {
                progressDialog.setMessage(this.f278753b.f279617c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574958k45) + i17 + "%");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi done.");
        android.app.ProgressDialog progressDialog2 = this.f278753b.f279616b;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 i18 = db5.e1.i(this.f278753b.f279617c, com.p314xaae8f345.mm.R.C30867xcad56011.k48, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        if (i18 != null) {
            i18.setOnDismissListener(this.f278752a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12975, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        synchronized (com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278353f) {
            com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278352e = false;
        }
    }
}
