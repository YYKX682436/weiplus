package zv;

@j95.b
/* loaded from: classes11.dex */
public final class q4 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final zv.n4 f557626d = new zv.n4();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginBrandEcs", "onAccountInitialized");
        super.mo204xfac946a6(context);
        this.f557626d.m43071x58998cd();
        if (gm0.j1.a() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj())) {
            yw.q3 q3Var = yw.q3.f547970a;
            if (yw.h1.f547865a.n()) {
                if (yw.q3.f547973d) {
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.A();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizMsgBridge", "onWechatIntoActive hasInit=" + yw.q3.f547973d);
                }
            }
            zv.q qVar = zv.q.f557612a;
            if (qVar.g()) {
                yw.a3 a3Var = yw.a3.f547799a;
                if (qVar.g()) {
                    if (yw.a3.f547803e) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.o();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "onWechatIntoActive hasInit=" + yw.a3.f547803e);
                    }
                }
            } else {
                zv.l.f557549a.b(false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                if (z40.e.l4()) {
                    ((y40.i0) z40.e.get()).getClass();
                    if (a50.e1.f83007d) {
                        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b.A();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.BoxFlutterBizMsgBridge", "resetBrandServiceDataMigrateStatusTemp hasInit=" + a50.e1.f83007d);
                    }
                } else if (yw.q3.f547973d) {
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.I();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizMsgBridge", "resetBrandServiceDataMigrateStatusTemp hasInit=" + yw.q3.f547973d);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(zv.p4.f557611d);
    }
}
