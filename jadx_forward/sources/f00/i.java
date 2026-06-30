package f00;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f339844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f339847h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, java.lang.String str, int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f339844e = j17;
        this.f339845f = str;
        this.f339846g = i17;
        this.f339847h = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f00.i(this.f339844e, this.f339845f, this.f339846g, this.f339847h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f00.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f339843d;
        boolean z17 = false;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.ne0 ne0Var = new bw5.ne0();
            ne0Var.d(this.f339844e);
            ne0Var.c(this.f339845f);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            this.f339843d = 1;
            obj = ((b00.r) z2Var).vj(ne0Var, this.f339846g, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.qe0 qe0Var = (bw5.qe0) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (qe0Var == null) {
            return f0Var;
        }
        int i18 = qe0Var.b().f113128f;
        int i19 = qe0Var.b().f113127e;
        if (i18 == 1 && i19 == 1) {
            z17 = true;
        }
        this.f339847h.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17));
        return f0Var;
    }
}
