package ek2;

/* loaded from: classes.dex */
public final class c1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334959u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, long j18, java.lang.String nonceId, byte[] bArr, int i17, java.util.List sendIdList) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendIdList, "sendIdList");
        this.f334959u = "Finder.CgiFinderLiveGetRedPacketInfo";
        r45.ou1 ou1Var = new r45.ou1();
        ou1Var.set(5, java.lang.Long.valueOf(j17));
        ou1Var.set(4, java.lang.Long.valueOf(j18));
        ou1Var.set(6, nonceId);
        ou1Var.set(1, db2.t4.f309704a.a(6271));
        ou1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        ou1Var.set(7, xy2.c.f(this.f97668n));
        ou1Var.set(8, java.lang.Integer.valueOf(i17));
        java.util.LinkedList m75941xfb821914 = ou1Var.m75941xfb821914(3);
        if (m75941xfb821914 != null) {
            m75941xfb821914.addAll(sendIdList);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ou1Var;
        r45.pu1 pu1Var = new r45.pu1();
        pu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pu1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = pu1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetredpacketinfo";
        lVar.f152200d = 6271;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetRedPacketInfo", "CgiFinderLiveGetRedPacketInfo, init liveId:" + ou1Var.m75942xfb822ef2(5) + ", objectId:" + ou1Var.m75942xfb822ef2(4) + ", nonceId:" + ou1Var.m75945x2fec8307(6) + ", send_id_list:" + ou1Var.m75941xfb821914(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pu1 resp = (r45.pu1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334959u, "CgiFinderLiveGetRedPacketInfo [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ",result:" + pm0.b0.g(resp));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
