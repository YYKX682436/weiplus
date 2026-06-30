package ek2;

/* loaded from: classes.dex */
public final class w1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.v1 f335092u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335093v;

    public w1(long j17, java.lang.String str, long j18, int i17, int i18, int i19, ek2.v1 v1Var) {
        super(null, 1, null);
        this.f335092u = v1Var;
        this.f335093v = "Finder.CgiFinderLivePause";
        r45.jo2 jo2Var = new r45.jo2();
        jo2Var.set(3, java.lang.Long.valueOf(j17));
        jo2Var.set(1, str);
        jo2Var.set(2, java.lang.Long.valueOf(j18));
        jo2Var.set(4, java.lang.Integer.valueOf(i17));
        jo2Var.set(5, java.lang.Integer.valueOf(i18));
        jo2Var.set(6, java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = jo2Var;
        r45.ko2 ko2Var = new r45.ko2();
        ko2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ko2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ko2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpauselive";
        lVar.f152200d = 4197;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLivePause", "CgiFinderLivePause init " + jo2Var.m75942xfb822ef2(3) + ',' + jo2Var.m75945x2fec8307(1) + ",pause_second:" + jo2Var.m75939xb282bd08(4) + ",pause_mode:" + jo2Var.m75939xb282bd08(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ko2 resp = (r45.ko2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335093v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.v1 v1Var = this.f335092u;
        if (v1Var != null) {
            v1Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
