package on2;

/* loaded from: classes3.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f428609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(r45.cz1 cz1Var, on2.z2 z2Var) {
        super(0);
        this.f428609d = cz1Var;
        this.f428610e = z2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m75945x2fec8307;
        java.lang.Object obj;
        r45.cz1 cz1Var;
        on2.z2 z2Var = this.f428610e;
        r45.cz1 cz1Var2 = this.f428609d;
        if (cz1Var2 != null && (m75945x2fec8307 = cz1Var2.m75945x2fec8307(0)) != null) {
            java.util.Iterator it = z2Var.f428624i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.cz1 cz1Var3 = ((km2.z) next).f390765d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cz1Var3 != null ? cz1Var3.m75945x2fec8307(0) : null, m75945x2fec8307)) {
                    obj = next;
                    break;
                }
            }
            km2.z zVar = (km2.z) obj;
            if (zVar != null && ((cz1Var = zVar.f390765d) == null || z2Var.U6(cz1Var2, cz1Var))) {
                zVar.f390765d = cz1Var2;
            }
        }
        z2Var.Z6("update", false);
        return jz5.f0.f384359a;
    }
}
