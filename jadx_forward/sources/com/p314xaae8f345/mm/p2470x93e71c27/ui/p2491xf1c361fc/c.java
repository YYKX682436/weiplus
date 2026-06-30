package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e f273587d;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e) {
        this.f273587d = c19758xc331845e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = this.f273587d.f273580s;
        g3Var.f272389s = 5;
        g3Var.f272390t.cancel();
        g3Var.invalidateSelf();
    }
}
