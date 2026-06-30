package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f262199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w3 f262200e;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w3 w3Var, boolean z17) {
        this.f262200e = w3Var;
        this.f262199d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f262199d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w3 w3Var = this.f262200e;
        if (z17) {
            w3Var.f262294a.f261518m.fullScroll(130);
        } else {
            w3Var.f262294a.f261518m.fullScroll(33);
        }
    }
}
