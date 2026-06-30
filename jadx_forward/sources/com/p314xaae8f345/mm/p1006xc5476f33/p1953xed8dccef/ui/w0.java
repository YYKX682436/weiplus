package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0 f234904e;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0 x0Var, android.graphics.Bitmap bitmap) {
        this.f234904e = x0Var;
        this.f234903d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234904e.f234905d.setImageBitmap(this.f234903d);
    }
}
