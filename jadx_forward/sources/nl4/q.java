package nl4;

/* loaded from: classes11.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419760d;

    /* renamed from: e, reason: collision with root package name */
    public int f419761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.kq0 f419762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bw5.kq0 kq0Var, nl4.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419762f = kq0Var;
        this.f419763g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nl4.q(this.f419762f, this.f419763g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nl4.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        bw5.lp0 lp0Var;
        bw5.e70 g18;
        bw5.e70 g19;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419761e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nl4.r rVar = this.f419763g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.lp0 b17 = this.f419762f.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPlayingItem(...)");
            bw5.v70 d17 = b17.d();
            java.lang.String m11811xb5887159 = (d17 == null || (g19 = d17.g()) == null) ? null : g19.m11811xb5887159();
            java.lang.String str = m11811xb5887159 == null ? "" : m11811xb5887159;
            bw5.v70 d18 = b17.d();
            java.lang.String b18 = (d18 == null || (g18 = d18.g()) == null) ? null : g18.b();
            java.lang.String str2 = b18 == null ? "" : b18;
            if (!(str.length() == 0)) {
                if (!(str2.length() == 0)) {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
                    nl4.p pVar = new nl4.p(this.f419763g, str, str2, b17, null);
                    this.f419760d = b17;
                    this.f419761e = 1;
                    g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, pVar, this);
                    if (g17 == aVar) {
                        return aVar;
                    }
                    lp0Var = b17;
                }
            }
            ll4.a aVar2 = rVar.f419764a;
            if (aVar2 != null) {
                ll4.a.a(aVar2, 12, null, 2, null);
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lp0Var = (bw5.lp0) this.f419760d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g17 = obj;
        dk4.a aVar3 = (dk4.a) g17;
        if (aVar3 == null) {
            ll4.a aVar4 = rVar.f419764a;
            if (aVar4 != null) {
                ll4.a.a(aVar4, 12, null, 2, null);
            }
            return f0Var;
        }
        java.lang.String str3 = aVar3.f316014r;
        if (str3 == null || str3.length() == 0) {
            aVar3.f316014r = aVar3.f315998b;
        }
        rVar.f419770g = lp0Var;
        rVar.getClass();
        java.lang.String url = aVar3.f316017u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
        aVar3.f316003g *= 1000;
        kk4.v vVar = (kk4.v) rVar.f419773j;
        vVar.B(aVar3);
        rVar.f419765b = aVar3.f316003g;
        vVar.f390118j = true;
        bw5.lp0 lp0Var2 = rVar.f419770g;
        if (lp0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        long j17 = lp0Var2.c() != null ? r2.f108986e * 1000 : 0L;
        bw5.lp0 lp0Var3 = rVar.f419770g;
        if (lp0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        bw5.fq0 c17 = lp0Var3.c();
        float f17 = c17 != null ? c17.f108985d : 1.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f419775l, "real call startPlay decryptionKey:" + rVar.f419771h);
        rVar.f419768e = false;
        vVar.G(new nl4.l(rVar, j17, f17));
        vVar.c(rVar.f419771h);
        return f0Var;
    }
}
