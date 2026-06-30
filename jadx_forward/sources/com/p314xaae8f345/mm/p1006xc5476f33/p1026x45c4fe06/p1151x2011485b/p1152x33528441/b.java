package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167267a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f167268b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f167269c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f167267a = runtime;
        java.lang.String str = "MicroMsg.MBFrameBizHostMiniProgramHolderImpl(" + hashCode() + ')';
        this.f167268b = str;
        this.f167269c = new android.util.SparseArray();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<init> with runtime:" + runtime);
    }

    public void a() {
        fh1.x0 x0Var;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f167268b, "destroy");
        android.util.SparseArray sparseArray = this.f167269c;
        int i17 = 0;
        while (true) {
            if (!(i17 < sparseArray.size())) {
                return;
            }
            int i18 = i17 + 1;
            fh1.z zVar = (fh1.z) ((fh1.i) sparseArray.valueAt(i17));
            zVar.f344167h.set(true);
            p3325xe03a0797.p3326xc267989b.z0.e(zVar.f344166g, null, 1, null);
            synchronized (zVar) {
                x0Var = zVar.f344168i;
                zVar.f344168i = null;
            }
            if (x0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165835a;
                jc3.j0 j0Var = x0Var.f364528g;
                if (j0Var == null || (str = ((rc3.w0) j0Var).f475620e) == null) {
                    str = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameTaskManager", "killByBizInstance(" + str + ')');
                java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165836b.iterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    fj1.y yVar = (fj1.y) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.f344676c.f165787i, str)) {
                        try {
                            yVar.b();
                        } finally {
                            it.remove();
                        }
                    }
                }
                x0Var.mo123041x5cd39ffa();
            }
            i17 = i18;
        }
    }
}
