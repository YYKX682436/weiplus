package tx0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504032d;

    /* renamed from: e, reason: collision with root package name */
    public int f504033e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx0.k f504035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f504036h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f504037i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tx0.k kVar, double d17, double d18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504035g = kVar;
        this.f504036h = d17;
        this.f504037i = d18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        tx0.b bVar = new tx0.b(this.f504035g, this.f504036h, this.f504037i, interfaceC29045xdcb5ca57);
        bVar.f504034f = obj;
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.y0] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        ?? r17;
        tx0.k kVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f504033e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ?? r18 = (p3325xe03a0797.p3326xc267989b.y0) this.f504034f;
                tx0.k kVar2 = this.f504035g;
                double d17 = this.f504036h;
                double d18 = this.f504037i;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f504034f = r18;
                this.f504032d = kVar2;
                this.f504033e = 1;
                java.lang.Object a17 = tx0.k.a(kVar2, d17, d18, this);
                if (a17 == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                obj2 = a17;
                i17 = r18;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (tx0.k) this.f504032d;
                ?? r19 = (p3325xe03a0797.p3326xc267989b.y0) this.f504034f;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                obj2 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
                i17 = r19;
            }
            kVar.f504060d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(obj2);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            r17 = i17;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            r17 = i17;
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            tx0.k kVar3 = this.f504035g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LocationHelper", m143898xd4a2fc34, "", new java.lang.Object[0]);
            kVar3.f504060d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(m143898xd4a2fc34)));
        }
        tx0.k kVar4 = this.f504035g;
        synchronized (r17) {
            try {
                yz5.l lVar = kVar4.f504061e;
                if (lVar != null) {
                    p3321xbce91901.C29043x91b2b43d c29043x91b2b43d = kVar4.f504060d;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(c29043x91b2b43d != null ? c29043x91b2b43d.getValue() : p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Location")))));
                }
                kVar4.f504061e = null;
            } catch (java.lang.Throwable th7) {
                throw th7;
            }
        }
        return jz5.f0.f384359a;
    }
}
