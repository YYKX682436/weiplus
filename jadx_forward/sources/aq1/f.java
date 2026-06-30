package aq1;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f94575d;

    public f(aq1.e eVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f94575d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = ((e21.j) this.f94575d).f328071f;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                xg3.q0 q0Var = (xg3.q0) it.next();
                if (q0Var.b() == 2) {
                    hashSet.add(x51.j1.g(((r45.tn4) new r45.tn4().mo11468x92b714fd(q0Var.a())).f468122d));
                } else if (q0Var.b() == 54) {
                    hashSet.add(((r45.wn4) new r45.wn4().mo11468x92b714fd(q0Var.a())).f470844d);
                } else if (q0Var.b() == 60) {
                    hashSet.add(((r45.qo4) new r45.qo4().mo11468x92b714fd(q0Var.a())).f465681d);
                } else if (q0Var.b() == 74) {
                    hashSet.add(((r45.qn4) new r45.qn4().mo11468x92b714fd(q0Var.a())).f465640d.f454289d);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BigBallContactAssemblerImpl", e17, "BaseProtoBuf parseFrom error!", new java.lang.Object[0]);
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((c01.k7) c01.n8.a()).b(str, 32, null);
            }
        }
    }
}
