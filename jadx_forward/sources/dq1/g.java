package dq1;

/* loaded from: classes8.dex */
public final class g extends dq1.a {
    public g() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderOpenLive", "context self check fail!");
            return false;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_finder_live_enable_external_schema_url_open_live, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderOpenLive", "xlab config disable opening live from URL scheme");
            return false;
        }
        r45.k00 k00Var = new r45.k00();
        try {
            k00Var.mo11468x92b714fd(actionBuffer.g());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k00Var.m75945x2fec8307(0))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderOpenLive", "exportId is empty!");
                return false;
            }
            r45.c90 c90Var = (r45.c90) k00Var.m75936x14adae67(4);
            int m75939xb282bd08 = c90Var != null ? c90Var.m75939xb282bd08(0) : 0;
            r45.c90 c90Var2 = (r45.c90) k00Var.m75936x14adae67(4);
            int m75939xb282bd082 = c90Var2 != null ? c90Var2.m75939xb282bd08(1) : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportId:");
            sb6.append(k00Var.m75945x2fec8307(0));
            sb6.append(", entranceScene:");
            sb6.append(m75939xb282bd08);
            sb6.append(", cardType:");
            sb6.append(m75939xb282bd082);
            sb6.append(", joinliveBuffer size:");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = k00Var.m75934xbce7f2f(1);
            sb6.append(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a.length : 0);
            sb6.append(", openLiveH5Buffer size:");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = k00Var.m75934xbce7f2f(2);
            sb6.append(m75934xbce7f2f2 != null ? m75934xbce7f2f2.f273689a.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeFinderOpenLive", sb6.toString());
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("key_comment_scene_for_external_live_h5", "391");
            linkedHashMap.put("key_enter_scene", java.lang.Integer.valueOf(m75939xb282bd08));
            linkedHashMap.put("key_card_type", java.lang.Integer.valueOf(m75939xb282bd082));
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = k00Var.m75934xbce7f2f(1);
            if (m75934xbce7f2f3 != null) {
                linkedHashMap.put("key_joinlive_buffer", m75934xbce7f2f3.g());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f4 = k00Var.m75934xbce7f2f(2);
            if (m75934xbce7f2f4 != null) {
                linkedHashMap.put("key_open_live_h5_buffer", m75934xbce7f2f4.g());
            }
            ((c61.l7) b6Var).getClass();
            vd2.t3.f517454a.m(ui6.mo55332x76847179(), null, 0L, k00Var.m75945x2fec8307(0), "", linkedHashMap, new dq1.e(this), new dq1.f(this));
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderOpenLive", "parse CheckExternalFinderOpenLiveActionBuffer error: e = " + e17.getMessage());
            return false;
        }
    }
}
