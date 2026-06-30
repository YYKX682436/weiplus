package rk4;

/* loaded from: classes11.dex */
public final class p0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f478422d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25029xa5f884d8 f478423e;

    public final int a(double d17) {
        android.app.Activity activity = this.f478422d;
        java.lang.Object systemService = activity != null ? activity.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        android.graphics.Point point = new android.graphics.Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        int i17 = point.y;
        return this.f478422d != null ? (int) ((i17 * d17) - com.p314xaae8f345.mm.ui.bl.c(r1)) : (int) (i17 * d17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7
    /* renamed from: closeProfileDialog */
    public void mo92793x2ac39539() {
        android.app.Activity activity = this.f478422d;
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(lm4.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            lm4.b0 b0Var = ((lm4.i0) a17).f401103f;
            if (b0Var != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.AbstractGestureDetectorOnGestureListenerC18733xe073c388.f256354u;
                b0Var.j(b0Var.edgeAttached, true);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.app.Activity mo137508x19263085 = p07.mo137508x19263085();
        this.f478422d = mo137508x19263085;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo137508x19263085);
        pf5.z zVar = pf5.z.f435481a;
        if (!(mo137508x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo137508x19263085).a(lm4.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        lm4.i0 i0Var = (lm4.i0) a17;
        i0Var.f401109o.add(new rk4.n0(this));
        rk4.u6 u6Var = rk4.k8.f478321r;
        rk4.k8.f478325v = new rk4.o0(i0Var);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.Companion.m92797x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f478423e = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25029xa5f884d8(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f478422d = null;
        rk4.u6 u6Var = rk4.k8.f478321r;
        rk4.k8.f478325v = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7.Companion.m92797x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f478423e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7
    /* renamed from: showBizProfileDialog */
    public void mo92794xd1cd1f1b(java.lang.String userName, double d17, byte[] listenItemData, long j17, java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f478422d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", userName);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("Contact_Scene", (int) j17);
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_Scene_Note", str);
            intent.putExtra("biz_dialog_show_header_bar", false);
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(lm4.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((lm4.i0) a17).O6(intent, a(d17), lm4.c0.f401078e);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25024x7588cdc7
    /* renamed from: showFinderProfileDialog */
    public void mo92795x9e40ff8e(java.lang.String userName, double d17, byte[] listenItemData, long j17, long j18, java.lang.String str, long j19, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f478422d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", userName);
            int i17 = (int) j18;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(37, 42, i17, intent);
            intent.putExtra("key_enter_profile_type", 42);
            if (j17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44726x8611d863.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 7);
            } else if (j17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44728x12d10cc0.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 6);
            } else if (j17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44725x1227ba71.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 8);
            }
            if (!(str == null || r26.n0.N(str))) {
                intent.putExtra("key_extra_info", str);
            }
            intent.putExtra("key_from_comment_scene", i17);
            intent.putExtra("key_from_follow_scene", il4.c.a(j19));
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(lm4.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((lm4.i0) a17).O6(intent, a(d17), lm4.c0.f401077d);
        }
    }
}
