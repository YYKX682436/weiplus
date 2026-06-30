package df2;

/* loaded from: classes3.dex */
public final class mm extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f312320a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f312321b;

    public mm(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f312320a = liveContext;
        this.f312321b = "Finder.LiveInsertGiftNotifyInterceptor";
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        r45.ta4 e17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.ta4 e18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (e18 = nVar.e()) != null && (m75934xbce7f2f2 = e18.m75934xbce7f2f(11)) != null) {
            d(respWrapper, m75934xbce7f2f2, null);
            km2.n nVar2 = dk2.ef.H;
            r45.ta4 e19 = nVar2 != null ? nVar2.e() : null;
            if (e19 != null) {
                e19.set(11, null);
            }
        }
        km2.n nVar3 = dk2.ef.H;
        if (nVar3 == null || (e17 = nVar3.e()) == null || (m75934xbce7f2f = e17.m75934xbce7f2f(16)) == null) {
            return true;
        }
        r45.ch1 ch1Var = new r45.ch1();
        try {
            ch1Var.mo11468x92b714fd(m75934xbce7f2f.g());
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e27);
            ch1Var = null;
        }
        if (ch1Var != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = ch1Var.m75934xbce7f2f(4);
            r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
            if (m75934xbce7f2f3 != null) {
                d(respWrapper, m75934xbce7f2f3, xn1Var);
            }
        }
        dk2.ef efVar2 = dk2.ef.f314905a;
        km2.n nVar4 = dk2.ef.H;
        r45.ta4 e28 = nVar4 != null ? nVar4.e() : null;
        if (e28 == null) {
            return true;
        }
        e28.set(16, null);
        return true;
    }

    public final void d(we2.b bVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.xn1 xn1Var) {
        java.util.LinkedList m75941xfb821914;
        r45.r71 r71Var = bVar.f526747a;
        if (r71Var == null || (m75941xfb821914 = r71Var.m75941xfb821914(14)) == null) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20009);
        ch1Var.set(4, gVar);
        ch1Var.set(2, zl2.q4.f555466a.m());
        r45.xn1 xn1Var2 = new r45.xn1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76240x66bc2758(((mm2.c1) this.f312320a.a(mm2.c1.class)).f410385o);
        xn1Var2.set(0, c19782x23db1cfa);
        ch1Var.set(0, xn1Var2);
        ch1Var.set(13, xn1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312321b, "insert liveappmsg:" + ch1Var.hashCode() + ", client_msg_id:" + ch1Var.m75945x2fec8307(2));
        m75941xfb821914.add(ch1Var);
    }
}
