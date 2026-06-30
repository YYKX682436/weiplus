package hg2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f362875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f362876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hg2.h f362877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f362879h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, hg2.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(0);
        this.f362875d = bitmap;
        this.f362876e = imageView;
        this.f362877f = hVar;
        this.f362878g = str;
        this.f362879h = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f362875d;
        if (bitmap != null) {
            this.f362876e.setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362877f.f362885m, this.f362878g + " resource is null");
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f384359a;
        this.f362879h.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        return f0Var;
    }
}
