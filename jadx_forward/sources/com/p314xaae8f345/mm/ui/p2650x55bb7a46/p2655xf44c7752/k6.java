package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f282678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l6 f282679e;

    public k6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l6 l6Var, boolean z17) {
        this.f282679e = l6Var;
        this.f282678d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        oc5.d dVar = this.f282679e.f282711f.f282124a3;
        oc5.b bVar = dVar.f425929c;
        boolean z17 = false;
        if (!(bVar != null)) {
            if (bVar != null && (hashMap = bVar.f425918b) != null) {
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get("1,2"), java.lang.Boolean.TRUE);
            }
            if (!z17) {
                oc5.b bVar2 = dVar.f425929c;
                if (bVar2 != null) {
                    bVar2.f425918b.put("1,2", java.lang.Boolean.TRUE);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                oc5.b bVar3 = dVar.f425929c;
                if (bVar3 != null) {
                    ((ku5.t0) ku5.t0.f394148d).b(new oc5.c(bVar3, 1, 2, currentTimeMillis), "ReportSearchButtonAction");
                }
            }
        }
        if (this.f282678d) {
            ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(1, 2, tg0.e1.f500594d);
        }
    }
}
