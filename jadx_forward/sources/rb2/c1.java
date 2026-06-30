package rb2;

/* loaded from: classes3.dex */
public final class c1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb2.d1 f475127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f475128c;

    public c1(java.lang.String str, rb2.d1 d1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f475126a = str;
        this.f475127b = d1Var;
        this.f475128c = h0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        rb2.d1 d1Var = this.f475127b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475126a, d1Var.f475139e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", "image url changed");
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", "bitmap is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mn2.h3 h3Var = (mn2.h3) aVar.f375106a;
        sb6.append(h3Var != null ? h3Var.mo148083xfb83cc9b() : null);
        sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", "save bitmap failed");
        }
        p3325xe03a0797.p3326xc267989b.y0 a17 = v65.m.a((android.view.View) this.f475128c.f391656d);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(a17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new rb2.b1(d1Var, sb7, bitmap, null), 2, null);
    }
}
