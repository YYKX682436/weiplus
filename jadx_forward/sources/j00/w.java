package j00;

/* loaded from: classes11.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f378452d;

    /* renamed from: e, reason: collision with root package name */
    public int f378453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378455g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.Map map, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378454f = map;
        this.f378455g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j00.w(this.f378454f, this.f378455g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f378453e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ecs", null, false, null, 28, null);
            l1Var.f436182h = true;
            this.f378452d = l1Var;
            this.f378453e = 1;
            if (l1Var.o("ecs_gift_resend_in_live_logic", this.f378454f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j00.y yVar = j00.y.f378479a;
                return jz5.f0.f384359a;
            }
            l1Var = (pi0.l1) this.f378452d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l1Var.a(kz5.c0.i(new j00.d0(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null)));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149658o = false;
        c10716x931597c6.f149650d = 1;
        c10716x931597c6.f149651e = -1;
        android.content.Context context = this.f378455g;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f378452d = null;
        this.f378453e = 2;
        if (l1Var.s(context, c10716x931597c6, com.p314xaae8f345.mm.p689xc5a27af6.ecs.ui.ActivityC10566xacd95eeb.class, null, this) == aVar) {
            return aVar;
        }
        j00.y yVar2 = j00.y.f378479a;
        return jz5.f0.f384359a;
    }
}
