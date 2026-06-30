package vw;

/* loaded from: classes11.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f522119d;

    /* renamed from: e, reason: collision with root package name */
    public int f522120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f522121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f522122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i17, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522121f = i17;
        this.f522122g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw.a2(this.f522121f, this.f522122g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522120e;
        int i18 = this.f522121f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "biz", null, false, null, 28, null);
            ur1.n nVar = ur1.n.f511894a;
            java.util.Map l17 = kz5.c1.l(new jz5.l("is_subscribetag_open", new java.lang.Integer(nVar.b().f467361o)), new jz5.l("have_my_subscribetag", new java.lang.Integer(nVar.b().f467362p)), new jz5.l("biz_type", new java.lang.Integer(i18)));
            this.f522119d = l1Var;
            this.f522120e = 1;
            if (l1Var.o("conversation_list", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f522119d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l1Var.a(kz5.b0.c(new lx.u(i18)));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f522122g;
        this.f522119d = null;
        this.f522120e = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
