package dl4;

/* loaded from: classes3.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316909h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ff0.r f316910i;

    public c0(android.graphics.Bitmap bitmap, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, android.view.View view, dl4.m0 m0Var, ff0.r rVar) {
        this.f316905d = bitmap;
        this.f316906e = str;
        this.f316907f = w1Var;
        this.f316908g = view;
        this.f316909h = m0Var;
        this.f316910i = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk4.g4 g4Var = rk4.g4.f478207a;
        dl4.b0 b0Var = new dl4.b0(this.f316906e, this.f316907f, this.f316908g, this.f316909h, this.f316910i);
        android.graphics.Bitmap bitmap = this.f316905d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            b0Var.mo146xb9724478(null);
            return;
        }
        byte[] imageData = (byte[]) c17.f384366d;
        bw5.tq0 imageInfo = (bw5.tq0) c17.f384367e;
        rk4.e4 e4Var = new rk4.e4(b0Var);
        jm4.w5 w5Var = (jm4.w5) rk4.g4.f478208b;
        w5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        byte[] mo14344x5f01b1f6 = imageInfo.mo14344x5f01b1f6();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f381984q = e4Var;
        long m105978x2737f10 = w5Var.m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3381xf512d0a5.C30462x21b41440.m169135x21b09a73(m105978x2737f10, imageData, mo14344x5f01b1f6, x1Var);
    }
}
