package i06;

/* loaded from: classes15.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(i06.k1 k1Var) {
        super(0);
        this.f368284d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o06.g u17;
        h16.c cVar;
        int i17 = i06.k1.f368212g;
        i06.k1 k1Var = this.f368284d;
        n16.b v17 = k1Var.v();
        i06.f1 f1Var = (i06.f1) k1Var.f368214f.mo141623x754a37bb();
        f1Var.getClass();
        f06.v vVar = i06.o1.f368244b[0];
        java.lang.Object mo152xb9724478 = f1Var.f368245a.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        t06.k kVar = (t06.k) mo152xb9724478;
        b26.q qVar = kVar.f496075a;
        o06.v0 v0Var = qVar.f99017b;
        boolean z17 = v17.f415691c;
        java.lang.Class cls = k1Var.f368213e;
        o06.g b17 = (z17 && cls.isAnnotationPresent(p3321xbce91901.InterfaceC29042xe907df4f.class)) ? qVar.b(v17) : o06.l0.a(v0Var, v17);
        if (b17 != null) {
            return b17;
        }
        if (cls.isSynthetic()) {
            u17 = k1Var.u(v17, kVar);
        } else {
            t06.g a17 = t06.g.f496068c.a(cls);
            h16.b bVar = (a17 == null || (cVar = a17.f496070b) == null) ? null : cVar.f359762a;
            switch (bVar == null ? -1 : i06.g1.f368182a[bVar.ordinal()]) {
                case -1:
                case 6:
                    throw new i06.a4("Unresolved class: " + cls + " (kind = " + bVar + ')');
                case 0:
                default:
                    throw new jz5.j();
                case 1:
                case 2:
                case 3:
                case 4:
                    u17 = k1Var.u(v17, kVar);
                    break;
                case 5:
                    throw new i06.a4("Unknown class: " + cls + " (kind = " + bVar + ')');
            }
        }
        return u17;
    }
}
