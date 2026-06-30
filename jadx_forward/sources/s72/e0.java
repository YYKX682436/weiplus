package s72;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f485552d;

    /* renamed from: e, reason: collision with root package name */
    public int f485553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f485554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f485556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.util.List list, s72.j0 j0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485554f = list;
        this.f485555g = j0Var;
        this.f485556h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.e0(this.f485554f, this.f485555g, this.f485556h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long currentTimeMillis;
        java.lang.Object Z6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485553e;
        int i18 = 1;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            o72.d2.m(8);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.f485554f);
            o72.d3 d3Var = o72.d3.f424854a;
            if (o72.d3.f424858e) {
                java.util.HashSet hashSet = s72.j0.f485602i;
                if (hashSet.size() > 0) {
                    java.util.HashSet hashSet2 = new java.util.HashSet(arrayList);
                    hashSet2.removeAll(hashSet);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSyncService", "[syncFavByIdsWithCallback] disable batch get, size=" + hashSet.size() + ", favIds=[" + kz5.n0.g0(hashSet, ",", null, null, 0, null, null, 62, null) + ']');
                    arrayList.clear();
                    arrayList.addAll(hashSet2);
                }
            }
            this.f485552d = currentTimeMillis;
            i18 = 1;
            this.f485553e = 1;
            java.util.HashSet hashSet3 = s72.j0.f485602i;
            Z6 = this.f485555g.Z6(arrayList, this);
            if (Z6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j17 = this.f485552d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            currentTimeMillis = j17;
            Z6 = obj;
        }
        s72.h hVar = (s72.h) Z6;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        int i19 = hVar.f485581c;
        int i27 = hVar.f485582d;
        if (i19 == 0 && i27 == 0) {
            i18 = 0;
        }
        int i28 = i18;
        if (i28 != 0) {
            o72.d2.j(0, i28, i19, i27, currentTimeMillis2, false);
        } else {
            o72.d2.k(0, 0, hVar.f485580b, hVar.f485579a, currentTimeMillis2, 0, false);
        }
        o72.d2.c();
        this.f485556h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
