package tt2;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f503457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f503459h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ut2.s3 s3Var, so2.j5 j5Var, tt2.e1 e1Var, l81.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503456e = s3Var;
        this.f503457f = j5Var;
        this.f503458g = e1Var;
        this.f503459h = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tt2.h0(this.f503456e, this.f503457f, this.f503458g, this.f503459h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503455d;
        so2.j5 j5Var = this.f503457f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            android.content.Context context = this.f503456e.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.y23 y23Var = ((cm2.m0) j5Var).f124901v;
            this.f503455d = 1;
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) a1Var).aj(context, y23Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        tt2.e1 e1Var = this.f503458g;
        yz5.p pVar = e1Var.f503425w;
        if (pVar != null) {
            pVar.mo149xb9724478(new java.lang.Integer(2), this.f503459h);
        }
        yz5.l lVar = e1Var.f503428z;
        if (lVar != null) {
            lVar.mo146xb9724478(new java.lang.Long(((cm2.m0) j5Var).f124902w));
        }
        return jz5.f0.f384359a;
    }
}
