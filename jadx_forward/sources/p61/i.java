package p61;

/* loaded from: classes8.dex */
public class i extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e f433819a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e) {
        this.f433819a = activityC11358x5a6f125e;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (!str.toLowerCase().startsWith("weixin://private/googlegetcode")) {
            return this instanceof j82.h;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.f154461s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433819a;
        activityC11358x5a6f125e.getClass();
        java.lang.String substring = str.substring(30);
        activityC11358x5a6f125e.X6();
        new p61.q(activityC11358x5a6f125e, substring).execute(new java.lang.Void[0]);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433819a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC11358x5a6f125e.f154463e;
        if (c22633x83752a59 != null && c22633x83752a59.getVisibility() != 0) {
            activityC11358x5a6f125e.f154463e.setVisibility(0);
            android.widget.TextView textView = activityC11358x5a6f125e.f154464f;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
        activityC11358x5a6f125e.U6();
        if (c27816xac2547f9 != null) {
            java.lang.String mo64579x7531c8a2 = c27816xac2547f9.mo64579x7531c8a2();
            if (android.text.TextUtils.isEmpty(mo64579x7531c8a2)) {
                return;
            }
            if (!mo64579x7531c8a2.toLowerCase().contains(ya.b.f77504xbb80cbe3)) {
                if (mo64579x7531c8a2.toLowerCase().contains("error")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GoogleContact.BindGoogleContactUI", "failed." + mo64579x7531c8a2.substring(mo64579x7531c8a2.indexOf("=")));
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = activityC11358x5a6f125e.f154463e;
            if (c22633x83752a592 != null) {
                c22633x83752a592.setVisibility(4);
            }
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a593 = activityC11358x5a6f125e.f154463e;
            ((yg0.s4) q3Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.i(c22633x83752a593, "weixin://private/googlegetcode", "document.getElementById('code').value", true);
        }
    }
}
