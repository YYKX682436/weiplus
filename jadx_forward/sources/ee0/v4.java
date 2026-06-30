package ee0;

@j95.b
/* loaded from: classes4.dex */
public class v4 extends i95.w implements fe0.o4 {
    public java.lang.String Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", new java.math.BigInteger(str).longValue()));
        if (a17 != null) {
            java.lang.String m70363x51f8f990 = a17.m70363x51f8f990();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
            return m70363x51f8f990;
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtilService", "getLocalid, snsid = %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        return null;
    }

    public java.lang.String Bi(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
            return "";
        }
        java.lang.String str2 = k17.f68896xdde069b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        return str2;
    }

    public java.lang.String Di(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
            return "";
        }
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_" + ca4.z0.t0(k17.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        return str2;
    }

    public void Ni(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        java.lang.String str;
        java.lang.String str2;
        r45.ek4 ek4Var;
        r45.kv2 kv2Var;
        r45.kv2 kv2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MomentChannels.k(context, null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
            return;
        }
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        ya2.e1 e1Var = ya2.e1.f542005a;
        if (a90Var == null || (kv2Var2 = a90Var.f451377o) == null) {
            str = "gotoFinderShareFeedPage";
            str2 = "com.tencent.mm.feature.sns.SnsUtilService";
            if (a90Var != null && (ek4Var = a90Var.f451382t) != null) {
                long F0 = ca4.z0.F0(ek4Var.m75945x2fec8307(0));
                if (F0 != 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("report_scene", 3);
                    intent.putExtra("from_user", c19807x593d1720.f39018xf3f56116);
                    intent.putExtra("feed_object_id", F0);
                    intent.putExtra("feed_object_nonceId", c19807x593d1720.f39014x86965dde.f451382t.m75945x2fec8307(7));
                    intent.putExtra("business_type", 1);
                    intent.putExtra("key_from_user_name", c19807x593d1720.f39018xf3f56116);
                    intent.putExtra("key_ec_source", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(24));
                    intent.putExtra("tab_type", 5);
                    intent.putExtra("KEY_FINDER_SNS_ID", Ai(c19807x593d1720.Id));
                    intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", c19807x593d1720.f39015xc86e6609);
                    intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                    intent.putExtra("key_finder_teen_mode_scene", 3);
                    intent.putExtra("key_finder_teen_mode_user_name", c19807x593d1720.f39014x86965dde.f451382t.m75945x2fec8307(2));
                    intent.putExtra("key_finder_teen_mode_user_id", c19807x593d1720.f39014x86965dde.f451382t.m75945x2fec8307(1));
                    vr2.f fVar = (vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class));
                    if (fVar.wi() && fVar.Ai() && (kv2Var = c19807x593d1720.f39014x86965dde.f451377o) != null) {
                        intent.putExtra("KEY_OBJECT_ID", pm0.v.Z(kv2Var.m75945x2fec8307(0)));
                        intent.putExtra("KEY_OBJECT_NONCE_ID", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(8));
                        intent.putExtra("FROM_SCENE_KEY", 6);
                        intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 20, intent);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        e1Var.C(context, intent);
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 53, intent);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        e1Var.A(context, intent, false);
                    }
                }
            }
        } else {
            str = "gotoFinderShareFeedPage";
            str2 = "com.tencent.mm.feature.sns.SnsUtilService";
            long F02 = ca4.z0.F0(kv2Var2.m75945x2fec8307(0));
            long m75942xfb822ef2 = c19807x593d1720.f39014x86965dde.f451377o.m75942xfb822ef2(9);
            if (F02 != 0 || m75942xfb822ef2 != 0) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("report_scene", 3);
                intent2.putExtra("from_user", c19807x593d1720.f39018xf3f56116);
                intent2.putExtra("feed_object_id", F02);
                intent2.putExtra("feed_object_nonceId", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(8));
                intent2.putExtra("business_type", 0);
                intent2.putExtra("finder_user_name", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(1));
                intent2.putExtra("key_from_user_name", c19807x593d1720.f39018xf3f56116);
                intent2.putExtra("key_ec_source", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(24));
                intent2.putExtra("tab_type", 5);
                intent2.putExtra("feed_local_id", m75942xfb822ef2);
                intent2.putExtra("KEY_FINDER_SNS_ID", Ai(c19807x593d1720.Id));
                intent2.putExtra("KEY_FINDER_SHARE_SUC_TIME", c19807x593d1720.f39015xc86e6609);
                intent2.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.x(c19807x593d1720.f39014x86965dde.f451377o), null, null));
                intent2.putExtra("KEY_FINDER_FORWARD_SOURCE", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(22));
                intent2.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                intent2.putExtra("key_finder_teen_mode_scene", 3);
                intent2.putExtra("key_finder_teen_mode_user_name", ca4.z0.z(c19807x593d1720.f39014x86965dde.f451377o));
                intent2.putExtra("key_finder_teen_mode_user_id", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(1));
                java.lang.String Ai = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(c19807x593d1720.Id, c19807x593d1720.f39015xc86e6609);
                r45.md5 md5Var = new r45.md5();
                md5Var.set(0, java.lang.Long.valueOf(F02));
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent2, Ai, md5Var);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent2, Ai, md5Var);
                if (F02 == 0 && m75942xfb822ef2 != 0) {
                    intent2.putExtra("key_posting_scene", true);
                }
                if ((c19807x593d1720.f39014x86965dde.f451377o.m75939xb282bd08(25) & 4) > 0) {
                    intent2.putExtra("member_username", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(1));
                }
                intent2.putExtra("key_source_comment_scene", c19807x593d1720.f39014x86965dde.f451377o.m75939xb282bd08(29));
                vr2.f fVar2 = (vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class));
                if (fVar2.wi() && fVar2.Ai()) {
                    intent2.putExtra("KEY_OBJECT_ID", pm0.v.Z(c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(0)));
                    intent2.putExtra("KEY_OBJECT_NONCE_ID", c19807x593d1720.f39014x86965dde.f451377o.m75945x2fec8307(8));
                    intent2.putExtra("FROM_SCENE_KEY", 6);
                    intent2.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 20, intent2);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.C(context, intent2);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 38, intent2);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.A(context, intent2, true);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    public java.lang.String wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        java.lang.String l17 = ca4.z0.l();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        return l17;
    }
}
