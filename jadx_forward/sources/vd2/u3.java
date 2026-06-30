package vd2;

/* loaded from: classes3.dex */
public final class u3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final int f517464n;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, int i17) {
        super(c14167x40aca97c.f193025q.getContext());
        this.f517464n = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        int g17 = super.g(i17, i18, i19, i27, i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "scroll calculateDtToFit : " + g17);
        if (g17 > 0) {
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
            return g17 - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
        }
        int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
        return g17 + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int k(int i17) {
        int i18 = this.f517464n;
        return i18 > 0 ? i18 : super.k(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        int i18 = this.f517464n;
        return i18 > 0 ? i18 : super.l(i17);
    }
}
