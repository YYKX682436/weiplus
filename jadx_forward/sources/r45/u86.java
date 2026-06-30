package r45;

/* loaded from: classes.dex */
public class u86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public u86() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(2, "task_id"));
        this.f38874x227b759e = true;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i d() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 18857;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsgetaiimageresult";
        lVar.f152197a = this;
        lVar.f152198b = new r45.v86();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
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
