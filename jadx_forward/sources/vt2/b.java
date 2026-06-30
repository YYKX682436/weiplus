package vt2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f521470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ld2 f521471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt2.c f521472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, r45.ld2 ld2Var, vt2.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521469d = str;
        this.f521470e = i17;
        this.f521471f = ld2Var;
        this.f521472g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt2.b(this.f521469d, this.f521470e, this.f521471f, this.f521472g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vt2.b bVar = (vt2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f521469d;
        int i17 = this.f521470e;
        bw5.vk vkVar = new bw5.vk();
        vt2.c cVar = this.f521472g;
        vkVar.f115918d = cVar.f521474b;
        vkVar.f115919e[1] = true;
        new ke2.o0(str, i17, vkVar, this.f521471f, null).l().K(new vt2.a(cVar));
        return jz5.f0.f384359a;
    }
}
