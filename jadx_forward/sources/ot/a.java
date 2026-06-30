package ot;

/* loaded from: classes12.dex */
public abstract class a {
    public static final v05.a a(r05.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        java.lang.Object m126734x4dcbcf6d = kVar.m126734x4dcbcf6d("appattach");
        if (m126734x4dcbcf6d instanceof v05.a) {
            return (v05.a) m126734x4dcbcf6d;
        }
        return null;
    }

    public static final r05.k b(l15.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        java.lang.Object m126734x4dcbcf6d = aVar.m126734x4dcbcf6d("appmsg");
        if (m126734x4dcbcf6d instanceof r05.k) {
            return (r05.k) m126734x4dcbcf6d;
        }
        return null;
    }

    public static final int c(l15.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        java.lang.Object m126734x4dcbcf6d = aVar.m126734x4dcbcf6d("appmsg");
        if (m126734x4dcbcf6d instanceof e14.k) {
            java.lang.Object m126734x4dcbcf6d2 = ((e14.k) m126734x4dcbcf6d).m126734x4dcbcf6d("type");
            if (m126734x4dcbcf6d2 instanceof java.lang.Integer) {
                return ((java.lang.Number) m126734x4dcbcf6d2).intValue();
            }
        }
        return 0;
    }

    public static final int d(r05.k kVar) {
        c15.b j17;
        c15.c j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        java.lang.Object m126734x4dcbcf6d = kVar.m126734x4dcbcf6d("mmreader");
        if (!(m126734x4dcbcf6d instanceof c15.a) || (j17 = ((c15.a) m126734x4dcbcf6d).j()) == null || (j18 = j17.j()) == null) {
            return 0;
        }
        return j18.j();
    }

    public static final int e(r05.k kVar) {
        c15.d k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        java.lang.Object m126734x4dcbcf6d = kVar.m126734x4dcbcf6d("mmreader");
        if (!(m126734x4dcbcf6d instanceof c15.a) || (k17 = ((c15.a) m126734x4dcbcf6d).k()) == null) {
            return 0;
        }
        return k17.j();
    }
}
