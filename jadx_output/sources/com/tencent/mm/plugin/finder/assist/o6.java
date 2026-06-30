package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class o6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zz2 f102430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102431f;

    public o6(android.content.Context context, r45.zz2 zz2Var, r45.qt2 qt2Var) {
        this.f102429d = context;
        this.f102430e = zz2Var;
        this.f102431f = qt2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            android.content.Context context = this.f102429d;
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490560yi));
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
            finderBroadcastEidClickStruct.u("");
            finderBroadcastEidClickStruct.p("");
            finderBroadcastEidClickStruct.B("");
            finderBroadcastEidClickStruct.y("");
            r45.qt2 qt2Var = this.f102431f;
            if (qt2Var == null || (str = qt2Var.getString(0)) == null) {
                str = "";
            }
            finderBroadcastEidClickStruct.w(str);
            finderBroadcastEidClickStruct.r(qt2Var != null ? qt2Var.getString(1) : null);
            if (qt2Var == null || (str2 = java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString()) == null) {
                str2 = "";
            }
            finderBroadcastEidClickStruct.q(str2);
            if (qt2Var == null || (str3 = qt2Var.getString(2)) == null) {
                str3 = "";
            }
            finderBroadcastEidClickStruct.A(str3);
            finderBroadcastEidClickStruct.x("");
            finderBroadcastEidClickStruct.v("");
            finderBroadcastEidClickStruct.s("square_topic_page_share_success");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("share_type", 2);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderBroadcastEidClickStruct.t(r26.i0.t(jSONObject2, ",", ";", false));
            finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            finderBroadcastEidClickStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Zk(finderBroadcastEidClickStruct);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareFinderLiveThemeToSnsTimeLine: themeId=");
            r45.zz2 zz2Var = this.f102430e;
            sb6.append(zz2Var.f392483g);
            sb6.append(", main_title=");
            sb6.append(zz2Var.f392480d);
            sb6.append(" to ");
            sb6.append(stringArrayListExtra);
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        }
    }
}
