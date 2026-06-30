package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class d0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f272465d;

    public d0(java.util.Comparator comparator) {
        this.f272465d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f272465d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj).f272559s, ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) obj2).f272559s);
    }
}
