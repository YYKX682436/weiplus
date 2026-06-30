package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public int f275390a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f275391b = new java.util.LinkedList();

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hasNew: ");
        sb6.append(this.f275390a);
        sb6.append(", ");
        java.util.LinkedList linkedList = this.f275391b;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDesignerProductList", sb6.toString());
        int i17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if ((linkedList instanceof java.util.Collection) && linkedList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((long) ((z85.a) it.next()).f68245x8a0c25ad) > ((long) i17) - 2592000) {
                return true;
            }
        }
        return false;
    }
}
