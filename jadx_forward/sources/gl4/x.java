package gl4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f354423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr4.e f354424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f354425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f354426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList, pr4.e eVar, gl4.a aVar, qk.y8 y8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354423e = arrayList;
        this.f354424f = eVar;
        this.f354425g = aVar;
        this.f354426h = y8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gl4.x(this.f354423e, this.f354424f, this.f354425g, this.f354426h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354422d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "showWeCoinSubscribeView startSubscribeMemberLogic priceTierList: " + this.f354423e.size());
            js4.f fVar = (js4.f) i95.n0.c(js4.f.class);
            this.f354422d = 1;
            ((ls4.e) fVar).getClass();
            obj = new ls4.n0(this.f354424f).e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int ordinal = ((pr4.f) obj).f439528a.ordinal();
        qk.ga gaVar = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? qk.ga.f445667d : qk.ga.f445668e : qk.ga.f445670g : qk.ga.f445669f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWeCoinSubscribeView startSubscribeMemberLogic result status: ");
        sb6.append(gaVar);
        sb6.append(", selectedInfo: ");
        gl4.a aVar2 = this.f354425g;
        bw5.u80 u80Var = aVar2.f354375a;
        sb6.append(u80Var != null ? u80Var.f115340q[1] ? u80Var.f115330d : "" : null);
        sb6.append(", succHalfPanel != null: ");
        sb6.append(aVar2.f354376b != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        qk.ea eaVar = new qk.ea(gaVar, qk.da.f445616e);
        eaVar.f445629c = aVar2.f354376b;
        bw5.u80 u80Var2 = aVar2.f354375a;
        eaVar.f445630d = u80Var2;
        eaVar.f445631e = u80Var2 != null ? u80Var2.f115333g : false;
        qk.y8 y8Var = this.f354426h;
        if (y8Var != null) {
            y8Var.a(eaVar);
        }
        return jz5.f0.f384359a;
    }
}
