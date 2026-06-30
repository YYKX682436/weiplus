package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes15.dex */
public final class j9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f210921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f210922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f210923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f210922e = activityC15041xa4ea2f4;
        this.f210923f = i17;
        this.f210924g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j9(this.f210922e, this.f210923f, this.f210924g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f210921d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f210922e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f210921d = 1;
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
        int i18 = this.f210923f;
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user picked wepay, precheckType=" + i18);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
            activityC15041xa4ea2f4.r7(this.f210924g, i18);
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user picked CTID, precheckType=" + i18);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
            activityC15041xa4ea2f4.u7(true, i18);
        } else if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[CTID] external: user cancelled, precheckType=" + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.o7(this.f210922e, false, 0, null, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
