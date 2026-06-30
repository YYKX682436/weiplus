package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.r4 f221273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.r4 r4Var) {
        super(2);
        this.f221272d = q5Var;
        this.f221273e = r4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.r4 r4Var = this.f221273e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221272d;
        if (booleanValue) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
            q5Var.a(r4Var.f221276e + ":ok", null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
            if (str == null) {
                str = r4Var.f221276e + ":fail";
            }
            q5Var.a(str, null);
        }
        return jz5.f0.f384359a;
    }
}
