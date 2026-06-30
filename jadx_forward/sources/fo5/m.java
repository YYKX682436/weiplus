package fo5;

/* loaded from: classes14.dex */
public final class m implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er4.r f346556b;

    public m(fo5.r0 r0Var, er4.r rVar) {
        this.f346555a = r0Var;
        this.f346556b = rVar;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        er4.r rVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchSmallWindow onResultAllow: ");
        fo5.r0 r0Var = this.f346555a;
        sb6.append(r0Var.o());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        if (r0Var.o() == null || (rVar = this.f346556b) == null) {
            return;
        }
        android.app.Activity o17 = r0Var.o();
        if (o17 != null) {
            o17.finish();
        }
        ((jp5.o) i95.n0.c(jp5.o.class)).we(rVar);
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "launchSmallWindow onResultCancel: ");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        if (this.f346555a.f346620f != er4.l.MAIN_UI_CALL_END) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "launchSmallWindow onResultRefuse: ");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        if (this.f346555a.f346620f != er4.l.MAIN_UI_CALL_END) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
        }
    }
}
