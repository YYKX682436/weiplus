package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class x2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 f264717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f264718e;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var, r45.jv5 jv5Var) {
        this.f264717d = y2Var;
        this.f264718e = jv5Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = this.f264717d;
        fl1.o oVar = y2Var.f264728c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = bundle.getString("userName", "");
        java.lang.String string2 = y2Var.f264726a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a07);
        java.lang.String str = this.f264718e.f459664d;
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String string3 = bundle.getString("userIcon", "");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        arrayList.add(new fl1.h1(0, string, string2, str, true, com.p314xaae8f345.mm.p943x351df9c2.z.h(string3, null, false), 0));
        oVar.mo2041x3f8132ef(arrayList);
        y2Var.f264727b.c(y2Var.f264728c);
    }
}
