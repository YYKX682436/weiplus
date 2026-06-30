package yc1;

/* loaded from: classes7.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f542299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f542300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f542301f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f542302g;

    /* renamed from: h, reason: collision with root package name */
    public int f542303h;

    /* renamed from: i, reason: collision with root package name */
    public int f542304i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f542306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yc1.c0 f542307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f542308p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, yc1.c0 c0Var2, org.json.JSONArray jSONArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542305m = c0Var;
        this.f542306n = i17;
        this.f542307o = c0Var2;
        this.f542308p = jSONArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yc1.b0(this.f542305m, this.f542306n, this.f542307o, this.f542308p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yc1.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yc1.c0 c0Var;
        java.lang.Object f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2;
        java.lang.String str;
        int i17;
        jc1.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f542304i;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jc1.d dVar2 = jc1.f.f380445a;
            org.json.JSONArray domainList = this.f542308p;
            e06.k m17 = e06.p.m(0, domainList.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(domainList, "$domainList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String string = domainList.getString(((kz5.x0) it).b());
                if (string != null) {
                    arrayList.add(string);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var3 = this.f542305m;
            this.f542299d = c0Var3;
            c0Var = this.f542307o;
            this.f542300e = c0Var;
            this.f542301f = dVar2;
            this.f542302g = "result";
            int i19 = this.f542306n;
            this.f542303h = i19;
            this.f542304i = 1;
            if (arrayList.isEmpty()) {
                f17 = kz5.q0.f395534d;
            } else {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                f17 = p3325xe03a0797.p3326xc267989b.z0.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.w0(arrayList, android.os.SystemClock.elapsedRealtime(), null), this);
            }
            if (f17 == aVar) {
                return aVar;
            }
            c0Var2 = c0Var3;
            str = "result";
            i17 = i19;
            java.lang.Object obj2 = f17;
            dVar = dVar2;
            obj = obj2;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f542303h;
            str = (java.lang.String) this.f542302g;
            dVar = (jc1.d) this.f542301f;
            c0Var = (yc1.c0) this.f542300e;
            c0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f542299d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.net.InetAddress inetAddress = (java.net.InetAddress) entry.getValue();
            linkedHashMap.put(key, java.lang.String.valueOf(inetAddress != null ? inetAddress.getHostAddress() : null));
        }
        c0Var2.a(i17, c0Var.q(null, dVar, kz5.b1.e(new jz5.l(str, linkedHashMap))));
        return jz5.f0.f384359a;
    }
}
