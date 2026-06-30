package sj2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f489909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj2.f f489910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.graphics.Bitmap bitmap, sj2.f fVar) {
        super(0);
        this.f489909d = bitmap;
        this.f489910e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f489909d;
        if (bitmap != null) {
            sj2.f fVar = this.f489910e;
            fVar.N.f343717g.setImageDrawable(new android.graphics.drawable.BitmapDrawable(fVar.getContext().getResources(), bitmap));
            fVar.m174009x3a33aac1().a0().D(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f384359a;
    }
}
