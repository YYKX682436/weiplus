package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f284784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b2 f284785e;

    public a2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b2 b2Var, android.graphics.Bitmap bitmap) {
        this.f284785e = b2Var;
        this.f284784d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f284785e.f284982a.f287276f.setImageBitmap(this.f284784d);
    }
}
