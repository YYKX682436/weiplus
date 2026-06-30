package dt4;

/* loaded from: classes9.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final synchronized dt4.p a(java.lang.String talker) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.Map map = dt4.p.f324800g;
        if (!map.containsKey(talker)) {
            map.put(talker, new dt4.p(talker, null));
        }
        obj = ((java.util.LinkedHashMap) map).get(talker);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (dt4.p) obj;
    }

    public final void b(android.content.Context context, java.lang.String talker, dt4.u itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        long j17 = itemData.f324830f;
        if (j17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(talker, j17);
        java.lang.String j18 = n17.j();
        ot0.q v17 = ot0.q.v(j18);
        if (j18 == null || v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerDataCenter", "xml or content is null!");
            return;
        }
        int i17 = itemData.f324829e;
        if (i17 == 301) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sender_name", n17.Q0());
            intent.putExtra("appmsg_type", v17.I0);
            intent.putExtra("transfer_id", v17.L0);
            intent.putExtra(ya.b.f77506xba41a63c, v17.K0);
            intent.putExtra("effective_date", v17.N0);
            intent.putExtra("total_fee", v17.Q0);
            intent.putExtra("fee_type", v17.R0);
            intent.putExtra("payer_name", v17.O0);
            intent.putExtra("receiver_name", v17.P0);
            intent.putExtra("transfer_attach", v17.S0);
            j45.l.j(context, "remittance", ".ui.RemittanceSwipeDetailUI", intent, null);
            return;
        }
        if (i17 != 201) {
            if (i17 == 101) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("bill_no", v17.f430269z1);
                intent2.putExtra("launcher_user_name", v17.I);
                intent2.putExtra("enter_scene", 1);
                intent2.putExtra("chatroom", talker);
                j45.l.j(context, "aa", ".ui.PaylistAAUI", intent2, null);
                return;
            }
            return;
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("key_swipe", 1);
        intent3.putExtra("key_anim_slide", true);
        intent3.putExtra("key_way", 0);
        intent3.putExtra("key_native_url", v17.f430237r1);
        intent3.putExtra("key_username", talker);
        intent3.putExtra("key_from_username", g95.e0.d(n17));
        java.lang.String c2cSceneId = v17.f430233q1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c2cSceneId, "c2cSceneId");
        intent3.putExtra("scene_id", java.lang.Integer.parseInt(c2cSceneId));
        intent3.putExtra("key_invalidtime", v17.M0);
        ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
        ot0.j jVar = (ot0.j) v17.y(ot0.j.class);
        intent3.putExtra("key_exclusive_username", cVar.f429954n);
        intent3.putExtra("key_cropname", cVar.f429944d);
        intent3.putExtra("key_receive_envelope_url", cVar.f429949i);
        intent3.putExtra("key_receive_envelope_md5", cVar.f429950j);
        intent3.putExtra("key_receive_envelope_dynamic_url", cVar.f429966z);
        intent3.putExtra("key_receive_envelope_dynamic_md5", cVar.A);
        intent3.putExtra("key_receive_envelope_dynamic_type", cVar.B);
        intent3.putExtra("key_receive_envelope_widget_url", cVar.f429955o);
        intent3.putExtra("key_receive_envelope_widget_md5", cVar.f429956p);
        intent3.putExtra("key_receive_envelope_widget_status_flag", cVar.f429961u);
        intent3.putExtra("key_receive_envelope_fission_info", cVar.f429962v);
        intent3.putExtra("key_packet_create_time", (int) n17.mo78012x3fdd41df());
        intent3.putExtra("key_packet_source", jVar.f430073l);
        intent3.putExtra("key_detail_envelope_url", cVar.f429951k);
        intent3.putExtra("key_detail_envelope_md5", cVar.f429952l);
        intent3.putExtra("key_detail_envelope_dynamic_url", cVar.C);
        intent3.putExtra("key_detail_envelope_dynamic_md5", cVar.D);
        intent3.putExtra("key_about_url", jVar.f430071j);
        intent3.putExtra("key_packet_id", jVar.f430072k);
        intent3.putExtra("key_has_story", jVar.f430076o);
        intent3.putExtra("key_material_flag", jVar.f430077p);
        intent3.putExtra("key_msgid", n17.m124847x74d37ac6());
        intent3.putExtra("key_lucky_money_can_received", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430237r1)) {
            try {
                intent3.putExtra("key_sendid", android.net.Uri.parse(v17.f430237r1).getQueryParameter("sendid"));
            } catch (java.lang.Exception unused) {
            }
        }
        j45.l.j(context, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent3, null);
    }

    public final int c(int i17) {
        return i17 != 101 ? i17 != 201 ? i17 != 301 ? com.p314xaae8f345.mm.R.C30867xcad56011.lhc : com.p314xaae8f345.mm.R.C30867xcad56011.i1h : com.p314xaae8f345.mm.R.C30867xcad56011.lf_ : com.p314xaae8f345.mm.R.C30867xcad56011.gat;
    }
}
