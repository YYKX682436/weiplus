package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public final class f5 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f282019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282020b;

    public f5(boolean z17, int i17) {
        this.f282019a = z17;
        this.f282020b = i17;
    }

    /* renamed from: equals */
    public boolean m79558xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5 f5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5) obj;
        return this.f282019a == f5Var.f282019a && this.f282020b == f5Var.f282020b;
    }

    /* renamed from: hashCode */
    public int m79559x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f282019a) * 31) + java.lang.Integer.hashCode(this.f282020b);
    }

    /* renamed from: toString */
    public java.lang.String m79560x9616526c() {
        return "IsFromNewsJump(value=" + this.f282019a + ", unreadCount=" + this.f282020b + ')';
    }
}
