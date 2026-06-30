package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes5.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f271222a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.List f271223b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        f271222a = hashMap;
        hashMap.put(161516564, new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n());
        f271223b = null;
    }

    public static java.util.Collection a() {
        if (f271223b != null) {
            return f271223b;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = f271222a.keySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o oVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) f271222a.get(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
            if (oVar != null) {
                linkedList.add(oVar);
            }
        }
        f271223b = linkedList;
        return linkedList;
    }
}
