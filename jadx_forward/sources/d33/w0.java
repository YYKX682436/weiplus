package d33;

/* loaded from: classes.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f307830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, android.widget.ImageView imageView, yz5.p pVar) {
        super(0);
        this.f307828d = str;
        this.f307829e = imageView;
        this.f307830f = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String str = this.f307828d;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        int i18 = 1280;
        if (n07 != null) {
            int i19 = n07.outWidth;
            int i27 = n07.outHeight;
            double sqrt = java.lang.Math.sqrt(1638400 / (i19 * i27));
            if (sqrt <= 1.0d) {
                i19 = (int) (i19 * sqrt);
                i27 = (int) (sqrt * i27);
                if (i19 < 1280 && i27 < 1280) {
                    i27 = 1280;
                    int i28 = i18;
                    i18 = i27;
                    i17 = i28;
                }
            }
            i18 = i19;
            int i282 = i18;
            i18 = i27;
            i17 = i282;
        } else {
            i17 = 1280;
        }
        android.graphics.Bitmap t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(str, i18, i17, true, false);
        if (t17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxMediaCropLayout", "source is null. file exit=" + com.p314xaae8f345.mm.vfs.w6.j(str) + " mediaPath=" + str + " targetHeight=" + i18 + " targetWidth=" + i17);
        } else {
            pm0.v.X(new d33.v0(this.f307829e, t17, t17.getWidth(), t17.getHeight(), this.f307830f));
        }
        return jz5.f0.f384359a;
    }
}
