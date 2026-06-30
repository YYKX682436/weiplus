package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0 f234911e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0 a0Var, android.graphics.Bitmap bitmap) {
        this.f234911e = a0Var;
        this.f234910d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234911e.f234799d.setImageBitmap(this.f234910d);
    }
}
