package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f111236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f111238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f111239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111240i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.feed.f8 f8Var, java.lang.String str, android.widget.TextView textView, int i17, int i18, java.lang.String str2) {
        super(0);
        this.f111235d = bitmap;
        this.f111236e = f8Var;
        this.f111237f = str;
        this.f111238g = textView;
        this.f111239h = i17;
        this.f111240i = i18;
        this.f111241m = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = this.f111238g;
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f111236e;
        android.graphics.Bitmap bitmap = this.f111235d;
        if (bitmap == null) {
            f8Var.e(this.f111237f, textView, this.f111239h, this.f111240i);
        } else {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
            java.lang.String str = this.f111237f;
            int i17 = this.f111240i;
            if (textView == null) {
                f8Var.getClass();
            } else {
                textView.setText(hc2.x0.l(str, f8Var.f106710d, '#', bitmapDrawable, i17, f8Var.f106711e, 0, 0, 0, 224, null));
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "getImage resource :" + bitmap + " iconUrl:" + this.f111241m);
        return jz5.f0.f302826a;
    }
}
