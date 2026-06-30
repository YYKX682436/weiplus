package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class c1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 f240249b;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, java.lang.String str) {
        this.f240249b = c17263x2beb5636;
        this.f240248a = str;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636 = this.f240249b;
        c17263x2beb5636.f240181e = aq3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636.a(c17263x2beb5636, aq3Var);
        java.util.HashMap hashMap = c17263x2beb5636.f240186m;
        java.lang.String str = this.f240248a;
        hashMap.put(str, aq3Var);
        kd0.n2 n2Var = c17263x2beb5636.f240183g;
        if (n2Var != null) {
            n2Var.a();
        }
        kd0.o2 o2Var = c17263x2beb5636.f240184h;
        if (o2Var != null) {
            o2Var.K0(str, c17263x2beb5636.f240181e);
        }
    }
}
