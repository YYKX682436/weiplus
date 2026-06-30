package us2;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f512042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt3.r f512043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f512044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f512045h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f512046i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ us2.d f512047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, vt3.r rVar, int i17, int i18, int i19, us2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512042e = z17;
        this.f512043f = rVar;
        this.f512044g = i17;
        this.f512045h = i18;
        this.f512046i = i19;
        this.f512047m = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new us2.m(this.f512042e, this.f512043f, this.f512044g, this.f512045h, this.f512046i, this.f512047m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        java.lang.Object g18;
        rt3.a aVar;
        long j17;
        long intValue;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f512041d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!this.f512042e) {
                vt3.r rVar = this.f512043f;
                if (rVar != null && rVar.f521575d) {
                    rt3.e eVar = us2.u.f512092l;
                    this.f512041d = 2;
                    eVar.getClass();
                    g18 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new rt3.c(eVar, null, null), this);
                    if (g18 == aVar2) {
                        return aVar2;
                    }
                    aVar = (rt3.a) g18;
                }
            }
            rt3.e eVar2 = us2.u.f512092l;
            int i18 = this.f512044g;
            int i19 = this.f512045h;
            int i27 = this.f512046i;
            us2.d dVar = this.f512047m;
            vt3.n nVar = dVar.f512010b;
            java.lang.Long l17 = new java.lang.Long(dVar.f512009a);
            this.f512041d = 1;
            eVar2.getClass();
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new rt3.b(i18, i19, i27, nVar, eVar2, l17, null, null), this);
            if (g17 == aVar2) {
                return aVar2;
            }
            aVar = (rt3.a) g17;
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
            aVar = (rt3.a) g17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g18 = obj;
            aVar = (rt3.a) g18;
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob:load data failed");
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: maxAge: " + aVar.f481042b + " continue_flag: " + aVar.f481043c);
        java.lang.Object obj2 = us2.u.f512087g;
        boolean z17 = this.f512042e;
        us2.d dVar2 = this.f512047m;
        vt3.r rVar2 = this.f512043f;
        int i28 = this.f512044g;
        synchronized (obj2) {
            if (z17) {
                r45.s46 s46Var = aVar.f481046f;
                j17 = s46Var != null ? s46Var.f467035d : 0L;
            } else {
                j17 = dVar2.f512009a;
            }
            if (j17 != dVar2.f512009a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: realTabId: " + j17 + ", cacheKey.tabId: " + dVar2.f512009a);
            }
            if (z17) {
                r45.s46 s46Var2 = aVar.f481046f;
                java.lang.String str = s46Var2 != null ? s46Var2.f467036e : null;
                if (str == null) {
                    str = "";
                }
                rVar2 = new vt3.r(j17, str, dVar2.f512010b, s46Var2 != null && s46Var2.f467038g == 3);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar2);
            }
            us2.d dVar3 = new us2.d(j17, dVar2.f512010b);
            java.util.ArrayList arrayList = aVar.f481041a;
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                if (hashSet.add(((vt3.p) obj3).f521553b)) {
                    arrayList2.add(obj3);
                }
            }
            java.util.Map map = us2.u.f512088h;
            if (((java.util.HashMap) map).get(new java.lang.Integer(i28)) == null) {
                ((java.util.HashMap) map).put(new java.lang.Integer(i28), new java.util.HashMap());
            }
            boolean z18 = aVar.f481043c == 0;
            if (rVar2.f521575d) {
                intValue = java.lang.System.currentTimeMillis();
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.Integer num = new java.lang.Integer(aVar.f481042b);
                intValue = currentTimeMillis + (((num.intValue() != 0 ? num : null) != null ? r6.intValue() : 300) * 1000);
            }
            us2.a aVar3 = new us2.a(intValue, new us2.b(rVar2, z17, kz5.n0.V0(arrayList2), aVar.f481044d, z18));
            java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(new java.lang.Integer(i28));
            if (map2 != null) {
            }
            if (z17) {
                us2.u.f512094n = aVar.f481047g;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("getOrCreateRequestJob: tabItem: ");
            sb6.append(rVar2);
            sb6.append(", reachEnd: ");
            sb6.append(z18);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
