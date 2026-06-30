package ep4;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337270d;

    /* renamed from: e, reason: collision with root package name */
    public int f337271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep4.j f337272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f337274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ep4.j jVar, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f337272f = jVar;
        this.f337273g = str;
        this.f337274h = m1Var;
        this.f337275i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ep4.e(this.f337272f, this.f337273g, this.f337274h, this.f337275i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep4.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f337271e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            ep4.d dVar = new ep4.d(c0Var2, this.f337272f, this.f337275i, this.f337273g, null);
            this.f337270d = c0Var2;
            this.f337271e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, dVar, this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f337270d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean z17 = c0Var.f391645d;
        ep4.j jVar = this.f337272f;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f337274h;
        if (z17) {
            long j17 = ((ep4.k) m1Var).f337296i;
            jVar.getClass();
            java.lang.String path = this.f337273g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            zu3.p pVar = jVar.f337285m;
            if (pVar != null) {
                pVar.c(path, j17);
            }
            java.lang.Object obj2 = jVar.f337285m;
            zu3.a aVar2 = obj2 instanceof zu3.a ? (zu3.a) obj2 : null;
            long min = aVar2 != null ? java.lang.Math.min(aVar2.f557293c.c(), jVar.f337282g) : 0L;
            jVar.f337281f.setVisibility(8);
            ju3.c0 c0Var3 = ju3.c0.f383447x2;
            ju3.d0 d0Var = jVar.f546865d;
            ju3.d0.k(d0Var, c0Var3, null, 2, null);
            ju3.c0 c0Var4 = ju3.c0.E2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", min);
            d0Var.w(c0Var4, bundle);
            uo4.a.f511207a.b(111L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorReadPlugin", "tts remux error, input text:" + ((ep4.k) m1Var).f337291d);
            jVar.A();
        }
        return jz5.f0.f384359a;
    }
}
