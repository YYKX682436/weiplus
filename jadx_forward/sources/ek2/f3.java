package ek2;

/* loaded from: classes.dex */
public final class f3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334982u;

    public f3(int i17, int i18, int i19, int i27, int i28) {
        super(null, 1, null);
        this.f334982u = "Finder.CgiTestClientSpeed";
        r45.o40 o40Var = new r45.o40();
        o40Var.set(1, java.lang.Integer.valueOf(i17));
        o40Var.set(2, java.lang.Integer.valueOf(i18));
        o40Var.set(3, java.lang.Integer.valueOf(i19));
        o40Var.set(4, java.lang.Integer.valueOf(i27));
        o40Var.set(5, java.lang.Integer.valueOf(i28));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiTestClientSpeed", "sceneCode:" + i17 + " opCode:" + i18 + " uploadSize:" + i19 + " downloadSize:" + i27 + " concurrentNum:" + i28);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = o40Var;
        r45.p40 p40Var = new r45.p40();
        p40Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) p40Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = p40Var;
        lVar.f152199c = " /cgi-bin/micromsg-bin/clientspeedtest";
        lVar.f152200d = 4138;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.p40 resp = (r45.p40) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334982u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
