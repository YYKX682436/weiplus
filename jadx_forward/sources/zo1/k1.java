package zo1;

/* loaded from: classes5.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        super(1);
        this.f556197d = activityC12868xd8a7d79e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556197d;
        activityC12868xd8a7d79e.f174358q = intValue;
        if ((intValue & 1) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12868xd8a7d79e.f174359r;
            if (c12853x6acde7c9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            c12853x6acde7c9.f174267h = 0L;
            activityC12868xd8a7d79e.X6();
        }
        activityC12868xd8a7d79e.W6();
        return jz5.f0.f384359a;
    }
}
