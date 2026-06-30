package gu0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f357313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f357314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gu0.k2 k2Var, org.json.JSONObject jSONObject, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357312e = k2Var;
        this.f357313f = jSONObject;
        this.f357314g = z17;
        this.f357315h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.o1(this.f357312e, this.f357313f, this.f357314g, this.f357315h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357311d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                t26.a aVar2 = ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h;
                gu0.n1 n1Var = new gu0.n1(this.f357312e, null);
                this.f357311d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(aVar2, n1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "releaseAndFinish: releaseResources failed: " + e17.getMessage());
        }
        this.f357312e.f357260c.mo146xb9724478(this.f357313f);
        p3325xe03a0797.p3326xc267989b.v2.c(this.f357312e.f357269l, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f357312e.f357261d, null, 1, null);
        boolean z17 = this.f357314g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.SessionMgr", "clearSession");
        gu0.l2.f357294a = null;
        if (z17) {
            gu0.l2.f357296c = null;
            gu0.l2.f357295b = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "releaseAndFinish: cleanup done");
        yz5.a aVar3 = this.f357315h;
        if (aVar3 != null) {
            aVar3.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
