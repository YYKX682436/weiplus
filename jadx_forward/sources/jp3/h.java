package jp3;

/* loaded from: classes14.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jp3.k f382534a;

    public h(jp3.k kVar) {
        this.f382534a = kVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        byte[] m75962x8b6d8abc;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        jp3.t tVar = jp3.t.f382562a;
        jp3.k kVar = this.f382534a;
        java.lang.String str = kVar.f382544d.f234406f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152149b);
        java.lang.String str2 = fVar.f152150c;
        r45.v10 v10Var = (r45.v10) fVar.f152151d;
        tVar.c("checkpalmuseronlineopenresource", str, valueOf, str2, (v10Var == null || (m75962x8b6d8abc = v10Var.m75962x8b6d8abc()) == null) ? null : java.lang.Integer.valueOf(m75962x8b6d8abc.length));
        boolean U6 = kVar.f382544d.U6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[doCheckPalmResult] resp: " + fVar + ", needPalmInfo:" + U6);
        int i17 = fVar.f152148a;
        jp3.g gVar = jp3.g.f382533a;
        if (i17 == 0 && fVar.f152149b == 0) {
            gVar.i(kVar.f382544d, 0, "ok", U6 ? kVar.f382548h : null, U6 ? kVar.f382549i : null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activityC16781xd3c41868 = kVar.f382544d;
            int i18 = fVar.f152149b;
            if (i18 == 0) {
                i18 = 80021;
            }
            int i19 = i18;
            java.lang.String str3 = fVar.f152150c;
            gVar.i(activityC16781xd3c41868, i19, !(str3 == null || str3.length() == 0) ? fVar.f152150c : "ERR_PALM_SERVER_OPEN_RESULT_FAILED", U6 ? kVar.f382548h : null, U6 ? kVar.f382549i : null);
        }
        return jz5.f0.f384359a;
    }
}
