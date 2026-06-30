package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26;

/* loaded from: classes8.dex */
public class f implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f223636d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223637e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c cVar, int i17, java.lang.String str) {
        this.f223636d = str;
        this.f223637e = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var) {
        if (!(r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f)) {
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f) r0Var;
        return (this.f223637e == fVar.f223637e && android.text.TextUtils.equals(this.f223636d, fVar.f223636d)) ? 0 : 1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f223637e;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
