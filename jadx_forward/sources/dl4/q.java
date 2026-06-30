package dl4;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f316990e;

    public q(android.graphics.Bitmap bitmap, yz5.l lVar) {
        this.f316989d = bitmap;
        this.f316990e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk4.g4 g4Var = rk4.g4.f478207a;
        dl4.p pVar = new dl4.p(this.f316990e);
        android.graphics.Bitmap bitmap = this.f316989d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            pVar.mo146xb9724478(null);
            return;
        }
        byte[] imageData = (byte[]) c17.f384366d;
        bw5.tq0 imageInfo = (bw5.tq0) c17.f384367e;
        rk4.f4 f4Var = new rk4.f4(pVar);
        jm4.w5 w5Var = (jm4.w5) rk4.g4.f478208b;
        w5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        byte[] mo14344x5f01b1f6 = imageInfo.mo14344x5f01b1f6();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f381984q = f4Var;
        long m105978x2737f10 = w5Var.m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3381xf512d0a5.C30462x21b41440.m169140x21b9affe(m105978x2737f10, imageData, mo14344x5f01b1f6, true, x1Var);
    }
}
