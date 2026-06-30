package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class g2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 f285543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f285544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285545f;

    public g2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2 c2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var, boolean z17, yb5.d dVar) {
        this.f285543d = v1Var;
        this.f285544e = z17;
        this.f285545f = dVar;
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = this.f285543d;
        if (bitmap == null || bitmap.isRecycled()) {
            v1Var.E.setVisibility(4);
            v1Var.G.setVisibility(0);
            v1Var.n(v1Var.F);
            return;
        }
        v1Var.E.setImageBitmap(bitmap);
        v1Var.E.setVisibility(0);
        v1Var.G.setVisibility(4);
        if (!this.f285544e) {
            v1Var.n(v1Var.F);
        } else {
            v1Var.F.setImageDrawable(i65.a.i(this.f285545f.g(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            v1Var.F.setVisibility(0);
        }
    }
}
