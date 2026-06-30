package fw1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw1.h f348609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jw1.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348609d = hVar;
        this.f348610e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fw1.f(this.f348609d, this.f348610e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fw1.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qw1.j jVar = this.f348609d.f383838g;
        jVar.getClass();
        java.lang.String username = this.f348610e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        qw1.c cVar = jVar.f448645h;
        if (cVar == null) {
            is0.c b17 = is0.b.b(false, 19L);
            jVar.f448643f.add(b17);
            qw1.c cVar2 = new qw1.c(jVar, username, b17);
            jVar.f448645h = cVar2;
            cVar = cVar2;
        }
        is0.c cVar3 = cVar.f448611b;
        return new jz5.l(cVar3, new android.graphics.SurfaceTexture(cVar3.f375928e));
    }
}
