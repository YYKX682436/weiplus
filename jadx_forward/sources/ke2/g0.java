package ke2;

/* loaded from: classes.dex */
public final class g0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final ke2.f0 f388484t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f388485u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(byte[] bArr, long j17, long j18, java.lang.String objectNonceId, java.lang.String finderUserName, int i17, int i18, ke2.f0 f0Var) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f388484t = f0Var;
        this.f388485u = "Finder.CgiFinderLiveRandomMic";
        r45.g62 g62Var = new r45.g62();
        g62Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        g62Var.set(3, java.lang.Long.valueOf(j17));
        g62Var.set(4, java.lang.Long.valueOf(j18));
        g62Var.set(5, objectNonceId);
        g62Var.set(6, finderUserName);
        g62Var.set(1, db2.t4.f309704a.a(4136));
        g62Var.set(7, java.lang.Integer.valueOf(i17));
        g62Var.set(8, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = g62Var;
        r45.h62 h62Var = new r45.h62();
        h62Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h62Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h62Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliverandommic";
        lVar.f152200d = 4136;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveRandomMic", "init: liveId:" + g62Var.m75942xfb822ef2(3) + ", objectId:" + g62Var.m75942xfb822ef2(4) + ", objectNonceId:" + g62Var.m75945x2fec8307(5) + ", finderUserName:" + g62Var.m75945x2fec8307(6) + ", opCode:" + g62Var.m75939xb282bd08(7) + ", applyPos:" + g62Var.m75939xb282bd08(8));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h62 resp = (r45.h62) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388485u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.f0 f0Var = this.f388484t;
        if (f0Var != null) {
            f0Var.a(i17, i18, str, resp);
        }
    }
}
