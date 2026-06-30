package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f276766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f276768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s1 f276769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(java.util.Map map, int i17, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var) {
        super(0);
        this.f276766d = map;
        this.f276767e = i17;
        this.f276768f = context;
        this.f276769g = s1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.os.Bundle bundle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.");
        int i17 = this.f276767e;
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17));
        sb6.append(".url");
        java.lang.String sb7 = sb6.toString();
        java.util.Map map = this.f276766d;
        java.lang.String a17 = ot0.g0.a((java.lang.String) map.get(sb7), 0, 10000, (int) (java.lang.System.currentTimeMillis() / 1000));
        java.lang.Object obj = map.get(".msg.appmsg.mmreader.category.item.title");
        java.lang.Object obj2 = map.get(".msg.appmsg.mmreader.category.item.cover");
        java.lang.Object obj3 = map.get(".msg.appmsg.mmreader.category.item.cover_1_1");
        java.lang.Object obj4 = map.get(".msg.appmsg.template_id");
        java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".publisher_username");
        if (str2 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
            str = n17 != null ? n17.f2() : null;
            if (str == null) {
                str = str2;
            }
        } else {
            str = null;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".item_show_type"), -1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", a17);
        intent.putExtra("shortUrl", a17);
        intent.putExtra("webpageTitle", (java.lang.String) obj);
        java.lang.String str4 = (java.lang.String) obj3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str4 = (java.lang.String) obj2;
        }
        intent.putExtra("thumbUrl", str4);
        intent.putExtra("KTemplateId", (java.lang.String) obj4);
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = this.f276769g;
        long j17 = s1Var.f67292x297eb4f7;
        if (j17 >= 0) {
            intent.putExtra("msg_id", j17);
            intent.putExtra("msg_talker", s1Var.f67306x114ef53e);
        }
        intent.putExtra("KPublisherId", "msg_" + s1Var.f67293xd09be28e);
        intent.putExtra("pre_username", s1Var.f67306x114ef53e);
        intent.putExtra("prePublishId", "msg_" + s1Var.f67293xd09be28e);
        intent.putExtra("preChatName", s1Var.f67306x114ef53e);
        intent.putExtra("geta8key_username", s1Var.f67306x114ef53e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("srcUsername", str2);
            intent.putExtra("srcDisplayname", str);
            intent.putExtra("mode", 1);
        }
        intent.putExtra("message_id", s1Var.f67293xd09be28e);
        intent.putExtra("from_scence", 1);
        intent.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292730j, P);
        intent.putExtra("key_enable_fts_quick", true);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.putExtra("geta8key_scene", 102);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            intent.putExtra("msgUsername", str3);
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(2)) {
            bundle = null;
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(this.f276768f, a17, P, false, 0, 10000, intent)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "jump to TmplWebview");
                return jz5.f0.f384359a;
            }
        } else {
            bundle = null;
        }
        intent.putExtra("rawUrl", a17);
        j45.l.j(this.f276768f, "webview", ".ui.tools.WebViewUI", intent, bundle);
        return jz5.f0.f384359a;
    }
}
