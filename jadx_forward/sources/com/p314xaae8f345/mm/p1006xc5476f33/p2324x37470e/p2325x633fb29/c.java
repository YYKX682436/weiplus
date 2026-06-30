package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes5.dex */
public final class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.c f257104d = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        int i17 = aVar.f257073d;
        int i18 = aVar2.f257073d;
        if (i18 < i17) {
            return -1;
        }
        return i17 < i18 ? 1 : 0;
    }
}
