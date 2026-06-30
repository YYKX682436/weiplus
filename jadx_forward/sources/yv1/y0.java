package yv1;

/* loaded from: classes10.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final yv1.y0 f547724d = new yv1.y0();

    public y0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List linkedFileIndexList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedFileIndexList, "linkedFileIndexList");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj3 : linkedFileIndexList) {
            java.lang.String str = ((ot1.h) ((ot1.i) obj3)).f68230xdec927b;
            if (str == null) {
                str = "";
            }
            java.lang.Object obj4 = linkedHashMap.get(str);
            if (obj4 == null) {
                obj4 = new java.util.ArrayList();
                linkedHashMap.put(str, obj4);
            }
            ((java.util.List) obj4).add(obj3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.List list = (java.util.List) ((java.util.Map.Entry) it.next()).getValue();
            java.util.Iterator it6 = list.iterator();
            if (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (it6.hasNext()) {
                    long j17 = ((ot1.h) ((ot1.i) next)).f68226xc4b8ff89;
                    do {
                        java.lang.Object next2 = it6.next();
                        long j18 = ((ot1.h) ((ot1.i) next2)).f68226xc4b8ff89;
                        if (j17 > j18) {
                            next = next2;
                            j17 = j18;
                        }
                    } while (it6.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            ot1.i iVar = (ot1.i) obj2;
            if (iVar != null) {
                list = kz5.b0.c(iVar);
            }
            kz5.h0.u(arrayList, list);
        }
        return kz5.n0.F0(arrayList, new yv1.x0());
    }
}
