package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class w5 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.x5 f90300d;

    public w5(com.tencent.mm.plugin.appbrand.ui.x5 x5Var) {
        this.f90300d = x5Var;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        android.graphics.Bitmap t07 = com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, i65.a.a(this.f90300d.f90327b, 30.0f), false, null);
        kotlin.jvm.internal.o.f(t07, "getRoundedCornerBitmap(...)");
        return t07;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "";
    }
}
