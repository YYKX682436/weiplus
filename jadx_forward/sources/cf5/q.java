package cf5;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f122550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122550d = j17;
        this.f122551e = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cf5.q(this.f122550d, this.f122551e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cf5.q qVar = (cf5.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.Map map = cf5.t.f122565f;
        long j17 = this.f122550d;
        java.lang.Long l17 = new java.lang.Long(j17);
        java.lang.Long l18 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(new java.lang.Long(j17));
        ((java.util.concurrent.ConcurrentHashMap) map).put(l17, new java.lang.Long((l18 != null ? l18.longValue() : 0L) + this.f122551e));
        return jz5.f0.f384359a;
    }
}
