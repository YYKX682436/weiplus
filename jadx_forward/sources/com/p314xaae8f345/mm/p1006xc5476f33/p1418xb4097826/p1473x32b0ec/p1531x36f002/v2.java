package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f197259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f197260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.an1 f197261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, r45.an1 an1Var) {
        super(0);
        this.f197259d = bitmap;
        this.f197260e = imageView;
        this.f197261f = an1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f197259d;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f197260e;
            imageView.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getContext().getResources(), bitmap));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SquareConvertUtil", "bindHighTagView background resource is null, url = " + this.f197261f + ".background_icon_url");
        }
        return jz5.f0.f384359a;
    }
}
