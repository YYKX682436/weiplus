package oj2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f427302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj2.l f427303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, oj2.l lVar) {
        super(0);
        this.f427302d = bitmap;
        this.f427303e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f427302d;
        if (bitmap != null) {
            oj2.l lVar = this.f427303e;
            android.widget.ImageView m151526xb464ae51 = lVar.m151526xb464ae51();
            if (m151526xb464ae51 != null) {
                m151526xb464ae51.setImageDrawable(new android.graphics.drawable.BitmapDrawable(lVar.getContext().getResources(), bitmap));
            }
            lVar.m174009x3a33aac1().a0().D(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f384359a;
    }
}
