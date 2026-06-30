package jm3;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f381857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(boolean z17) {
        super(2);
        this.f381857d = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        fm3.q itemData = (fm3.q) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
        c17.f141022r = c17.b("FeedId", itemData.a(), true);
        c17.f141023s = c17.b("FinderUin", itemData.b(), true);
        int i17 = fm3.g0.f345605c;
        if (i17 == 3) {
            c17.f141026v = fm3.g0.f345606d;
        }
        c17.f141028x = intValue;
        c17.f141029y = i17;
        c17.A = itemData.d();
        c17.f141030z = this.f381857d ? 1L : 2L;
        c17.f141015k = 4L;
        c17.k();
        c17.o();
        return jz5.f0.f384359a;
    }
}
