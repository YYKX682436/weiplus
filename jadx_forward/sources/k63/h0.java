package k63;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f386078d;

    public h0(k63.m0 m0Var) {
        this.f386078d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k63.m0 m0Var = this.f386078d;
        m0Var.getClass();
        m0Var.getClass();
        k63.w wVar = m0Var.f386094o;
        if (wVar != null) {
            java.lang.System.currentTimeMillis();
            long j17 = m0Var.f386095p;
            m0Var.f386095p = java.lang.System.currentTimeMillis();
            is0.c c17 = m0Var.f386090h.c();
            wVar.H = c17 != null ? c17.f375928e : -1;
            wVar.o();
            java.lang.System.currentTimeMillis();
            is0.c cVar = wVar.f429533i;
            if (cVar != null) {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.opengl.EGLContext eglContext = m0Var.c().f480827c;
                int i17 = cVar.f375928e;
                int i18 = cVar.f375933m;
                int i19 = cVar.f375934n;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglContext, "eglContext");
                tn0.w0 w0Var2 = dk2.ef.f314911d;
                if (w0Var2 != null) {
                    w0Var2.s0(eglContext, i17, i18, i19, 0L, false);
                }
                if (java.lang.System.currentTimeMillis() - m0Var.f386096q > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                    m0Var.f386096q = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveRenderManager", "send external data: " + cVar.f375928e + " size:" + cVar.f375933m + ' ' + cVar.f375934n + " cost:" + (java.lang.System.currentTimeMillis() - m0Var.f386095p));
                }
            }
        }
    }
}
