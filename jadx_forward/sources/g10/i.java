package g10;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f349056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g10.v f349057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.s7 f349058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f349060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g10.v vVar, bw5.s7 s7Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f349057e = vVar;
        this.f349058f = s7Var;
        this.f349059g = str;
        this.f349060h = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g10.i(this.f349057e, this.f349058f, this.f349059g, this.f349060h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g10.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349056d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g10.v vVar = this.f349057e;
            bw5.s7 s7Var = this.f349058f;
            if (!vVar.Ni(s7Var)) {
                this.f349056d = 1;
                obj = g10.v.wi(vVar, s7Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "checkBizValid, bizName = " + this.f349059g + ", result = " + z17);
            this.f349060h.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (!((java.lang.Boolean) obj).booleanValue()) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "checkBizValid, bizName = " + this.f349059g + ", result = " + z17);
        this.f349060h.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
        return jz5.f0.f384359a;
    }
}
