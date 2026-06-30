package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kf implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f285863d;

    /* renamed from: e, reason: collision with root package name */
    public final ot0.q f285864e;

    public kf(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285863d = str;
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            this.f285864e = ot0.q.v(U1);
        } else {
            this.f285864e = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        ot0.a aVar;
        boolean z17;
        java.util.List list;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kf kfVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kf) obj;
        ot0.q qVar = this.f285864e;
        if (qVar == null || kfVar.f285864e == null || (aVar = (ot0.a) qVar.y(ot0.a.class)) == null || aVar.f429882e) {
            return false;
        }
        ot0.q qVar2 = kfVar.f285864e;
        ot0.a aVar2 = (ot0.a) qVar2.y(ot0.a.class);
        if (aVar2 == null || aVar2.f429882e) {
            return false;
        }
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        java.lang.String str = qVar.f430226o2;
        ((oh1.k2) x0Var).getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (list = (java.util.List) ((java.util.HashMap) oh1.k2.f426780e).get(this.f285863d)) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(((oh1.e2) it.next()).f426738b)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 && aVar.Q && aVar2.Q && java.util.Objects.equals(qVar.f430226o2, qVar2.f430226o2);
    }
}
