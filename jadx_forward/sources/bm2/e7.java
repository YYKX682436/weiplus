package bm2;

/* loaded from: classes10.dex */
public final class e7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f103402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f103403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103404i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(bm2.k7 k7Var, hn2.d dVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, bm2.t6 t6Var, r45.yx1 yx1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103400e = k7Var;
        this.f103401f = dVar;
        this.f103402g = y0Var;
        this.f103403h = t6Var;
        this.f103404i = yx1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.e7(this.f103400e, this.f103401f, this.f103402g, this.f103403h, this.f103404i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.e7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.gy1 gy1Var;
        java.lang.Object r76;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f103399d;
        hn2.d dVar = this.f103401f;
        bm2.k7 k7Var = this.f103400e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var = k7Var.f103573i;
            hn2.d dVar2 = this.f103401f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f454377d = 2;
            boolean z17 = dVar.f364049l;
            hn2.e eVar = dVar.f364050m;
            if (eVar != null) {
                r45.gy1 gy1Var2 = new r45.gy1();
                gy1Var2.f457168d = eVar.f364052a;
                gy1Var2.f457169e = eVar.f364053b;
                gy1Var2.f457170f = eVar.f364054c;
                gy1Var = gy1Var2;
            } else {
                gy1Var = null;
            }
            this.f103399d = 1;
            r76 = d3Var.r7(dVar2, dy1Var, z17, gy1Var, this);
            if (r76 == aVar) {
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
            r76 = obj;
        }
        r45.mx1 mx1Var = (r45.mx1) r76;
        if (mx1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongPlayListAdapter", "Request item done");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRequestSongPlayListAdapter", "Request item failed");
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f103402g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bm2.c7(this.f103403h, this.f103400e, this.f103404i, this.f103401f, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = k7Var.f103573i;
            bm2.d7 d7Var = bm2.d7.f103381d;
            this.f103399d = 2;
            if (d3Var2.d7(dVar, mx1Var, d7Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
