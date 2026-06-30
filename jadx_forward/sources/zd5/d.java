package zd5;

/* loaded from: classes9.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.j f553204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f553205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f553206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ae5.j jVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553204d = jVar;
        this.f553205e = h0Var;
        this.f553206f = k3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zd5.d(this.f553204d, this.f553205e, this.f553206f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zd5.d dVar = (zd5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ae5.j jVar = this.f553204d;
        java.lang.String str2 = jVar.f85950g;
        if (str2 != null) {
            if (r26.i0.o(str2, "hd", false, 2, null)) {
                str = jVar.f85950g;
            } else {
                str = jVar.f85950g + "hd";
            }
            str2 = str;
            if (com.p314xaae8f345.mm.vfs.w6.k(str2) == 0) {
                str2 = str2.substring(0, str2.length() - 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f553206f;
        this.f553205e.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str2, ((zd5.r) k3Var).f553242i.getWidth(), ((zd5.r) k3Var).f553242i.getHeight());
        return jz5.f0.f384359a;
    }
}
