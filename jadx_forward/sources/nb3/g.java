package nb3;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d f417583d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d) {
        this.f417583d = activityC16324x5371571d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d = this.f417583d;
        activityC16324x5371571d.V6();
        if (activityC16324x5371571d.m78513xc2a54588().getVisibility() == 8 || activityC16324x5371571d.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyDetailUI", "user cancel & finish");
            activityC16324x5371571d.setResult(-1, null);
            activityC16324x5371571d.finish();
        }
    }
}
