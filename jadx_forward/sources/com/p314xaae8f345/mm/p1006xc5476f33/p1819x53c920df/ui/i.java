package com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.j f226531e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.j jVar, android.graphics.Bitmap bitmap) {
        this.f226531e = jVar;
        this.f226530d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f226531e.f226533e.f226510m.setImageBitmap(this.f226530d);
    }
}
