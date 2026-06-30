package kd2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f388266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc f388267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f388268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc, android.graphics.Bitmap bitmap) {
        super(0);
        this.f388266d = imageView;
        this.f388267e = c14146x2a22facc;
        this.f388268f = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f388266d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f388267e.getContext().getResources(), this.f388268f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage success!");
        return jz5.f0.f384359a;
    }
}
