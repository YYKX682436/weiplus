package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static final java.lang.String a() {
        java.util.Collection collection;
        java.lang.String a17 = bm5.f1.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return "_MM_";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        java.util.List g17 = new r26.t(":").g(a17, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (strArr.length < 2) {
            return "_others_";
        }
        return "_" + strArr[1] + '_';
    }
}
