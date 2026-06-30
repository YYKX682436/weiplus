package my1;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ my1.j f414221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, my1.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414220e = str;
        this.f414221f = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new my1.h(this.f414220e, this.f414221f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((my1.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414219d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f414220e;
            if (str == null) {
                str = "";
            }
            my1.e eVar = new my1.e(str);
            this.f414219d = 1;
            obj = eVar.d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.u4 u4Var = (bw5.u4) obj;
        mk.e eVar2 = this.f414221f.f414225a;
        if (eVar2 != null) {
            ((ry5.b) eVar2).d(u4Var.f115265e[2] ? u4Var.f115264d : "");
        }
        return jz5.f0.f384359a;
    }
}
