package we0;

/* loaded from: classes11.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f526690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ we0.u0 f526691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f526693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526694h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f526695i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 f526696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(we0.u0 u0Var, java.lang.String str, java.util.Map map, java.lang.String str2, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526691e = u0Var;
        this.f526692f = str;
        this.f526693g = map;
        this.f526694h = str2;
        this.f526695i = context;
        this.f526696m = c10716x931597c6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new we0.s0(this.f526691e, this.f526692f, this.f526693g, this.f526694h, this.f526695i, this.f526696m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((we0.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Class cls;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f526690d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f526690d = 1;
            obj = this.f526691e.Bi(this.f526692f, this.f526693g, this);
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
        pi0.l1 l1Var = (pi0.l1) obj;
        java.lang.String str = this.f526694h;
        if (r26.n0.N(str)) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6.f254967u;
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6.class;
        } else {
            cls = java.lang.Class.forName(str);
        }
        android.content.Context context = this.f526695i;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f526696m;
        this.f526690d = 2;
        if (pi0.l1.v(l1Var, context, c10716x931597c6, cls, null, null, this, 24, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
