package ax;

/* loaded from: classes7.dex */
public abstract class t extends dq0.a0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f14959r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dq0.q mbPlugin) {
        super(mbPlugin);
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
    }

    @Override // dq0.a0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public cx.w0 t() {
        java.lang.ref.WeakReference weakReference = this.f14959r;
        if (weakReference != null) {
            return (cx.w0) weakReference.get();
        }
        return null;
    }

    @Override // dq0.a0
    public void a(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        if (frameSet.f265483g <= 0) {
            vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
            bVar.getClass();
            java.lang.String frameSetName = frameSet.f265477a;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            int i17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) bVar.f440590d).getValue()).getInt(frameSetName, 0);
            if (i17 > 0) {
                frameSet.f265483g = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "beforeFrameSetBind set cached height: " + frameSet);
            }
        }
    }

    @Override // dq0.a0, dq0.j
    public void attachFrameSet(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(extra, "extra");
        cx.w0 t17 = t();
        if (t17 != null && (V0 = t17.V0(frameSetId)) != null) {
            cl0.g gVar = new cl0.g(extra);
            mq0.d1 d1Var = mq0.d1.f330546a;
            java.lang.String sessionId = java.lang.String.valueOf(com.tencent.mm.storage.c2.f193803a);
            int optInt = gVar.optInt("position", -1);
            boolean optBoolean = gVar.optBoolean("isRecCard");
            java.lang.String key = V0.f265478b;
            kotlin.jvm.internal.o.g(key, "key");
            java.lang.String frameSetName = V0.f265477a;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            long j17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) mq0.d1.f330549d).getValue()).getLong(frameSetName, -1L);
            boolean contains = mq0.d1.f330550e.contains(frameSetName);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("cardName", key);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId);
            jSONObject.put("position", optInt);
            jSONObject.put("receiveTime", j17);
            jSONObject.put("exposeTime", currentTimeMillis);
            jSONObject.put("exposeFromReceive", j17 <= 0 ? -1L : currentTimeMillis - j17);
            jSONObject.put("realtime", contains);
            jSONObject.put("isRecCard", optBoolean);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate iMagicBrushMonitor$SampleRate = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneThousandth;
            iVar.Sc("MagicBrandCardExposeRaw", 1, jSONObject2, iMagicBrushMonitor$SampleRate.getValue());
            java.util.HashSet hashSet = mq0.d1.f330548c;
            if (!hashSet.contains(key)) {
                hashSet.add(key);
                ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandCardExpose", 1, jSONObject.toString(), iMagicBrushMonitor$SampleRate.getValue());
            }
        }
        super.attachFrameSet(rootId, frameSetId, extra);
    }

    @Override // dq0.a0
    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        hq0.e0 h17;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
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
        return kz5.c1.m(this.f242298q, kz5.c1.k(new jz5.l("scroll", new ax.d(this)), new jz5.l("onPopupWindowDismiss", new ax.e(this)), new jz5.l("resume", new ax.f(this)), new jz5.l("pause", new ax.g(this)), new jz5.l("onScreenShot", new ax.h(this)), new jz5.l("onFrameSetExpose", new ax.i(this)), new jz5.l("onFlutterListCardExpose", new ax.j(this)), new jz5.l("brandServiceBoxQuit", new ax.k(this)), new jz5.l("enterFinderHot", new ax.l(this)), new jz5.l("exitFinderHot", new ax.c(this))));
    }

    @Override // dq0.a0
    public synchronized void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine ");
        cx.w0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", sb6.toString());
        super.m(binding);
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        cx.w0 w0Var;
        kotlin.jvm.internal.o.g(binding, "binding");
        super.onAttachedToActivity(binding);
        java.lang.ref.WeakReference weakReference = this.f14959r;
        if (weakReference == null || (w0Var = (cx.w0) weakReference.get()) == null) {
            return;
        }
        w0Var.f224481z = new java.lang.ref.WeakReference(binding.getActivity());
        w0Var.m1();
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.FlutterPlugin
    public synchronized void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttachedToEngine ");
        cx.w0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", sb6.toString());
        super.onAttachedToEngine(binding);
        ((cx.j1) y()).Di(13);
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        cx.w0 w0Var;
        this.f242297p = null;
        java.lang.ref.WeakReference weakReference = this.f14959r;
        if (weakReference == null || (w0Var = (cx.w0) weakReference.get()) == null) {
            return;
        }
        w0Var.f224481z = new java.lang.ref.WeakReference(null);
        w0Var.m1();
    }

    @Override // dq0.a0
    public void s(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        frameSet.f265485i = new ax.q(frameSet);
    }

    @Override // dq0.a0
    public void u() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "recreateBizForEngineChangeStatus - force destroy and recreate brand service");
        cx.w0 t17 = t();
        if (t17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "Force destroying brand service: " + t17.O0());
            t17.destroy();
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
