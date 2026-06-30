package pp4;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lp4.u f439056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f439058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f439059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f439060i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 f439061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lp4.u uVar, int i17, long j17, long j18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 c18816x3a93c0f9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439056e = uVar;
        this.f439057f = i17;
        this.f439058g = j17;
        this.f439059h = j18;
        this.f439060i = z17;
        this.f439061m = c18816x3a93c0f9;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pp4.e(this.f439056e, this.f439057f, this.f439058g, this.f439059h, this.f439060i, this.f439061m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439055d;
        lp4.u uVar = this.f439056e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f439057f;
            long j17 = this.f439058g;
            long j18 = this.f439059h;
            this.f439055d = 1;
            uVar.getClass();
            if (p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new lp4.r(i18, uVar, j17, j18, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        rm5.v z17 = uVar.z();
        if (z17 != null) {
            rm5.j jVar = (rm5.j) z17.f479117l.get(this.f439057f);
            long j19 = this.f439060i ? jVar.f479035d : jVar.f479036e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 c18816x3a93c0f9 = this.f439061m;
            lp4.l0 l0Var = (lp4.l0) c18816x3a93c0f9.j(lp4.l0.class);
            if (l0Var != null) {
                l0Var.f401910m = z17;
                l0Var.f401906f.q(z17, false, true, j19);
            }
            lp4.p pVar = (lp4.p) c18816x3a93c0f9.j(lp4.p.class);
            if (pVar != null) {
                pVar.A().b(null, j19);
            }
        }
        return jz5.f0.f384359a;
    }
}
