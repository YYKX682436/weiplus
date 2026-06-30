package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f286358a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f286359b = new java.util.HashMap();

    public final void a(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        java.util.HashMap hashMap = this.f286358a;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f286359b;
        hashMap2.clear();
        int i17 = 0;
        for (java.lang.Object obj : items) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.k) obj;
            java.lang.String v17 = kVar.v();
            hashMap.put(v17, java.lang.Integer.valueOf(i17));
            hashMap2.put(v17, kVar.f286350d);
            i17 = i18;
        }
    }
}
