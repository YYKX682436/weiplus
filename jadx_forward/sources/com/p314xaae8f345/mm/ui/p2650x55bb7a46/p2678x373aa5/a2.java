package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class a2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f284409d;

    public a2(java.util.HashMap hashMap) {
        this.f284409d = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long valueOf = java.lang.Long.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2) obj).f284627a);
        java.util.HashMap hashMap = this.f284409d;
        java.lang.Float f17 = (java.lang.Float) hashMap.get(valueOf);
        if (f17 == null) {
            f17 = java.lang.Float.valueOf(Float.MAX_VALUE);
        }
        java.lang.Float f18 = (java.lang.Float) hashMap.get(java.lang.Long.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2) obj2).f284627a));
        if (f18 == null) {
            f18 = java.lang.Float.valueOf(Float.MAX_VALUE);
        }
        return mz5.a.b(f17, f18);
    }
}
