package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class l2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public int f260945d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260946e;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260946e = activityC19082x760c9ba5;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260946e;
        activityC19082x760c9ba5.mo48632xd46dd964();
        if (bool == null || !bool.booleanValue()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = activityC19082x760c9ba5.f260826t;
            if (c0Var != null) {
                c0Var.d();
                return;
            }
            return;
        }
        java.util.List list = activityC19082x760c9ba5.F;
        if (((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[((java.util.ArrayList) list).size()];
        activityC19082x760c9ba5.getResources().getIntArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559572an);
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            strArr[i17] = ((r45.mj5) ((java.util.ArrayList) list).get(i17)).f462116d.f458400e;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activityC19082x760c9ba5.mo55332x76847179(), strArr);
        activityC19082x760c9ba5.f260826t = c0Var2;
        c0Var2.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.k2(this);
        c0Var2.i(this.f260945d);
        activityC19082x760c9ba5.f260826t.l();
    }
}
