package md2;

/* loaded from: classes11.dex */
public final class j implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f407383d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f407384e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f407385f;

    public j(android.content.Context context, gk2.e buContext, yz5.q completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        this.f407383d = completion;
        this.f407385f = "LiveSelectNoticeFlutterPlugin";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843
    /* renamed from: handleSelectNoticeResult */
    public void mo90676xaff0a879(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476 action, byte[] bArr) {
        r45.h32 h32Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (bArr != null) {
            r0 = !(bArr.length == 0);
        }
        if (r0) {
            h32Var = new r45.h32();
            h32Var.m75932x347fbd55(bArr);
        } else {
            h32Var = null;
        }
        android.app.Activity activity = this.f407384e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        this.f407383d.mo147xb9724478(activity, action, h32Var);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f407384e = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407385f, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.Companion.m90678x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f407384e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f407384e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407385f, "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24417xce485843.Companion.m90678x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f407384e = binding.mo137508x19263085();
    }
}
