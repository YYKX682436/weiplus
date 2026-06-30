package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class z7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f192768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f192769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f192771g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f192772h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f192773i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192774m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var, java.lang.String str, android.widget.TextView textView, int i17, int i18, java.lang.String str2) {
        super(0);
        this.f192768d = bitmap;
        this.f192769e = f8Var;
        this.f192770f = str;
        this.f192771g = textView;
        this.f192772h = i17;
        this.f192773i = i18;
        this.f192774m = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = this.f192771g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = this.f192769e;
        android.graphics.Bitmap bitmap = this.f192768d;
        if (bitmap == null) {
            f8Var.e(this.f192770f, textView, this.f192772h, this.f192773i);
        } else {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
            java.lang.String str = this.f192770f;
            int i17 = this.f192773i;
            if (textView == null) {
                f8Var.getClass();
            } else {
                textView.setText(hc2.x0.l(str, f8Var.f188243d, '#', bitmapDrawable, i17, f8Var.f188244e, 0, 0, 0, 224, null));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", "getImage resource :" + bitmap + " iconUrl:" + this.f192774m);
        return jz5.f0.f384359a;
    }
}
