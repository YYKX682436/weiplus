package nu0;

/* loaded from: classes5.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421661e = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.w1(this.f421661e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.w1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x006d. Please report as an issue. */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421660d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f421661e.f421411o != nu0.c1.f421433m) {
                nu0.b4 b4Var = this.f421661e;
                java.lang.String b17 = j65.q.b(b4Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli);
                this.f421660d = 1;
                if (b4Var.A6(b17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                if (i17 != 3) {
                    if (i17 == 4) {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                nu0.b4.e7(this.f421661e);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[initAndStartup] state:" + this.f421661e.f421411o);
        switch (this.f421661e.f421411o.ordinal()) {
            case 0:
                nu0.b4 b4Var2 = this.f421661e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[doInit] state:" + b4Var2.f421411o);
                b4Var2.z7(nu0.c1.f421428e);
                b4Var2.f421414q = p3325xe03a0797.p3326xc267989b.l.d(b4Var2.mo144225x95f74600(), null, null, new nu0.o1(b4Var2, null), 3, null);
                return f0Var;
            case 1:
                return f0Var;
            case 2:
                nu0.b4.e7(this.f421661e);
                return f0Var;
            case 3:
            case 5:
            case 7:
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f421661e.f421414q;
                if (r2Var != null) {
                    nu0.b4 b4Var3 = this.f421661e;
                    this.f421660d = 3;
                    if (nu0.b4.b7(b4Var3, r2Var, "initAndStartup", this) == aVar) {
                        return aVar;
                    }
                }
                nu0.b4.e7(this.f421661e);
                return f0Var;
            case 4:
                nu0.b4 b4Var4 = this.f421661e;
                this.f421660d = 2;
                return b4Var4.E4(this) == aVar ? aVar : f0Var;
            case 6:
                return f0Var;
            case 8:
                nu0.b4 b4Var5 = this.f421661e;
                this.f421660d = 4;
                return b4Var5.E4(this) == aVar ? aVar : f0Var;
            default:
                return f0Var;
        }
    }
}
