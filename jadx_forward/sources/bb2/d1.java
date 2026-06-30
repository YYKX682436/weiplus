package bb2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f100375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f100376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(bb2.w1 w1Var, long j17, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100374d = w1Var;
        this.f100375e = j17;
        this.f100376f = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bb2.d1(this.f100374d, this.f100375e, this.f100376f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bb2.d1 d1Var = (bb2.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bb2.w1 w1Var = (bb2.w1) new java.lang.ref.WeakReference(this.f100374d).get();
        if (w1Var != null) {
            long m59251x5db1b11 = w1Var.e().getFeedObject().m59251x5db1b11();
            int b17 = a06.d.b(w1Var.f() * 100);
            java.lang.String u17 = pm0.v.u(this.f100375e);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = w1Var.f100586r;
            java.util.Map t17 = kz5.c1.t(this.f100376f);
            t17.put("feed_id", pm0.v.u(m59251x5db1b11));
            t17.put("playpercent", new java.lang.Integer(b17));
            concurrentHashMap.put(u17, t17);
        }
        return jz5.f0.f384359a;
    }
}
