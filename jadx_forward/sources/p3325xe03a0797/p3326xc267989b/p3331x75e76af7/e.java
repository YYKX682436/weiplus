package p3325xe03a0797.p3326xc267989b.p3331x75e76af7;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f f392166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f392167e;

    public e(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar, yz5.l lVar) {
        this.f392166d = fVar;
        this.f392167e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> bVar;
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = this.f392166d;
        if (fVar.B()) {
            yz5.l lVar = this.f392167e;
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
                if (lVar instanceof qz5.a) {
                    bVar = ((qz5.a) lVar).mo2108xaf65a0fc(fVar);
                } else {
                    oz5.l mo48699x76847179 = fVar.mo48699x76847179();
                    bVar = mo48699x76847179 == oz5.m.f431862d ? new pz5.b(fVar, lVar) : new pz5.c(fVar, mo48699x76847179, lVar);
                }
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(bVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.b(b17, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a), null, 2, null);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                fVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
                throw th6;
            }
        }
    }
}
