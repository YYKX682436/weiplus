package jm4;

/* loaded from: classes9.dex */
public final class g5 implements hf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381918a;

    public g5(yz5.l lVar) {
        this.f381918a = lVar;
    }

    public void a(int i17, boolean z17, java.lang.String fileUrl, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileUrl, "fileUrl");
        yz5.l lVar = this.f381918a;
        if (!z17) {
            if (lVar != null) {
                bw5.xo0 xo0Var = new bw5.xo0();
                xo0Var.f116745d = 99992;
                boolean[] zArr = xo0Var.f116748g;
                zArr[1] = true;
                xo0Var.f116746e = java.lang.String.valueOf(i17);
                zArr[2] = true;
                byte[] mo14344x5f01b1f6 = xo0Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                lVar.mo146xb9724478(mo14344x5f01b1f6);
                return;
            }
            return;
        }
        if (fileUrl.length() == 0) {
            if (lVar != null) {
                bw5.xo0 xo0Var2 = new bw5.xo0();
                xo0Var2.f116745d = 99993;
                xo0Var2.f116748g[1] = true;
                byte[] mo14344x5f01b1f62 = xo0Var2.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                lVar.mo146xb9724478(mo14344x5f01b1f62);
                return;
            }
            return;
        }
        if (lVar != null) {
            bw5.xo0 xo0Var3 = new bw5.xo0();
            xo0Var3.f116745d = 0;
            boolean[] zArr2 = xo0Var3.f116748g;
            zArr2[1] = true;
            xo0Var3.f116747f = fileUrl;
            zArr2[3] = true;
            byte[] mo14344x5f01b1f63 = xo0Var3.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
            lVar.mo146xb9724478(mo14344x5f01b1f63);
        }
    }
}
