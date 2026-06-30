package lx;

/* loaded from: classes11.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f403382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f403383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403385i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, int i17, boolean z17, yz5.l lVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403381e = c10491x8102098a;
        this.f403382f = i17;
        this.f403383g = z17;
        this.f403384h = lVar;
        this.f403385i = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lx.l3(this.f403381e, this.f403382f, this.f403383g, this.f403384h, this.f403385i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403380d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a = this.f403381e;
            if (c10491x8102098a.f146801v) {
                ((ku5.t0) ku5.t0.f394148d).B(new lx.d3(this.f403384h));
                return f0Var;
            }
            c10491x8102098a.f146801v = true;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var.h().B("live_bar_list_last_refresh_time", java.lang.System.currentTimeMillis());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lx.k3 k3Var = new lx.k3(this.f403381e, currentTimeMillis);
            ((ku5.t0) ku5.t0.f394148d).B(new lx.f3(this.f403381e, currentTimeMillis));
            int i18 = this.f403382f;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f403385i);
            this.f403380d = 1;
            obj = b0Var.d(i18, linkedList, k3Var, this);
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
            int i19 = this.f403382f;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var2.A(i19, qkVar.f465599g);
            b0Var2.z(i19, qkVar.f465600h);
            if (i19 == 2) {
                b0Var2.B(qkVar);
            }
        } else {
            qkVar = null;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a2 = this.f403381e;
        java.lang.String str = c10491x8102098a2.f146786d;
        c10491x8102098a2.f146801v = false;
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
            java.util.List k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.k(linkedList2, this.f403383g);
            com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a3 = this.f403381e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList2.add(c10491x8102098a3.a((r45.lk) it.next()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f403381e.f146786d, "doGetBizFinderLives getValidBizFinderLiveInfo size=" + arrayList2.size());
            arrayList = arrayList2;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new lx.h3(this.f403381e, this.f403382f, arrayList, this.f403384h));
        return f0Var;
    }
}
