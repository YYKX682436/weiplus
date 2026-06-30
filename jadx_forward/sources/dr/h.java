package dr;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.i f323918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f323919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f323920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dr.i iVar, boolean z17, android.graphics.Bitmap bitmap) {
        super(0);
        this.f323918d = iVar;
        this.f323919e = z17;
        this.f323920f = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uiThread, md5 = ");
        dr.i iVar = this.f323918d;
        sb6.append(iVar.f323933a.mo42933xb5885648());
        sb6.append(", view is ");
        java.lang.ref.WeakReference weakReference = iVar.f323935c;
        sb6.append(weakReference != null ? (android.widget.ImageView) weakReference.get() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCoverRequest", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = iVar.f323935c;
        android.widget.ImageView imageView = weakReference2 != null ? (android.widget.ImageView) weakReference2.get() : null;
        if (this.f323919e && (bitmap = this.f323920f) != null && imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
