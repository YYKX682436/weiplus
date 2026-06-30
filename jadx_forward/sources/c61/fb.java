package c61;

/* loaded from: classes10.dex */
public final class fb implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f120516d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e
    /* renamed from: convertWGS84LocationToGCJ02 */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e mo14271x3a4694d4(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e locationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationInfo, "locationInfo");
        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
        double m91399x2605e9e2 = locationInfo.m91399x2605e9e2();
        double m91400x79d7af9 = locationInfo.m91400x79d7af9();
        ((t60.e) gVar).getClass();
        double[] dArr = new double[2];
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34971xde5778f6(new double[]{m91399x2605e9e2, m91400x79d7af9}, dArr);
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e(dArr[1], dArr[0], locationInfo.m91398xac30a733(), locationInfo.m91401x1a941605());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e
    /* renamed from: getUserCurrentLocation */
    public void mo14272xa6c471cd(long j17, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f locationGeoMode, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationGeoMode, "locationGeoMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((y80.k0) ((z80.g0) i95.n0.c(z80.g0.class))).Ai(this.f120516d, j17, locationGeoMode, callback);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120516d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.Companion.m91384x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f120516d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f120516d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24639xefe2c8e.Companion.m91384x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120516d = binding.mo137508x19263085();
    }
}
