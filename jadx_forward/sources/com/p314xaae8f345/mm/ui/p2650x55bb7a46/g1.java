package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class g1 extends wu5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282049d;

    public g1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b, java.lang.String str) {
        this.f282049d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        qk.o b17;
        boolean a17 = gm0.j1.a();
        java.lang.String str = this.f282049d;
        if (a17 && (b17 = r01.z.b(str)) != null) {
            if (b17.F0()) {
                return "_EnterpriseChat";
            }
            if (b17.I0()) {
                return "_EnterpriseFatherBiz";
            }
            if (b17.G0()) {
                return "_EnterpriseChildBiz";
            }
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? "_chatroom" : com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) ? "_bottle" : com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str) ? "_QQ" : "";
    }
}
