package r45;

/* loaded from: classes5.dex */
public class g82 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public g82() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(2, "finder_basereq", r45.kv0.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(3, "finder_username"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(4, "object_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(5, "live_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(6, "reward_product_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(7, "reward_product_count"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(8, "reward_amount_in_wecoin"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(9, "request_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(10, "combo_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.a(11, "live_cookies"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(12, "combo_finish"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(13, "to_mic_username"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(14, "session_buffer"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(15, "reward_type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.a(16, "reward_ext_info"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.b(19, "prepare_buf"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(20, "reward_duration_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(21, "batch_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(22, "switch_skin_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.s(23, "prepare_buf_infos", r45.c82.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(24, "to_co_author_username"));
        this.f38874x227b759e = true;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i d() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5891;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivereward";
        lVar.f152197a = this;
        lVar.f152198b = new r45.h82();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // r45.my3
    /* renamed from: getBaseRequest */
    public final r45.he mo11508xa452ad48() {
        return (r45.he) m75936x14adae67(0);
    }

    @Override // r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
