package q53;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 f441720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f441721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q53.f f441722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211, android.widget.ImageView imageView, q53.f fVar) {
        super(2);
        this.f441720d = c15924x61e54211;
        this.f441721e = imageView;
        this.f441722f = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((cp0.n) obj, "<anonymous parameter 0>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameWebSettingActionBar", "load tabTopSetting icon finished bitmap = " + bitmap + "  url:" + this.f441720d.f221710e);
        android.widget.ImageView imageView = this.f441721e;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "$imageView");
            this.f441722f.m(imageView, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
        }
        return jz5.f0.f384359a;
    }
}
