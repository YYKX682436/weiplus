package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class n6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zz2 f183937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183938e;

    public n6(r45.zz2 zz2Var, r45.qt2 qt2Var) {
        this.f183937d = zz2Var;
        this.f183938e = qt2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.zz2 zz2Var = this.f183937d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToConversation: share finder live theme theme_id=" + zz2Var.f474016g + " cancel");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToConversation: share finder live theme theme_id=" + zz2Var.f474016g + " to " + stringArrayListExtra);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(stringArrayListExtra);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        c6463x6ead4318.u("");
        c6463x6ead4318.p("");
        c6463x6ead4318.B("");
        c6463x6ead4318.y("");
        r45.qt2 qt2Var = this.f183938e;
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        c6463x6ead4318.w(str);
        c6463x6ead4318.r(qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        if (qt2Var == null || (str2 = java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString()) == null) {
            str2 = "";
        }
        c6463x6ead4318.q(str2);
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(2)) == null) {
            str3 = "";
        }
        c6463x6ead4318.A(str3);
        c6463x6ead4318.x("");
        c6463x6ead4318.v("");
        c6463x6ead4318.s("square_topic_page_share_success");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("share_type", 1);
        jSONObject.put("share_username", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, "#"));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6463x6ead4318.t(r26.i0.t(jSONObject2, ",", ";", false));
        c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6463x6ead4318.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Zk(c6463x6ead4318);
    }
}
