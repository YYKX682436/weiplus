package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class jp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f242741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f242743f;

    public jp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7, java.util.HashSet hashSet, int i17) {
        this.f242743f = activityC17486x3b418ac7;
        this.f242741d = hashSet;
        this.f242742e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f242741d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            activityC17486x3b418ac7 = this.f242743f;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp x17 = activityC17486x3b418ac7.f242309q.x(((java.lang.Integer) it.next()).intValue());
            java.lang.String d17 = x17.f243333c.d1();
            int i17 = this.f242742e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "username:%s index:%s", d17, java.lang.Integer.valueOf(i17));
            if (i17 == 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
                am.jw jwVar = c6082xbd84dd0a.f136360g;
                jwVar.getClass();
                jwVar.f88635a = true;
                jwVar.f88636b = x17.f243333c.d1();
                c6082xbd84dd0a.e();
                linkedList.add(x17.f243333c.d1());
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = x17.f243333c;
                z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 256);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
                am.jw jwVar2 = c6082xbd84dd0a2.f136360g;
                jwVar2.getClass();
                jwVar2.f88635a = false;
                jwVar2.f88636b = x17.f243333c.d1();
                c6082xbd84dd0a2.e();
                c01.e2.x0(x17.f243333c, true, true);
            }
        }
        if (linkedList.size() <= 0) {
            activityC17486x3b418ac7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ip(this));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
        am.oo ooVar = c5845xa0f7b469.f136154g;
        ooVar.f89103e = linkedList;
        ooVar.f89099a = 1;
        ooVar.f89100b = 5L;
        c5845xa0f7b469.e();
    }
}
