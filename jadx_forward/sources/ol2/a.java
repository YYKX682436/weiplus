package ol2;

/* loaded from: classes3.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ol2.b a(r45.o92 o92Var) {
        java.util.LinkedList m75941xfb821914;
        java.lang.String str;
        ol2.b bVar = new ol2.b();
        boolean z17 = false;
        if (o92Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList m75941xfb8219142 = o92Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getWording_list(...)");
            int i17 = 0;
            for (java.lang.Object obj : m75941xfb8219142) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ol2.c cVar = new ol2.c();
                cVar.f427678a = (java.lang.String) obj;
                java.util.LinkedList m75941xfb8219143 = o92Var.m75941xfb821914(3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getWording_type_list(...)");
                java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(m75941xfb8219143, i17);
                cVar.f427679b = 1;
                if (num != null && num.intValue() > 0) {
                    cVar.f427679b = java.lang.Integer.valueOf(num.intValue());
                }
                java.util.LinkedList m75941xfb8219144 = o92Var.m75941xfb821914(4);
                if (m75941xfb8219144 != null && (str = (java.lang.String) kz5.n0.a0(m75941xfb8219144, i17)) != null) {
                    cVar.f427680c = str;
                }
                arrayList.add(cVar);
                i17 = i18;
            }
            bVar.f427676a = arrayList;
            o92Var.m75939xb282bd08(1);
            o92Var.m75945x2fec8307(2);
        }
        if (o92Var != null && (m75941xfb821914 = o92Var.m75941xfb821914(3)) != null && m75941xfb821914.contains(4)) {
            z17 = true;
        }
        if (z17) {
            bVar.f427677b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575234op5);
        }
        return bVar;
    }
}
