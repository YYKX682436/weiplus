package aq1;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f13042d;

    public f(aq1.e eVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f13042d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = ((e21.j) this.f13042d).f246538f;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                xg3.q0 q0Var = (xg3.q0) it.next();
                if (q0Var.b() == 2) {
                    hashSet.add(x51.j1.g(((r45.tn4) new r45.tn4().parseFrom(q0Var.a())).f386589d));
                } else if (q0Var.b() == 54) {
                    hashSet.add(((r45.wn4) new r45.wn4().parseFrom(q0Var.a())).f389311d);
                } else if (q0Var.b() == 60) {
                    hashSet.add(((r45.qo4) new r45.qo4().parseFrom(q0Var.a())).f384148d);
                } else if (q0Var.b() == 74) {
                    hashSet.add(((r45.qn4) new r45.qn4().parseFrom(q0Var.a())).f384107d.f372756d);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", e17, "BaseProtoBuf parseFrom error!", new java.lang.Object[0]);
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((c01.k7) c01.n8.a()).b(str, 32, null);
            }
        }
    }
}
