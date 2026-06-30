package db2;

/* loaded from: classes3.dex */
public final class z extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309788t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.e01 f309789u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e cover_img, java.lang.String desc, java.lang.String ticket, java.lang.String appid, int i17, int i18, r45.o92 o92Var, java.util.LinkedList linkedList, java.lang.Integer num, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.lang.Integer num2, java.util.LinkedList linkedList4, java.lang.Integer num3, boolean z17, byte[] bArr, int i19, int i27) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cover_img, "cover_img");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        this.f309788t = "Finder.CgiFinderCreateGameLivePrepare";
        r45.e01 e01Var = new r45.e01();
        this.f309789u = e01Var;
        e01Var.set(1, db2.t4.f309704a.a(6434));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e01Var.set(2, xy2.c.e(context));
        e01Var.set(3, cover_img);
        e01Var.set(4, desc);
        e01Var.set(6, ticket);
        e01Var.set(7, appid);
        e01Var.set(8, java.lang.Integer.valueOf(i17));
        e01Var.set(12, java.lang.Integer.valueOf(i18));
        e01Var.set(17, linkedList);
        e01Var.set(18, java.lang.Integer.valueOf(num3 != null ? num3.intValue() : 0));
        e01Var.set(11, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        if (!zl2.r4.f555483a.O1(true)) {
            e01Var.set(14, linkedList2);
            e01Var.set(13, linkedList3);
            e01Var.set(10, linkedList4);
            e01Var.set(9, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        r45.pi2 pi2Var = new r45.pi2();
        pi2Var.set(0, o92Var);
        e01Var.set(16, pi2Var);
        e01Var.set(20, java.lang.Integer.valueOf(z17 ? 1 : 0));
        e01Var.set(19, bArr != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length) : null);
        e01Var.set(21, java.lang.Integer.valueOf(i19));
        e01Var.set(24, java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = e01Var;
        r45.f01 f01Var = new r45.f01();
        f01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f01Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = f01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreategameliveprepare";
        lVar.f152200d = 6434;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderCreateGameLivePrepare", "init join_team_up_setting:" + i18 + " , anchorSwitchFlag = " + e01Var.m75939xb282bd08(18) + ", anchorStatusFlag = " + e01Var.m75939xb282bd08(11) + ", acknowledgeSpamMsg:" + z17 + "liveEntranceType:" + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("Finder.CgiFinderCreateGameLivePrepare", num != null ? num.intValue() : 0);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.f01 resp = (r45.f01) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309788t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
