package ze5;

/* loaded from: classes9.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f553868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.k4 f553872h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f553873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yb5.d dVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, c00.k4 k4Var, ze5.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553869e = dVar;
        this.f553870f = view;
        this.f553871g = f9Var;
        this.f553872h = k4Var;
        this.f553873i = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ze5.z0(this.f553869e, this.f553870f, this.f553871g, this.f553872h, this.f553873i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f553868d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w wVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0.f280389r;
            android.view.View view = this.f553870f;
            yb5.d dVar = this.f553869e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553871g;
            wVar.b(dVar, view, f9Var);
            vd2.d3 d3Var = vd2.d3.f517236a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            w05.a aVar2 = this.f553873i.f553366t;
            if (aVar2 == null || (str = aVar2.m173053x93d5ac12()) == null) {
                str = "";
            }
            jSONObject.put("finderusername", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            d3Var.a("click_shopwindow_shard_card", jSONObject2);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_shop");
            int i18 = c00.z2.f118574f0;
            i95.m c17 = i95.n0.c(c00.z2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.app.Activity g17 = dVar.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            this.f553868d = 1;
            if (((b00.r) ((c00.z2) c17)).nj(g17, this.f553872h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
