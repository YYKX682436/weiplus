package vm1;

/* loaded from: classes10.dex */
public final class i implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25057x6d5d1b2d f519547d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f519548e = jz5.h.b(vm1.a.f519512d);

    public final qm1.f a() {
        return (qm1.f) ((jz5.n) this.f519548e).mo141623x754a37bb();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137502xbf77c2e1(this);
        qm1.f a17 = a();
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "attachActivity " + mo137508x19263085);
        a17.f446226a = mo137508x19263085;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.Companion.m92674x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f519547d = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25057x6d5d1b2d(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        qm1.f a17 = a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "release");
        a17.f446226a = null;
        a17.f446236k = null;
        a17.e();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = a17.f446227b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f446227b = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        qm1.f a17 = a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "release");
        a17.f446226a = null;
        a17.f446236k = null;
        a17.e();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = a17.f446227b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f446227b = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f519547d = null;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9.Companion.m92674x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137502xbf77c2e1(this);
        qm1.f a17 = a();
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "attachActivity " + mo137508x19263085);
        a17.f446226a = mo137508x19263085;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24984xd3462ce9
    /* renamed from: showCommentInputView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo92672x9f7e830d(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 r13, yz5.l r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm1.i.mo92672x9f7e830d(com.tencent.pigeon.ting.CommentInputRequest, yz5.l):void");
    }
}
