package n0;

/* loaded from: classes14.dex */
public final class m3 {
    public m3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(n0.m3 m3Var, n0.n3 n3Var) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var;
        p0.g gVar;
        s0.b bVar;
        m3Var.getClass();
        do {
            h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) n0.b4.f414976r;
            gVar = (p0.g) h3Var.mo144003x754a37bb();
            bVar = (s0.b) gVar;
            r0.d dVar = bVar.f483377f;
            s0.a aVar = (s0.a) dVar.get(n3Var);
            if (aVar != null) {
                int hashCode = n3Var != null ? n3Var.hashCode() : 0;
                r0.u uVar = dVar.f449496d;
                r0.u v17 = uVar.v(hashCode, n3Var, 0);
                if (uVar != v17) {
                    dVar = v17 == null ? r0.d.f449495f : new r0.d(v17, dVar.f449497e - 1);
                }
                t0.b bVar2 = t0.b.f495794a;
                java.lang.Object obj = aVar.f483372a;
                boolean z17 = obj != bVar2;
                java.lang.Object obj2 = aVar.f483373b;
                if (z17) {
                    java.lang.Object obj3 = dVar.get(obj);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                    dVar = dVar.b(obj, new s0.a(((s0.a) obj3).f483372a, obj2));
                }
                if (obj2 != bVar2) {
                    java.lang.Object obj4 = dVar.get(obj2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                    dVar = dVar.b(obj2, new s0.a(obj, ((s0.a) obj4).f483373b));
                }
                java.lang.Object obj5 = !(obj != bVar2) ? obj2 : bVar.f483375d;
                if (obj2 != bVar2) {
                    obj = bVar.f483376e;
                }
                bVar = new s0.b(obj5, obj, dVar);
            }
            if (gVar == bVar) {
                return;
            }
        } while (!h3Var.j(gVar, bVar));
    }
}
