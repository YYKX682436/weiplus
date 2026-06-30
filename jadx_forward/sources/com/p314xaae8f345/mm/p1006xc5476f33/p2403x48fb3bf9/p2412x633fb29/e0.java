package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class e0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 f264376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264378c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264379d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var, java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f264376a = h0Var;
        this.f264377b = str;
        this.f264378c = context;
        this.f264379d = str2;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewShrotcutManager", "getContactCallBack, suc = %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var = this.f264376a;
        java.lang.String str2 = this.f264377b;
        if (!z17) {
            if (h0Var != null) {
                h0Var.a(str2, false);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f2())) {
            if (h0Var != null) {
                h0Var.a(str2, false);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.b(this.f264378c, str2, this.f264379d, n17.f2(), h0Var);
        }
    }
}
