package ud2;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f508164d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f508165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud2.o f508166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ud2.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508166f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ud2.n nVar = new ud2.n(this.f508166f, interfaceC29045xdcb5ca57);
        nVar.f508165e = obj;
        return nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ud2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.nw1 m59258xd0557130;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f508164d;
        ud2.o oVar = this.f508166f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f508165e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f508169c, "on resume");
            this.f508165e = y0Var2;
            this.f508164d = 1;
            a17 = ud2.o.a(oVar, this);
            if (a17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f508165e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) a17;
        if (c19792x256d2725 != null) {
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            java.lang.Long l17 = m76794xd0557130 != null ? new java.lang.Long(m76794xd0557130.m75942xfb822ef2(0)) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = oVar.f508170d;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, (c14994x9b99c079 == null || (m59258xd0557130 = c14994x9b99c079.m59258xd0557130()) == null) ? null : new java.lang.Long(m59258xd0557130.m75942xfb822ef2(0)))) {
                oVar.f508170d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
                ud2.o.b(oVar);
            }
        }
        if (oVar.f508172f.getPlayer() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f508169c, "create new player");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f508172f;
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(c14522x8ffd8962.getContext(), (X == 5 || X == 6) ? 2 : 0, false);
            cVar.f(true);
            cVar.J(new rp2.g(c14522x8ffd8962));
            cVar.K(mn0.d0.f411258x, 18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a;
            java.lang.String str = oVar.f508169c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = oVar.f508170d;
            cVar.F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.b(n2Var, str, true, c14994x9b99c0792 != null ? c14994x9b99c0792.m59258xd0557130() : null, null, 0, 0, 56, null));
            cVar.Q(0);
            c14522x8ffd8962.m58398x1d8af1e3(cVar);
        }
        boolean mo58387xc00617a4 = oVar.f508172f.mo58387xc00617a4();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!mo58387xc00617a4) {
            ud2.o.c(oVar);
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f508169c, y0Var + " try start play when playing");
        return f0Var;
    }
}
