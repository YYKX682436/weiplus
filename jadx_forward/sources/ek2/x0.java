package ek2;

/* loaded from: classes.dex */
public final class x0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f335094t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.es1 f335095u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String anchorUsername, byte[] bArr, long j17, long j18, java.util.LinkedList reqList) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqList, "reqList");
        this.f335094t = "Finder.CgiFinderLiveGetExtraInfo";
        r45.es1 es1Var = new r45.es1();
        this.f335095u = es1Var;
        es1Var.set(1, db2.t4.f309704a.a(8259));
        es1Var.set(2, anchorUsername);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String str = e17.length() > 0 ? e17 : null;
        if (str != null) {
            es1Var.set(3, str);
        }
        es1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        es1Var.set(5, java.lang.Long.valueOf(j18));
        es1Var.set(6, java.lang.Long.valueOf(j17));
        es1Var.set(7, reqList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = es1Var;
        r45.fs1 fs1Var = new r45.fs1();
        fs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fs1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fs1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        lVar.f152200d = 8259;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fs1 resp = (r45.fs1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335094t, "[onCgiBack] scene:" + this.f335095u.m75942xfb822ef2(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
