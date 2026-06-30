package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class c6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21363x65d29512 f279611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f279612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f279614g;

    public c6(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512, boolean z17, java.lang.String str) {
        this.f279614g = c21357x5e7365bb;
        this.f279611d = c21363x65d29512;
        this.f279612e = z17;
        this.f279613f = str;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b;
        jz5.l lVar = (jz5.l) obj;
        if (((java.lang.Boolean) lVar.f384367e).booleanValue()) {
            int intValue = ((java.lang.Integer) lVar.f384366d).intValue();
            com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512 = this.f279611d;
            oc2.k kVar = c21363x65d29512.S2;
            if ((kVar == null || (c13738xbdff117b = ((oc2.n) kVar).f425762d) == null || intValue != c13738xbdff117b.hashCode()) ? false : true) {
                boolean z17 = this.f279612e;
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f279614g;
                if (z17 && !c21357x5e7365bb.F) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged]safeReportFinderLiveRedDotExpose return for not in findEntrance");
                    return;
                }
                zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                java.lang.String str = this.f279613f + "_DslRender";
                java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                ((c61.w8) paVar).fj(str, true, true, c21357x5e7365bb.G0(c21363x65d29512));
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(c21357x5e7365bb, this, true);
                c21357x5e7365bb.J1 = null;
            }
        }
    }
}
