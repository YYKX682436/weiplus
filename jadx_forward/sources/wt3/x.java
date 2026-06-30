package wt3;

/* loaded from: classes4.dex */
public final class x extends com.p314xaae8f345.mm.p944x882e457a.i {
    public x(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.util.List list, java.lang.String str, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        gVar = (i19 & 4) != 0 ? null : gVar;
        j17 = (i19 & 8) != 0 ? 0L : j17;
        j18 = (i19 & 16) != 0 ? 0L : j18;
        gVar2 = (i19 & 32) != 0 ? null : gVar2;
        list = (i19 & 64) != 0 ? null : list;
        str = (i19 & 128) != 0 ? null : str;
        r45.vg4 vg4Var = new r45.vg4();
        r45.wg4 wg4Var = new r45.wg4();
        wg4Var.mo11485x1f73abb4(new r45.ie());
        wg4Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        vg4Var.f469734d = i17;
        vg4Var.f469735e = i18;
        vg4Var.f469736f = gVar;
        vg4Var.f469740m = j17;
        vg4Var.f469741n = j18;
        vg4Var.f469742o = gVar2;
        if (list != null && (!list.isEmpty())) {
            vg4Var.f469743p.addAll(list);
        }
        vg4Var.f469744q = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = vg4Var;
        lVar.f152198b = wg4Var;
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listenvideobgmlist";
        lVar.f152200d = 4404;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiGetLikedListenVideoBgmList", "type:" + i17 + " count" + i18 + " forRecommendExtraInfo:" + str);
    }
}
