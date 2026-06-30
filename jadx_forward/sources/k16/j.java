package k16;

/* loaded from: classes16.dex */
public abstract class j {
    public static final i16.l1 a(i16.l1 l1Var, k16.k typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = l1Var.f369115f;
        if ((i17 & 256) == 256) {
            return l1Var.f369125s;
        }
        if ((i17 & 512) == 512) {
            return typeTable.a(l1Var.f369126t);
        }
        return null;
    }

    public static final i16.l1 b(i16.j0 j0Var, k16.k typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = j0Var.f369059f;
        if ((i17 & 32) == 32) {
            return j0Var.f369066p;
        }
        if ((i17 & 64) == 64) {
            return typeTable.a(j0Var.f369067q);
        }
        return null;
    }

    public static final i16.l1 c(i16.j0 j0Var, k16.k typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = j0Var.f369059f;
        if ((i17 & 8) == 8) {
            i16.l1 l1Var = j0Var.f369063m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l1Var, "getReturnType(...)");
            return l1Var;
        }
        if ((i17 & 16) == 16) {
            return typeTable.a(j0Var.f369064n);
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final i16.l1 d(i16.u0 u0Var, k16.k typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = u0Var.f369295f;
        if ((i17 & 8) == 8) {
            i16.l1 l1Var = u0Var.f369299m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l1Var, "getReturnType(...)");
            return l1Var;
        }
        if ((i17 & 16) == 16) {
            return typeTable.a(u0Var.f369300n);
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final i16.l1 e(i16.y1 y1Var, k16.k typeTable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        int i17 = y1Var.f369355f;
        if ((i17 & 4) == 4) {
            i16.l1 l1Var = y1Var.f369358i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l1Var, "getType(...)");
            return l1Var;
        }
        if ((i17 & 8) == 8) {
            return typeTable.a(y1Var.f369359m);
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
