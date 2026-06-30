package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class tp implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f214679d;

    public tp(int i17) {
        this.f214679d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp) {
            return this.f214679d == ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp) obj).f214679d ? 0 : 1;
        }
        return 1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f214679d;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
