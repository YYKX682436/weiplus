package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class a6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21363x65d29512 f278652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f278653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f278654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f278655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f278656h;

    public a6(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512, boolean z17, p012xc85e97e9.p093xedfae76a.y yVar, boolean z18) {
        this.f278656h = c21357x5e7365bb;
        this.f278652d = c21363x65d29512;
        this.f278653e = z17;
        this.f278654f = yVar;
        this.f278655g = z18;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b;
        jz5.l lVar = (jz5.l) obj;
        if (!((java.lang.Boolean) lVar.f384367e).booleanValue() || (c21363x65d29512 = this.f278652d) == null) {
            return;
        }
        int intValue = ((java.lang.Integer) lVar.f384366d).intValue();
        oc2.k kVar = c21363x65d29512.S2;
        if ((kVar == null || (c13738xbdff117b = ((oc2.n) kVar).f425762d) == null || intValue != c13738xbdff117b.hashCode()) ? false : true) {
            boolean z17 = this.f278653e;
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f278656h;
            if (z17 && !c21357x5e7365bb.F) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] reportFindPageRedDotExpose return because not in find page!");
            } else {
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this.f278654f, c21357x5e7365bb.I1, true);
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).cj(this.f278655g, c21363x65d29512.H0(), c21363x65d29512.B0(), c21363x65d29512.C0());
            }
        }
    }
}
