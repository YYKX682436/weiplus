package k14;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f384824d;

    /* renamed from: e, reason: collision with root package name */
    public int f384825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f384826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f384827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wd0.b f384828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, wd0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f384826f = lVar;
        this.f384827g = activityC0065xcd7aa112;
        this.f384828h = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k14.a(this.f384826f, this.f384827g, this.f384828h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k14.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f384825e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null) {
                str = "";
            }
            boolean N = r26.n0.N(str);
            yz5.l lVar2 = this.f384826f;
            if (N) {
                wd0.i2 i2Var = new wd0.i2();
                i2Var.f526259a = 1;
                lVar2.mo146xb9724478(i2Var);
                return f0Var;
            }
            k14.g gVar = k14.g.f384865a;
            this.f384824d = lVar2;
            this.f384825e = 1;
            obj = k14.g.a(gVar, this.f384827g, this.f384828h, this);
            if (obj == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f384824d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lVar.mo146xb9724478(obj);
        return f0Var;
    }
}
