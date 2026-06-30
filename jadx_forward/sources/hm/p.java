package hm;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hm.u f363698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f363699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, hm.u uVar, java.lang.Class cls, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363697d = h0Var;
        this.f363698e = uVar;
        this.f363699f = cls;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hm.p(this.f363697d, this.f363698e, this.f363699f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hm.p pVar = (hm.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f363697d.f391656d = ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f363698e.f363712g).mo141623x754a37bb()).get(this.f363699f);
        return jz5.f0.f384359a;
    }
}
