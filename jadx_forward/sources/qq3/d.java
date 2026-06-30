package qq3;

/* loaded from: classes12.dex */
public final class d implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq3.e f447478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sq3.a f447479b;

    public d(qq3.e eVar, sq3.a aVar) {
        this.f447478a = eVar;
        this.f447479b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int ordinal = event.f152636a.ordinal();
        qq3.e eVar = this.f447478a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                qq3.i.e(eVar, 1, 0, 2, null);
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj((java.lang.String) ((jz5.n) eVar.f447483n).mo141623x754a37bb(), 3, null, null);
                bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                long j17 = eVar.f447494f;
                sq3.a aVar = this.f447479b;
                java.lang.String w07 = aVar.w0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getFromUser(...)");
                ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
                return;
            }
            if (ordinal == 2) {
                dn.g gVar = event.f152640e;
                if (gVar != null) {
                    eVar.f447495g = gVar.f69496x83ec3dd;
                }
                eVar.f();
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10 && ordinal != 11) {
                return;
            }
        }
        eVar.d(2, event.f152638c);
    }
}
