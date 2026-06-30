package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class gf implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf f285568d;

    public gf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.Cif cif, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar) {
        this.f285568d = lfVar;
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar = this.f285568d;
        if (bitmap == null || bitmap.isRecycled()) {
            lfVar.f286010p.setVisibility(4);
            lfVar.f286011q.setVisibility(0);
        } else {
            lfVar.f286010p.setImageBitmap(bitmap);
            lfVar.f286010p.setVisibility(0);
            lfVar.f286011q.setVisibility(4);
        }
    }
}
