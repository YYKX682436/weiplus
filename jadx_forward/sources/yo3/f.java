package yo3;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final yo3.f f545678a;

    /* renamed from: b, reason: collision with root package name */
    public static yo3.d f545679b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f545680c;

    static {
        yo3.f fVar = new yo3.f();
        f545678a = fVar;
        f545680c = new java.util.ArrayList();
        fVar.b();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a(boolean z17) {
        yo3.d dVar = f545679b;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sImpl");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c17 = dVar.c(z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPriorBankcard: ");
        sb6.append(c17 != null ? c17.f69223x58802fcb : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePriorBankcardLogic", sb6.toString());
        return c17;
    }

    public final void b() {
        yo3.d aVar;
        boolean z17 = yo3.m.f() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePriorBankcardLogic", "isOnlineToken: " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePriorBankcardLogic", "create online store");
            aVar = new yo3.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePriorBankcardLogic", "create legacy store");
            aVar = new yo3.a();
        }
        f545679b = aVar;
        c();
    }

    public final void c() {
        yo3.d dVar = f545679b;
        if (dVar != null) {
            dVar.mo177433xc84a8199();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sImpl");
            throw null;
        }
    }
}
