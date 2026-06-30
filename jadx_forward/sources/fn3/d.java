package fn3;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final fn3.a f345996a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d.Callback f345997b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345998c;

    public d(fn3.a handler, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d.Callback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f345996a = handler;
        this.f345997b = callback;
    }

    public static /* synthetic */ void b(fn3.d dVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callback");
        }
        if ((i18 & 1) != 0) {
            fVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        dVar.a(fVar, i17, str);
    }

    public void a(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (this.f345998c) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115718x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053.m115718x3136c9db();
        fn3.a aVar = this.f345996a;
        m115718x3136c9db.f60158x5a623f5 = aVar.f345989a;
        m115718x3136c9db.f60159xa7c470f2 = i17;
        m115718x3136c9db.f60160xb2d4efdc = errMsg;
        if (fVar != null) {
            m115718x3136c9db.f60161x65fc9e8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063.m115698x3136c9db().m115703xdfd7b7ef(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(fVar.mo14344x5f01b1f6())).m115699x59bc66e();
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.InterfaceC27368xfaa63c8d.Callback callback = this.f345997b;
        if (callback != null) {
            callback.mo113722x6ac7baf9(aVar.f345990b, m115718x3136c9db.m115719x59bc66e());
        }
        aVar.getClass();
        this.f345998c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeAffAsyncCallback", "taskId:" + aVar.f345990b + " cmdId:" + aVar.f345989a + " cost:" + (c01.id.c() - aVar.f345991c));
    }
}
