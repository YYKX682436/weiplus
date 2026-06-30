package bg2;

/* loaded from: classes3.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101462d;

    /* renamed from: e, reason: collision with root package name */
    public int f101463e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f101465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f101466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101467i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f101468m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f101469n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bg2.d2 d2Var, r45.nw1 nw1Var, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.kr0 kr0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101465g = d2Var;
        this.f101466h = nw1Var;
        this.f101467i = context;
        this.f101468m = c19792x256d2725;
        this.f101469n = kr0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        bg2.b2 b2Var = new bg2.b2(this.f101465g, this.f101466h, this.f101467i, this.f101468m, this.f101469n, interfaceC29045xdcb5ca57);
        b2Var.f101464f = obj;
        return b2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int m75939xb282bd08;
        java.lang.Object a76;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.qt2 qt2Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101463e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f101464f;
            int i18 = bg2.d2.f101541z;
            bg2.d2 d2Var = this.f101465g;
            d2Var.getClass();
            r45.nw1 nw1Var = this.f101466h;
            if (pm0.v.A(nw1Var != null ? nw1Var.m75942xfb822ef2(57) : 0L, 1L)) {
                m75939xb282bd08 = 0;
            } else {
                m75939xb282bd08 = ((nw1Var != null ? nw1Var.m75939xb282bd08(38) : 0) <= 0 || nw1Var == null) ? bg2.d2.f101541z : nw1Var.m75939xb282bd08(38);
            }
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(this.f101467i);
            r45.qt2 V6 = Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null;
            r45.nw1 nw1Var2 = this.f101466h;
            android.content.Context context = this.f101467i;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f101468m;
            r45.kr0 kr0Var = this.f101469n;
            int m75939xb282bd082 = nw1Var2.m75939xb282bd08(38);
            if (m75939xb282bd08 > 0) {
                in5.s0 s0Var = d2Var.f498674d.f498682i;
                d2Var.f101557w = (s0Var == null || (y0Var2 = s0Var.f374653d) == null) ? null : p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new bg2.v1(d2Var, nw1Var2, m75939xb282bd08, context, c19792x256d2725, V6, kr0Var, m75939xb282bd082, null), 2, null);
            } else {
                d2Var.getClass();
            }
            d2Var.f101555u = c01.id.c();
            bg2.d2 d2Var2 = this.f101465g;
            r45.nw1 nw1Var3 = this.f101466h;
            android.content.Context context2 = this.f101467i;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f101468m;
            r45.kr0 kr0Var2 = this.f101469n;
            int m75939xb282bd083 = nw1Var3.m75939xb282bd08(38);
            this.f101464f = y0Var3;
            this.f101462d = V6;
            this.f101463e = 1;
            r45.qt2 qt2Var2 = V6;
            a76 = d2Var2.a7(false, nw1Var3, context2, c19792x256d27252, V6, kr0Var2, m75939xb282bd083, this);
            if (a76 == aVar) {
                return aVar;
            }
            y0Var = y0Var3;
            qt2Var = qt2Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r45.qt2 qt2Var3 = (r45.qt2) this.f101462d;
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f101464f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qt2Var = qt2Var3;
            a76 = obj;
        }
        r45.hc1 hc1Var = (r45.hc1) a76;
        if (hc1Var == null) {
            return f0Var;
        }
        bg2.d2 d2Var3 = this.f101465g;
        android.content.Context context3 = this.f101467i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = this.f101468m;
        r45.nw1 nw1Var4 = this.f101466h;
        r45.kr0 kr0Var3 = this.f101469n;
        this.f101464f = null;
        this.f101462d = null;
        this.f101463e = 2;
        return bg2.d2.Y6(d2Var3, y0Var, hc1Var, context3, c19792x256d27253, qt2Var, nw1Var4, kr0Var3, this) == aVar ? aVar : f0Var;
    }
}
