package ea2;

/* loaded from: classes2.dex */
public final class z implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f332127c;

    public z(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, android.widget.ImageView imageView) {
        this.f332125a = str;
        this.f332126b = c13650x1bf60d72;
        this.f332127c = imageView;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "[loadCover] source:" + this.f332125a + " 2, success:" + z17);
        if (z17) {
            return;
        }
        this.f332126b.getClass();
        pm0.v.X(new ea2.i(this.f332127c));
    }
}
