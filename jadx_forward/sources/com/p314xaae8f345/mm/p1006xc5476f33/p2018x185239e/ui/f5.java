package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class f5 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239244a;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883) {
        this.f239244a = activityC17133x39d21883;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("back_from_webview_or_tinyapp");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239244a;
        if (mo27542xfb7da360) {
            activityC17133x39d21883.d7(0);
            return;
        }
        if (!abstractC3411xcfaed72e.mo27542xfb7da360("has_cmd_info")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "has_cmd_info is no");
            return;
        }
        byte[] mo27541x124d2ef7 = abstractC3411xcfaed72e.mo27541x124d2ef7("cmd_info");
        r45.a50 a50Var = new r45.a50();
        try {
            a50Var.mo11468x92b714fd(mo27541x124d2ef7);
            if (a50Var.f451259d == 6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5905xd2ae9448 c5905xd2ae9448 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5905xd2ae9448();
                am.sq sqVar = c5905xd2ae9448.f136210g;
                sqVar.f89459a = activityC17133x39d21883.f238879f2.getString(ya.b.f77506xba41a63c);
                sqVar.f89460b = activityC17133x39d21883.f238879f2.getString("transfer_id");
                sqVar.f89461c = activityC17133x39d21883.f238879f2.getInt("total_fee");
                sqVar.f89462d = activityC17133x39d21883.f238879f2.getString("sender_name");
                activityC17133x39d21883.f238886j2.mo1xf5bc2045(c5905xd2ae9448);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailUI", "cmdInfo parse failed");
        }
    }
}
