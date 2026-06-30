package pv0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pv0.j f440078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv0.y f440080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f440081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f440082i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pv0.j jVar, java.lang.String str, pv0.y yVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440078e = jVar;
        this.f440079f = str;
        this.f440080g = yVar;
        this.f440081h = c4190xd8dd3713;
        this.f440082i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pv0.r(this.f440078e, this.f440079f, this.f440080g, this.f440081h, this.f440082i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pv0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fv0.d c17;
        dw0.c k76;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440077d;
        pv0.j jVar = this.f440078e;
        pv0.y yVar = this.f440080g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = jVar.ordinal();
            if (ordinal == 0) {
                c17 = fv0.e.c(com.p314xaae8f345.p457x3304c6.p476x11d36527.g.TimbreVoiceChange);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                c17 = fv0.e.c(com.p314xaae8f345.p457x3304c6.p476x11d36527.g.TimbreTTS);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadTTSTimbreList: roleId ");
            java.lang.String str = this.f440079f;
            sb6.append(str);
            sb6.append(" scene ");
            sb6.append(c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimbrePanelUIC", sb6.toString());
            gw0.e eVar = yVar.f440094o;
            this.f440077d = 1;
            if (eVar.c(str, this.f440081h, c17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (this.f440082i && (k76 = yVar.k7()) != null) {
            yVar.f440096q.a(null, k76, jVar);
        }
        return jz5.f0.f384359a;
    }
}
