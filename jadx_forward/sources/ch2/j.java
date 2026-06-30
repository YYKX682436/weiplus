package ch2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f122912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f122913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f122914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sf2.d3 d3Var, hn2.d dVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122912e = d3Var;
        this.f122913f = dVar;
        this.f122914g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.j(this.f122912e, this.f122913f, this.f122914g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.gy1 gy1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122911d;
        sf2.d3 d3Var = this.f122912e;
        hn2.d dVar = this.f122913f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var2 = this.f122912e;
            hn2.d dVar2 = this.f122913f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f454377d = this.f122914g;
            boolean z17 = dVar.f364049l;
            hn2.e eVar = dVar.f364050m;
            if (eVar != null) {
                gy1Var = new r45.gy1();
                gy1Var.f457168d = eVar.f364052a;
                gy1Var.f457169e = eVar.f364053b;
                gy1Var.f457170f = eVar.f364054c;
            } else {
                gy1Var = null;
            }
            this.f122911d = 1;
            obj = d3Var2.r7(dVar2, dy1Var, z17, gy1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                d3Var.f488639p = null;
                d3Var.f488640q = null;
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVController", "Request item done");
            ch2.i iVar = ch2.i.f122903d;
            this.f122911d = 2;
            if (d3Var.d7(dVar, mx1Var, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVController", "Request item failed");
        }
        d3Var.f488639p = null;
        d3Var.f488640q = null;
        return jz5.f0.f384359a;
    }
}
