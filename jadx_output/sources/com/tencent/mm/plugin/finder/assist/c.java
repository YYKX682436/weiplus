package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f102039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102041i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f102042m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer, r45.qt2 qt2Var, java.lang.String str, org.json.JSONObject jSONObject) {
        super(2);
        this.f102036d = i0Var;
        this.f102037e = context;
        this.f102038f = baseFinderFeed;
        this.f102039g = dataBuffer;
        this.f102040h = qt2Var;
        this.f102041i = str;
        this.f102042m = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        r45.dm2 object_extend;
        r45.pm2 pm2Var;
        r45.dm2 object_extend2;
        r45.cl2 cl2Var;
        java.lang.String string;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        android.content.Intent intent;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject5;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject6;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent2 = (android.content.Intent) obj2;
        android.content.Context context = this.f102037e;
        int integer = this.f102040h.getInteger(5);
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        this.f102036d.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102038f;
        boolean z17 = baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z17 ? baseFinderFeed : null;
        intent2.putExtra("CURRENT_FEED_ID", (baseFinderFeed2 == null || (feedObject6 = baseFinderFeed2.getFeedObject()) == null) ? 0L : feedObject6.getId());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z17 ? baseFinderFeed : null;
        intent2.putExtra("key_ad_flag", (baseFinderFeed3 == null || (feedObject4 = baseFinderFeed3.getFeedObject()) == null || (feedObject5 = feedObject4.getFeedObject()) == null) ? 0 : feedObject5.getAdFlag());
        intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
        intent2.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
        org.json.JSONObject jSONObject = this.f102042m;
        java.lang.String str3 = "";
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        intent2.putExtra("key_chnl_extra", str);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("key_jsapi_bypass");
        if ((stringExtra == null || stringExtra.length() == 0) == false) {
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterLive, byPass:" + stringExtra);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(stringExtra);
                intent2.putExtra("key_enter_live_param_by_pass_type", jSONObject2.optInt("by_pass_type"));
                intent2.putExtra("key_enter_live_param_by_pass_info", jSONObject2.optString("by_pass_info"));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.ActivityRouter", th6, "byPassJson error", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = z17 ? baseFinderFeed : null;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject7 = (baseFinderFeed4 == null || (feedObject3 = baseFinderFeed4.getFeedObject()) == null) ? null : feedObject3.getFeedObject();
        if (integer != 0 && feedObject7 != null) {
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterLiveVisitorUI rewrite commentScene:" + integer + " sessionBuffer:" + feedObject7.getSessionBuffer());
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).rk(feedObject7, integer, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f102039g);
        jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, baseFinderFeed);
        java.util.List list = (java.util.List) Ai.f302833d;
        int intValue = ((java.lang.Number) Ai.f302834e).intValue();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(integer));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = z17 ? baseFinderFeed : null;
        if (baseFinderFeed5 == null || (feedObject2 = baseFinderFeed5.getFeedObject()) == null || (str2 = feedObject2.getNickName()) == null) {
            str2 = "";
        }
        y74Var.set(2, str2);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = z17 ? baseFinderFeed : null;
        y74Var.set(5, (baseFinderFeed6 == null || (feedObject = baseFinderFeed6.getFeedObject()) == null) ? null : feedObject.getFeedObject());
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        if (feedObject7 != null && (object_extend2 = feedObject7.getObject_extend()) != null && (cl2Var = (r45.cl2) object_extend2.getCustom(4)) != null && (string = cl2Var.getString(2)) != null) {
            str3 = string;
        }
        byte[] bytes = str3.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        ta4Var.set(1, new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ta4Var.set(25, bool);
        if (feedObject7 != null && (object_extend = feedObject7.getObject_extend()) != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && ((r45.wm2) pm2Var.getCustom(10)) != null) {
            r45.wm2 wm2Var = new r45.wm2();
            nv2.n1 n1Var = nv2.n1.f340551h;
            wm2Var.set(0, java.lang.Integer.valueOf(((java.lang.Boolean) n1Var.k(feedObject7).f302833d).booleanValue() ? 1 : 0));
            wm2Var.set(1, java.lang.Integer.valueOf(n1Var.l(feedObject7)));
            wm2Var.set(3, n1Var.h(feedObject7));
            ta4Var.set(30, new com.tencent.mm.protobuf.g(wm2Var.toByteArray()));
        }
        ta4Var.set(32, this.f102041i);
        ta4Var.set(33, bool);
        wk0Var.set(7, ta4Var);
        r45.u74 u74Var = new r45.u74();
        r45.ta4 ta4Var2 = (r45.ta4) wk0Var.getCustom(7);
        u74Var.set(0, ta4Var2 != null ? ta4Var2.getByteString(1) : null);
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        u74Var.set(1, h1Var != null ? h1Var.f410379f : null);
        wk0Var.set(8, u74Var);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(context, intent2, list, intValue, wk0Var, null);
        return jz5.f0.f302826a;
    }
}
