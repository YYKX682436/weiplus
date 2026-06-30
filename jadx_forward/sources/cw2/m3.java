package cw2;

/* loaded from: classes10.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f305394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f305396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(r45.nw1 nw1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b, java.lang.Long l17, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f305394e = nw1Var;
        this.f305395f = c15182x1607686b;
        this.f305396g = l17;
        this.f305397h = str;
        this.f305398i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw2.m3(this.f305394e, this.f305395f, this.f305396g, this.f305397h, this.f305398i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.m3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ne2.k m61331xf1700852;
        ne2.k m61331xf17008522;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f305393d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            cw2.l3 l3Var = new cw2.l3(this.f305396g, this.f305397h, this.f305394e, this.f305398i, this.f305395f, null);
            this.f305393d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, l3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj().L0(this.f305394e.m75942xfb822ef2(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePlayView", "charge live invalid!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = this.f305395f;
            mn0.b0 txLivePlayer = c15182x1607686b.getTxLivePlayer();
            if (txLivePlayer != null) {
                mn0.b0.C(txLivePlayer, false, false, false, 6, null);
            }
            c15182x1607686b.X();
            if (c15182x1607686b.isLiveFreeTimerInit) {
                m61331xf1700852 = c15182x1607686b.m61331xf1700852();
                if (m61331xf1700852.e()) {
                    m61331xf17008522 = c15182x1607686b.m61331xf1700852();
                    cw2.wa waVar = c15182x1607686b.f212140n;
                    ne2.e.a(m61331xf17008522, (waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) ? 0L : c14989xf862ae88.getLiveId(), true, false, 4, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
