package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class hm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km f213785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f213786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km kmVar, com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78) {
        super(3);
        this.f213785d = kmVar;
        this.f213786e = c18690x34c5bc78;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km kmVar = this.f213785d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kmVar.f214042q, "onFirstFrameAvailable");
        pj4.t tVar = kmVar.f214806g;
        if (tVar.f436822e == 1 && !tVar.f436823f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPlayStarted] isViewOpen=");
            sb6.append(kmVar.f214047v);
            sb6.append(" width=");
            sb6.append(intValue);
            sb6.append(" height=");
            sb6.append(intValue2);
            sb6.append(" isPlaying=");
            kk4.b player = this.f213786e.getPlayer();
            sb6.append(player != null ? java.lang.Boolean.valueOf(((kk4.v) player).s()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kmVar.f214042q, sb6.toString());
            if (!kmVar.f214047v) {
                kmVar.r();
            }
        }
        kmVar.f214044s.setVisibility(8);
        return jz5.f0.f384359a;
    }
}
