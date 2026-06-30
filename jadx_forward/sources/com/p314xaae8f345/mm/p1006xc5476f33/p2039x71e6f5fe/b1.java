package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class b1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 f240213b;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, java.lang.String str) {
        this.f240213b = c17263x2beb5636;
        this.f240212a = str;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636 = this.f240213b;
        if (c17263x2beb5636.f240181e == c17263x2beb5636.f240182f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "net call back after 1s");
            return;
        }
        if (!c17263x2beb5636.f240188o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "enableCallback false");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.ScanCodeSheetItemLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb56362 = this.f240213b;
        c17263x2beb56362.f240181e = aq3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636.a(c17263x2beb56362, aq3Var);
        this.f240213b.f240186m.put(this.f240212a, aq3Var);
        kd0.n2 n2Var = this.f240213b.f240183g;
        if (n2Var != null) {
            n2Var.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb56363 = this.f240213b;
        kd0.o2 o2Var = c17263x2beb56363.f240184h;
        if (o2Var != null) {
            o2Var.K0(this.f240212a, c17263x2beb56363.f240181e);
        }
    }
}
