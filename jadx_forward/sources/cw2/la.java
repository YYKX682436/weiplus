package cw2;

/* loaded from: classes10.dex */
public final class la extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f305383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f305385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(r45.nw1 nw1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190, java.lang.Long l17, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f305383e = nw1Var;
        this.f305384f = c15201xe049f190;
        this.f305385g = l17;
        this.f305386h = str;
        this.f305387i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw2.la(this.f305383e, this.f305384f, this.f305385g, this.f305386h, this.f305387i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.la) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ne2.k m61546xf1700852;
        ne2.k m61546xf17008522;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f305382d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            cw2.ka kaVar = new cw2.ka(this.f305385g, this.f305386h, this.f305383e, this.f305387i, this.f305384f, null);
            this.f305382d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, kaVar, this);
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
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj().L0(this.f305383e.m75942xfb822ef2(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedPlayerView", "charge live invalid!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305384f;
            mn0.b0 player = c15201xe049f190.getPlayer();
            if (player != null) {
                mn0.b0.C(player, false, false, false, 6, null);
            }
            c15201xe049f190.Y();
            if (c15201xe049f190.N) {
                m61546xf1700852 = c15201xe049f190.m61546xf1700852();
                if (m61546xf1700852.e()) {
                    m61546xf17008522 = c15201xe049f190.m61546xf1700852();
                    cw2.wa waVar = c15201xe049f190.f212289y;
                    ne2.e.a(m61546xf17008522, (waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) ? 0L : c14989xf862ae88.getLiveId(), true, false, 4, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
