package tv0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f503755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f503756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d f503757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tv0.o f503758i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f503759m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tv0.j0 j0Var, double d17, ex0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d, tv0.o oVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503754e = j0Var;
        this.f503755f = d17;
        this.f503756g = a0Var;
        this.f503757h = c10942x373bdc1d;
        this.f503758i = oVar;
        this.f503759m = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tv0.n(this.f503754e, this.f503755f, this.f503756g, this.f503757h, this.f503758i, this.f503759m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503753d;
        tv0.j0 j0Var = this.f503754e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = j0Var.p7();
            this.f503753d = 1;
            if (p76.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f503755f / this.f503756g.s(this.f503757h.getTimelineLayoutType()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33969x7905b775, "fromSeconds(...)");
        tv0.o oVar = this.f503758i;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = oVar.f503760a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a, "access$getMinTargetTime$p(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a17 = ou0.f.a(m33969x7905b775, c4128x879fba0a);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = oVar.f503761b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a2, "access$getMaxTargetTime$p(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = ou0.f.b(a17, c4128x879fba0a2);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f503759m;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = c4181x2248e1a3.A().add(b17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(add);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a3 = oVar.f503762c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a3, "access$getMaxPlaybackTimeInTimeline$p(...)");
        j0Var.f503746z = ou0.f.b(add, c4128x879fba0a3);
        ((rv0.n1) ((jz5.n) j0Var.f503741u).mo141623x754a37bb()).v7(j0Var.f503746z);
        java.lang.Double d17 = new java.lang.Double(c4181x2248e1a3.v1());
        double doubleValue = d17.doubleValue();
        if (!((java.lang.Double.isInfinite(doubleValue) || java.lang.Double.isNaN(doubleValue)) ? false : true)) {
            d17 = null;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add2 = b17.add(c4181x2248e1a3.x1().m34009x8082fb99().m33984x636d539(1 / (d17 != null ? d17.doubleValue() : 1.0d)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add2, "add(...)");
        if (j0Var.p7().L) {
            j0Var.p7().b7(add2, false);
        }
        tv0.d dVar = (tv0.d) j0Var.f150773i;
        if (dVar != null) {
            dVar.K(b17);
        }
        return jz5.f0.f384359a;
    }
}
