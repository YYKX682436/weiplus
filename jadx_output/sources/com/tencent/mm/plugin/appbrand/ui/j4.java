package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class j4 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89802d;

    public j4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var) {
        this.f89802d = w4Var;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        return com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, i65.a.b(this.f89802d.getContext(), 3) * 1.0f, false, null);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "appbrand_game_loading_age";
    }
}
