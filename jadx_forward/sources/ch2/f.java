package ch2;

/* loaded from: classes10.dex */
public final class f implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.q f122876d;

    public f(ch2.q qVar) {
        this.f122876d = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var;
        r45.gw1 gw1Var = (r45.gw1) obj;
        ch2.q qVar = this.f122876d;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVController", "checkKTVGuideOrderSongBubble text: " + gw1Var.m75945x2fec8307(2) + " limit: " + gw1Var.m75939xb282bd08(4));
        if (((mm2.e1) qVar.m56788xbba4bfc0(mm2.e1.class)).b7() && !zl2.r4.f555483a.x1()) {
            android.content.Context O6 = qVar.O6();
            android.view.ViewGroup viewGroup = null;
            android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
            if (activity != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = qVar.f372632e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) qVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
                if (ag0Var != null && (q30Var = ag0Var.f193417z) != null) {
                    viewGroup = q30Var.f201000d;
                }
                if (k0Var != null && viewGroup != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc rcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc(activity);
                    gw1Var.m75939xb282bd08(4);
                    rcVar.f201162k = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
                    java.lang.String m75945x2fec8307 = gw1Var.m75945x2fec8307(2);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    rcVar.f201159h = m75945x2fec8307;
                    rcVar.f201163l = true;
                    rcVar.f201160i = "GuideOrderSongBubble";
                    rcVar.f201161j = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sc.f201283e;
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc(rcVar).b(viewGroup, k0Var.m57691xa0fa63f9());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
