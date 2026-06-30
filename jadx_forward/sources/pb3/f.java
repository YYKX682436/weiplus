package pb3;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f f434708d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f) {
        this.f434708d = activityC16327xba05db3f;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f activityC16327xba05db3f = this.f434708d;
        activityC16327xba05db3f.a7();
        if (activityC16327xba05db3f.m78513xc2a54588().getVisibility() == 8 || activityC16327xba05db3f.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "user cancel & finish");
            activityC16327xba05db3f.V6(4, -1);
            activityC16327xba05db3f.finish();
        }
    }
}
