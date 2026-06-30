package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d0 f171147e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d0 d0Var, android.graphics.Bitmap bitmap) {
        this.f171147e = d0Var;
        this.f171146d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d0 d0Var = this.f171147e;
        d0Var.f171187d.R(this.f171146d);
        d0Var.f171187d.T(0);
        d0Var.f171187d.Y(0);
    }
}
