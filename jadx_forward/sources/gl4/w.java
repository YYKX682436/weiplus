package gl4;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f354418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.u80 f354420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f354421g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gl4.z zVar, bw5.u80 u80Var, gl4.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f354419e = zVar;
        this.f354420f = u80Var;
        this.f354421g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gl4.w(this.f354419e, this.f354420f, this.f354421g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((gl4.w) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354418d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.u80 packageInfo = this.f354420f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageInfo, "$packageInfo");
            gl4.a aVar2 = this.f354421g;
            this.f354418d = 1;
            gl4.z zVar = this.f354419e;
            zVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            if (aVar2 != null) {
                aVar2.f354375a = packageInfo;
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new gl4.j(zVar, packageInfo, aVar2, nVar, null), 3, null);
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
