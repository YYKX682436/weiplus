package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class me {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f283520a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f283521b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f283522c = new java.util.LinkedList();

    public static android.view.View a(int i17) {
        java.util.LinkedList linkedList = i17 == 1 ? f283520a : i17 == 2 ? f283521b : f283522c;
        if (linkedList.size() != 0) {
            return (android.view.View) linkedList.removeFirst();
        }
        return null;
    }

    public static void b(android.view.View view, int i17) {
        java.util.LinkedList linkedList = i17 == 1 ? f283520a : i17 == 2 ? f283521b : f283522c;
        if (linkedList.size() >= 35) {
            linkedList.removeFirst();
        }
        linkedList.addLast(view);
    }
}
