package kh;

/* loaded from: classes12.dex */
public final class s0 implements jj.d {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f389440d = jz5.h.a(jz5.i.f384362d, kh.r0.f389434d);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f389441e;

    public s0(kh.k1 k1Var) {
        this.f389441e = k1Var;
    }

    @Override // jj.d
    public void b(java.lang.String x17, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        boolean z17 = kh.k1.f389371n;
        kh.k1 k1Var = this.f389441e;
        if (k1Var.f476827a.f444868d.f444833s) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "[" + java.lang.Thread.currentThread().getName() + ']' + x17, new java.lang.Object[0]);
        }
        jz5.g gVar = this.f389440d;
        kh.g1 g1Var = (kh.g1) ((java.lang.ThreadLocal) gVar.mo141623x754a37bb()).get();
        if (g1Var != null) {
            ((java.lang.ThreadLocal) gVar.mo141623x754a37bb()).set(null);
            kh.k1.y(k1Var, g1Var);
        }
    }

    @Override // jj.d
    public void c(java.lang.String x17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        boolean z17 = kh.k1.f389371n;
        kh.k1 k1Var = this.f389441e;
        if (k1Var.f476827a.f444868d.f444833s) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "[" + java.lang.Thread.currentThread().getName() + ']' + x17, new java.lang.Object[0]);
        }
        kh.g1 g1Var = null;
        if (!android.text.TextUtils.isEmpty(x17)) {
            try {
                int L = r26.n0.L(x17, " to Handler (", 0, false, 6, null);
                if (L >= 0) {
                    java.lang.String substring = x17.substring(L + 13);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    int P = r26.n0.P(substring, ") ", 0, false, 6, null);
                    if (P >= 0) {
                        java.lang.String substring2 = substring.substring(0, P);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        int L2 = r26.n0.L(substring, "} ", 0, false, 6, null);
                        if (L2 >= 0) {
                            java.lang.String substring3 = substring.substring(L2 + 2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                            int P2 = r26.n0.P(substring3, ": ", 0, false, 6, null);
                            if (P2 >= 0) {
                                java.lang.String substring4 = substring3.substring(0, P2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                                if (r26.n0.B(substring4, "@", false)) {
                                    substring4 = substring4.substring(0, r26.n0.L(substring4, "@", 0, false, 6, null));
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                                }
                                java.lang.String substring5 = substring3.substring(P2 + 2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring5, "substring(...)");
                                g1Var = kh.g1.f389338f.a(substring2, substring4, java.lang.Integer.parseInt(substring5), null);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.LooperTaskMonitorFeatureKt", e17, "deconstructTask failed: ".concat(x17), new java.lang.Object[0]);
            }
        }
        if (g1Var != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g1Var.f389342b, "android.view.Choreographer$FrameDisplayEventReceiver")) {
                kh.i0 i0Var = kh.i0.f389359a;
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(choreographer, "getInstance(...)");
                i0Var.b(choreographer);
            }
            ((java.lang.ThreadLocal) this.f389440d.mo141623x754a37bb()).set(g1Var);
            kh.k1.z(k1Var, g1Var);
        }
    }

    @Override // jj.d
    /* renamed from: isValid */
    public boolean mo53758x7b953cf2() {
        boolean z17;
        kh.k1 k1Var = this.f389441e;
        boolean z18 = kh.k1.f389371n;
        qh.f0 f0Var = k1Var.f476827a;
        f0Var.getClass();
        synchronized (qh.f0.class) {
            z17 = f0Var.f444874m;
        }
        return z17;
    }
}
