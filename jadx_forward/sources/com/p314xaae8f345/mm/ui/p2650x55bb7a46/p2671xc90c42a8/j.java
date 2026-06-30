package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class j implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m f283808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k f283809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n f283810f;

    public j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m mVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k kVar) {
        this.f283810f = nVar;
        this.f283808d = mVar;
        this.f283809e = kVar;
    }

    @Override // l01.u
    public void b() {
        n11.a.b().h(this.f283809e.f283827n, this.f283808d.f283864i, this.f283810f.f283886t);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SEARCH#" + ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m mVar = this.f283808d;
        if (bitmap == null || bitmap.isRecycled()) {
            n11.a.b().h(this.f283809e.f283827n, mVar.f283864i, this.f283810f.f283886t);
        } else {
            mVar.f283864i.setImageBitmap(bitmap);
        }
    }
}
