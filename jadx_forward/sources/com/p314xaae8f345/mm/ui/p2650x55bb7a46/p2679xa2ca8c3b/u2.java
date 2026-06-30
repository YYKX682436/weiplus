package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class u2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 f287189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f287190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287191f;

    public u2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2 o2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var, boolean z17, yb5.d dVar) {
        this.f287189d = v1Var;
        this.f287190e = z17;
        this.f287191f = dVar;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", 240, 192);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = this.f287189d;
        if (bitmap == null || bitmap.isRecycled()) {
            v1Var.E.setVisibility(4);
            v1Var.G.setVisibility(0);
            v1Var.n(v1Var.F);
            return;
        }
        v1Var.E.setImageBitmap(bitmap);
        v1Var.E.setVisibility(0);
        v1Var.G.setVisibility(4);
        if (!this.f287190e) {
            v1Var.n(v1Var.F);
        } else {
            v1Var.F.setImageDrawable(i65.a.i(this.f287191f.g(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            v1Var.F.setVisibility(0);
        }
    }
}
