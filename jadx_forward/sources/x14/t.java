package x14;

/* loaded from: classes15.dex */
public final class t implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 f532998d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364) {
        this.f532998d = c17503x53f0d364;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364.f243188s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingPermissionView", "getLocation fail");
            return false;
        }
        java.util.List list2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364.f243188s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPermissionView", "getLocation suc");
        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
        if (gVar != null) {
            if (i11.h.e() != null) {
                i11.h.e().m(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364 = this.f532998d;
            ((i11.g) ((t60.e) gVar).wi()).b(new u60.h(f18, f17, 11, java.lang.Integer.valueOf(c17503x53f0d364.hashCode()), true), c17503x53f0d364.getOnAddr());
        }
        return false;
    }
}
