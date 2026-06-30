package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class g0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f272475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f272476e;

    public g0(java.util.Comparator comparator, java.util.HashMap hashMap) {
        this.f272475d = comparator;
        this.f272476e = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f272475d.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0 h0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a;
        java.util.HashMap hashMap = this.f272476e;
        return mz5.a.b(java.lang.Long.valueOf(h0Var.d((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj2, hashMap)), java.lang.Long.valueOf(h0Var.d((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj, hashMap)));
    }
}
