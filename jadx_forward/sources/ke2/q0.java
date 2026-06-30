package ke2;

/* loaded from: classes.dex */
public final class q0 extends az2.j {

    /* renamed from: w, reason: collision with root package name */
    public static final ke2.p0 f388514w = new ke2.p0(null);

    /* renamed from: t, reason: collision with root package name */
    public final gk2.e f388515t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.r f388516u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f388517v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r45.ch1 appMsg, gk2.e roomData, r45.qt2 qt2Var, yz5.r rVar) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomData, "roomData");
        int i17 = 2;
        this.f388515t = roomData;
        this.f388516u = rVar;
        this.f388517v = "Finder.CgiFinderPostLiveAppMsg";
        r45.sp2 sp2Var = new r45.sp2();
        sp2Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) ((mm2.c1) roomData.a(mm2.c1.class)).m147920xbba4bfc0(mm2.e1.class)).f410518o));
        sp2Var.set(3, appMsg);
        sp2Var.set(4, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        sp2Var.set(5, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410516m));
        sp2Var.set(6, ((mm2.e1) roomData.a(mm2.e1.class)).f410525v);
        if (zl2.r4.f555483a.w1()) {
            i17 = 1;
        } else {
            if (((mm2.n0) roomData.a(mm2.n0.class)).f410806r) {
                i17 = 16;
            }
        }
        sp2Var.set(7, java.lang.Integer.valueOf(i17));
        sp2Var.set(8, xy2.c.f(qt2Var));
        db2.t4 t4Var = db2.t4.f309704a;
        sp2Var.set(1, t4Var.a(6888));
        t4Var.h((r45.kv0) sp2Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410516m), ((mm2.e1) roomData.a(mm2.e1.class)).f410517n)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sp2Var;
        r45.tp2 tp2Var = new r45.tp2();
        tp2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tp2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tp2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        lVar.f152200d = 6888;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderPostLiveAppMsg init ");
        sb6.append(sp2Var.m75942xfb822ef2(4));
        sb6.append(",msgType ");
        r45.ch1 ch1Var = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var != null ? java.lang.Integer.valueOf(ch1Var.m75939xb282bd08(1)) : null);
        sb6.append(",is_float:");
        r45.ch1 ch1Var2 = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var2 != null ? java.lang.Integer.valueOf(ch1Var2.m75939xb282bd08(9)) : null);
        sb6.append(",floatType:");
        r45.ch1 ch1Var3 = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var3 != null ? java.lang.Integer.valueOf(ch1Var3.m75939xb282bd08(10)) : null);
        sb6.append(", replyMsgSeq:");
        r45.ch1 ch1Var4 = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var4 != null ? java.lang.Long.valueOf(ch1Var4.m75942xfb822ef2(3)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPostLiveAppMsg", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tp2 resp = (r45.tp2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", toastInfo:");
        r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
        sb6.append(zm6Var != null ? java.lang.Boolean.valueOf(zm6Var.m75933x41a8a7f2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388517v, sb6.toString());
        zl2.r4 r4Var = zl2.r4.f555483a;
        int m75939xb282bd08 = resp.m75939xb282bd08(6);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r4Var.K(m75939xb282bd08, context, this.f388515t);
        yz5.r rVar = this.f388516u;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, resp);
        }
    }
}
