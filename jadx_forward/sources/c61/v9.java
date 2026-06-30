package c61;

/* loaded from: classes11.dex */
public final class v9 implements com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final long f120885d;

    /* renamed from: e, reason: collision with root package name */
    public final long f120886e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f120887f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f120888g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public long f120889h;

    /* renamed from: i, reason: collision with root package name */
    public long f120890i;

    /* renamed from: m, reason: collision with root package name */
    public long f120891m;

    public v9(long j17, long j18) {
        this.f120885d = j17;
        this.f120886e = j18;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getBindFlutterInstanceMills */
    public long mo14404x689cded9() {
        return this.f120889h;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getDartVMMemoryInfo */
    public void mo14405xc4af6bdb(yz5.l callback) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28673xc6a7afef m137449x3d144ed9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((java.util.ArrayList) this.f120888g).add(callback);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f120887f;
        if (c28580x69eec95e == null || (m137449x3d144ed9 = c28580x69eec95e.m137449x3d144ed9()) == null) {
            return;
        }
        m137449x3d144ed9.m138351x939f934c();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getFlutterEngineCreateFinishMills */
    public long mo14406xe575cb80() {
        return this.f120886e;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getFlutterEngineCreateStartMills */
    public long mo14407xe79499() {
        return this.f120885d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getNativeFirstPointerDownMills */
    public long mo14408xa1df645b() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getNativeFirstScrollMills */
    public long mo14409x58370567() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getPageEnterMills */
    public long mo14410x3b0154c4() {
        return this.f120891m;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getSnapshotRenderMills */
    public long mo14411x7af4e847() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa
    /* renamed from: getTransitionReportInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.C25228x34d6d3d8 mo14412xf33d93ad() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.C25228x34d6d3d8(this.f120890i, 0L, 0L);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p07.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2884x6bc5090.InterfaceC25229x9fd1fbaa.Companion.m93356x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f120887f = binding.m137986xf7af55c8();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120887f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p07.mo137508x19263085();
    }
}
