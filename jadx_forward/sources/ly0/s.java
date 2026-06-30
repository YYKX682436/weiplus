package ly0;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.v f403774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ly0.v vVar) {
        super(1);
        this.f403774d = vVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ly0.n nVar = this.f403774d.f403780b;
        if (nVar != null) {
            synchronized (nVar.f403758j) {
                switch (nVar.f403752d.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        nVar.f403752d = ly0.e.f403728h;
                        nVar.c();
                        nVar.d();
                        nVar.b();
                        yz5.l lVar = nVar.f403759k;
                        if (lVar != null) {
                            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new ly0.g(lVar, null), 2, null);
                            nVar.f403759k = null;
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
