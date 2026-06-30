package u26;

/* loaded from: classes14.dex */
public final class i implements p3325xe03a0797.p3326xc267989b.p3331x75e76af7.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.k f505686d;

    public i(u26.k kVar) {
        this.f505686d = kVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3331x75e76af7.g
    public void o(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar, yz5.p pVar) {
        u26.k kVar = this.f505686d;
        kVar.getClass();
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) hVar;
            if (fVar.y()) {
                return;
            }
            if (kVar.A()) {
                u26.e eVar = new u26.e(kVar, fVar, pVar, 1);
                boolean x17 = kVar.x(eVar);
                if (x17) {
                    fVar.u(eVar);
                }
                if (x17) {
                    return;
                }
            } else {
                java.lang.Object E = kVar.E(fVar);
                if (E == p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b) {
                    return;
                }
                if (E != u26.l.f505702d && E != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392019b) {
                    boolean z17 = E instanceof u26.e0;
                    if (!z17) {
                        if (z17) {
                            E = new u26.a0(((u26.e0) E).f505681g);
                        }
                        w26.a.a(pVar, new u26.c0(E), fVar);
                    } else if (fVar.B()) {
                        w26.a.a(pVar, new u26.c0(new u26.a0(((u26.e0) E).f505681g)), fVar);
                    }
                }
            }
        }
    }
}
