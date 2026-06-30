package h05;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 f359464d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717) {
        this.f359464d = activityC19561x3f936717;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            r45.vq3 vq3Var = (r45.vq3) oVar.f152244b.f152233a;
            if (vq3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxGamePushSettingUI", "GetUserSwitchResponse failed, response is null!");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717 = this.f359464d;
                activityC19561x3f936717.f270094h.setVisibility(4);
                r45.ki6 ki6Var = vq3Var.f469981d;
                if (ki6Var != null && ki6Var.f460258d.size() > 0) {
                    activityC19561x3f936717.f270091e = vq3Var.f469981d;
                    activityC19561x3f936717.runOnUiThread(new h05.d(this));
                }
            }
        }
        return 0;
    }
}
