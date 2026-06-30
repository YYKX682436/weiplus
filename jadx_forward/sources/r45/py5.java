package r45;

/* loaded from: classes9.dex */
public class py5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.e implements r45.my3 {
    public py5() {
        super(com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(1, "BaseRequest", r45.he.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(2, "Msg", r45.b9.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(3, "CommentUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(4, "ReqTime"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(5, "Md5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(6, "FileType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(7, "Signature"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(8, "FromSence"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(9, "HitMd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(10, "CRC32"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(11, "MsgForwardType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(12, "DirectShare"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(13, "SendMsgTicket"));
        this.f38874x227b759e = true;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i d() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f152197a = this;
        lVar.f152198b = new r45.qy5();
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
