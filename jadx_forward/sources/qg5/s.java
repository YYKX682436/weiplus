package qg5;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444700d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f444702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444703g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444704h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qg5.l0 l0Var, java.util.List list, java.util.List list2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444702f = l0Var;
        this.f444703g = list;
        this.f444704h = list2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qg5.s sVar = new qg5.s(this.f444702f, this.f444703g, this.f444704h, interfaceC29045xdcb5ca57);
        sVar.f444701e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.z zVar;
        p3325xe03a0797.p3326xc267989b.z zVar2;
        p3325xe03a0797.p3326xc267989b.z zVar3;
        p3325xe03a0797.p3326xc267989b.z zVar4;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444700d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f444701e;
            qg5.l0 service = this.f444702f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
            if (!jm0.g.class.isAssignableFrom(sy.g.class)) {
                throw new java.lang.IllegalArgumentException(qg5.l0.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(sy.g.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            this.f444701e = y0Var;
            this.f444700d = 1;
            obj = ((sy.g) ((jm0.g) a17)).T6(this.f444703g, 15000L, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = (java.util.List) obj;
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.util.List list2 = this.f444704h;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "no cdnLocators, likely due to network issue");
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                c01.nb nbVar = ((c01.ob) it.next()).f118907b;
                if (nbVar != null && (zVar4 = nbVar.f118885b) != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(zVar4, null, 1, null);
                }
            }
            return f0Var;
        }
        if (list2.size() != list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsStagingFeatureService", "cdnLocators size mismatch, cdnLocatorsSize=" + list.size() + ", recordsSize=" + list2.size());
        }
        java.util.Iterator it6 = ((java.util.ArrayList) kz5.n0.a1(list2, list)).iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            c01.ob obVar = (c01.ob) lVar.f384366d;
            sy.a aVar2 = (sy.a) lVar.f384367e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = obVar.f118906a;
            boolean z17 = f9Var != null && te5.y0.b(f9Var, true);
            c01.nb nbVar2 = obVar.f118907b;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = obVar.f118906a;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("message is expired, skip, msgId=");
                sb6.append(f9Var2 != null ? f9Var2.m124847x74d37ac6() : 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsStagingFeatureService", sb6.toString());
                if (nbVar2 != null && (zVar = nbVar2.f118885b) != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(zVar, null, 1, null);
                }
            } else {
                if (aVar2 != null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cdnLocator is not null, msgId=");
                    sb7.append(f9Var2 != null ? f9Var2.m124847x74d37ac6() : 0L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsStagingFeatureService", sb7.toString());
                    if (((nbVar2 == null || (zVar3 = nbVar2.f118885b) == null) ? null : java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a0) zVar3).U(new c01.mb(aVar2.f495308a, aVar2.f495309b)))) == null) {
                    }
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("cdnLocator is null, msgId=");
                sb8.append(f9Var2 != null ? f9Var2.m124847x74d37ac6() : 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", sb8.toString());
                if (nbVar2 != null && (zVar2 = nbVar2.f118885b) != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(zVar2, null, 1, null);
                }
            }
        }
        return f0Var;
    }
}
