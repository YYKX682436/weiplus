package lx;

/* loaded from: classes11.dex */
public final class w implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9 {

    /* renamed from: d, reason: collision with root package name */
    public final int f403521d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f403522e;

    public w(int i17) {
        this.f403521d = i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9
    /* renamed from: addContact */
    public void mo84815xaa747c3f(java.lang.String username, long j17) {
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveIdentity", "BizFansListApi.addContact, username=" + username + ", scene=" + j17);
        if ((username.length() == 0) || (activity = this.f403522e) == null) {
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f424002g = false;
        aVar.f424003h = false;
        ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(activity, username, (int) j17, lx.v.f403507a, aVar)).f();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403522e = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.Companion.m84819x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403522e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403522e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9.Companion.m84819x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403522e = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9
    /* renamed from: openBizFansBlackListUI */
    public void mo84816x63c27b08(java.lang.String biz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f403521d;
        intent.putExtra("serviceType", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizFansPlugin", "openBizFansBlackListUI serviceType: " + i17);
        android.content.Context context = this.f403522e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.j(context, "brandservice", ".conversation.ui.BizFansBlackListUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23093xcd90c9c9
    /* renamed from: openBizFansHalfScreenProfile */
    public void mo84817xe9782361(com.p314xaae8f345.p2845xc516c4b6.biz.C23135x54a4d828 userInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        ir1.m0 m0Var = ir1.i1.R;
        android.content.Context context = this.f403522e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        m0Var.a(context, userInfo, "", this.f403521d);
    }

    public /* synthetic */ w(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
