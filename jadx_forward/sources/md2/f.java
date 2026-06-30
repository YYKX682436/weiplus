package md2;

/* loaded from: classes10.dex */
public final class f implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f407374d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f407375e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f407376f;

    public f(android.content.Context context, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f407374d = buContext;
        this.f407376f = "LiveCreateNoticeFlutterPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43
    /* renamed from: createNotice */
    public void mo90540x52bc76f4(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24415xfefa3080 taskID, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f407375e;
        if (activity == 0) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
            return;
        }
        java.lang.String e17 = xy2.c.e(activity);
        im5.b bVar = activity instanceof im5.b ? (im5.b) activity : null;
        if (bVar == null) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
            return;
        }
        ek2.c2 c2Var = new ek2.c2(db2.t4.f309704a.a(5874), e17, null, 0L, 0L, 0, 0L, 0, null, 248, null);
        az2.j.u(c2Var, activity, null, 0L, 6, null);
        c2Var.l().f(bVar).h(new md2.e(activity, callback, e17, this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f407375e = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407376f, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.Companion.m90542x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f407375e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f407375e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407376f, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24386x39bc6c43.Companion.m90542x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f407375e = binding.mo137508x19263085();
    }
}
