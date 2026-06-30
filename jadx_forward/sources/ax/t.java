package ax;

/* loaded from: classes7.dex */
public abstract class t extends dq0.a0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f96492r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dq0.q mbPlugin) {
        super(mbPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
    }

    @Override // dq0.a0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public cx.w0 t() {
        java.lang.ref.WeakReference weakReference = this.f96492r;
        if (weakReference != null) {
            return (cx.w0) weakReference.get();
        }
        return null;
    }

    @Override // dq0.a0
    public void a(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        if (frameSet.f347016g <= 0) {
            vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
            bVar.getClass();
            java.lang.String frameSetName = frameSet.f347010a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            int i17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) bVar.f522123d).mo141623x754a37bb()).getInt(frameSetName, 0);
            if (i17 > 0) {
                frameSet.f347016g = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "beforeFrameSetBind set cached height: " + frameSet);
            }
        }
    }

    @Override // dq0.a0, dq0.j
    /* renamed from: attachFrameSet */
    public void mo9214xe590c51a(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        cx.w0 t17 = t();
        if (t17 != null && (V0 = t17.V0(frameSetId)) != null) {
            cl0.g gVar = new cl0.g(extra);
            mq0.d1 d1Var = mq0.d1.f412079a;
            java.lang.String sessionId = java.lang.String.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a);
            int mo15080xc3ca103c = gVar.mo15080xc3ca103c("position", -1);
            boolean optBoolean = gVar.optBoolean("isRecCard");
            java.lang.String key = V0.f347011b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            java.lang.String frameSetName = V0.f347010a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            long j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) mq0.d1.f412082d).mo141623x754a37bb()).getLong(frameSetName, -1L);
            boolean contains = mq0.d1.f412083e.contains(frameSetName);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("cardName", key);
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionId);
            jSONObject.put("position", mo15080xc3ca103c);
            jSONObject.put("receiveTime", j17);
            jSONObject.put("exposeTime", currentTimeMillis);
            jSONObject.put("exposeFromReceive", j17 <= 0 ? -1L : currentTimeMillis - j17);
            jSONObject.put("realtime", contains);
            jSONObject.put("isRecCard", optBoolean);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa enumC16455x3f8428aa = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37610xc8814b8;
            iVar.Sc("MagicBrandCardExposeRaw", 1, jSONObject2, enumC16455x3f8428aa.getValue());
            java.util.HashSet hashSet = mq0.d1.f412081c;
            if (!hashSet.contains(key)) {
                hashSet.add(key);
                ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandCardExpose", 1, jSONObject.toString(), enumC16455x3f8428aa.getValue());
            }
        }
        super.mo9214xe590c51a(rootId, frameSetId, extra);
    }

    @Override // dq0.a0
    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        hq0.e0 h17;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        cx.w0 t17 = t();
        if (t17 == null || (hashMap2 = t17.A) == null || (h17 = (hq0.e0) hashMap2.get(path)) == null) {
            h17 = super.h(path, query);
            cx.w0 t18 = t();
            if (t18 != null && (hashMap = t18.A) != null) {
                hashMap.put(path, h17);
            }
        }
        return h17;
    }

    @Override // dq0.a0
    public java.util.Map j() {
        return kz5.c1.m(this.f323831q, kz5.c1.k(new jz5.l("scroll", new ax.d(this)), new jz5.l("onPopupWindowDismiss", new ax.e(this)), new jz5.l("resume", new ax.f(this)), new jz5.l("pause", new ax.g(this)), new jz5.l("onScreenShot", new ax.h(this)), new jz5.l("onFrameSetExpose", new ax.i(this)), new jz5.l("onFlutterListCardExpose", new ax.j(this)), new jz5.l("brandServiceBoxQuit", new ax.k(this)), new jz5.l("enterFinderHot", new ax.l(this)), new jz5.l("exitFinderHot", new ax.c(this))));
    }

    @Override // dq0.a0
    public synchronized void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine ");
        cx.w0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", sb6.toString());
        super.m(binding);
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        cx.w0 w0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.mo260x9f807ad(binding);
        java.lang.ref.WeakReference weakReference = this.f96492r;
        if (weakReference == null || (w0Var = (cx.w0) weakReference.get()) == null) {
            return;
        }
        w0Var.f306014z = new java.lang.ref.WeakReference(binding.mo137508x19263085());
        w0Var.m1();
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public synchronized void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttachedToEngine ");
        cx.w0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", sb6.toString());
        super.mo261xdddc9e60(binding);
        ((cx.j1) y()).Di(13);
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        cx.w0 w0Var;
        this.f323830p = null;
        java.lang.ref.WeakReference weakReference = this.f96492r;
        if (weakReference == null || (w0Var = (cx.w0) weakReference.get()) == null) {
            return;
        }
        w0Var.f306014z = new java.lang.ref.WeakReference(null);
        w0Var.m1();
    }

    @Override // dq0.a0
    public void s(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        frameSet.f347018i = new ax.q(frameSet);
    }

    @Override // dq0.a0
    public void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "recreateBizForEngineChangeStatus - force destroy and recreate brand service");
        cx.w0 t17 = t();
        if (t17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "Force destroying brand service: " + t17.O0());
            t17.mo123041x5cd39ffa();
            y().K6(6);
            ((cx.j1) y()).Di(9);
        }
    }

    public abstract bx.t y();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(java.lang.String r8, byte[] r9, yz5.l r10) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.t.z(java.lang.String, byte[], yz5.l):void");
    }
}
