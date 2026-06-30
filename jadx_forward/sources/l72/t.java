package l72;

/* loaded from: classes11.dex */
public class t implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 f398396a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61) {
        this.f398396a = activityC13535x2550df61;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "click faceAgreementOtherVerifyTitle");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_msg", "fail");
        intent.putExtra("err_code", 90114);
        intent.putExtra("click_other_verify_btn_front", "yes");
        vz2.c.h(90114);
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61 = this.f398396a;
        activityC13535x2550df61.setResult(1, intent);
        activityC13535x2550df61.finish();
    }
}
