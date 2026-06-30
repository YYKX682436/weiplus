package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes15.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f210955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f210956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f210957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f210956e = activityC15041xa4ea2f4;
        this.f210957f = i17;
        this.f210958g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k9(this.f210956e, this.f210957f, this.f210958g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f210955d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f210956e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f210955d = 1;
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.i7(activityC15041xa4ea2f4, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int ordinal = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n8) obj).ordinal();
        int i18 = this.f210957f;
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user picked wepay, precheckType=" + i18);
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.g7(activityC15041xa4ea2f4);
            } else if (i18 == 4) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a m67438x827fa4bb = activityC15041xa4ea2f4.m67438x827fa4bb();
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(m67438x827fa4bb, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o8(activityC15041xa4ea2f4, null), 2, null);
            } else if (i18 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLivePostHelperUI", "[CTID] internal: unexpected precheckType=" + i18);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.k7(activityC15041xa4ea2f4, this.f210958g);
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user picked CTID, precheckType=" + i18);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
            activityC15041xa4ea2f4.u7(false, i18);
        } else if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] internal: user cancelled, precheckType=" + i18);
        }
        return jz5.f0.f384359a;
    }
}
