package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 f273625d;

    public x3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 c19656x5a7dec62) {
        this.f273625d = c19656x5a7dec62;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = this.f273625d.f271398s;
        g3Var.f272389s = 5;
        g3Var.f272390t.cancel();
        g3Var.invalidateSelf();
    }
}
