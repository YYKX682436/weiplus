package si0;

/* loaded from: classes11.dex */
public final class o1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4, com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f489679d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: closeFromPlatform */
    public void mo92388xcaae9855() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4
    /* renamed from: getOpenImLabel */
    public void mo91980x3ee60950(java.lang.String userName, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String a17 = t41.g.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(userName));
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        if (a17 == null) {
            a17 = "";
        }
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4
    /* renamed from: jumpToProfile */
    public boolean mo91981x8dd0e220(java.lang.String userName, java.lang.String scene) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        android.app.Activity activity = this.f489679d;
        if (activity == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(userName);
        if (q17 == null || r26.i0.n(userName, "@stranger", false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ri0.a.f477554a;
            intent = userName.length() > 0 ? (android.content.Intent) ((java.util.LinkedHashMap) ri0.a.f477555b).get(userName) : null;
            if (intent == null) {
                intent = new android.content.Intent();
            }
        } else {
            intent = new android.content.Intent();
        }
        intent.putExtra("Contact_User", userName);
        if (q17 != null && q17.k2()) {
            intent.putExtra("Contact_Scene", 37);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, activity);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489679d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.Companion.m91983x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion.m92392x97a46f3a(companion2, m137983x3b5b91dc2, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f489679d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f489679d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24831x15b3f8a4.Companion.m91983x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion.m92392x97a46f3a(companion2, m137983x3b5b91dc2, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489679d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: openStatusCardFloatView */
    public void mo92389x9f598c75(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.app.Activity activity = this.f489679d;
        if (activity == null) {
            return;
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).sj(activity, new bi4.h1(username, 16, 154L, false, false, null, new bi4.i1(0.0f, 0, 3, null), null));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: showPrivacySettings */
    public void mo92390x6cfc1f0e(com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24936x156de99 request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }
}
