package yv4;

/* loaded from: classes4.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv4.k f547756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, yv4.k kVar) {
        super(0);
        this.f547755d = str;
        this.f547756e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String path = this.f547755d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(path)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            path = m11.b1.Di().P0(path);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(path);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleToSearchPreviewUIC", "setImage >> ".concat(path));
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(path);
        yv4.k kVar = this.f547756e;
        if (j17 && !r26.i0.n(path, ".temp", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleToSearchPreviewUIC", "setImage >> is set");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(path, options);
            if (d17 != null) {
                d17.recycle();
            }
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(path);
            kVar.U6().setVisibility(0);
            kVar.U6().m79320x1a6eb00e(a17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f U6 = kVar.U6();
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            U6.f149752h = i17;
            U6.f149753i = i18;
            kVar.U6().i();
            kVar.U6().t(path, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(path));
        } else if (r26.i0.n(path, ".temp", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleToSearchPreviewUIC", "path: " + path + " is error");
            kVar.U6().setVisibility(8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleToSearchPreviewUIC", "path: " + path + " is no exist");
            kVar.U6().setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
