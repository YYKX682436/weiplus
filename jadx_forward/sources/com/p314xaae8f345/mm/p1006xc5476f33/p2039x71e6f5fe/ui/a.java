package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b f241028e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b bVar, android.graphics.Bitmap bitmap) {
        this.f241028e = bVar;
        this.f241027d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b bVar = this.f241028e;
        bVar.N.setImageBitmap(this.f241027d);
        bVar.N.setVisibility(0);
        bVar.getClass();
    }
}
