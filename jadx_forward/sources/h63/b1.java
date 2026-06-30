package h63;

/* loaded from: classes7.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h63.g1 f360748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(h63.g1 g1Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360748e = g1Var;
        this.f360749f = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h63.b1(this.f360748e, this.f360749f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h63.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360747d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h63.g1 g1Var = this.f360748e;
            boolean z17 = false;
            if (g1Var.f360768e) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = g1Var.f360769f;
                if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
                    z17 = true;
                }
                if (z17 && (r2Var = g1Var.f360769f) != null) {
                    this.f360747d = 1;
                    if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "do start service");
                    int i18 = android.os.Build.VERSION.SDK_INT;
                    android.content.Context context = this.f360749f;
                    if (i18 >= 26) {
                        context.startForegroundService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1766x7643c6b5.ServiceC16073xa10d4774.class));
                    } else {
                        context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1766x7643c6b5.ServiceC16073xa10d4774.class));
                    }
                    g1Var.f360768e = true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameLiveMainProcessService", e17, "start foreground service error", new java.lang.Object[0]);
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
