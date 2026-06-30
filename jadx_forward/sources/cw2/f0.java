package cw2;

/* loaded from: classes10.dex */
public final class f0 implements ct0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.h0 f305219a;

    public f0(cw2.h0 h0Var) {
        this.f305219a = h0Var;
    }

    @Override // ct0.a
    public java.lang.String b() {
        return "";
    }

    @Override // ct0.a
    public int c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("mediacodec_create_error", false)) {
            return 1;
        }
        if (!st3.t.f494134e) {
            return this.f305219a.f494058d.f237205g;
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
        dw3.c0 c0Var = dw3.c0.f325715a;
        java.lang.String Ri = t21.o2.Bi().Ri();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ri, "getSubVideoPath(...)");
        if (!com.p314xaae8f345.mm.vfs.w6.j(Ri)) {
            java.lang.String Ri2 = t21.o2.Bi().Ri();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ri2, "getSubVideoPath(...)");
            com.p314xaae8f345.mm.vfs.w6.u(Ri2);
        }
        return t21.o2.Bi().Ri() + '/' + java.lang.System.currentTimeMillis();
    }
}
