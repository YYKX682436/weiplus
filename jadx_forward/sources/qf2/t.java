package qf2;

/* loaded from: classes3.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f444115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, km2.q qVar, qf2.v0 v0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444114d = hVar;
        this.f444115e = qVar;
        this.f444116f = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.t(this.f444114d, interfaceC29045xdcb5ca57, this.f444115e, this.f444116f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.t tVar = (qf2.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f444114d).f535914b).f535912a;
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        km2.q qVar = this.f444115e;
        qVar.f390714l = 0;
        mk2.h hVar = mk2.h.f408666a;
        r45.xn1 xn1Var = qVar.f390720r;
        java.lang.String str2 = null;
        hVar.b((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c());
        java.util.List list = ((mm2.o4) this.f444116f.m56788xbba4bfc0(mm2.o4.class)).f410858t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserTempList>(...)");
        pm0.v.I(list, new qf2.q(this.f444115e));
        java.util.List list2 = ((mm2.o4) this.f444116f.m56788xbba4bfc0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserList>(...)");
        pm0.v.I(list2, new qf2.r(this.f444115e));
        java.util.List list3 = ((mm2.o4) this.f444116f.m56788xbba4bfc0(mm2.o4.class)).f410852p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-recomApplylinkMicUserList>(...)");
        pm0.v.I(list3, new qf2.s(this.f444115e));
        java.util.Map map = ((mm2.o4) this.f444116f.m56788xbba4bfc0(mm2.o4.class)).f410859u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-anchorPkCarryMicUserMap>(...)");
        java.lang.String str3 = this.f444115e.f390703a;
        synchronized (map) {
            map.remove(str3);
        }
        if (str.length() > 0) {
            db5.t7.g(this.f444116f.O6(), str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accept pk response fail, errCode: ");
        sb6.append(i17);
        sb6.append(" errMsg: ");
        sb6.append(str);
        sb6.append(" errType: ");
        sb6.append(i18);
        sb6.append(" applyId: ");
        sb6.append(this.f444115e.f390727y);
        sb6.append(" , nickName: ");
        r45.xn1 xn1Var2 = this.f444115e.f390720r;
        if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
            str2 = c19782x23db1cfa.m76184x8010e5e4();
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", sb6.toString());
        return jz5.f0.f384359a;
    }
}
