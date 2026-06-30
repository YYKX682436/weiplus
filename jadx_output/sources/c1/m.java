package c1;

/* loaded from: classes14.dex */
public final class m implements c1.k {

    /* renamed from: a, reason: collision with root package name */
    public final c1.p f37756a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.t f37757b;

    /* renamed from: c, reason: collision with root package name */
    public p2.s f37758c;

    public m(c1.p focusModifier, int i17, kotlin.jvm.internal.i iVar) {
        focusModifier = (i17 & 1) != 0 ? new c1.p(c1.j0.Inactive, null, 2, null) : focusModifier;
        kotlin.jvm.internal.o.g(focusModifier, "focusModifier");
        this.f37756a = focusModifier;
        t1.f fVar = c1.w.f37782a;
        this.f37757b = focusModifier.k(c1.w.f37783b);
    }

    public void a(boolean z17) {
        c1.j0 j0Var;
        c1.p pVar = this.f37756a;
        c1.j0 j0Var2 = pVar.f37767f;
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
