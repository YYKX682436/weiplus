package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx3.e f240017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 f240018e;

    public s1(qx3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var) {
        this.f240017d = eVar;
        this.f240018e = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f240017d.f448884a == c01.z1.r().hashCode()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var = this.f240018e;
            x1Var.f240075e = true;
            cy3.d dVar = x1Var.f240074d;
            if (dVar != null) {
                dVar.b(true);
            }
        }
    }
}
