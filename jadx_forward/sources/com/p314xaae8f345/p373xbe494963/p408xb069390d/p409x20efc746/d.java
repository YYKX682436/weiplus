package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* loaded from: classes14.dex */
final /* synthetic */ class d implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.d f128609a = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.d();

    private d() {
    }

    public static java.util.Comparator a() {
        return f128609a;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a aVar = (com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a) obj;
        com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a aVar2 = (com.p314xaae8f345.p373xbe494963.p408xb069390d.a.a) obj2;
        int i17 = aVar.f128523a;
        int i18 = aVar2.f128523a;
        if (i17 < i18) {
            return -1;
        }
        if (i17 == i18) {
            return aVar.f128524b - aVar2.f128524b;
        }
        return 1;
    }
}
