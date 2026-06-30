package h05;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h05.e f359463d;

    public d(h05.e eVar) {
        this.f359463d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui.ActivityC19561x3f936717 activityC19561x3f936717 = this.f359463d.f359464d;
        r45.ki6 ki6Var = activityC19561x3f936717.f270091e;
        activityC19561x3f936717.getClass();
        java.util.Iterator it = ki6Var.f460258d.iterator();
        while (it.hasNext()) {
            r45.ji6 ji6Var = (r45.ji6) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ji6Var.f459376e) && ji6Var.f459377f.size() > 0) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(activityC19561x3f936717.mo55332x76847179(), null);
                c21568x1a71b23b.L(ji6Var.f459376e);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC19561x3f936717.f270090d).d(c21568x1a71b23b, -1);
                android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(ji6Var.f459375d), ji6Var.f459376e);
                java.util.Iterator it6 = ji6Var.f459377f.iterator();
                while (it6.hasNext()) {
                    r45.oi6 oi6Var = (r45.oi6) it6.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oi6Var.f463822d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oi6Var.f463824f)) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(activityC19561x3f936717.mo55332x76847179());
                        c21541x1c1b08fe.C(oi6Var.f463822d);
                        c21541x1c1b08fe.f279318v = false;
                        c21541x1c1b08fe.L = oi6Var.f463823e;
                        c21541x1c1b08fe.L(oi6Var.f463824f);
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC19561x3f936717.f270090d).d(c21541x1c1b08fe, -1);
                        activityC19561x3f936717.f270092f.add(oi6Var);
                        activityC19561x3f936717.f270093g.put(oi6Var, pair);
                    }
                }
            }
        }
    }
}
