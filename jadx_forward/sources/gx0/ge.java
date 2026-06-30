package gx0;

/* loaded from: classes5.dex */
public final class ge extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358003d = bfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ge(this.f358003d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.ge geVar = (gx0.ge) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        geVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (az0.i5.f97090a.t()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db(new android.os.Handler(android.os.Looper.getMainLooper()));
            gx0.bf bfVar = this.f358003d;
            c4152x8b3cf7db.m34167x827608f3(new gx0.de(bfVar));
            c4152x8b3cf7db.m34170x9eb0dc64(new gx0.ee(bfVar));
            c4152x8b3cf7db.m34169xe631c72f(gx0.fe.f357970a);
            bfVar.B = c4152x8b3cf7db;
        }
        return jz5.f0.f384359a;
    }
}
