package qr3;

/* loaded from: classes9.dex */
public class z implements com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 f447658a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323) {
        this.f447658a = activityC16884xbfaa2323;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoSettingUI", "handleBlockFinderClick: onFailure");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323.f235706y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323 = this.f447658a;
        activityC16884xbfaa2323.getClass();
        activityC16884xbfaa2323.runOnUiThread(new qr3.RunnableC30001x337571(activityC16884xbfaa2323));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1
    /* renamed from: onSuccess */
    public void mo67622xe05b4124(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323 = this.f447658a;
        activityC16884xbfaa2323.f235717q = i17;
        activityC16884xbfaa2323.runOnUiThread(new qr3.RunnableC30001x337571(activityC16884xbfaa2323));
    }
}
