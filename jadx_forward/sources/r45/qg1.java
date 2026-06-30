package r45;

/* loaded from: classes.dex */
public class qg1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public qg1() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(2, "finder_basereq", r45.kv0.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(3, "anchor_finder_username"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(4, "object_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(5, "live_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(6, "op_type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.a(7, "op_cmd_req_buf"));
        this.f38874x227b759e = true;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i d() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 10028;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchormodpromotejumpinfolist";
        lVar.f152197a = this;
        lVar.f152198b = new r45.rg1();
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
