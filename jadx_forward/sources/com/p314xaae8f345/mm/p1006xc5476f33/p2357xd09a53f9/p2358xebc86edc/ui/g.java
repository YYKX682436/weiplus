package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h f259425e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h hVar, android.graphics.Bitmap bitmap) {
        this.f259425e = hVar;
        this.f259424d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h hVar = this.f259425e;
        if (hVar.f259429e.f259316e == null || (imageView = hVar.f259428d) == null || imageView.getTag() == null || !hVar.f259428d.getTag().equals(hVar.f259429e.f259316e.f69225xed6d60f6)) {
            return;
        }
        hVar.f259428d.setImageBitmap(this.f259424d);
    }
}
