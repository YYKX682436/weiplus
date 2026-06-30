package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f283495a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f283496b;

    public c(yb5.d dVar) {
        this.f283496b = dVar;
    }

    public yn.e a(java.lang.Class cls) {
        if (cls.isInterface()) {
            java.util.HashMap hashMap = this.f283495a;
            if (hashMap.containsKey(cls)) {
                return (yn.e) hashMap.get(cls);
            }
            return null;
        }
        throw new java.lang.RuntimeException("[get] " + cls + " is not a interface!");
    }
}
