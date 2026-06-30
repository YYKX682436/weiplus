package a12;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements a12.k, gq0.v, jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f525f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f526g;

    /* renamed from: h, reason: collision with root package name */
    public iq0.c f527h;

    /* renamed from: i, reason: collision with root package name */
    public int f528i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f529m;

    public s() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) c17;
        com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc = f5Var.Vc(764);
        kotlin.jvm.internal.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f523d = kz5.c0.k(((com.tencent.mm.plugin.magicbrush.m5) d4Var).Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc, "MagicEcsKFDynamicCard"));
        ((op0.k) ((op0.i) i95.n0.c(op0.i.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.o8();
        java.lang.String name = com.tencent.mm.plugin.appbrand.jsapi.o8.class.getName();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.eb();
        this.f524e = kz5.p1.d(name, com.tencent.mm.plugin.appbrand.jsapi.eb.class.getName(), f5Var.Vc(251).getClass().getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX).getClass().getName(), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX).getClass().getName());
        this.f526g = true;
    }

    public void Ai() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "createBiz and active");
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f527h = gq0.t.de((gq0.t) c17, new a12.o(this), null, 2, null);
        iq0.c Bi = Bi();
        if (Bi != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, Bi, null, 2, null);
        }
    }

    public final iq0.c Bi() {
        iq0.c cVar = this.f527h;
        if (cVar != null) {
            return cVar;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return gq0.t.de((gq0.t) c17, new a12.o(this), null, 2, null);
    }

    public void Di(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "onReceiveNewMsg, frameSetName:" + str + ", frameSetData:" + str2);
        if (str == null || str2 == null) {
            return;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f527h = gq0.t.de((gq0.t) c17, new a12.o(this), null, 2, null);
        i95.m c18 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        iq0.c Bi = Bi();
        float dimension = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479866hf);
        bf3.x0 x0Var = bf3.x0.f19674a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.Point a17 = x0Var.a(context);
        gq0.t.Qh((gq0.t) c18, Bi, null, str, str2, new android.graphics.Rect(0, 0, a06.d.b(java.lang.Math.min(a17.x, a17.y) - (dimension * 2)), 0), hq0.m0.f283032d, 2, null);
    }

    public void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "removeAllFrameSetView");
        iq0.c Bi = Bi();
        if (Bi != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            gq0.t.gj((gq0.t) c17, Bi, null, 2, null);
        }
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        a12.j jVar;
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "notifyFrameSetRemove,frameSetId:" + frameSetId + ", isBizConnect:" + this.f526g);
        java.lang.String b17 = vq0.a.b(frameSetId);
        java.lang.ref.WeakReference weakReference = this.f525f;
        if (weakReference == null || (jVar = (a12.j) weakReference.get()) == null) {
            return;
        }
        boolean z17 = this.f526g;
        com.tencent.mm.ui.chatting.component.w9 w9Var = (com.tencent.mm.ui.chatting.component.w9) jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "markViewUpdate: framesetname:" + b17 + ", refresh:true, isBizConn:" + z17);
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) w9Var.f200161e.get(b17);
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "framesetname:" + b17 + " holder is null");
            return;
        }
        w9Var.p0(g0Var, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "markview update isForeGround:" + w9Var.f200162f + ", refresh:true");
        if (w9Var.f200162f && z17) {
            w9Var.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    @Override // jc3.l0
    public void b1() {
        this.f526g = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "notifyConnException");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // qp0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ca(java.lang.String r11, java.util.HashMap r12, yz5.q r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a12.s.ca(java.lang.String, java.util.HashMap, yz5.q):void");
    }

    @Override // jc3.l0
    public void d0(boolean z17) {
        a12.j jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "notifyRecreateBiz");
        this.f526g = true;
        java.lang.ref.WeakReference weakReference = this.f525f;
        if (weakReference == null || (jVar = (a12.j) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.w9) jVar).n0();
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(null);
    }

    @Override // jc3.l0
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "notifyDestroyBiz");
        this.f527h = null;
        this.f529m = null;
    }

    public boolean wi(java.lang.Integer num) {
        jz5.l lVar;
        if (num != null) {
            int intValue = num.intValue();
            i95.m c17 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            this.f527h = gq0.t.de((gq0.t) c17, new a12.o(this), null, 2, null);
            iq0.c Bi = Bi();
            if (Bi != null) {
                java.lang.String Ni = ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ni(Bi);
                java.lang.String str = r26.n0.N(Ni) ^ true ? Ni : null;
                if (str == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsKFDynamicCardService", "pkgConfig is null");
                    return false;
                }
                try {
                    int optInt = new org.json.JSONObject(str).optInt("updateUnixTimeStamp", 0);
                    if (optInt >= intValue) {
                        lVar = new jz5.l(java.lang.Boolean.TRUE, "PkgUpdateTime is valid, updateUnixTimeStamp: " + optInt + ", minUpdateUnixTimeStamp: " + intValue);
                    } else {
                        lVar = new jz5.l(java.lang.Boolean.FALSE, "Package is out of date, updateUnixTimeStamp: " + optInt + ", minUpdateUnixTimeStamp: " + intValue);
                    }
                } catch (java.lang.Throwable th6) {
                    lVar = new jz5.l(java.lang.Boolean.FALSE, "PkgUpdateTime is invalid, error: " + th6.getMessage());
                }
                boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
                java.lang.String str2 = (java.lang.String) lVar.f302834e;
                y02.w0 w0Var = y02.x0.f458634d;
                y02.v0 a17 = w0Var.a();
                bw5.d5 d5Var = bw5.d5.EcsKfDynamicCardPkgCheckResult;
                if (a17 != null) {
                    a17.bb(d5Var, booleanValue ? 1 : 2, "", bw5.e5.SampleRate_OnePercent);
                }
                if (booleanValue) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", str2);
                    return true;
                }
                y02.v0 a18 = w0Var.a();
                if (a18 != null) {
                    a18.p1(d5Var, 3, "{\"invalid_reason\":" + str2 + '}');
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsKFDynamicCardService", str2);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsKFDynamicCardService", "checkPkgVersion, minUpdateUnixTimeStamp is null");
        return false;
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new a12.n(this);
    }
}
