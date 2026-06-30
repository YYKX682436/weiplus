package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ae implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ae f210393d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ae();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        xk0.p o17 = (xk0.p) obj;
        xk0.p o27 = (xk0.p) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o17, "o1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o27, "o2");
        int compare = java.lang.Float.compare(o17.f536488m.y, o27.f536488m.y);
        return compare == 0 ? java.lang.Float.compare(o17.f536488m.x, o27.f536488m.x) : compare;
    }
}
