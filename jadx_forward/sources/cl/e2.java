package cl;

/* loaded from: classes7.dex */
public class e2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f124156b;

    public e2(cl.h2 h2Var, cl.q0 q0Var) {
        this.f124156b = h2Var;
        this.f124155a = q0Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        cl.i0 i0Var = null;
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 2 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 10 || c1469x28b0ccd7.mo16302xfb85f7b0(1) != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 v8ArrayBuffer = (com.p159x477cd522.p160x333422.C1470x40840ff7) c1469x28b0ccd7.get(0);
        java.lang.String mode = c1469x28b0ccd7.mo16298x2fec8307(1);
        cl.s sVar = this.f124156b.f124188c;
        cl.i0.f124191d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = mode.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "r")) {
            i0Var = cl.i0.f124192e;
        } else {
            java.lang.String lowerCase2 = mode.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase2, "rw")) {
                i0Var = cl.i0.f124193f;
            }
        }
        cl.j0 j0Var = (cl.j0) sVar;
        j0Var.getClass();
        cl.q0 v86 = this.f124155a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v86, "v8");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v8ArrayBuffer, "v8ArrayBuffer");
        int incrementAndGet = j0Var.f124200b.incrementAndGet();
        ((java.util.HashMap) j0Var.f124199a).put(java.lang.Integer.valueOf(incrementAndGet), new cl.k0(v86, v8ArrayBuffer, i0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareBufferTracerManager", "trace[" + incrementAndGet + ']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8DirectApiSharedBuffer", "trace, traceId:%d", java.lang.Integer.valueOf(incrementAndGet));
        return java.lang.Integer.valueOf(incrementAndGet);
    }
}
