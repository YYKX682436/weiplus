package te2;

/* loaded from: classes3.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f499482d;

    /* renamed from: e, reason: collision with root package name */
    public int f499483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f499485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f499486h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f499484f = p8Var;
        this.f499485g = interfaceC29045xdcb5ca57;
        this.f499486h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.d5(this.f499484f, this.f499485g, this.f499486h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.d5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57;
        java.lang.Object a18;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499483e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            te2.p8 p8Var = this.f499484f;
            boolean z17 = p8Var.A1.f499923a;
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca573 = this.f499485g;
            if (z17) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f499482d = interfaceC29045xdcb5ca573;
                this.f499483e = 1;
                p8Var.getClass();
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
                long m75942xfb822ef2 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
                r45.f92 f92Var = p8Var.A1.f499925c;
                long m75942xfb822ef22 = f92Var != null ? f92Var.m75942xfb822ef2(4) : 0L;
                java.lang.String str = p8Var.f499866y1;
                if (str == null) {
                    str = "";
                }
                int i18 = p8Var.f499862x0;
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 11);
                r45.f92 f92Var2 = new r45.f92();
                f92Var2.set(4, java.lang.Long.valueOf(m75942xfb822ef22));
                f92Var2.set(3, str);
                f92Var2.set(7, java.lang.Integer.valueOf(i18));
                hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(f92Var2.mo14344x5f01b1f6()));
                pq5.g l17 = new ek2.r1(m75942xfb822ef2, m75942xfb822ef22, 11, hx0Var).l();
                l17.K(new te2.b5(p8Var, nVar));
                android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179);
                a18 = nVar.a();
                if (a18 == aVar) {
                    return aVar;
                }
                interfaceC29045xdcb5ca572 = interfaceC29045xdcb5ca573;
                interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a18));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f499482d = interfaceC29045xdcb5ca573;
                this.f499483e = 2;
                p8Var.getClass();
                oz5.n nVar2 = new oz5.n(pz5.f.b(this));
                r45.hx0 hx0Var2 = new r45.hx0();
                r45.t02 t02Var = new r45.t02();
                te2.rc rcVar = p8Var.A1;
                r45.h32 h32Var = rcVar.f499924b;
                t02Var.set(0, h32Var != null ? h32Var.m75945x2fec8307(4) : null);
                t02Var.set(2, java.lang.Integer.valueOf(p8Var.f499862x0));
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p8Var.f499847l1, p8Var.f499866y1)) {
                    r45.cz3 cz3Var = new r45.cz3();
                    cz3Var.set(0, p8Var.f499866y1);
                    java.lang.String str2 = p8Var.f499866y1;
                    cz3Var.set(1, java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 2 : 1));
                    t02Var.set(1, cz3Var);
                }
                t02Var.set(3, java.lang.Integer.valueOf(this.f499486h));
                r45.h32 h32Var2 = rcVar.f499924b;
                t02Var.set(4, java.lang.Integer.valueOf(h32Var2 != null ? h32Var2.m75939xb282bd08(18) : 0));
                hx0Var2.set(0, 10);
                hx0Var2.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(t02Var.mo14344x5f01b1f6()));
                pq5.g l18 = new ek2.r1(0L, 0L, 7, hx0Var2).l();
                l18.K(new te2.c5(nVar2));
                android.app.Activity m80379x768471792 = p8Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x768471792, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l18.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471792);
                a17 = nVar2.a();
                if (a17 == aVar) {
                    return aVar;
                }
                interfaceC29045xdcb5ca57 = interfaceC29045xdcb5ca573;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17));
            }
        } else if (i17 == 1) {
            interfaceC29045xdcb5ca572 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) this.f499482d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a18 = obj;
            interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a18));
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) this.f499482d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17));
        }
        return jz5.f0.f384359a;
    }
}
