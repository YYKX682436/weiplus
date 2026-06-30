package vb5;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj5.a f516361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb5.l f516362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.q f516363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yj5.a aVar, vb5.l lVar, yb5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516361d = aVar;
        this.f516362e = lVar;
        this.f516363f = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vb5.b(this.f516361d, this.f516362e, this.f516363f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vb5.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vb5.l lVar = this.f516362e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            yj5.a aVar2 = this.f516361d;
            yb5.d dVar = lVar.f280113d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dVar, "access$getMChattingContext$p$s699518984(...)");
            yb5.q talkerInfo = this.f516363f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkerInfo, "$talkerInfo");
            aVar2.getClass();
            java.util.List m17 = aVar2.m(dVar, talkerInfo);
            aVar2.f544236e = m17;
            return m17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(lVar.f516389e, th6, "prepare tipsbar data err", new java.lang.Object[0]);
            return null;
        }
    }
}
