package mz0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f414591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 f414593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414594h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, mz0.b2 b2Var, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 c11009x358a2db0, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414591e = z17;
        this.f414592f = b2Var;
        this.f414593g = c11009x358a2db0;
        this.f414594h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.t0(this.f414591e, this.f414592f, this.f414593g, this.f414594h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414590d;
        boolean z17 = this.f414591e;
        mz0.b2 b2Var = this.f414592f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "musicDrawer: show=" + z17);
            if (((java.lang.Boolean) ((jz5.n) b2Var.f414426q).mo141623x754a37bb()).booleanValue() && z17) {
                az0.d.a(b2Var.n7(), null, 1, null);
                az0.d n76 = b2Var.n7();
                this.f414590d = 1;
                if (((dz0.k0) n76).c(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 c11009x358a2db0 = this.f414593g;
        if (!c11009x358a2db0.f151297h && z17) {
            c11009x358a2db0.f151297h = true;
        }
        mz0.s0 s0Var = new mz0.s0(this.f414594h, b2Var);
        ((gv3.d) b2Var.f414432w.mo141623x754a37bb()).mo68201x76500a7f(z17);
        ((gv3.d) b2Var.f414432w.mo141623x754a37bb()).mo68199x466a35c6(s0Var);
        b2Var.H7(z17);
        return jz5.f0.f384359a;
    }
}
