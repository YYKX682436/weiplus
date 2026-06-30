package q10;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f441043e = str;
        this.f441044f = str2;
        this.f441045g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q10.h(this.f441043e, this.f441044f, this.f441045g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q10.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f441042d;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBProfileUtil", "uploadAndUpdateClipboard: upload cancelled or failed: " + th6.getClass().getSimpleName() + " - " + th6.getMessage());
            str = "";
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            q10.k kVar = q10.k.f441053a;
            java.lang.String str2 = this.f441043e;
            java.lang.String str3 = this.f441044f;
            this.f441042d = 1;
            obj = q10.k.b(kVar, str2, str3, this);
            if (obj == aVar) {
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
        str = (java.lang.String) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        q10.g gVar = new q10.g(str, this.f441045g, null);
        this.f441042d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, gVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
