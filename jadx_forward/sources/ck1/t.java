package ck1;

/* loaded from: classes4.dex */
public final class t implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123913d;

    public t(ck1.k0 k0Var) {
        this.f123913d = k0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ck1.o0 o0Var = (ck1.o0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState: " + o0Var);
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState is null");
            return;
        }
        int ordinal = o0Var.ordinal();
        ck1.k0 k0Var = this.f123913d;
        if (ordinal == 0) {
            k0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokingDialog");
            android.app.Dialog dialog = k0Var.f123876i;
            if (dialog != null) {
                dialog.dismiss();
            }
            k0Var.f123876i = null;
            k0Var.f123876i = db5.e1.Q(ak1.f.d(k0Var.f123871d), null, null, true, false, null);
            return;
        }
        if (ordinal == 1) {
            k0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeSuccessToast");
            android.app.Dialog dialog2 = k0Var.f123876i;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            k0Var.f123876i = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d4 = k0Var.f123871d;
            db5.t7.i(ak1.f.d(c12720x8e4fa2d4), c12720x8e4fa2d4.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.a5h), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        k0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeFailureToast");
        android.app.Dialog dialog3 = k0Var.f123876i;
        if (dialog3 != null) {
            dialog3.dismiss();
        }
        k0Var.f123876i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d42 = k0Var.f123871d;
        db5.t7.i(ak1.f.d(c12720x8e4fa2d42), c12720x8e4fa2d42.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.a5f), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
    }
}
