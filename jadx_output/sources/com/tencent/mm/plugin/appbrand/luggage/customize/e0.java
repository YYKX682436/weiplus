package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class e0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o91.b f85518d;

    public e0(com.tencent.mm.plugin.appbrand.luggage.customize.g0 g0Var, o91.b bVar) {
        this.f85518d = bVar;
    }

    @Override // l01.u
    public void b() {
        o91.b bVar = this.f85518d;
        if (bVar == null) {
            return;
        }
        bVar.a(null);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "WxaIcon" + hashCode();
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        o91.b bVar = this.f85518d;
        if (bVar == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bVar.a(null);
        } else {
            bVar.a(bitmap);
        }
    }
}
