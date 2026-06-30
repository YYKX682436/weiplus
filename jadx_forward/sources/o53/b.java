package o53;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 f424645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f424646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o53.e f424647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211, android.widget.ImageView imageView, o53.e eVar) {
        super(2);
        this.f424645d = c15924x61e54211;
        this.f424646e = imageView;
        this.f424647f = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((cp0.n) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load tabTopSetting icon finished bitmap = ");
        sb6.append(bitmap);
        sb6.append("  url:");
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211 = this.f424645d;
        java.lang.String str = C ? c15924x61e54211.f221711f : c15924x61e54211.f221710e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLiteSettingActionBar", sb6.toString());
        android.widget.ImageView imageView = this.f424646e;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "$imageView");
            this.f424647f.d(imageView, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
        }
        return jz5.f0.f384359a;
    }
}
