package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2347x822e0f6c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "jq4/d1", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog */
/* loaded from: classes5.dex */
public final class ActivityC18850x6f4d99c3 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public static final jq4.d1 f257820e = new jq4.d1(null);

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardPermission", "showDialog: ");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this)) {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardPermission", "showDialog: has permission");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("voip_float_card_config");
        if (M != null && M.getBoolean("has_showed_dialog", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardPermission", "showDialog: finish");
            finish();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 2, 1);
        z2Var.x(0);
        z2Var.y(fp.h.c(23) ? getText(com.p314xaae8f345.mm.R.C30867xcad56011.kbq) : getText(com.p314xaae8f345.mm.R.C30867xcad56011.kbr));
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.d4r);
        z2Var.l(new jq4.e1(this));
        z2Var.F = new jq4.f1(this, z2Var);
        z2Var.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardPermission", "showDialog: show");
        M.putBoolean("has_showed_dialog", true);
    }
}
