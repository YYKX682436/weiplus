package t00;

/* loaded from: classes9.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f495839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f495840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f495841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t00.l2 f495842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495844i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f495845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, t00.l2 l2Var, android.content.Context context, c00.n3 n3Var, org.json.JSONObject jSONObject2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495840e = jSONObject;
        this.f495841f = u3Var;
        this.f495842g = l2Var;
        this.f495843h = context;
        this.f495844i = n3Var;
        this.f495845m = jSONObject2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new t00.k2(this.f495840e, this.f495841f, this.f495842g, this.f495843h, this.f495844i, this.f495845m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((t00.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f495839d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.ne0 ne0Var = new bw5.ne0();
            org.json.JSONObject jSONObject = this.f495840e;
            ne0Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(jSONObject.optString("productId")));
            ne0Var.f112191m = jSONObject.optString("passBuffer");
            ne0Var.f112192n[7] = true;
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            this.f495839d = 1;
            obj = ((b00.r) z2Var).vj(ne0Var, 5, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.qe0 qe0Var = (bw5.qe0) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        t00.j2 j2Var = new t00.j2(this.f495841f, qe0Var, this.f495842g, this.f495840e, this.f495843h, this.f495844i, this.f495845m, null);
        this.f495839d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, j2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
