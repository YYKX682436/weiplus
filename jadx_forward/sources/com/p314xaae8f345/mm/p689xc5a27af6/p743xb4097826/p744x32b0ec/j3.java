package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes2.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f148318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f148319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f148320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(0);
        this.f148318d = imageView;
        this.f148319e = bitmap;
        this.f148320f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f148318d;
        int i17 = imageView.getLayoutParams().height;
        android.graphics.Bitmap bitmap = this.f148319e;
        if (i17 > 0) {
            imageView.getLayoutParams().width = (int) java.lang.Math.ceil((imageView.getLayoutParams().height * bitmap.getWidth()) / bitmap.getHeight());
        }
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        yz5.l lVar = this.f148320f;
        if (lVar != null) {
            lVar.mo146xb9724478(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
