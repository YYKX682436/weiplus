package fu0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f348312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f348313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fu0.l f348314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f348315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f348316h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(org.json.JSONObject jSONObject, fu0.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348313e = jSONObject;
        this.f348314f = lVar;
        this.f348315g = c16997xb0aa383a;
        this.f348316h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fu0.h(this.f348313e, this.f348314f, this.f348315g, this.f348316h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fu0.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348312d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                org.json.JSONObject jSONObject = this.f348313e;
                this.f348312d = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new fu0.o(jSONObject, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            mVar = (fu0.m) obj;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.MusicPicking", "prepareRecommendContext: exception=" + e17.getMessage());
            mVar = null;
        }
        fu0.l lVar = this.f348314f;
        boolean z17 = lVar.f348322c;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            return f0Var;
        }
        try {
            fu0.l.a(lVar, this.f348315g, this.f348316h, mVar);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.MusicPicking", "showMusicPicker: exception=" + e18.getMessage());
            lVar.c(null, false);
        }
        return f0Var;
    }
}
