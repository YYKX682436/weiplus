package ly0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.n f403733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ly0.d f403735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ly0.n nVar, java.lang.String str, ly0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403733e = nVar;
        this.f403734f = str;
        this.f403735g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ly0.f(this.f403733e, this.f403734f, this.f403735g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403732d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ly0.n nVar = this.f403733e;
                java.lang.String str = this.f403734f;
                ly0.d dVar = this.f403735g;
                this.f403732d = 1;
                m143895xf1229813 = nVar.e(str, dVar, this);
                if (m143895xf1229813 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                m143895xf1229813 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
            }
        } catch (java.lang.Exception e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17));
        }
        return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
    }
}
