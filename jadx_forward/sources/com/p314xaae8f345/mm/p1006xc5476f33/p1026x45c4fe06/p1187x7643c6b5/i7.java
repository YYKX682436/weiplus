package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j7 f170219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w f170220e;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j7 j7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar) {
        this.f170219d = j7Var;
        this.f170220e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j7 j7Var = this.f170219d;
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 g17 = j7Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        g17.m43178x2ac791bd(j7Var.f170234b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = this.f170220e;
        if (wVar != null) {
            final cl.a aVar = (cl.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).c0();
            aVar.f124102b.n(new java.lang.Runnable() { // from class: cl.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    cl.a aVar2 = cl.a.this;
                    aVar2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "blockJsThread");
                    synchronized (aVar2.f124123w) {
                        aVar2.f124123w[0] = true;
                        while (true) {
                            boolean[] zArr = aVar2.f124123w;
                            if (zArr[0]) {
                                try {
                                    zArr.wait();
                                } catch (java.lang.InterruptedException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbstractJSRuntime", e17, "blockJsThread, interrupted", new java.lang.Object[0]);
                                }
                            }
                        }
                    }
                }
            }, true);
        }
    }
}
