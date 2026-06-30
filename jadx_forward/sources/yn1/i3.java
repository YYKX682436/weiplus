package yn1;

/* loaded from: classes11.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545240d;

    /* renamed from: e, reason: collision with root package name */
    public int f545241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.w0 f545245i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f545246m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(yn1.a4 a4Var, long j17, java.lang.String str, bw5.w0 w0Var, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545242f = a4Var;
        this.f545243g = j17;
        this.f545244h = str;
        this.f545245i = w0Var;
        this.f545246m = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.i3(this.f545242f, this.f545243g, this.f545244h, this.f545245i, this.f545246m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xn1.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545241e;
        java.lang.String str = this.f545244h;
        yn1.a4 a4Var = this.f545242f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yn1.a4.a(a4Var);
            fo1.m.f346415a.f("Restore", "pkg = " + this.f545243g + ", conv = " + str + ", msg size = " + this.f545245i.f116079d.f115628d.size(), new java.lang.Object[0]);
            xn1.k kVar2 = new xn1.k();
            co1.g gVar = co1.g.f125301a;
            java.lang.String str2 = this.f545244h;
            bw5.w0 w0Var = this.f545245i;
            this.f545240d = kVar2;
            this.f545241e = 1;
            if (gVar.k(str2, w0Var, -1L, this) == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (xn1.k) this.f545240d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        oo1.o.f428684a.f(str);
        java.lang.String str3 = a4Var.f545139a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[insertChatPackageAsync] taskId=");
        long j17 = this.f545246m;
        sb6.append(j17);
        sb6.append(", convId=");
        sb6.append(str);
        sb6.append(", scopeTime=");
        sb6.append(kVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
        if (aVar2 != null) {
            aVar2.v(j17);
        }
        return jz5.f0.f384359a;
    }
}
