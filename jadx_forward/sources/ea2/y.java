package ea2;

/* loaded from: classes2.dex */
public final class y implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f332124c;

    public y(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, android.widget.ImageView imageView) {
        this.f332122a = str;
        this.f332123b = c13650x1bf60d72;
        this.f332124c = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "[loadCover] source:" + this.f332122a + " 1, resource:" + bitmap);
        if (bitmap == null) {
            this.f332123b.getClass();
            pm0.v.X(new ea2.i(this.f332124c));
        }
    }
}
