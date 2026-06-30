package hu3;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, hu3.n0 n0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366660e = i17;
        this.f366661f = n0Var;
        this.f366662g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.g0(this.f366660e, this.f366661f, this.f366662g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Boolean bool;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366659d;
        hu3.n0 n0Var = this.f366661f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("angel >> ");
            int i18 = this.f366660e;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
            rg.e eVar = rg.e.H264;
            rg.a aVar2 = rg.a.MPEG4AAC;
            rg.d dVar = rg.d.MP4;
            hu3.t0 t0Var = n0Var.f366701o;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117(eVar, aVar2, dVar, t0Var.f366732a, t0Var.f366734c, t0Var.f366735d, t0Var.f366736e);
            c4084x74642117.f129691m = i18;
            if (n0Var.f366708v) {
                c4084x74642117.f129689k = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.d.Disabled;
            }
            pp0.p0 p0Var = n0Var.f366695f;
            bool = null;
            if (p0Var != null) {
                this.f366659d = 1;
                obj = p0Var.C(this.f366662g, c4084x74642117, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startRecord >> " + bool);
            if ((n0Var.f366697h == 1 || n0Var.f366698i != null) && !(z17 = n0Var.f366708v) && !z17 && (c16993xacc19624 = n0Var.f366700n) != null) {
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16993xacc19624.f237209n;
                hu3.s0 s0Var = new hu3.s0(new hu3.a(c11120x15dce88d.f152732o, c11120x15dce88d.f152733p));
                n0Var.f366709w = s0Var;
                s0Var.a(new hu3.f0(n0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startAudioRecord");
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startRecord >> " + bool);
        if (n0Var.f366697h == 1) {
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = c16993xacc19624.f237209n;
        hu3.s0 s0Var2 = new hu3.s0(new hu3.a(c11120x15dce88d2.f152732o, c11120x15dce88d2.f152733p));
        n0Var.f366709w = s0Var2;
        s0Var2.a(new hu3.f0(n0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startAudioRecord");
        return jz5.f0.f384359a;
    }
}
