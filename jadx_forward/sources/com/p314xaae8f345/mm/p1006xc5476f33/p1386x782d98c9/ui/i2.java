package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class i2 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e f181034a;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e activityC13465x3d3dbc1e) {
        this.f181034a = activityC13465x3d3dbc1e;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        java.lang.String charSequence2 = charSequence != null ? charSequence.toString() : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e activityC13465x3d3dbc1e = this.f181034a;
        if (activityC13465x3d3dbc1e.f180803v) {
            activityC13465x3d3dbc1e.f180798q = charSequence2;
            activityC13465x3d3dbc1e.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h2(this));
            v32.b L0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().L0(activityC13465x3d3dbc1e.f180794m, activityC13465x3d3dbc1e.f180795n);
            if (L0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", activityC13465x3d3dbc1e.f180794m, activityC13465x3d3dbc1e.f180795n);
                return false;
            }
            L0.f318639y = activityC13465x3d3dbc1e.f180798q;
            L0.f318634t = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().mo9952xce0038c9(L0, new java.lang.String[0]);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.s2(activityC13465x3d3dbc1e.f180794m, activityC13465x3d3dbc1e.f180795n, charSequence2, 0);
            activityC13465x3d3dbc1e.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e2(activityC13465x3d3dbc1e, s2Var));
            gm0.j1.n().f354821b.a(1263, activityC13465x3d3dbc1e);
            gm0.j1.n().f354821b.g(s2Var);
        }
        return true;
    }
}
