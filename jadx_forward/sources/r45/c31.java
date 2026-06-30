package r45;

/* loaded from: classes2.dex */
public class c31 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public c31() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(2, dm.i4.f66865x76d1ec5a), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(3, "feedback_type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(4, "feedback_sub_type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(5, "objectNonceId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(6, "finderBaseRequest", r45.kv0.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(7, "sessionBuffer"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(8, "live_scene"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(9, "source_type"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.s(10, "sub_type_list", r45.qw4.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(11, "export_id"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(12, "satisfaction_quest_sub_type"));
        this.f38874x227b759e = true;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i d() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3912;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfeedback";
        lVar.f152197a = this;
        lVar.f152198b = new r45.d31();
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
