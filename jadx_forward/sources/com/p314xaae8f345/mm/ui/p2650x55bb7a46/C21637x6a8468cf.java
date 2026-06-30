package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.RevokeMsgListener */
/* loaded from: classes12.dex */
public class C21637x6a8468cf extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f> {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.mc f279836d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f279837e;

    public C21637x6a8468cf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.mc mcVar, android.app.Activity activity) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f279836d = null;
        this.f279836d = mcVar;
        this.f279837e = new java.lang.ref.WeakReference(activity);
        this.f39173x3fe91575 = 675629679;
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 != null) {
            try {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(com.p314xaae8f345.mm.p947xba6de98f.i2.b("downvideo", h17.f496545j, h17.h(), h17.d()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgListener", "ashutest::[oneliang][revokeMsgVideo] cancel result:%s", java.lang.Boolean.TRUE);
                t21.p3 Zi = t21.o2.Zi();
                Zi.getClass();
                gm0.j1.d().d(Zi.f496411u);
                Zi.f();
                c01.w9.e(f9Var, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RevokeMsgListener", e17, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f2 = c5945xdd67bc5f;
        android.app.Activity activity = (android.app.Activity) this.f279837e.get();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.mc mcVar = this.f279836d;
        if (mcVar != null && c5945xdd67bc5f2 != null && activity != null) {
            am.cs csVar = c5945xdd67bc5f2.f136246g;
            long j17 = csVar.f87927a;
            java.lang.String str = csVar.f87928b;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = csVar.f87930d;
            if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
                f9Var = csVar.f87930d;
            }
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RevokeMsgListener", "in callback msgInfo null");
            } else {
                int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
                if (mo78013xfb85f7b0 != 3) {
                    if (mo78013xfb85f7b0 == 34) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5();
                        c5402xfd96e0b5.f135746g.f89712c = 1;
                        c5402xfd96e0b5.e();
                    } else if (mo78013xfb85f7b0 == 43 || mo78013xfb85f7b0 == 62) {
                        android.os.Looper.myLooper();
                        gm0.j1.e().a();
                        int ordinal = mcVar.ordinal();
                        if (ordinal == 0) {
                            c(f9Var);
                        } else if (ordinal == 2) {
                            c(f9Var);
                            if (activity instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) activity;
                                if (viewOnClickListenerC21748xb3d38e6b.f282144g != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var) && f9Var.m124847x74d37ac6() == viewOnClickListenerC21748xb3d38e6b.f282144g.w().m124847x74d37ac6()) {
                                    int I7 = viewOnClickListenerC21748xb3d38e6b.I7();
                                    viewOnClickListenerC21748xb3d38e6b.U7();
                                    if (viewOnClickListenerC21748xb3d38e6b.L1 != null) {
                                        viewOnClickListenerC21748xb3d38e6b.U7();
                                        viewOnClickListenerC21748xb3d38e6b.L1.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z7(viewOnClickListenerC21748xb3d38e6b, I7));
                                    }
                                    db5.e1.G(activity, str, "", false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.lc(this, activity));
                                }
                            }
                        }
                    }
                } else if (mcVar.ordinal() == 1) {
                    if (f9Var.m124847x74d37ac6() > 0) {
                        try {
                            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(com.p314xaae8f345.mm.p947xba6de98f.i2.b("downimg", f9Var.mo78012x3fdd41df(), f9Var.Q0(), "" + f9Var.m124847x74d37ac6()));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] cancel result:%s", java.lang.Boolean.TRUE);
                            c01.d9.e().c(109);
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.v(f9Var).f404166a, tg3.l1.a(f9Var), 1);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RevokeMsgListener", e17, "[oneliang][revokeMsgImage] cancel failure:%s", e17.getMessage());
                        }
                    }
                    if (activity instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) activity).O2));
                    }
                }
            }
        }
        return false;
    }
}
