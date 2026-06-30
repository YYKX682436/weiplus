package rk4;

/* loaded from: classes11.dex */
public final class q3 implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f478463g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25045x5b70b0b9 f478464h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f478465i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f478460d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f478461e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f478462f = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f478466m = "MicroMsg.FlutterTingMVTexturePlugin@" + hashCode();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96
    /* renamed from: dispose */
    public void mo92841x63a5261f(java.lang.String taskId, java.lang.String listendId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listendId, "listendId");
        java.lang.String str = taskId + '_' + listendId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose plugin:");
        sb6.append(hashCode());
        sb6.append(", task:");
        sb6.append(taskId);
        sb6.append(", listenId:");
        sb6.append(listendId);
        sb6.append(", hasTexture:");
        java.util.HashMap hashMap = this.f478460d;
        sb6.append(hashMap.containsKey(str));
        sb6.append(", hasTextureInfo:");
        java.util.HashMap hashMap2 = this.f478461e;
        sb6.append(hashMap2.containsKey(str));
        sb6.append(", hasCallback:");
        java.util.HashMap hashMap3 = this.f478462f;
        sb6.append(hashMap3.containsKey(str));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f478466m;
        rk4.k5.e(sb7, str2);
        yz5.l lVar = (yz5.l) hashMap3.get(str);
        ll4.c d17 = zk4.l.f555071a.d(taskId);
        jz5.f0 f0Var = null;
        if (d17 != null) {
            boolean z17 = lVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17.a(), lVar);
            rk4.k5.e("dispose: videoHandler found, isOwnCallback=" + z17 + ", plugin:" + hashCode(), str2);
            if (z17) {
                rk4.k5.e("dispose: clearing onPrepared & surface (callback belongs to this plugin:" + hashCode() + ')', str2);
                d17.p(null);
                d17.mo145966x42c875eb(null);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            rk4.k5.e("dispose: videoHandler is null for taskId=".concat(taskId), str2);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) hashMap.remove(str);
        if (surfaceProducer != null) {
            rk4.k5.e("dispose: releasing SurfaceProducer for key=" + str + ", plugin:" + surfaceProducer.hashCode(), str2);
            surfaceProducer.mo138094x41012807();
        }
        hashMap2.remove(str);
        hashMap3.remove(str);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96
    /* renamed from: getTexture */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25184x7851347b mo92842xe94b10e5(java.lang.String taskId, java.lang.String listendId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listendId, "listendId");
        java.lang.String str = taskId + '_' + listendId;
        this.f478465i = taskId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getTexture plugin:");
        sb6.append(hashCode());
        sb6.append(", task:");
        sb6.append(taskId);
        sb6.append(", listenId:");
        sb6.append(listendId);
        sb6.append(", textureMapKeys:");
        sb6.append(this.f478460d.keySet());
        sb6.append(", textureInfoMapKeys:");
        java.util.HashMap hashMap = this.f478461e;
        sb6.append(hashMap.keySet());
        sb6.append(", preparedCallbackMapKeys:");
        java.util.HashMap hashMap2 = this.f478462f;
        sb6.append(hashMap2.keySet());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f478466m;
        rk4.k5.e(sb7, str2);
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25184x7851347b c25184x7851347b = hashMap.containsKey(str) ? (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25184x7851347b) hashMap.get(str) : null;
        if (c25184x7851347b != null) {
            rk4.k5.e("existed TextureInfo id:" + c25184x7851347b.m93176xc2ca74e0() + ", width:" + c25184x7851347b.m93177x6dff3e1() + ", height:" + c25184x7851347b.m93175xbb4f8e6c(), str2);
        }
        ll4.c d17 = zk4.l.f555071a.d(taskId);
        if (d17 == null) {
            rk4.k5.e("getTexture: videoHandler is null for taskId=" + taskId + ", playerCore may not be created yet. Will return cached textureInfo=" + c25184x7851347b, str2);
        }
        if (d17 != null) {
            rk4.o3 o3Var = new rk4.o3(this, taskId, listendId, new rk4.p3(this, str));
            hashMap2.put(str, o3Var);
            yz5.l a17 = d17.a();
            boolean z17 = a17 == null || hashMap2.containsValue(a17);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("setOnPrepared: plugin:");
            sb8.append(d17.hashCode());
            sb8.append(", videoHandler:");
            sb8.append(d17);
            sb8.append(", existingCallback=");
            sb8.append(a17 != null);
            sb8.append(", isOwnCallback=");
            sb8.append(z17);
            sb8.append(", preparedCallbackCount:");
            sb8.append(hashMap2.size());
            sb8.append(", will set unconditionally");
            rk4.k5.e(sb8.toString(), str2);
            d17.p(o3Var);
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("getTexture result: plugin:");
        sb9.append(hashCode());
        sb9.append(", returning textureInfo=");
        sb9.append(c25184x7851347b != null);
        sb9.append(", textureId=");
        sb9.append(c25184x7851347b != null ? c25184x7851347b.m93176xc2ca74e0() : null);
        rk4.k5.e(sb9.toString(), str2);
        return c25184x7851347b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        rk4.k5.e("onAttachedToEngine plugin:" + hashCode(), this.f478466m);
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25040x57379b96.Companion.m92844x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f478463g = flutterPluginBinding.m137988x3128f042();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f478464h = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25045x5b70b0b9(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.q3.mo264x6a0307dd(io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding):void");
    }
}
