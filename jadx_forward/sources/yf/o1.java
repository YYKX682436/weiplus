package yf;

/* loaded from: classes15.dex */
public class o1 extends sc1.r1 implements yf.o {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 f542961d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.p1 f542962e;

    public o1(android.content.Context context) {
        super(context);
        this.f542962e = new yf.p1(this.f487259a);
    }

    @Override // yf.o
    public void a() {
        if (this.f542961d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherJSAdapterV2SameLayerSupport", "sendWeChatStop, send event 5001");
            this.f542961d.mo29886xceec7081(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28, new android.os.Bundle());
        }
    }

    @Override // yf.o
    public void b() {
        if (this.f542961d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherJSAdapterV2SameLayerSupport", "sendHandupStop, send event 5000");
            this.f542961d.mo29886xceec7081(5000, new android.os.Bundle());
        }
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 g(android.os.Bundle bundle) {
        sc1.k1 g17 = super.g(bundle);
        yf.p1 p1Var = this.f542962e;
        if (bundle == null) {
            p1Var.getClass();
        } else if (p1Var.f542968b) {
            p1Var.c(bundle, false);
        }
        return g17;
    }

    @Override // yf.o
    /* renamed from: getMaxZoom */
    public int mo176944x70202721() {
        return this.f487259a.m32021x70202721();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202 A[Catch: Exception -> 0x021a, TRY_LEAVE, TryCatch #1 {Exception -> 0x021a, blocks: (B:85:0x013d, B:111:0x0153, B:87:0x0164, B:89:0x016e, B:93:0x01b5, B:95:0x01bb, B:98:0x01c7, B:99:0x01d7, B:104:0x01eb, B:101:0x0202, B:105:0x0178, B:109:0x0187, B:107:0x0198), top: B:84:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0256  */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    @Override // sc1.r1, sc1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sc1.k1 h(java.lang.String r40, org.json.JSONObject r41) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.o1.h(java.lang.String, org.json.JSONObject):sc1.k1");
    }

    @Override // yf.o
    public sc1.k1 i(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m32022x656bc683 = this.f487259a.m32022x656bc683(bundle);
        yf.p1 p1Var = this.f542962e;
        if (bundle == null) {
            p1Var.getClass();
        } else {
            p1Var.c(bundle, true);
            p1Var.f542968b = true;
        }
        return new sc1.k1(m32022x656bc683);
    }

    @Override // yf.o
    /* renamed from: isPushing */
    public boolean mo176945xd057a1fe() {
        return this.f487259a.m32024xd057a1fe();
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 k() {
        sc1.k1 k17 = super.k();
        this.f542962e.f542968b = false;
        return k17;
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 n(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        sc1.k1 n17 = super.n(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle);
        yf.p1 p1Var = this.f542962e;
        p1Var.getClass();
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null && bundle != null) {
            p1Var.c(bundle, true);
            p1Var.f542968b = true;
        }
        return n17;
    }

    @Override // yf.o
    /* renamed from: setFocusPosition */
    public sc1.k1 mo176946xb39e1cdf(float f17, float f18) {
        return new sc1.k1(this.f487259a.m32030xb39e1cdf(f17, f18));
    }

    @Override // sc1.r1, sc1.l
    /* renamed from: setPushListener */
    public void mo164243x4e5bab70(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        super.mo164243x4e5bab70(interfaceC25480xa8fcc7a7);
        this.f542961d = interfaceC25480xa8fcc7a7;
    }

    @Override // yf.o
    /* renamed from: setSurface */
    public sc1.k1 mo176947x42c875eb(android.view.Surface surface) {
        return new sc1.k1(this.f487259a.m32033x42c875eb(surface));
    }

    @Override // yf.o
    /* renamed from: setSurfaceSize */
    public sc1.k1 mo176948x1c9cdc8c(int i17, int i18) {
        return new sc1.k1(this.f487259a.m32034x1c9cdc8c(i17, i18));
    }

    @Override // yf.o
    /* renamed from: setZoom */
    public sc1.k1 mo176949x76535355(int i17) {
        return new sc1.k1(this.f487259a.m32036x76535355(i17));
    }
}
