package xb3;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff f534428d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff) {
        this.f534428d = activityC16334x8c51adff;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff = this.f534428d;
        android.app.Dialog dialog = activityC16334x8c51adff.f226666g;
        if (dialog != null && dialog.isShowing()) {
            activityC16334x8c51adff.f226666g.dismiss();
        }
        wb3.a aVar = activityC16334x8c51adff.f226668i;
        if (aVar != null) {
            aVar.j();
        }
        if (activityC16334x8c51adff.m78513xc2a54588().getVisibility() == 8 || activityC16334x8c51adff.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "user cancel & finish");
            activityC16334x8c51adff.finish();
        }
    }
}
