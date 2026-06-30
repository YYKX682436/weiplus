package cj4;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123581d;

    /* renamed from: e, reason: collision with root package name */
    public int f123582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f123584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mj4.h hVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123583f = hVar;
        this.f123584g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cj4.x0(this.f123583f, this.f123584g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cj4.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123582e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        mj4.h hVar = this.f123583f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (hVar == null) {
                return f0Var;
            }
            h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            cj4.v0 v0Var = new cj4.v0(h0Var, this.f123584g, null);
            this.f123581d = h0Var;
            this.f123582e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, v0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f123581d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("blogapp");
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("service_officialaccounts");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList)).d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f434189c = "MicroMsg.TextStatus.BaseStatusLoadLogic";
        g17.f434190d = d17;
        g17.f434192f = dVar.h();
        p75.l0 a18 = g17.a();
        si4.a d18 = qi4.p.f445309a.d(true);
        si4.c cVar = d18 instanceof si4.c ? (si4.c) d18 : null;
        ((mj4.k) hVar).o();
        ((mj4.k) hVar).l();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : a18.l(gm0.j1.u().f354686f)) {
            if (hashSet.size() <= 1000 || hashSet.contains(str)) {
                mj4.k kVar = (mj4.k) hVar;
                kVar.getClass();
                mj4.j jVar = new mj4.j(kVar);
                jVar.h(str);
                jVar.g(str.concat("_xx"));
                mj4.h a19 = jVar.a();
                if (cVar != null) {
                    cVar.s(a19);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "set user:" + str + " status " + hashSet.size());
            }
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        cj4.w0 w0Var = new cj4.w0(h0Var, null);
        this.f123581d = null;
        this.f123582e = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, w0Var, this) == aVar ? aVar : f0Var;
    }
}
