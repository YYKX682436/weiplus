package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes12.dex */
public class kh implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155522a;

    public kh(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        this.f155522a = activityC11466x7d774b0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155522a;
            sb6.append((java.lang.Object) activityC11466x7d774b0.f155162d.getText());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString().trim())) {
                activityC11466x7d774b0.f155162d.setText((java.lang.CharSequence) null);
            }
        }
        if (fp.i.b()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegSetInfoUI", "SDcard is not available");
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m48698x9616526c() {
        return super.toString() + "|initView";
    }
}
