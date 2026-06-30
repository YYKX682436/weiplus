package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes9.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f274028a = new java.util.HashSet();

    public static boolean a(java.lang.String str) {
        java.util.Set set = f274028a;
        if (((java.util.HashSet) set).contains(str)) {
            return false;
        }
        return ((java.util.HashSet) set).add(str);
    }

    public static void b(java.lang.String str) {
        ((java.util.HashSet) f274028a).remove(str);
    }
}
