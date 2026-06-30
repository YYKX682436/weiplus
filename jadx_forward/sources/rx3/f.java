package rx3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f482556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.k f482558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f482559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f482560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, rx3.h hVar, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482557e = list;
        this.f482558f = kVar;
        this.f482559g = hVar;
        this.f482560h = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rx3.f(this.f482557e, this.f482558f, this.f482559g, this.f482560h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f482556d;
        java.util.ArrayList arrayList = this.f482560h;
        java.util.List<ox3.a> list = this.f482557e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j m17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.m(new p3325xe03a0797.p3326xc267989b.p3328x30012e.n(list), 0, new rx3.d(this.f482559g, null), 1, null);
            rx3.e eVar = new rx3.e(arrayList);
            this.f482556d = 1;
            if (m17.a(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (ox3.a aVar2 : list) {
            if (arrayList.contains(aVar2)) {
                arrayList2.add(aVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar2.f431254d.f497121d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExclusiveRemoteDataSource", "no avail data receive");
            }
        }
        this.f482556d = 2;
        if (this.f482558f.mo771x2f8fd3(arrayList2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
