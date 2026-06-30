package rf2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, r45.f02 f02Var, rf2.v0 v0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476444d = hVar;
        this.f476445e = f02Var;
        this.f476446f = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.v(this.f476444d, interfaceC29045xdcb5ca57, this.f476445e, this.f476446f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.v vVar = (rf2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.f02 f02Var = this.f476445e;
        int i17 = f02Var.f455414g;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        f02Var.f455414g = i17 | 1;
        r45.tl4 tl4Var = f02Var.f455412e;
        java.lang.Integer num = tl4Var != null ? new java.lang.Integer(tl4Var.f468083i) : null;
        rf2.v0 v0Var = this.f476446f;
        ((mm2.v4) v0Var.f476448b.m56788xbba4bfc0(mm2.v4.class)).S6(f02Var.f455411d, null);
        r45.tl4 tl4Var2 = f02Var.f455412e;
        if (tl4Var2 != null) {
            int i18 = tl4Var2.f468083i;
            if (num != null && i18 == num.intValue()) {
                tl4Var2.f468083i++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.f476449c, "modify ui data, participate_count++, " + tl4Var2.f468083i);
            }
        }
        return jz5.f0.f384359a;
    }
}
