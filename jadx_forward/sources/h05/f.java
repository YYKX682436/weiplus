package h05;

/* loaded from: classes4.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h05.i f359465d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717, h05.i iVar) {
        this.f359465d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        if (i17 == 0 && i18 == 0) {
            if (((r45.e36) oVar.f152244b.f152233a) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxGamePushSettingUI", "SetUserSwitchResponse failed, response is null!");
                z17 = false;
            } else {
                z17 = true;
            }
            h05.i iVar = this.f359465d;
            if (iVar != null) {
                iVar.a(z17);
            }
        }
        return 0;
    }
}
