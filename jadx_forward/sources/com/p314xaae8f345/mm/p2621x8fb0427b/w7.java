package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class w7 extends l75.n0 implements xg3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f277841f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.u7.f277796r, "FriendUser")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f277842d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f277843e;

    public w7(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.u7.f277796r, "FriendUser", null);
        this.f277843e = new com.p314xaae8f345.mm.p2621x8fb0427b.v7(this);
        this.f277842d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u7) f0Var;
        if (u7Var == null) {
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(u7Var);
        if (!mo880xb970c2b9) {
            return mo880xb970c2b9;
        }
        l75.v0 v0Var = this.f277843e;
        if (!v0Var.d(u7Var)) {
            return mo880xb970c2b9;
        }
        v0Var.c();
        return mo880xb970c2b9;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u7) f0Var;
        iz5.a.g("FriendUser NULL !", u7Var != null);
        java.lang.String str = u7Var.f66597xdd77ad16;
        if (!(this.f277842d.m("FriendUser", "", u7Var.mo9763xeb27878e()) > 0)) {
            return false;
        }
        l75.v0 v0Var = this.f277843e;
        if (!v0Var.d(u7Var)) {
            return true;
        }
        v0Var.c();
        return true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.u7 y0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.u7();
        android.database.Cursor D = this.f277842d.D("FriendUser", null, "encryptUsername = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            u7Var.mo9015xbf5d97fd(D);
        }
        D.close();
        return u7Var;
    }
}
