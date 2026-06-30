package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f273588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e f273589e;

    public d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e, boolean z17) {
        this.f273589e = c19758xc331845e;
        this.f273588d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = this.f273589e.f273580s;
        g3Var.getClass();
        if (!this.f273588d) {
            g3Var.f272389s = 3;
        }
        g3Var.f272387q = true;
        g3Var.invalidateSelf();
    }
}
