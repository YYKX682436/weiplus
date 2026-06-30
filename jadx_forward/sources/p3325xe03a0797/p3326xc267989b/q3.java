package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class q3 extends p3325xe03a0797.p3326xc267989b.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h f392105h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f392106i;

    public q3(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar, yz5.p pVar) {
        this.f392105h = hVar;
        this.f392106i = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f384359a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.g0
    public void u(java.lang.Throwable th6) {
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) this.f392105h;
        if (fVar.B()) {
            p3325xe03a0797.p3326xc267989b.c3 w17 = w();
            yz5.p pVar = this.f392106i;
            java.lang.Object P = w17.P();
            if (P instanceof p3325xe03a0797.p3326xc267989b.e0) {
                fVar.A(((p3325xe03a0797.p3326xc267989b.e0) P).f391705a);
                return;
            }
            java.lang.Object a17 = p3325xe03a0797.p3326xc267989b.d3.a(P);
            fVar.getClass();
            try {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(pz5.f.a(pVar, a17, fVar));
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.a(b17, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a), null);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                fVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7)));
                throw th7;
            }
        }
    }
}
