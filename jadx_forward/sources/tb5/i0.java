package tb5;

/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb5.i0 f498588a = new tb5.i0();

    public final java.lang.String a(java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        return kz5.n0.g0(msgList, "#", null, null, 0, null, tb5.h0.f498586d, 30, null);
    }

    public final void b(java.lang.String eventId, java.util.List selectedItems, tb5.g0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedItems, "selectedItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj(eventId, null, kz5.c1.m(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(selectedItems.size())), new jz5.l("selected_msgs_succ_cnt", java.lang.Integer.valueOf(selectedItems.size())), new jz5.l("selected_msg_list", a(selectedItems))), state.f498584a), 35480);
    }

    public final void c(java.util.List selectItems, java.lang.String reportId, java.lang.String str, tb5.g0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectItems, "selectItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportId, "reportId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.Map map = state.f498584a;
        if (!map.containsKey("share_session_id")) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            map.put("share_session_id", uuid);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("bottom_options_controls", "view_clk", kz5.c1.m(kz5.c1.k(new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(selectItems.size())), new jz5.l("selected_msg_list", a(selectItems)), new jz5.l("click_btn_name", reportId)), map), 35480);
    }

    public final void d(java.util.List selectItems, boolean z17, tb5.g0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectItems, "selectItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(selectItems.size()));
        lVarArr[1] = new jz5.l("selected_msg_list", a(selectItems));
        lVarArr[2] = new jz5.l("bind_mail_type", java.lang.Integer.valueOf(z17 ? 2 : 3));
        ((cy1.a) rVar).Cj("multi_select_msg_add_to_mail_end", null, kz5.c1.m(kz5.c1.k(lVarArr), state.f498584a), 35480);
    }
}
