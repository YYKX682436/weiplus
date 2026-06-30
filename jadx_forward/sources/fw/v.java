package fw;

/* loaded from: classes7.dex */
public abstract class v extends dq0.a0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f348570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dq0.q mbPlugin) {
        super(mbPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
    }

    public static final void y(fw.v vVar, java.lang.String str, byte[] bArr, yz5.l callback) {
        vVar.getClass();
        switch (str.hashCode()) {
            case -1760177256:
                if (str.equals("onFrameSetExpose")) {
                    ((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e0) com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e0.f149494h.mo20642x92b714fd(bArr)).g();
                    return;
                }
                return;
            case -1371776827:
                if (!str.equals("onScreenShot")) {
                    return;
                }
                break;
            case -1085405331:
                if (str.equals("onPopupWindowDismiss")) {
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.p pVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.p) com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.p.f149585h.mo20642x92b714fd(bArr);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
                    int i17 = pVar.f149587e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onPopupWindowDismiss reason:" + i17);
                    com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p711x65e70ac.C10487x1041292b c10487x1041292b = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p711x65e70ac.C10487x1041292b();
                    cl0.g gVar = new cl0.g();
                    gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, i17);
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    c10487x1041292b.f229415e = gVar2;
                    hw.c0 t17 = vVar.t();
                    if (t17 != null) {
                        t17.M0(c10487x1041292b);
                    }
                    callback.mo146xb9724478(vVar.p(null));
                    return;
                }
                return;
            case -907680051:
                if (str.equals("scroll")) {
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s m45627x92b714fd = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s.m45627x92b714fd(bArr);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m45627x92b714fd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "handleScroll " + m45627x92b714fd.m45631x8a8fa90c() + ' ' + m45627x92b714fd.m45630x6ee07a10());
                    callback.mo146xb9724478(vVar.p(null));
                    return;
                }
                return;
            case 389178575:
                if (str.equals("onFlutterListCardExpose")) {
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10707x95e6b476 m45359x92b714fd = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10707x95e6b476.m45359x92b714fd(bArr);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m45359x92b714fd, "parseFrom(...)");
                    int mo45362x7b5cb3e0 = m45359x92b714fd.mo45362x7b5cb3e0();
                    java.lang.String mo45365x45e62656 = m45359x92b714fd.mo45365x45e62656();
                    int mo45364xfb9a4d14 = m45359x92b714fd.mo45364xfb9a4d14();
                    long mo45363xfb9a10a7 = m45359x92b714fd.mo45363xfb9a10a7();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onFlutterCardExpose cardType:" + mo45362x7b5cb3e0 + " frameSetName:" + mo45365x45e62656 + " exposeType:" + mo45364xfb9a4d14 + " exposeTime:" + mo45363xfb9a10a7);
                    if (mo45362x7b5cb3e0 == 1) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd c10484x8f75c5cd = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd();
                        cl0.g gVar3 = new cl0.g();
                        gVar3.h("eventName", "brandServiceAdFlutterExpose");
                        gVar3.h("frameSetName", mo45365x45e62656);
                        gVar3.o("exposeType", mo45364xfb9a4d14);
                        gVar3.p("exposeTimeStamp", mo45363xfb9a10a7);
                        java.lang.String gVar4 = gVar3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                        c10484x8f75c5cd.f229415e = gVar4;
                        hw.c0 t18 = vVar.t();
                        if (t18 != null) {
                            t18.M0(c10484x8f75c5cd);
                        }
                    }
                    callback.mo146xb9724478(vVar.p(null));
                    return;
                }
                return;
            case 704897452:
                if (!str.equals("brandServiceBoxQuit")) {
                    return;
                }
                break;
            default:
                return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onBrandServiceEvent eventName:".concat(str));
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd c10484x8f75c5cd2 = new com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.p707x60b7c31.p708x5c6729a.C10484x8f75c5cd();
        cl0.g gVar5 = new cl0.g();
        gVar5.h("eventName", str);
        java.lang.String gVar6 = gVar5.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        c10484x8f75c5cd2.f229415e = gVar6;
        hw.c0 t19 = vVar.t();
        if (t19 != null) {
            t19.M0(c10484x8f75c5cd2);
        }
        callback.mo146xb9724478(vVar.p(null));
    }

    @Override // dq0.a0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public hw.c0 t() {
        java.lang.ref.WeakReference weakReference = this.f348570r;
        if (weakReference != null) {
            return (hw.c0) weakReference.get();
        }
        return null;
    }

    public void B(java.lang.String frameSetName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
        bVar.getClass();
        jz5.g gVar = bVar.f522123d;
        if (i17 <= 0) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).remove(frameSetName);
        } else {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putInt(frameSetName, i17);
        }
    }

    @Override // dq0.a0
    public void a(fq0.x frameSet) {
        int z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        if (frameSet.f347016g > 0 || (z17 = z(frameSet.f347010a)) <= 0) {
            return;
        }
        frameSet.f347016g = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "beforeFrameSetBind set cached height: " + frameSet);
    }

    @Override // dq0.a0, dq0.j
    /* renamed from: attachFrameSet */
    public void mo9214xe590c51a(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        super.mo9214xe590c51a(rootId, frameSetId, extra);
    }

    @Override // dq0.a0
    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        hq0.e0 h17;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        hw.c0 t17 = t();
        if (t17 == null || (hashMap2 = t17.A) == null || (h17 = (hq0.e0) hashMap2.get(path)) == null) {
            h17 = super.h(path, query);
            hw.c0 t18 = t();
            if (t18 != null && (hashMap = t18.A) != null) {
                hashMap.put(path, h17);
            }
        }
        return h17;
    }

    @Override // dq0.a0
    public java.util.Map j() {
        return kz5.c1.m(this.f323831q, kz5.c1.k(new jz5.l("scroll", new fw.i(this)), new jz5.l("onPopupWindowDismiss", new fw.j(this)), new jz5.l("resume", new fw.k(this)), new jz5.l("pause", new fw.l(this)), new jz5.l("onScreenShot", new fw.m(this)), new jz5.l("onFrameSetExpose", new fw.n(this)), new jz5.l("onFlutterListCardExpose", new fw.o(this)), new jz5.l("brandServiceBoxQuit", new fw.p(this))));
    }

    @Override // dq0.a0
    public synchronized void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine ");
        hw.c0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", sb6.toString());
        super.m(binding);
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        hw.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.mo260x9f807ad(binding);
        java.lang.ref.WeakReference weakReference = this.f348570r;
        if (weakReference == null || (c0Var = (hw.c0) weakReference.get()) == null) {
            return;
        }
        c0Var.f366897z = new java.lang.ref.WeakReference(binding.mo137508x19263085());
        c0Var.m1();
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public synchronized void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttachedToEngine ");
        hw.c0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", sb6.toString());
        super.mo261xdddc9e60(binding);
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        hw.c0 c0Var;
        this.f323830p = null;
        java.lang.ref.WeakReference weakReference = this.f348570r;
        if (weakReference == null || (c0Var = (hw.c0) weakReference.get()) == null) {
            return;
        }
        c0Var.f366897z = new java.lang.ref.WeakReference(null);
        c0Var.m1();
    }

    @Override // dq0.a0
    public void s(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        frameSet.f347018i = new fw.s(frameSet, this);
    }

    public int z(java.lang.String frameSetName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
        bVar.getClass();
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) bVar.f522123d).mo141623x754a37bb()).getInt(frameSetName, 0);
    }
}
