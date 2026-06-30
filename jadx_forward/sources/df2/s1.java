package df2;

/* loaded from: classes10.dex */
public final class s1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.w1 f312815d;

    public s1(df2.w1 w1Var) {
        this.f312815d = w1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var;
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            int m75939xb282bd08 = tm1Var.m75939xb282bd08(0);
            df2.w1 w1Var = this.f312815d;
            if (w1Var.f313183n.contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveApplyMicGuideController", "observe: has shown this guide, msgType=" + m75939xb282bd08);
                return;
            }
            w1Var.f313183n.add(java.lang.Integer.valueOf(m75939xb282bd08));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveApplyMicGuideController", "showBubble info: " + tm1Var.mo12245xcc313de3());
            android.content.Context O6 = w1Var.O6();
            android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
            if (activity != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) w1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
                android.view.ViewGroup viewGroup = (ag0Var == null || (q30Var = ag0Var.f193417z) == null) ? null : q30Var.f201000d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = w1Var.f372632e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
                if (k0Var != null && viewGroup != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc rcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc(activity);
                    rcVar.f201162k = tm1Var.m75939xb282bd08(1);
                    java.lang.String m75945x2fec8307 = tm1Var.m75945x2fec8307(3);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    rcVar.f201159h = m75945x2fec8307;
                    rcVar.f201163l = true;
                    rcVar.f201160i = "ApplyMicGuideBubble";
                    rcVar.f201154c = df2.t1.f312928d;
                    rcVar.f201161j = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sc.f201283e;
                    rcVar.f201155d = df2.u1.f313026d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc ycVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc(rcVar);
                    w1Var.f313184o = ycVar;
                    df2.v1 v1Var = df2.v1.f313110d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc rcVar2 = ycVar.f201965a;
                    rcVar2.getClass();
                    rcVar2.f201153b = v1Var;
                    ycVar.b(viewGroup, k0Var.m57691xa0fa63f9());
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveApplyMicGuideController", "observe: post null");
        }
    }
}
