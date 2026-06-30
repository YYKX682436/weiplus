package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f262331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y8 f262332e;

    public x8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y8 y8Var, boolean z17) {
        this.f262332e = y8Var;
        this.f262331d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f262331d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y8 y8Var = this.f262332e;
        if (z17) {
            y8Var.f262348a.f261632g.fullScroll(130);
        } else {
            y8Var.f262348a.f261632g.fullScroll(33);
        }
    }
}
