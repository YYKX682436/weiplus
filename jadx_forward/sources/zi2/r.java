package zi2;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f554670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f554672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f554673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, zi2.w wVar, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554670e = hVar;
        this.f554671f = wVar;
        this.f554672g = z17;
        this.f554673h = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zi2.r(this.f554670e, interfaceC29045xdcb5ca57, this.f554671f, this.f554672g, this.f554673h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zi2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554669d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f554670e).f535914b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "updateMicSeatInfo fail: " + aVar2);
            rm0.j jVar = aVar2.f535912a;
            zi2.w wVar = this.f554671f;
            if (jVar == null || (string = jVar.f478959g) == null) {
                string = wVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573313e75);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
            if (this.f554672g) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                zi2.u uVar = new zi2.u(wVar, string, null);
                this.f554669d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, uVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f554673h.f391645d = false;
        return jz5.f0.f384359a;
    }
}
