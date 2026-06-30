package oi0;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f427118d;

    /* renamed from: e, reason: collision with root package name */
    public int f427119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f427120f = str;
        this.f427121g = str2;
        this.f427122h = str3;
        this.f427123i = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new oi0.d(this.f427120f, this.f427121g, this.f427122h, this.f427123i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oi0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f427119e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p3133xd0ce8b26.aff.sns.h.f299036b.d(c01.z1.r(), com.p314xaae8f345.mm.vfs.q7.c("sns_aff_db"), com.p314xaae8f345.mm.vfs.q7.c("sns_aff_publish"));
            com.p314xaae8f345.p3133xd0ce8b26.aff.sns.b.f299034b.a();
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            java.util.Map l17 = kz5.c1.l(new jz5.l("user_name", c01.z1.r()), new jz5.l("client_version", new java.lang.Integer(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)), new jz5.l("home_user_name", this.f427120f), new jz5.l("signature", this.f427121g), new jz5.l("from_page", this.f427122h));
            this.f427118d = l1Var;
            this.f427119e = 1;
            if (l1Var.o("userHome", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f427118d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(kz5.c0.i(new si0.n1(), new p000.v(), new si0.r1(), new si0.o1(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null), new si0.m1(), new si0.x0(), new si0.n0(), new si0.u1(), new si0.y0(), new si0.p1(), new si0.u0()));
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) di4.i.f314318d).mo141623x754a37bb()).booleanValue()) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            arrayList.add(new yi4.e());
        }
        l1Var.a(arrayList);
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f427123i;
        this.f427118d = null;
        this.f427119e = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
