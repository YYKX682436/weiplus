package b50;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f99500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f99503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f99504h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99505i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, int i17, boolean z17, yz5.l lVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99501e = c10601x91d05935;
        this.f99502f = i17;
        this.f99503g = z17;
        this.f99504h = lVar;
        this.f99505i = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b50.o(this.f99501e, this.f99502f, this.f99503g, this.f99504h, this.f99505i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b50.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f99500d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935 = this.f99501e;
            if (c10601x91d05935.f148609v) {
                ((ku5.t0) ku5.t0.f394148d).B(new b50.g(this.f99504h));
                return f0Var;
            }
            c10601x91d05935.f148609v = true;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var.h().B("live_bar_list_last_refresh_time", java.lang.System.currentTimeMillis());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            b50.n nVar = new b50.n(this.f99501e, currentTimeMillis);
            ((ku5.t0) ku5.t0.f394148d).B(new b50.i(this.f99501e, currentTimeMillis));
            int i18 = this.f99502f;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f99505i);
            this.f99500d = 1;
            obj = b0Var.d(i18, linkedList, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.qk qkVar = (r45.qk) obj;
        if (qkVar != null) {
            int i19 = this.f99502f;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var2.A(i19, qkVar.f465599g);
            b0Var2.z(i19, qkVar.f465600h);
            if (i19 == 2) {
                b0Var2.B(qkVar);
            }
        } else {
            qkVar = null;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d059352 = this.f99501e;
        java.lang.String str = c10601x91d059352.f148594d;
        c10601x91d059352.f148609v = false;
        java.util.LinkedList linkedList2 = qkVar != null ? qkVar.f465596d : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doGetBizFinderLives cgi response size=");
        sb6.append(linkedList2 != null ? linkedList2.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            arrayList = new java.util.ArrayList();
        } else {
            java.util.List k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.k(linkedList2, this.f99503g);
            com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d059353 = this.f99501e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList2.add(c10601x91d059353.a((r45.lk) it.next()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99501e.f148594d, "doGetBizFinderLives getValidBizFinderLiveInfo size=" + arrayList2.size());
            arrayList = arrayList2;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new b50.k(this.f99501e, this.f99502f, arrayList, this.f99504h));
        return f0Var;
    }
}
