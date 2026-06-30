package db2;

/* loaded from: classes2.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f309529t;

    /* renamed from: u, reason: collision with root package name */
    public final long f309530u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17, long j18, java.lang.String str, java.lang.String objectNonceId, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.sy0 sy0Var = new r45.sy0();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sy0Var;
        r45.ty0 ty0Var = new r45.ty0();
        ty0Var.set(0, new r45.ie());
        lVar.f152198b = ty0Var;
        lVar.f152205i = 2000;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercomment";
        lVar.f152200d = 3906;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
        this.f309529t = j17;
        this.f309530u = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "[CgiDeleteFinderComment] commentId=" + j17 + ')');
        r45.sy0 sy0Var2 = new r45.sy0();
        sy0Var2.set(4, java.lang.Long.valueOf(j17));
        sy0Var2.set(7, 1);
        sy0Var2.set(2, java.lang.Long.valueOf(j18));
        sy0Var2.set(11, objectNonceId);
        sy0Var2.set(10, java.lang.Integer.valueOf(i17));
        db2.t4 t4Var = db2.t4.f309704a;
        sy0Var2.set(12, t4Var.b(3906, qt2Var));
        sy0Var2.set(13, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j18, str, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = sy0Var2;
        r45.ty0 ty0Var2 = new r45.ty0();
        ty0Var2.set(0, new r45.ie());
        lVar2.f152198b = ty0Var2;
        lVar2.f152205i = 2000;
        t4Var.h((r45.kv0) sy0Var2.m75936x14adae67(12), qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(j18), str)));
        lVar2.f152199c = "/cgi-bin/micromsg-bin/findercomment";
        lVar2.f152200d = 3906;
        p(lVar2.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        bu2.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        r45.ty0 resp = (r45.ty0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp + " thread=" + java.lang.Thread.currentThread() + " commentId=" + this.f309529t);
        if (i17 == 0 && i18 == 0 && (h17 = (jVar = bu2.j.f106067a).h(this.f309530u)) != null) {
            h17.m59355xc51b2372(h17.m59216x8ed22866() - 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32();
            long j17 = h17.f66939xc8a07680;
            am.cb cbVar = c5467x4cfefe32.f135805g;
            cbVar.f87876a = j17;
            cbVar.f87878c = h17.m59216x8ed22866();
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(4);
            if (m75941xfb821914 != null && m75941xfb821914.size() > 0) {
                h17.m59217x57341267().clear();
                h17.m59217x57341267().addAll(m75941xfb821914);
                r45.yl2 yl2Var = new r45.yl2();
                yl2Var.set(0, h17.m59217x57341267());
                cbVar.f87877b = yl2Var;
            }
            c5467x4cfefe32.e();
            hc2.a0.e(h17.m59217x57341267(), h17.m59251x5db1b11(), this.f309529t, "");
            jVar.n(h17, bu2.i.f106058f);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            c5445x963cab3.f135785g.f88451a = h17.f66939xc8a07680;
            c5445x963cab3.e();
        }
    }
}
