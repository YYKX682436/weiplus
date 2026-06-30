package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f264160b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f264159a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f264161c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f264162d = new java.util.HashMap();

    public static java.lang.String a(sd.u0 u0Var) {
        return "luggage_page_" + u0Var.hashCode();
    }

    public static java.util.LinkedList b() {
        java.util.LinkedList linkedList;
        synchronized (f264159a) {
            linkedList = new java.util.LinkedList(f264161c);
        }
        return linkedList;
    }
}
