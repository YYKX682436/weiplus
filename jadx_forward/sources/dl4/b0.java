package dl4;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ff0.r f316901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, android.view.View view, dl4.m0 m0Var, ff0.r rVar) {
        super(1);
        this.f316897d = str;
        this.f316898e = w1Var;
        this.f316899f = view;
        this.f316900g = m0Var;
        this.f316901h = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kk.j jVar = dl4.k.f316957a;
        java.lang.String key = this.f316897d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.getRowBytes();
            bitmap.getWidth();
            bitmap.getHeight();
            bitmap.getAllocationByteCount();
            ((jt0.i) dl4.k.f316957a).put(key, bitmap);
        }
        final dl4.a0 a0Var = new dl4.a0(this.f316897d, this.f316899f, bitmap, this.f316900g, this.f316901h);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var = this.f316898e;
        if (w1Var != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c4) w1Var).a(new java.lang.Runnable(a0Var) { // from class: dl4.x

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f317025d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a0Var, "function");
                    this.f317025d = a0Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f317025d.mo152xb9724478();
                }
            });
        } else {
            pm0.v.X(a0Var);
        }
        return jz5.f0.f384359a;
    }
}
