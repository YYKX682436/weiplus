package ns4;

/* loaded from: classes8.dex */
public final class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421128d;

    public n(ns4.s sVar) {
        this.f421128d = sVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ns4.s sVar = this.f421128d;
        if (!sVar.f421169a.isFinishing() && !sVar.f421169a.isDestroyed()) {
            ms4.h hVar = sVar.f421173e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RechargeProductsDialogViewModel", "cancelGetPriceListRequest, mGetPriceListCgi: " + hVar.f412566i);
            ks4.g gVar = hVar.f412566i;
            if (gVar != null) {
                gVar.j();
            }
            hVar.N6(8, 2, 0, "");
            sVar.f421169a.finish();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = sVar.f421179k;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        u3Var.dismiss();
        sVar.f421179k = null;
    }
}
