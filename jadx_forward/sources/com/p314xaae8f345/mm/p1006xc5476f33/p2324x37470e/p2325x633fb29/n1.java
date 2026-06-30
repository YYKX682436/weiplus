package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class n1 implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f257230a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f257231b;

    /* renamed from: c, reason: collision with root package name */
    public final uq5.p f257232c;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition, java.util.HashMap labelMap, uq5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelMap, "labelMap");
        this.f257230a = composition;
        this.f257231b = labelMap;
        this.f257232c = pVar;
    }

    @Override // wm5.f
    public void a(long j17) {
        uq5.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.c(this.f257230a, j17);
        java.lang.Integer num = (java.lang.Integer) this.f257231b.get(c17 != null ? c17.f257149a : null);
        int intValue = num != null ? num.intValue() : -1;
        if (!((java.util.ArrayList) so4.g.f492317i).contains(java.lang.Integer.valueOf(intValue)) || (pVar = this.f257232c) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83860x6315c81d(pVar.f511802c, intValue);
    }

    @Override // wm5.f
    public void b() {
    }
}
