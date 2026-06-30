package il4;

/* loaded from: classes2.dex */
public final class k implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f373673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f373674e;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f373673d = c0Var;
        this.f373674e = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback " + i17 + ", " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f373673d;
        if (c0Var.f391645d) {
            return 0;
        }
        c0Var.f391645d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback errType: " + i17 + ", errCode: " + i18);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f373674e;
        if (i17 == 0 && i18 == 0) {
            try {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152244b.f152233a;
                if (!(fVar instanceof qk.t9)) {
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                    return 0;
                }
                bw5.e50 mo11468x92b714fd = new bw5.e50().mo11468x92b714fd(((qk.t9) fVar).f445871d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo11468x92b714fd.f108265d, "getItems(...)");
                if (!r6.isEmpty()) {
                    bw5.o50 o50Var = (bw5.o50) mo11468x92b714fd.f108265d.get(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback type: " + o50Var.f112497n + ", name: " + o50Var.m12637xfb82e301());
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(o50Var));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicUtils", "getCategoryItem failed itemsCount == 0");
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingMusicUtils", th6, "getCategoryItem callback exception", new java.lang.Object[0]);
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicUtils", "getCategoryItem failed");
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return 0;
    }
}
