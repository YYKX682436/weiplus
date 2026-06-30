package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class i implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.l f90090d;

    public i(com.tencent.mm.plugin.appbrand.ui.recents.l lVar) {
        this.f90090d = lVar;
    }

    @Override // l01.u
    public void b() {
        this.f90090d.a();
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "LoadShowcaseImageTask";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.appbrand.ui.recents.l lVar = this.f90090d;
        lVar.f90113e = bitmap;
        lVar.a();
    }
}
