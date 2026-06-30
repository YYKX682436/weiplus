package ot0;

/* loaded from: classes4.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.d0 f429973a = new ot0.d0();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ot0.f0.f430005a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ot0.f0.f430005a = null;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bool.booleanValue() & ot0.f0.f430006b);
        ot0.f0.f430006b = false;
        return valueOf;
    }
}
