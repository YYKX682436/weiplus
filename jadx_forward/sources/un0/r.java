package un0;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f510944d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f510945e;

    /* renamed from: f, reason: collision with root package name */
    public int f510946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f510948h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f510949i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.app.Activity activity, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510947g = h0Var;
        this.f510948h = activity;
        this.f510949i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new un0.r(this.f510947g, this.f510948h, this.f510949i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((un0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Intent createScreenCaptureIntent;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510946f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity activity = this.f510948h;
            this.f510944d = activity;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f510947g;
            this.f510945e = h0Var2;
            this.f510946f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity;
            java.lang.Object systemService = activityC21401x6ce6f73f.getSystemService("media_projection");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            android.media.projection.MediaProjectionManager mediaProjectionManager = (android.media.projection.MediaProjectionManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                try {
                    java.lang.Object invoke = android.media.projection.MediaProjectionManager.class.getMethod("createScreenCaptureIntent", java.lang.Class.forName("android.media.projection.MediaProjectionConfig")).invoke(mediaProjectionManager, java.lang.Class.forName("android.media.projection.MediaProjectionConfig").getMethod("createConfigForDefaultDisplay", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type android.content.Intent");
                    createScreenCaptureIntent = (android.content.Intent) invoke;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveScreenRecordHelper", "#requestPermission MediaProjectionConfig not available, fallback to default", e17);
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createScreenCaptureIntent);
                }
            } else {
                createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createScreenCaptureIntent);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#requestPermission start activity now");
            ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(createScreenCaptureIntent)).f279410a = new un0.q(this.f510949i, nVar);
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f510945e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = obj;
        return jz5.f0.f384359a;
    }
}
