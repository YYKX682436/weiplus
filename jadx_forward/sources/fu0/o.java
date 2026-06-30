package fu0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348338d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f348339e;

    /* renamed from: f, reason: collision with root package name */
    public int f348340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f348341g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348341g = jSONObject;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fu0.o(this.f348341g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g c17;
        java.util.List t07;
        java.util.List list;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348340f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            eu0.b a17 = eu0.b.f338227o.a(this.f348341g);
            gVar = null;
            if (a17 == null) {
                return null;
            }
            java.util.List list2 = a17.f338232e;
            java.util.List list3 = kz5.p0.f395529d;
            if (list2 == null) {
                list2 = list3;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!r26.n0.N((java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            java.util.List list4 = a17.f338233f;
            if (list4 != null) {
                list3 = list4;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                if (!r26.n0.N((java.lang.String) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            java.lang.String str = a17.f338230c;
            if (str == null) {
                str = "";
            }
            if (!(!r26.n0.N(str))) {
                str = null;
            }
            c17 = str != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str) : null;
            fu0.p pVar = fu0.p.f348342a;
            t07 = kz5.n0.t0(fu0.p.b(pVar, arrayList), fu0.p.b(pVar, arrayList2));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resolve: assetCount=");
            sb6.append(arrayList.size());
            sb6.append(", effectCount=");
            sb6.append(arrayList2.size());
            sb6.append(", resolvedImageCount=");
            sb6.append(((java.util.ArrayList) t07).size());
            sb6.append(", hasPrompt=");
            sb6.append(c17 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicRecommendCtx", sb6.toString());
            if (!t07.isEmpty()) {
                this.f348338d = c17;
                this.f348339e = t07;
                this.f348340f = 1;
                java.lang.Object a18 = fu0.p.a(pVar, t07, this);
                if (a18 == aVar) {
                    return aVar;
                }
                list = t07;
                gVar2 = c17;
                obj = a18;
            }
            return new fu0.m(t07, gVar, c17, t07.size());
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (java.util.List) this.f348339e;
        gVar2 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) this.f348338d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        t07 = list;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = gVar2;
        gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj;
        c17 = gVar3;
        return new fu0.m(t07, gVar, c17, t07.size());
    }
}
