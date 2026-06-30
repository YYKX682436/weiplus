package rn2;

/* loaded from: classes.dex */
public final class x2 {
    public x2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List chooseProductList, java.util.List productList) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseProductList, "chooseProductList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productList, "productList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = chooseProductList.iterator();
        while (it.hasNext()) {
            r45.n30 n30Var = (r45.n30) it.next();
            java.util.Iterator it6 = productList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                r45.kv1 kv1Var = (r45.kv1) ((r45.wd4) obj).m75936x14adae67(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kv1Var != null ? kv1Var.m75945x2fec8307(0) : null, n30Var.m75945x2fec8307(0))) {
                    break;
                }
            }
            r45.wd4 wd4Var = (r45.wd4) obj;
            r45.kv1 kv1Var2 = wd4Var != null ? (r45.kv1) wd4Var.m75936x14adae67(1) : null;
            if (kv1Var2 != null) {
                arrayList.add(new rn2.y2(false, 0, n30Var, kv1Var2));
            }
        }
        return arrayList;
    }
}
