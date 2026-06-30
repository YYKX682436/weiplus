package it3;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        super(2);
        this.f376103d = activityC16983x775783e2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue % 1000 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "loadVideo onProgressChange " + longValue + '/' + longValue2);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.f237144t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe V6 = this.f376103d.V6();
        if (V6 != null) {
            V6.m66919xbf54e136(((float) longValue) / ((float) longValue2));
        }
        return jz5.f0.f384359a;
    }
}
