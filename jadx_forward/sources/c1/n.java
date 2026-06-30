package c1;

/* loaded from: classes14.dex */
public abstract class n {
    public static final c1.p a(c1.p pVar) {
        c1.p a17;
        int ordinal = pVar.f119300f.ordinal();
        if (ordinal == 0) {
            return pVar;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return pVar;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new jz5.j();
                    }
                }
            }
            return null;
        }
        c1.p pVar2 = pVar.f119301g;
        if (pVar2 == null || (a17 = a(pVar2)) == null) {
            throw new java.lang.IllegalStateException("no child".toString());
        }
        return a17;
    }

    public static final void b(c1.p pVar) {
        c1.b0.a(pVar);
        o0.i iVar = pVar.f119299e;
        int i17 = iVar.f423385f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i18 = 0;
            do {
                b((c1.p) objArr[i18]);
                i18++;
            } while (i18 < i17);
        }
    }
}
