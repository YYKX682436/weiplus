package j00;

/* loaded from: classes11.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f378422d;

    /* renamed from: e, reason: collision with root package name */
    public int f378423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378424f = str;
        this.f378425g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j00.t(this.f378424f, this.f378425g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f378423e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f378424f;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Ecs.EcsGiftFlutterMgr", "openEcsGiftLotteryPage paramsJson is null");
                return f0Var;
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) b00.p0.f98280a.e(new org.json.JSONObject(str));
            java.lang.Object obj2 = linkedHashMap.get("activity_info_base64");
            if (obj2 == null) {
                obj2 = "";
            }
            java.lang.String obj3 = obj2.toString();
            java.lang.Object obj4 = linkedHashMap.get("ecsOpenEventId");
            java.util.Map l17 = kz5.c1.l(new jz5.l("activity_info", n51.d.a(obj3, 0)), new jz5.l("ecsOpenEventId", obj4 != null ? obj4 : ""));
            pi0.l1 l1Var2 = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ecs", null, false, null, 28, null);
            l1Var2.f436182h = true;
            this.f378422d = l1Var2;
            this.f378423e = 1;
            if (l1Var2.o("ecs_gift_mpactivity", l17, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j00.y yVar = j00.y.f378479a;
                return f0Var;
            }
            l1Var = (pi0.l1) this.f378422d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l1Var.a(kz5.c0.i(new j00.d0(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null)));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149658o = false;
        c10716x931597c6.f149650d = 1;
        c10716x931597c6.f149651e = -1;
        android.content.Context context = this.f378425g;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f378422d = null;
        this.f378423e = 2;
        if (l1Var.s(context, c10716x931597c6, com.p314xaae8f345.mm.p689xc5a27af6.ecs.ui.ActivityC10566xacd95eeb.class, null, this) == aVar) {
            return aVar;
        }
        j00.y yVar2 = j00.y.f378479a;
        return f0Var;
    }
}
