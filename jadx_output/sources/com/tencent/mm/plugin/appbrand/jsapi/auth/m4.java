package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class m4 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf.h f79640d;

    public m4(bf.h hVar) {
        this.f79640d = hVar;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "JsApiOperateWXData";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        bf.h hVar = this.f79640d;
        if (hVar != null) {
            hVar.a(bitmap);
        }
    }
}
