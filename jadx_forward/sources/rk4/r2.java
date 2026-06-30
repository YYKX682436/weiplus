package rk4;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {
    public final /* synthetic */ rk4.l3 L;

    /* renamed from: d, reason: collision with root package name */
    public int f478481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf f478483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf c25175x712785bf, rk4.l3 l3Var, android.content.Context context, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478483f = c25175x712785bf;
        this.L = l3Var;
        this.f478482e = context;
        this.f478484g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.r2(this.f478483f, this.L, this.f478482e, this.f478484g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478481d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478481d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf c25175x712785bf = this.f478483f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25175x712785bf.m93092xb8f6ba48(), java.lang.Boolean.TRUE);
        android.content.Context activity = this.f478482e;
        yz5.l lVar = this.f478484g;
        if (b17) {
            rk4.q2 q2Var = new rk4.q2(lVar, c25175x712785bf);
            n13.r rVar = new n13.r();
            rVar.f415651b = this.L.f478361s;
            rVar.f415652c = q2Var;
            rVar.f415659j = true;
            rVar.f415650a = false;
            java.util.List<java.lang.String> m93090x65cb4dcb = c25175x712785bf.m93090x65cb4dcb();
            rVar.f415662m = m93090x65cb4dcb != null ? kz5.n0.V(m93090x65cb4dcb) : null;
            rVar.f415663n = c25175x712785bf.m93089x4dc5289();
            java.lang.Long m93087x83a63265 = c25175x712785bf.m93087x83a63265();
            rVar.f415664o = m93087x83a63265 != null ? new java.lang.Integer((int) m93087x83a63265.longValue()) : null;
            rVar.f415665p = c25175x712785bf.m93088x31fb574b();
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(activity, rVar);
        } else {
            l0.m5 m5Var = new l0.m5(lVar);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.util.List<java.lang.String> m93090x65cb4dcb2 = c25175x712785bf.m93090x65cb4dcb();
            java.lang.Boolean m93089x4dc5289 = c25175x712785bf.m93089x4dc5289();
            java.lang.Long m93087x83a632652 = c25175x712785bf.m93087x83a63265();
            java.lang.Integer num = m93087x83a632652 != null ? new java.lang.Integer((int) m93087x83a632652.longValue()) : null;
            java.lang.String m93088x31fb574b = c25175x712785bf.m93088x31fb574b();
            java.lang.String m93091x5ec63639 = c25175x712785bf.m93091x5ec63639();
            ((qd0.q0) e1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
            intent.putExtra("titile", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbj));
            intent.putExtra("list_type", 0);
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(64, 131072));
            intent.putExtra("default_multi_search", true);
            intent.putExtra("menu_mode", 1);
            if (m93091x5ec63639 == null) {
                m93091x5ec63639 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573899mb4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m93091x5ec63639, "getString(...)");
            }
            intent.putExtra("key_confirm_menu_name", m93091x5ec63639);
            intent.putExtra("key_confirm_menu_color", 0);
            intent.putExtra("recommend_chatroom", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c01.z1.r());
            arrayList.add("weixin");
            arrayList.add("filehelper");
            arrayList.addAll(c01.e2.i());
            arrayList.addAll(c01.e2.h());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            }
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(m93090x65cb4dcb2, ",");
            if (c17 != null) {
                if (m93089x4dc5289 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m93089x4dc5289, java.lang.Boolean.FALSE)) {
                    intent.putExtra("always_select_contact", c17);
                }
                intent.putExtra("already_select_contact", c17);
            }
            if (num != null) {
                intent.putExtra("max_limit_num", num.intValue());
                intent.putExtra("too_many_member_tip_string", m93088x31fb574b);
            }
            pf5.j0.a(intent, cj5.q4.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            pf5.j0.a(intent, cj5.b3.class);
            pf5.j0.a(intent, cj5.o.class);
            if (activity instanceof android.app.Activity) {
                bh5.c cVar = new bh5.c();
                cVar.f102455a.f102457a = activity;
                cVar.d(intent);
                cVar.c(true);
                cVar.a(com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class.getName());
                cVar.i(m5Var);
            }
        }
        return f0Var;
    }
}
