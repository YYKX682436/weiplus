package o26;

/* loaded from: classes15.dex */
public abstract class h {
    public static /* synthetic */ void a(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i17) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i17) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static java.lang.Object b(java.util.Collection collection, o26.d dVar, o26.e eVar) {
        if (collection == null) {
            a(4);
            throw null;
        }
        if (dVar == null) {
            a(5);
            throw null;
        }
        if (eVar == null) {
            a(6);
            throw null;
        }
        o26.g gVar = new o26.g();
        if (collection == null) {
            a(0);
            throw null;
        }
        if (dVar == null) {
            a(1);
            throw null;
        }
        if (eVar == null) {
            a(3);
            throw null;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(it.next(), dVar, gVar, eVar);
        }
        return eVar.a();
    }

    public static void c(java.lang.Object obj, o26.d dVar, o26.f fVar, o26.e eVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (dVar == null) {
            a(23);
            throw null;
        }
        if (fVar == null) {
            a(24);
            throw null;
        }
        if (eVar == null) {
            a(25);
            throw null;
        }
        if (((o26.g) fVar).f424134a.add(obj) && eVar.b(obj)) {
            java.util.Iterator it = dVar.a(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), dVar, fVar, eVar);
            }
            eVar.c(obj);
        }
    }

    public static java.lang.Boolean d(java.util.Collection collection, o26.d dVar, yz5.l lVar) {
        if (collection == null) {
            a(7);
            throw null;
        }
        if (dVar == null) {
            a(8);
            throw null;
        }
        if (lVar != null) {
            return (java.lang.Boolean) b(collection, dVar, new o26.b(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }
}
