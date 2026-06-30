package db2;

/* loaded from: classes.dex */
public final class c1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309448t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.lang.String md52) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        this.f309448t = "Finder.CgiFinderGetMiaoJianVideoMeta";
        r45.o81 o81Var = new r45.o81();
        o81Var.set(1, db2.t4.f309704a.a(4198));
        o81Var.set(2, o81Var.m75945x2fec8307(2));
        o81Var.set(2, md52);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetMiaoJianVideoMeta", "CgiFinderGetMiaoJianVideoMeta md5:".concat(md52));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = o81Var;
        r45.p81 p81Var = new r45.p81();
        p81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) p81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = p81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmiaojianvideometa";
        lVar.f152200d = 4198;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.p81 resp = (r45.p81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309448t, "onCgiEnd errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
