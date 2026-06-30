package s16;

/* loaded from: classes16.dex */
public abstract class f {
    public static final f26.l2 a(f26.l2 l2Var, o06.e2 e2Var) {
        if (e2Var == null || l2Var.c() == f26.d3.f340676f) {
            return l2Var;
        }
        if (e2Var.q() != l2Var.c()) {
            s16.c cVar = new s16.c(l2Var);
            f26.r1.f340747e.getClass();
            return new f26.n2(new s16.a(l2Var, cVar, false, f26.r1.f340748f));
        }
        if (!l2Var.b()) {
            return new f26.n2(l2Var.mo128949xfb85f7b0());
        }
        e26.c0 NO_LOCKS = e26.u.f328570e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NO_LOCKS, "NO_LOCKS");
        return new f26.n2(new f26.u0(NO_LOCKS, new s16.d(l2Var)));
    }

    public static f26.q2 b(f26.q2 q2Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(q2Var, "<this>");
        if (!(q2Var instanceof f26.i0)) {
            return new s16.e(q2Var, z17);
        }
        f26.i0 i0Var = (f26.i0) q2Var;
        f26.l2[] l2VarArr = i0Var.f340707c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l2VarArr, "<this>");
        o06.e2[] other = i0Var.f340706b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int min = java.lang.Math.min(l2VarArr.length, other.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(min);
        for (int i18 = 0; i18 < min; i18++) {
            arrayList.add(new jz5.l(l2VarArr[i18], other[i18]));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            arrayList2.add(a((f26.l2) lVar.f384366d, (o06.e2) lVar.f384367e));
        }
        return new f26.i0(other, (f26.l2[]) arrayList2.toArray(new f26.l2[0]), z17);
    }
}
