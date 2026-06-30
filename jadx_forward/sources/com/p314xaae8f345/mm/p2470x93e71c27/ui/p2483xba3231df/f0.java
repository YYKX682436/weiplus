package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class f0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f272472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f272473e;

    public f0(java.util.Comparator comparator, boolean z17) {
        this.f272472d = comparator;
        this.f272473e = z17;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f272472d.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj2;
        boolean z17 = this.f272473e;
        return mz5.a.b((z17 && wVar.f272552i) ? 1 : 0, (z17 && ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj).f272552i) ? 1 : 0);
    }
}
