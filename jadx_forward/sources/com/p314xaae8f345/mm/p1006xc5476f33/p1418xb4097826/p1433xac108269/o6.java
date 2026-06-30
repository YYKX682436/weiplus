package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class o6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zz2 f183963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183964f;

    public o6(android.content.Context context, r45.zz2 zz2Var, r45.qt2 qt2Var) {
        this.f183962d = context;
        this.f183963e = zz2Var;
        this.f183964f = qt2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            android.content.Context context = this.f183962d;
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
            c6463x6ead4318.u("");
            c6463x6ead4318.p("");
            c6463x6ead4318.B("");
            c6463x6ead4318.y("");
            r45.qt2 qt2Var = this.f183964f;
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
            jSONObject.put("share_type", 2);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6463x6ead4318.t(r26.i0.t(jSONObject2, ",", ";", false));
            c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            c6463x6ead4318.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Zk(c6463x6ead4318);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareFinderLiveThemeToSnsTimeLine: themeId=");
            r45.zz2 zz2Var = this.f183963e;
            sb6.append(zz2Var.f474016g);
            sb6.append(", main_title=");
            sb6.append(zz2Var.f474013d);
            sb6.append(" to ");
            sb6.append(stringArrayListExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        }
    }
}
