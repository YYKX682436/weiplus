package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a0 f171891e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a0 a0Var, android.graphics.Bitmap bitmap) {
        this.f171891e = a0Var;
        this.f171890d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a0 a0Var = this.f171891e;
        a0Var.f171031d.R(this.f171890d);
        a0Var.f171031d.T(0);
        a0Var.f171031d.Y(0);
    }
}
