package tf2;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f500449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f500450e;

    /* renamed from: f, reason: collision with root package name */
    public int f500451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f500452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500452g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tf2.f(this.f500452g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500451f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#inQueueReady-viewScopeLaunch wait to time out start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f500452g;
            this.f500450e = h0Var;
            this.f500449d = currentTimeMillis;
            this.f500451f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            p05.x0 x0Var = (p05.x0) h0Var.f391656d;
            if (x0Var != null) {
                ((tf2.g) x0Var).f500454b = new v65.n(rVar);
            }
            if (rVar.j() == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f500449d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#inQueueReady-viewScopeLaunch wait to time out end. interval=" + (java.lang.System.currentTimeMillis() - j17));
        return jz5.f0.f384359a;
    }
}
