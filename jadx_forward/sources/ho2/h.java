package ho2;

/* loaded from: classes2.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f364402t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f364403u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, java.lang.String myUsername, java.lang.String authorFinderUsername, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, java.lang.String clientId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myUsername, "myUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        this.f364402t = i17;
        this.f364403u = finderItem;
        new r45.eg2();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = finderItem.getFeedObject();
        r45.eg2 eg2Var = new r45.eg2();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        fo3.s sVar = fo3.s.INSTANCE;
        cu5Var.d(sVar.Ci("ce_feed_publish"));
        k57Var.f459928e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.h());
        k57Var.f459929f = cu5Var2;
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 b17 = t4Var.b(7945, this.f97668n);
        eg2Var.f454962d = b17;
        b17.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
        eg2Var.f454972q = clientId;
        eg2Var.f454963e = finderItem.getFeedObject().m76802x2dd01666();
        eg2Var.f454964f = myUsername;
        eg2Var.f454966h = feedObject.m76784x5db1b11();
        eg2Var.f454965g = authorFinderUsername;
        eg2Var.f454962d = t4Var.a(7945);
        eg2Var.f454971p = i17;
        eg2Var.f454973r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = eg2Var;
        r45.fg2 fg2Var = new r45.fg2();
        fg2Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = fg2Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = fg2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermemberqaoprqa";
        lVar.f152200d = 7945;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fg2 resp = (r45.fg2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f364403u;
            int i19 = this.f364402t;
            if (i19 == 101 || i19 == 102 || i19 == 104) {
                cu2.u.f303974a.b(c14994x9b99c079.m59251x5db1b11());
                long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
                if (m59251x5db1b11 != 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11();
                    c5437xe8b43b11.f135780g.f87970a = m59251x5db1b11;
                    c5437xe8b43b11.e();
                }
            } else if (i19 == 5) {
                c14994x9b99c079.getFeedObject().m76925xd630e258(c01.id.e());
            } else if (i19 == 105) {
                c14994x9b99c079.getFeedObject().m76925xd630e258(0);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderMemberQAOprQACgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
