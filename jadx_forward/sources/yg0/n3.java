package yg0;

/* loaded from: classes8.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f543758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fs0 f543759e;

    public n3(yg0.o3 o3Var, bw5.fs0 fs0Var) {
        this.f543758d = o3Var;
        this.f543759e = fs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx4.d0 d0Var;
        java.lang.ref.WeakReference weakReference;
        ch0.z b17 = this.f543758d.f543764e.b();
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864 = (b17 == null || (weakReference = b17.f122799f) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864) weakReference.get();
        if (abstractActivityC19400xd202f864 != null) {
            if (!abstractActivityC19400xd202f864.K3) {
                return;
            }
            java.lang.String content = "setNewSearchRequestId, activity hash code: " + abstractActivityC19400xd202f864.hashCode() + ", notify js new request";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        }
        bw5.fs0 fs0Var = this.f543759e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            cl0.g gVar = new cl0.g();
            gVar.s("query", fs0Var.b());
            gVar.s(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(fs0Var.f109043n));
            gVar.s("type", java.lang.Long.valueOf(fs0Var.f109039g));
            if (abstractActivityC19400xd202f864 != null && (d0Var = abstractActivityC19400xd202f864.E3) != null) {
                d0Var.m("newFlutterRequestStart", gVar);
                f0Var = jz5.f0.f384359a;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
