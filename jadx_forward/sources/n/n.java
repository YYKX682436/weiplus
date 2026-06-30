package n;

/* loaded from: classes16.dex */
public final class n extends qz5.l implements yz5.p {
    public java.lang.Object L;
    public int M;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 N;
    public final /* synthetic */ bw5.nk0 P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ android.content.Context S;
    public final /* synthetic */ o.q0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, bw5.nk0 nk0Var, long j17, int i17, android.content.Context context, o.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.N = c17933xe8d1b226;
        this.P = nk0Var;
        this.Q = j17;
        this.R = i17;
        this.S = context;
        this.T = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new n.n(this.N, this.P, this.Q, this.R, this.S, this.T, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((n.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.M;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            o.p0 p0Var = new o.p0();
            p0Var.f423312d = this.T;
            l1Var.a(kz5.c0.i(new si0.n1(), new si0.o1(), new si0.t0(), new si0.m1(), p0Var, new si0.s0(this.N)));
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("user_name", c01.z1.r());
            lVarArr[1] = new jz5.l("client_version", new java.lang.Integer(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
            lVarArr[2] = new jz5.l("local_sns_visibility", this.P.mo14344x5f01b1f6());
            lVarArr[3] = new jz5.l("sns_id", new java.lang.Long(this.Q));
            int i18 = this.R;
            lVarArr[4] = new jz5.l("from_platform_scene", new java.lang.Integer(i18));
            lVarArr[5] = new jz5.l("post_session_id", i18 == 1 ? ca4.z0.l() : "");
            java.util.Map l17 = kz5.c1.l(lVarArr);
            this.L = l1Var;
            this.M = 1;
            if (l1Var.o("visibilityShow", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.L;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149658o = false;
        c10716x931597c6.f149650d = 1;
        c10716x931597c6.f149651e = -1;
        android.content.Context context = this.S;
        this.L = null;
        this.M = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
