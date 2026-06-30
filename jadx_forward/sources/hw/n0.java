package hw;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366940f;

    public n0(hw.o0 o0Var, java.lang.String str, java.lang.String str2) {
        this.f366938d = o0Var;
        this.f366939e = str;
        this.f366940f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw.c0 c0Var = this.f366938d.f366942e;
        if (c0Var != null) {
            cl0.g gVar = new cl0.g();
            java.lang.String frameSetName = this.f366939e;
            gVar.h("frameSetName", frameSetName);
            gVar.o("preLayoutScene", 3);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            java.lang.String data = this.f366940f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            pm0.v.X(new hw.a0(3, c0Var, frameSetName, data, gVar2));
        }
    }
}
