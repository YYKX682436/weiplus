package df2;

/* loaded from: classes3.dex */
public final class aq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f311267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f311268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f311269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.gq gqVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311267d = hVar;
        this.f311268e = gqVar;
        this.f311269f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.aq(this.f311267d, interfaceC29045xdcb5ca57, this.f311268e, this.f311269f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.aq aqVar = (df2.aq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aqVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.fu1 fu1Var = (r45.fu1) ((xg2.i) this.f311267d).f535926b;
        df2.gq gqVar = this.f311268e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gqVar.f311770m, "[cgiGetPanelData], success, resp = " + pm0.b0.g(fu1Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("old-dataVersion = ");
        r45.fu1 fu1Var2 = gqVar.f311771n;
        sb6.append(fu1Var2 != null ? java.lang.Integer.valueOf(fu1Var2.m75939xb282bd08(3)) : null);
        sb6.append(", new-dataVersion = ");
        sb6.append(java.lang.Integer.valueOf(fu1Var.m75939xb282bd08(3)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gqVar.f311770m, sb6.toString());
        r45.fu1 fu1Var3 = gqVar.f311771n;
        if (fu1Var3 == null) {
            gqVar.f311771n = fu1Var;
        } else if (fu1Var3.m75939xb282bd08(3) <= fu1Var.m75939xb282bd08(3)) {
            gqVar.f311771n = fu1Var;
        }
        this.f311269f.f391645d = true;
        return jz5.f0.f384359a;
    }
}
