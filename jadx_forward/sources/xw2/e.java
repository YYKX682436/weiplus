package xw2;

/* loaded from: classes10.dex */
public final class e implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 f539222d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664) {
        this.f539222d = c15387x98533664;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539222d;
        c15387x98533664.m62539xb39e1cdf(i17);
        ym5.o1 indicator = c15387x98533664.getIndicator();
        if (indicator != null) {
            indicator.mo62753xed908c5b(i17);
        }
        c15387x98533664.m62533x81cb527a();
    }
}
