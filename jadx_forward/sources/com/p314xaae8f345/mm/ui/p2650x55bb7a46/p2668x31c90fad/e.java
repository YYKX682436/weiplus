package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes9.dex */
public class e implements j45.h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f283498b = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f283499a;

    public e(yb5.d dVar) {
        this.f283499a = new java.lang.ref.WeakReference(dVar);
    }

    public void a(android.content.Intent intent, int i17, j45.g gVar) {
        yb5.d dVar = (yb5.d) this.f283499a.get();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar != null ? dVar.f542250l : null;
        if (abstractC21611x7536149b == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = f283498b;
        java.util.HashMap hashMap = (java.util.HashMap) weakHashMap.get(abstractC21611x7536149b);
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
            weakHashMap.put(abstractC21611x7536149b, hashMap);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.d(this, abstractC21611x7536149b));
        }
        hashMap.put(java.lang.Integer.valueOf(i17), gVar);
        abstractC21611x7536149b.m7587x5dc77fb5(intent, i17);
    }
}
