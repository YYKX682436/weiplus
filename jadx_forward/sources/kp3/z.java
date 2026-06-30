package kp3;

/* loaded from: classes14.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 f392603b;

    public z(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb82) {
        this.f392602a = str;
        this.f392603b = activityC16780x4fcabb82;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        byte[] m75962x8b6d8abc;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        jp3.t tVar = jp3.t.f382562a;
        java.lang.String str = this.f392602a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152149b);
        java.lang.String str2 = fVar.f152150c;
        r45.r10 r10Var = (r45.r10) fVar.f152151d;
        tVar.c("checkonlineopenpalmserviceauth", str, valueOf, str2, (r10Var == null || (m75962x8b6d8abc = r10Var.m75962x8b6d8abc()) == null) ? null : java.lang.Integer.valueOf(m75962x8b6d8abc.length));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] response : " + fVar);
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && fVar.f152151d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] success");
            r45.s10 s10Var = (r45.s10) ((r45.r10) fVar.f152151d).m75936x14adae67(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb82 = this.f392603b;
            if (s10Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] is_upload_bypass: " + s10Var.m75933x41a8a7f2(0) + ", sdk_config: " + s10Var.m75945x2fec8307(1) + ", guide_popup_config: " + s10Var.m75945x2fec8307(2));
                jp3.r rVar = jp3.s.f382558b;
                java.lang.String m75945x2fec8307 = s10Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                jp3.s.f382561e = m75945x2fec8307;
                activityC16780x4fcabb82.getIntent().putExtra("is_upload_bypass", s10Var.m75933x41a8a7f2(0));
                activityC16780x4fcabb82.getIntent().putExtra("guide_popup_config", s10Var.m75945x2fec8307(2));
            }
            j45.l.n(activityC16780x4fcabb82, "palm", ".ui.PalmPrintMainUI", activityC16780x4fcabb82.getIntent(), activityC16780x4fcabb82.f234400d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.palmPrintFrontUI", "[doCheckServiceAuth] failed");
            jp3.g gVar = jp3.g.f382533a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb822 = this.f392603b;
            int i17 = fVar.f152149b;
            if (i17 == 0) {
                i17 = 80020;
            }
            int i18 = i17;
            java.lang.String str3 = fVar.f152150c;
            gVar.i(activityC16780x4fcabb822, i18, !(str3 == null || str3.length() == 0) ? fVar.f152150c : "ERR_PALM_SERVER_CHECK_AUTH", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        return jz5.f0.f384359a;
    }
}
