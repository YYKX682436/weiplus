package dj4;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314524i;

    public j(android.widget.ImageView imageView, int i17, android.graphics.Bitmap bitmap, mj4.h hVar, android.content.Context context, java.lang.String str) {
        this.f314519d = imageView;
        this.f314520e = i17;
        this.f314521f = bitmap;
        this.f314522g = hVar;
        this.f314523h = context;
        this.f314524i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314519d.getTag(com.p314xaae8f345.mm.R.id.f565654d41), java.lang.Integer.valueOf(this.f314520e))) {
            dj4.u.i(dj4.u.f314582a, this.f314519d, this.f314521f, ((mj4.k) this.f314522g).v(), this.f314523h, 0.0f, this.f314524i, 16, null);
        }
    }
}
