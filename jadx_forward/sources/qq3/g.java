package qq3;

/* loaded from: classes12.dex */
public final class g implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq3.h f447486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sq3.a f447487b;

    public g(qq3.h hVar, sq3.a aVar) {
        this.f447486a = hVar;
        this.f447487b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int ordinal = event.f152636a.ordinal();
        qq3.h hVar = this.f447486a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                qq3.i.e(hVar, 1, 0, 2, null);
                a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
                jz5.g gVar = hVar.f447489i;
                ((t02.e) iVar).bj((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb(), 3, null, null);
                if (hVar.f447491n > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f447490m)) {
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).fj((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb(), 3, hVar.f447490m, hVar.f447491n, null);
                }
                bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                long j17 = hVar.f447494f;
                sq3.a aVar = this.f447487b;
                java.lang.String w07 = aVar.w0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getFromUser(...)");
                ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
                return;
            }
            if (ordinal == 2) {
                dn.g gVar2 = event.f152640e;
                if (gVar2 != null) {
                    hVar.f447495g = gVar2.f69496x83ec3dd;
                }
                hVar.f();
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10 && ordinal != 11) {
                return;
            }
        }
        hVar.d(2, event.f152638c);
    }
}
