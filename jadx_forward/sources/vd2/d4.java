package vd2;

/* loaded from: classes3.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c) {
        super(0);
        this.f517237d = c14167x40aca97c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        km2.m E;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517237d;
        if (!c14167x40aca97c.L) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1 = c14167x40aca97c.f193026r;
            int w17 = c14329x76e637f1 != null ? c14329x76e637f1.w() : -1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f12 = c14167x40aca97c.f193026r;
            int y17 = c14329x76e637f12 != null ? c14329x76e637f12.y() : -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17);
            if (w17 == y17) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14167x40aca97c.f193025q.mo7946xf939df19();
                vd2.s1 s1Var = mo7946xf939df19 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df19 : null;
                long j17 = (s1Var == null || (E = s1Var.E(w17)) == null || (c10828x8f239b6e = E.f390662d) == null) ? 0L : c10828x8f239b6e.f150070e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onItemChecked curLiveId:" + j17 + " selectedLiveId:" + c14167x40aca97c.K);
                if (j17 != 0 && j17 != c14167x40aca97c.K) {
                    c14167x40aca97c.K = j17;
                    z17 = true;
                    return java.lang.Boolean.valueOf(z17);
                }
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
