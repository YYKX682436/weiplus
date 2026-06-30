package ry2;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f482992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f482993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry2.t f482994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f482995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, boolean z17, ry2.t tVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f482992d = i17;
        this.f482993e = z17;
        this.f482994f = tVar;
        this.f482995g = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostImageWidget", "add thumb file, index:" + this.f482992d);
        if (this.f482993e) {
            ry2.t tVar = this.f482994f;
            tVar.getClass();
            pm0.v.X(new ry2.c(this.f482995g, tVar));
            android.widget.ImageView imageView = tVar.f483020q;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
                throw null;
            }
            imageView.setOnClickListener(new ry2.q(tVar));
        }
        return jz5.f0.f384359a;
    }
}
