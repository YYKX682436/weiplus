package dj4;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f314549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f314551i;

    public n(android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap, boolean z17, android.content.Context context, float f17) {
        this.f314546d = imageView;
        this.f314547e = str;
        this.f314548f = bitmap;
        this.f314549g = z17;
        this.f314550h = context;
        this.f314551i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f314546d.getTag(com.p314xaae8f345.mm.R.id.f565654d41);
        java.lang.String str = this.f314547e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str)) {
            dj4.u.i(dj4.u.f314582a, this.f314546d, this.f314548f, this.f314549g, this.f314550h, this.f314551i, null, 32, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.StatusImgHandler", "loadByUrl: curTag:" + tag + " tag:" + str);
    }
}
