package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.n f210591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210592e;

    public d7(cp0.n nVar, android.graphics.Bitmap bitmap) {
        this.f210591d = nVar;
        this.f210592e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View b17 = this.f210591d.b();
        if (b17 != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) b17;
            android.graphics.Bitmap bitmap = this.f210592e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
            c21524xecd57b9a.i();
        }
    }
}
