package oi0;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {
    public final /* synthetic */ java.lang.String L;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f427106d;

    /* renamed from: e, reason: collision with root package name */
    public int f427107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f427108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.nk0 f427109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f427110h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f427111i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427112m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ si0.s1 f427113n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, bw5.nk0 nk0Var, int i17, java.lang.String str, java.lang.Long l17, android.content.Context context, si0.s1 s1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f427108f = c17933xe8d1b226;
        this.f427109g = nk0Var;
        this.f427110h = i17;
        this.L = str;
        this.f427111i = l17;
        this.f427112m = context;
        this.f427113n = s1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new oi0.b(this.f427108f, this.f427109g, this.f427110h, this.L, this.f427111i, this.f427112m, this.f427113n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oi0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f427107e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            si0.v0 v0Var = new si0.v0();
            v0Var.f489737d = this.f427113n;
            l1Var.a(kz5.c0.i(new si0.n1(), new si0.t0(), new si0.s0(this.f427108f), new si0.m1(), v0Var));
            java.util.Map l17 = kz5.c1.l(new jz5.l("user_name", c01.z1.r()), new jz5.l("client_version", new java.lang.Integer(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)), new jz5.l("current_select_data", this.f427109g.mo14344x5f01b1f6()), new jz5.l("page_result_type", new java.lang.Integer(this.f427110h)), new jz5.l("post_session_id", this.L));
            java.lang.Long l18 = this.f427111i;
            if (l18 != null) {
                l17.put("sns_id", l18);
            }
            this.f427106d = l1Var;
            this.f427107e = 1;
            if (l1Var.o("visibilitySetting", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f427106d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f427112m;
        this.f427106d = null;
        this.f427107e = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
