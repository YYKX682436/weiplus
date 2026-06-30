package on2;

/* loaded from: classes3.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f428476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gm4 f428477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(on2.v0 v0Var, s71.b bVar, r45.gm4 gm4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f428475e = v0Var;
        this.f428476f = bVar;
        this.f428477g = gm4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new on2.j0(this.f428475e, this.f428476f, this.f428477g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f428474d;
        on2.v0 v0Var = this.f428475e;
        s71.b bVar = this.f428476f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            on2.l3 l3Var = on2.l3.f428499a;
            long j17 = v0Var.f428561J;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v0Var.m158354x19263085();
            java.lang.String str = "claim addr:" + bVar.f485509m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f485510n);
            p30Var.set(1, bVar.f485511o);
            p30Var.set(2, l3Var.d(bVar));
            java.lang.String m75945x2fec8307 = this.f428477g.m75945x2fec8307(5);
            this.f428474d = 1;
            obj = l3Var.e(j17, null, m158354x19263085, str, p30Var, m75945x2fec8307, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.ul4 ul4Var = (r45.ul4) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (ul4Var != null) {
            pm0.v.X(new on2.i0(v0Var, ul4Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryAudienceUIC", "claim addr:" + bVar.f485509m + " but resp is null!");
        }
        return f0Var2;
    }
}
