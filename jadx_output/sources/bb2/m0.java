package bb2;

/* loaded from: classes10.dex */
public final class m0 {

    /* renamed from: a */
    public static final bb2.m0 f18918a = new bb2.m0();

    public static /* synthetic */ void b(bb2.m0 m0Var, android.content.Context context, r45.qt2 qt2Var, java.lang.String str, boolean z17, org.json.JSONObject jSONObject, boolean z18, int i17, int i18, java.lang.Object obj) {
        m0Var.a(context, qt2Var, str, z17, jSONObject, (i18 & 32) != 0 ? false : z18, (i18 & 64) != 0 ? -1 : i17);
    }

    public final void a(android.content.Context context, r45.qt2 qt2Var, java.lang.String eid, boolean z17, org.json.JSONObject udfKv, boolean z18, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        if (i17 == 0) {
            udfKv.put("bullet_screen_belong", "other");
        } else if (i17 == 1) {
            udfKv.put("bullet_screen_belong", "my");
        } else if (i17 == 2) {
            udfKv.put("bullet_screen_belong", "author");
        }
        udfKv.put("sub_obj_type", z18 ? 1 : 0);
        udfKv.put("screen_type", context.getResources().getConfiguration().orientation != 2 ? 2 : 1);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, qt2Var, eid, z17 ? 1 : 0, udfKv, false, null, 48, null);
    }

    public final void c(android.content.Context context, r45.oo bulletInfo, so2.u1 feedObject, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.autogen.mmdata.rpt.FinderBulletPostStruct finderBulletPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBulletPostStruct();
        finderBulletPostStruct.f56580d = finderBulletPostStruct.b("bs_id", pm0.v.u(bulletInfo.getLong(0)), true);
        finderBulletPostStruct.f56581e = finderBulletPostStruct.b("feed_id", pm0.v.u(feedObject.getItemId()), true);
        finderBulletPostStruct.f56582f = finderBulletPostStruct.b("bs_content", bulletInfo.getString(2), true);
        finderBulletPostStruct.f56583g = z17 ? 1 : 2;
        finderBulletPostStruct.f56584h = bulletInfo.getInteger(4);
        finderBulletPostStruct.f56585i = i17;
        finderBulletPostStruct.f56586j = context.getResources().getConfiguration().orientation == 2 ? 1 : 2;
        finderBulletPostStruct.f56587k = 1;
        finderBulletPostStruct.f56588l = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).O6(feedObject.getItemId()) + 1;
        finderBulletPostStruct.f56589m = bulletInfo.getLong(14) == 0 ? 1 : 2;
        java.lang.Long valueOf = java.lang.Long.valueOf(bulletInfo.getLong(14));
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        finderBulletPostStruct.f56590n = finderBulletPostStruct.b("bs_follow_button_id", valueOf != null ? pm0.v.u(valueOf.longValue()) : null, true);
        if (z17) {
            java.lang.String a17 = hc2.k.a(kz5.c1.k(new jz5.l("bs_id", finderBulletPostStruct.f56580d), new jz5.l("feed_id", finderBulletPostStruct.f56581e), new jz5.l("bs_content", finderBulletPostStruct.f56582f), new jz5.l("bs_status", java.lang.Integer.valueOf(finderBulletPostStruct.f56583g)), new jz5.l("bs_createtime", java.lang.Long.valueOf(finderBulletPostStruct.f56584h)), new jz5.l("post_play_sec", java.lang.Long.valueOf(finderBulletPostStruct.f56585i)), new jz5.l("screen_type", java.lang.Integer.valueOf(finderBulletPostStruct.f56586j)), new jz5.l("bs_type", java.lang.Integer.valueOf(finderBulletPostStruct.f56587k)), new jz5.l("post_play_times", java.lang.Integer.valueOf(finderBulletPostStruct.f56588l)), new jz5.l("bs_post_type", java.lang.Integer.valueOf(finderBulletPostStruct.f56589m)), new jz5.l("bs_follow_button_id", finderBulletPostStruct.f56590n)));
            com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.l0.h(l0Var, nyVar != null ? nyVar.V6() : null, feedObject.getFeedObject(), 50, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", 50), new jz5.l("strValue", a17))), 0, null, 48, null);
        }
        finderBulletPostStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderBulletPostStruct);
    }

    public final void d(android.view.View targetView, android.content.Context context, r45.oo bulletInfo, long j17, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "bs_agree_button");
        lVarArr[1] = new jz5.l("bs_id", pm0.v.u(bulletInfo.getLong(0)));
        lVarArr[2] = new jz5.l("bs_content", bulletInfo.getString(2));
        lVarArr[3] = new jz5.l("bs_status", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[4] = new jz5.l("post_play_sec", java.lang.Long.valueOf(i17));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(context.getResources().getConfiguration().orientation == 2 ? 1 : 2));
        lVarArr[6] = new jz5.l("bs_type", 1);
        lVarArr[7] = new jz5.l("post_play_times", java.lang.Integer.valueOf(((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).O6(j17) + 1));
        lVarArr[8] = new jz5.l("feed_id", pm0.v.u(j17));
        ((cy1.a) rVar).Cj("post_bs", targetView, kz5.c1.k(lVarArr), 25496);
    }
}
