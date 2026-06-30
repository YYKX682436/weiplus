package st3;

/* loaded from: classes10.dex */
public final class c implements ct0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st3.e f494056a;

    public c(st3.e eVar) {
        this.f494056a = eVar;
    }

    @Override // ct0.a
    public java.lang.String b() {
        java.lang.String thumbPath = this.f494056a.f494058d.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
        return thumbPath;
    }

    @Override // ct0.a
    public int c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("mediacodec_create_error", false)) {
            return 1;
        }
        if (!st3.t.f494134e) {
            return this.f494056a.f494058d.f237205g;
        }
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Media_CaptureSoft_Int, 0);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 0)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 1) ? 1 : 2;
        }
        di3.f0 f0Var = di3.w.f314303d;
        if (f0Var == null || !st3.t.f494134e) {
            return 2;
        }
        return f0Var.f314233a;
    }

    @Override // ct0.a
    /* renamed from: getFilePath */
    public java.lang.String mo483x5000ed37() {
        java.lang.String inputVideoPath = this.f494056a.f494058d.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputVideoPath, "inputVideoPath");
        return inputVideoPath;
    }
}
