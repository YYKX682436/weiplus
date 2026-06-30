package si0;

/* loaded from: classes8.dex */
public final class u1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f489710d = new java.lang.ref.WeakReference(null);

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a
    /* renamed from: getWeAppNickName */
    public void mo92111x3983f26b(java.lang.String userName, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: userName is empty");
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: userName=".concat(userName));
        try {
            java.lang.String e17 = ((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.e(userName) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: nickName=" + e17);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (e17 == null) {
                e17 = "";
            }
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(e17)));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWeAppPlugin", "getWeAppNickName error: " + e18.getMessage());
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a
    /* renamed from: jumpToWeApp */
    public void mo92112xfdd7e2aa(java.lang.String userName, java.lang.String pagePath, long j17, com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24889xc4f4553e scene, java.lang.String messageExtraData) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageExtraData, "messageExtraData");
        android.content.Context context = (android.content.Context) this.f489710d.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: context is null");
            return;
        }
        if (userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: userName is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: userName=" + userName + ", pagePath=" + pagePath + ", version=" + j17 + ", scene=" + scene + ", messageExtraData=" + messageExtraData);
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.ox oxVar = c6113xa3727625.f136391h;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f89004f = context;
            nxVar.f88999a = userName;
            nxVar.f89000b = pagePath;
            nxVar.f89007i = j17 > 0 ? (int) j17 : 0;
            int i18 = si0.t1.f489708a[scene.ordinal()];
            if (i18 == 1) {
                i17 = 1045;
            } else if (i18 != 2) {
                if (i18 != 3 && i18 != 4) {
                    throw new jz5.j();
                }
                i17 = 1009;
            } else {
                i17 = 1046;
            }
            nxVar.f89002d = i17;
            nxVar.f89013o.f151950f = messageExtraData;
            c6113xa3727625.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: openOk=" + oxVar.f89114a + ", returnMsg=" + oxVar.f89115b);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp error: " + e17.getMessage());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onAttachedToActivity");
        this.f489710d = new java.lang.ref.WeakReference(binding.mo137508x19263085());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.Companion.m92114x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onDetachedFromActivity");
        this.f489710d.clear();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        mo262x262a05ea();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24885x39fc5e5a.Companion.m92114x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        mo260x9f807ad(binding);
    }
}
