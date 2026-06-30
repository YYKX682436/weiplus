package qe5;

/* loaded from: classes9.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qe5.o0 f443696a = new qe5.o0();

    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a(qe5.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(params.f443626b, params.f443627c);
        if (J0 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(params.f443626b);
            int i17 = x51.t1.f533619a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", valueOf, new x51.s1());
            return J0;
        }
        if (ez.v0.f339310a.k(java.lang.Integer.valueOf(params.f443625a))) {
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.h(params.f443628d);
        if (h17 == null) {
            int i18 = x51.t1.f533619a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new x51.s1());
            return null;
        }
        if (h17.f68106x315a5445 != params.f443626b && !com.p314xaae8f345.mm.vfs.w6.j(h17.f68099xfeae815)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.s(params.f443626b, params.f443627c, params.f443629e, null);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J02 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(params.f443626b, params.f443627c);
            if (J02 == null) {
                int i19 = x51.t1.f533619a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new x51.s1());
                return h17;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new qe5.n0(h17, J02), "copyAttachFromLocal");
        }
        return h17;
    }
}
