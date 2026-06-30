package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class r0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87741g;

    public r0(android.content.Context context, java.lang.String str, int i17, yz5.a aVar) {
        this.f87738d = context;
        this.f87739e = str;
        this.f87740f = i17;
        this.f87741g = aVar;
    }

    @Override // l01.u
    public void b() {
        com.tencent.mm.plugin.appbrand.s0.f88438a.b(this.f87738d, this.f87739e, this.f87740f, null, this.f87741g);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.appbrand.s0.f88438a.b(this.f87738d, this.f87739e, this.f87740f, bitmap, this.f87741g);
    }
}
