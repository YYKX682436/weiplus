package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f199583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f199584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, java.lang.String str) {
        super(0);
        this.f199583d = bitmap;
        this.f199584e = imageView;
        this.f199585f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f199583d;
        if (bitmap != null) {
            this.f199584e.setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAfterRecommendProductWidget", this.f199585f + " resource is null");
        }
        return jz5.f0.f384359a;
    }
}
