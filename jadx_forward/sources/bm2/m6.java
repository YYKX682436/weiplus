package bm2;

/* loaded from: classes10.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f103643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f103645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f103646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(bm2.o6 o6Var, hn2.d dVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, bm2.i6 i6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103643e = o6Var;
        this.f103644f = dVar;
        this.f103645g = y0Var;
        this.f103646h = i6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.m6(this.f103643e, this.f103644f, this.f103645g, this.f103646h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.m6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.gy1 gy1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f103642d;
        hn2.d dVar = this.f103644f;
        bm2.o6 o6Var = this.f103643e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            o6Var.I(2, 3, dVar);
            sf2.d3 d3Var = o6Var.f103729i;
            hn2.d dVar2 = this.f103644f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f454377d = o6Var.f103732o.f472305d;
            r45.in inVar = o6Var.f103734q;
            if (inVar != null) {
                dy1Var.f454378e = inVar.f458689d;
                dy1Var.f454379f = inVar.f458690e;
            }
            r45.ch6 ch6Var = o6Var.f103733p;
            if (ch6Var != null) {
                dy1Var.f454380g = ch6Var.f453088d;
                dy1Var.f454381h = ch6Var.f453089e;
            }
            dy1Var.f454384n = o6Var.f103731n.f345950d;
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
            this.f103642d = 1;
            obj = d3Var.r7(dVar2, dy1Var, z17, gy1Var, this);
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
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongListAdapter", "Request item done");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRequestSongListAdapter", "Request item failed");
        }
        bm2.i6 i6Var = this.f103646h;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f103645g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bm2.k6(o6Var, i6Var, dVar, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = o6Var.f103729i;
            bm2.l6 l6Var = new bm2.l6(o6Var, dVar, i6Var);
            this.f103642d = 2;
            if (d3Var2.d7(dVar, mx1Var, l6Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
