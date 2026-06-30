package hm;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hm.u f363708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w65.m f363709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, hm.u uVar, w65.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363707d = h0Var;
        this.f363708e = uVar;
        this.f363709f = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hm.t(this.f363707d, this.f363708e, this.f363709f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hm.t tVar = (hm.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object putIfAbsent;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hm.u uVar = this.f363708e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) uVar.f363712g).mo141623x754a37bb();
        w65.m mVar = this.f363709f;
        java.lang.Class z17 = mVar.z1();
        java.lang.Object obj2 = concurrentHashMap.get(z17);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(z17, (obj2 = (x65.a) mVar.z1().getConstructor(p012xc85e97e9.p093xedfae76a.y.class).newInstance(uVar.f381800d)))) != null) {
            obj2 = putIfAbsent;
        }
        this.f363707d.f391656d = obj2;
        return jz5.f0.f384359a;
    }
}
