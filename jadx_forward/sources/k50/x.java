package k50;

/* loaded from: classes.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k50.z f385800a;

    public x(k50.z zVar) {
        this.f385800a = zVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        int i17;
        int i18;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        co.a aVar;
        int i19 = 3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072 ? 2 : 3;
        } else {
            i17 = 1;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
        hashMap.put("forward_version", 20250731);
        hashMap.put("forwarding_lists_state", java.lang.Integer.valueOf(i17));
        k50.z zVar = this.f385800a;
        boolean booleanExtra = zVar.m158359x1e885992().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", false);
        boolean booleanExtra2 = zVar.m158359x1e885992().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", false);
        boolean booleanExtra3 = zVar.m158359x1e885992().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK_LOCAL", false);
        java.util.List i27 = kz5.c0.i(java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(zVar.m158359x1e885992().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", false)));
        if (i27.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it = i27.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((java.lang.Boolean) it.next()).booleanValue() && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (i18 > 1) {
            i19 = 4;
        } else if (booleanExtra) {
            i19 = 1;
        } else if (booleanExtra3) {
            i19 = 2;
        } else if (!booleanExtra2) {
            i19 = 0;
        }
        hashMap.put("forward_lists_other_app", java.lang.Integer.valueOf(i19));
        int intExtra = zVar.m158359x1e885992().getIntExtra("ForwardParams_ReportFromScene", 0);
        hashMap.put("forward_from_scene", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.k(intExtra)));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page_in")) {
            hashMap.put("forward_init_time_ms", java.lang.Long.valueOf(zVar.f385810e));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page_out")) {
            hashMap.put("forward_page_out_type", java.lang.Integer.valueOf(zVar.f385812g));
            hashMap.put("forward_finish_time_ms", java.lang.Long.valueOf(c01.id.c() - zVar.T6()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = zVar.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null && (aVar = n0Var.f527857t) != null) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
            int g17 = eVar.g(aVar);
            java.lang.String h17 = eVar.h(aVar);
            hashMap.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(g17));
            hashMap.put("selected_msg_list", h17);
            int i28 = aVar.f125235d;
            hashMap.put("chat_username", aVar.m75945x2fec8307(i28 + 1));
            hashMap.put("forward_msgtype", java.lang.Integer.valueOf(eVar.c(aVar, zVar.m158359x1e885992().getIntExtra("ForwardParams_ForwardMsgType", 0))));
            hashMap.put("forward_source_scene", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.d(intExtra, aVar.m75945x2fec8307(i28 + 1))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardReportUIC", "reportMsgCount: " + g17 + ", reportForwardMsgStr: " + h17 + ", talker: " + aVar.m75945x2fec8307(i28 + 1));
        }
        return hashMap;
    }
}
