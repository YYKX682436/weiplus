package ah3;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86478d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ah3.v f86481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f86482h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86483i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ah3.n f86484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, ah3.v vVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.l lVar, ah3.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86480f = list;
        this.f86481g = vVar;
        this.f86482h = y0Var;
        this.f86483i = lVar;
        this.f86484m = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ah3.s sVar = new ah3.s(this.f86480f, this.f86481g, this.f86482h, this.f86483i, this.f86484m, interfaceC29045xdcb5ca57);
        sVar.f86479e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86478d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f86479e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRetryUsernames retryUsernames:");
            java.util.List list = this.f86480f;
            sb6.append(list);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitBatchGetContactHelperV3", sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
                if (arrayList2.size() >= 100) {
                    java.util.List S0 = kz5.n0.S0(arrayList2);
                    arrayList2.clear();
                    arrayList4.add(ah3.v.a(this.f86481g, y0Var, S0, this.f86482h, this.f86483i, this.f86484m));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList4.add(ah3.v.a(this.f86481g, y0Var, kz5.n0.S0(arrayList2), this.f86482h, this.f86483i, this.f86484m));
            }
            this.f86479e = arrayList3;
            this.f86478d = 1;
            a17 = p3325xe03a0797.p3326xc267989b.h.a(arrayList4, this);
            if (a17 == aVar) {
                return aVar;
            }
            arrayList = arrayList3;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            ?? r27 = (java.util.List) this.f86479e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            arrayList = r27;
            a17 = obj;
        }
        java.util.Iterator it6 = ((java.lang.Iterable) a17).iterator();
        while (it6.hasNext()) {
            arrayList.addAll((java.util.List) it6.next());
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitBatchGetContactHelperV3", "handleRetryUsernames retryUsernames.isNotEmpty() ");
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f86482h;
            yz5.l lVar = this.f86483i;
            ah3.n nVar = this.f86484m;
            this.f86479e = null;
            this.f86478d = 2;
            ah3.v vVar = this.f86481g;
            vVar.getClass();
            java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new ah3.s(arrayList, vVar, y0Var2, lVar, nVar, null), this);
            if (f17 != pz5.a.f440719d) {
                f17 = f0Var;
            }
            if (f17 == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
