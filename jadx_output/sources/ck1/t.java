package ck1;

/* loaded from: classes4.dex */
public final class t implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42380d;

    public t(ck1.k0 k0Var) {
        this.f42380d = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ck1.o0 o0Var = (ck1.o0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState: " + o0Var);
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState is null");
            return;
        }
        int ordinal = o0Var.ordinal();
        ck1.k0 k0Var = this.f42380d;
        if (ordinal == 0) {
            k0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokingDialog");
            android.app.Dialog dialog = k0Var.f42343i;
            if (dialog != null) {
                dialog.dismiss();
            }
            k0Var.f42343i = null;
            k0Var.f42343i = db5.e1.Q(ak1.f.d(k0Var.f42338d), null, null, true, false, null);
            return;
        }
        if (ordinal == 1) {
            k0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeSuccessToast");
            android.app.Dialog dialog2 = k0Var.f42343i;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            k0Var.f42343i = null;
            com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = k0Var.f42338d;
            db5.t7.i(ak1.f.d(appBrandUserInfoRevokePage), appBrandUserInfoRevokePage.getString(com.tencent.mm.R.string.a5h), com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        k0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeFailureToast");
        android.app.Dialog dialog3 = k0Var.f42343i;
        if (dialog3 != null) {
            dialog3.dismiss();
        }
        k0Var.f42343i = null;
        com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage2 = k0Var.f42338d;
        db5.t7.i(ak1.f.d(appBrandUserInfoRevokePage2), appBrandUserInfoRevokePage2.getString(com.tencent.mm.R.string.a5f), com.tencent.mm.R.raw.icons_filled_error);
    }
}
