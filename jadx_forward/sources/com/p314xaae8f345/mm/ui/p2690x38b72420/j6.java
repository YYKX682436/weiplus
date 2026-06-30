package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static int f288492a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f288493b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f288494c;

    public static void a(java.util.List list) {
        java.util.List list2;
        if (f288493b != null && (list2 = f288494c) != null && list2.size() > 0 && list != null && list.size() > 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!((java.util.LinkedList) f288493b).contains(str)) {
                    if (f288494c.contains(str)) {
                        linkedList.add(str);
                    } else {
                        linkedList2.add(str);
                    }
                }
            }
            for (int i17 = 0; i17 < f288494c.size(); i17++) {
                if (linkedList.contains(f288494c.get(i17))) {
                    linkedList3.add("" + i17);
                }
            }
            if (linkedList.size() > 0 || linkedList2.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18637, java.lang.Integer.valueOf(f288492a), android.text.TextUtils.join(";", f288493b), android.text.TextUtils.join(";", f288494c), android.text.TextUtils.join(";", linkedList), android.text.TextUtils.join(";", linkedList2), android.text.TextUtils.join(";", linkedList3));
            }
        }
        f288493b = null;
        f288494c = null;
    }
}
