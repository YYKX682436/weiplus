package ee1;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.i {
    public h(java.lang.String appId, java.util.List fpanidList, java.util.List issuerIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fpanidList, "fpanidList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerIdList, "issuerIdList");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rs0();
        lVar.f152198b = new r45.ss0();
        lVar.f152199c = "/cgi-bin/mmpay-bin/industry/nfccards/filtervalidnfccardlist";
        lVar.f152200d = 2770;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.m mVar = a17.f152243a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = mVar.f152217a;
        r45.rs0 rs0Var = fVar instanceof r45.rs0 ? (r45.rs0) fVar : null;
        if (rs0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestProtoBuf is not FilterValidNfcCardListRequest, actual=");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = mVar.f152217a;
            sb6.append(fVar2 != null ? fVar2.getClass().getName() : null);
            throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        rs0Var.f466702d = appId;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(fpanidList);
        rs0Var.f466703e = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(issuerIdList);
        rs0Var.f466704f = linkedList2;
        p(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNFCCardFilter", "init, appId=%s, fpanidListSize=%d, issuerIdListSize=%d", appId, java.lang.Integer.valueOf(fpanidList.size()), java.lang.Integer.valueOf(issuerIdList.size()));
    }
}
