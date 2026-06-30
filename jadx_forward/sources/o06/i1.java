package o06;

/* loaded from: classes15.dex */
public abstract class i1 {
    public static final void a(o06.e1 e1Var, n16.c fqName, java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        if (e1Var instanceof o06.j1) {
            ((o06.j1) e1Var).a(fqName, packageFragments);
        } else {
            packageFragments.addAll(e1Var.b(fqName));
        }
    }

    public static final boolean b(o06.e1 e1Var, n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return e1Var instanceof o06.j1 ? ((o06.j1) e1Var).c(fqName) : ((java.util.ArrayList) c(e1Var, fqName)).isEmpty();
    }

    public static final java.util.List c(o06.e1 e1Var, n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(e1Var, fqName, arrayList);
        return arrayList;
    }
}
