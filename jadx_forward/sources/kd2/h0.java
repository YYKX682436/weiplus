package kd2;

/* loaded from: classes.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc f388284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f388285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc, android.graphics.Bitmap bitmap) {
        super(0);
        this.f388284d = c14146x2a22facc;
        this.f388285e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc = this.f388284d;
        c14146x2a22facc.f192856m.setImageBitmap(this.f388285e);
        android.widget.ImageView imageView = c14146x2a22facc.f192856m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
