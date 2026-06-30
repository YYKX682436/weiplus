package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class aj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f213183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f213184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f213183d = bitmap;
        this.f213184e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f213184e;
        android.graphics.Bitmap bitmap = this.f213183d;
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderQuickShareShopWindowDialog", "load url get null");
        }
        return jz5.f0.f384359a;
    }
}
