package c1;

/* loaded from: classes14.dex */
public final class m implements c1.k {

    /* renamed from: a, reason: collision with root package name */
    public final c1.p f119289a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.t f119290b;

    /* renamed from: c, reason: collision with root package name */
    public p2.s f119291c;

    public m(c1.p focusModifier, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        focusModifier = (i17 & 1) != 0 ? new c1.p(c1.j0.Inactive, null, 2, null) : focusModifier;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusModifier, "focusModifier");
        this.f119289a = focusModifier;
        t1.f fVar = c1.w.f119315a;
        this.f119290b = focusModifier.k(c1.w.f119316b);
    }

    public void a(boolean z17) {
        c1.j0 j0Var;
        c1.p pVar = this.f119289a;
        c1.j0 j0Var2 = pVar.f119300f;
        if (c1.k0.c(pVar, z17)) {
            int ordinal = j0Var2.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                j0Var = c1.j0.Active;
            } else if (ordinal == 3 || ordinal == 4) {
                j0Var = c1.j0.Deactivated;
            } else {
                if (ordinal != 5) {
                    throw new jz5.j();
                }
                j0Var = c1.j0.Inactive;
            }
            pVar.a(j0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r17) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.m.b(int):boolean");
    }
}
