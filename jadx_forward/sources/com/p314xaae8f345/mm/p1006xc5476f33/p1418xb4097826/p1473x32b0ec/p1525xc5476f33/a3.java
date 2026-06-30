package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f193319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f193320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f193321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193322g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f193323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(0);
        this.f193319d = bitmap;
        this.f193320e = imageView;
        this.f193321f = i17;
        this.f193322g = str;
        this.f193323h = v3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f193320e;
        android.graphics.Bitmap bitmap = this.f193319d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            int i17 = this.f193321f;
            if (i17 >= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", this.f193322g + " resource is null");
                imageView.setImageDrawable(this.f193323h.f446856d.getContext().getResources().getDrawable(i17));
            }
        }
        return jz5.f0.f384359a;
    }
}
