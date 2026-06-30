package si0;

/* loaded from: classes11.dex */
public final class u0 implements com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51
    /* renamed from: getStrangerNickname */
    public void mo92055x4e118e7a(java.lang.String username, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ri0.a.f477554a;
        boolean z17 = true;
        java.lang.String string = username.length() > 0 ? ri0.a.f477554a.getString("nickname_".concat(username), null) : null;
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(string)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "get nickname fail, return username instead");
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(username)));
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.Companion.m92057x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24861xad522c51.Companion.m92057x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
