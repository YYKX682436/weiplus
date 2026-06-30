package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes3.dex */
public final class vi implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f205837b;

    public vi(java.lang.String str, android.widget.ImageView imageView) {
        this.f205836a = str;
        this.f205837b = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ui(this.f205837b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "[handleProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f205836a);
        }
    }
}
