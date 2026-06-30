package vb5;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f516372d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f516373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vb5.l f516374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.q f516375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f516376h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e f516377i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f516378m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vb5.l lVar, yb5.q qVar, long j17, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e eVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516374f = lVar;
        this.f516375g = qVar;
        this.f516376h = j17;
        this.f516377i = eVar;
        this.f516378m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        vb5.f fVar = new vb5.f(this.f516374f, this.f516375g, this.f516376h, this.f516377i, this.f516378m, interfaceC29045xdcb5ca57);
        fVar.f516373e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vb5.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f516372d;
        int i18 = 0;
        yb5.q talkerInfo = this.f516375g;
        vb5.l lVar = this.f516374f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f516373e;
            new java.lang.Long(java.lang.System.currentTimeMillis() - lVar.f516393i);
            java.util.ArrayList arrayList = lVar.f516392h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 2);
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new vb5.b((yj5.a) next, lVar, talkerInfo, null), 3, null));
                i19 = i27;
            }
            this.f516372d = 1;
            a17 = p3325xe03a0797.p3326xc267989b.h.a(arrayList2, this);
            if (a17 == aVar) {
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
            a17 = obj;
        }
        java.util.List<java.util.List> list = (java.util.List) a17;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size() + 2);
        for (java.util.List list2 : list) {
            if (list2 != null && (!list2.isEmpty())) {
                arrayList3.addAll(list2);
            }
        }
        lVar.getClass();
        kz5.g0.t(arrayList3, vb5.j.f516384d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkerInfo, "$talkerInfo");
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(arrayList3.size()))), com.p314xaae8f345.mm.ui.p2738xb1dfbddb.s.a(talkerInfo));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xj5.a aVar2 = (xj5.a) next2;
            aVar2.f536429d = i18;
            aVar2.f536431f = m17;
            i18 = i28;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a18 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new xj5.k(lVar.f516396o, arrayList3), true);
        a18.a(new vb5.h(lVar, arrayList3, lVar.f516396o));
        java.lang.Object clone = arrayList3.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.ui.tipsbar.data.BaseTipsBarData<*>>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.ui.tipsbar.data.BaseTipsBarData<*>> }");
        lVar.f516396o = (java.util.ArrayList) clone;
        vb5.e eVar = new vb5.e(this.f516374f, this.f516376h, arrayList3, this.f516377i, a18, this.f516378m);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        vb5.c cVar = new vb5.c(eVar, null);
        this.f516372d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, cVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
