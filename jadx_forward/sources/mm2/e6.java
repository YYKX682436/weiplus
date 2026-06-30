package mm2;

/* loaded from: classes3.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410541d;

    /* renamed from: e, reason: collision with root package name */
    public int f410542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.f6 f410543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f410544g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(mm2.f6 f6Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410543f = f6Var;
        this.f410544g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.e6(this.f410543f, this.f410544g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.e6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mm2.f6 f6Var;
        r45.cp1 cp1Var;
        r45.j92 j92Var;
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410542e;
        mm2.f6 f6Var2 = this.f410543f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            mm2.d6 d6Var = new mm2.d6(f6Var2, this.f410544g, null);
            this.f410541d = f6Var2;
            this.f410542e = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, d6Var, this);
            if (obj == aVar) {
                return aVar;
            }
            f6Var = f6Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6Var = (mm2.f6) this.f410541d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        f6Var.V6((r45.cp1) obj);
        f6Var2.T = false;
        boolean N6 = f6Var2.N6();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if ((N6 || f6Var2.f410568i) && (cp1Var = f6Var2.S) != null) {
            if (((r45.j92) cp1Var.m75936x14adae67(1)) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vip info size = ");
                r45.cp1 cp1Var2 = f6Var2.S;
                sb6.append((cp1Var2 == null || (j92Var = (r45.j92) cp1Var2.m75936x14adae67(1)) == null || (m75941xfb821914 = j92Var.m75941xfb821914(0)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveShopSlice", sb6.toString());
                f6Var2.f410575p1.mo7808x76db6cb1((r45.j92) cp1Var.m75936x14adae67(1));
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryToGetEcReponse shopVipInfo = ");
            r45.j92 j92Var2 = (r45.j92) cp1Var.m75936x14adae67(1);
            sb7.append(j92Var2 != null ? j92Var2.m75941xfb821914(0) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveShopSlice", sb7.toString());
        }
        return f0Var;
    }
}
