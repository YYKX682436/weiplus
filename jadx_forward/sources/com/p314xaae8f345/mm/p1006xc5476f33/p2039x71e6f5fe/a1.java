package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class a1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd0.n2 f240193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 f240194c;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, java.lang.String str, kd0.n2 n2Var) {
        this.f240194c = c17263x2beb5636;
        this.f240192a = str;
        this.f240193b = n2Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        if (aq3Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636 = this.f240194c;
        c17263x2beb5636.f240181e = aq3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636.a(c17263x2beb5636, aq3Var);
        c17263x2beb5636.f240186m.put(this.f240192a, aq3Var);
        kd0.n2 n2Var = this.f240193b;
        if (n2Var != null) {
            n2Var.a();
        }
    }
}
