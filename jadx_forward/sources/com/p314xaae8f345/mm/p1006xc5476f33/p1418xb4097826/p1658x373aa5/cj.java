package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class cj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f213313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f213314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f213313d = bitmap;
        this.f213314e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f213314e;
        android.graphics.Bitmap bitmap = this.f213313d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderQuickShareShopWindowDialog", "load url get null");
        }
        return jz5.f0.f384359a;
    }
}
