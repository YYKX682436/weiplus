package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f242630a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ov6 f242631b;

    public h7(int i17, r45.ov6 ov6Var) {
        this.f242630a = i17;
        this.f242631b = ov6Var;
    }

    /* renamed from: equals */
    public boolean m69026xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7 h7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7) obj;
        return this.f242630a == h7Var.f242630a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f242631b, h7Var.f242631b);
    }

    /* renamed from: hashCode */
    public int m69027x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f242630a) * 31;
        r45.ov6 ov6Var = this.f242631b;
        return hashCode + (ov6Var == null ? 0 : ov6Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m69028x9616526c() {
        return "UserAuthAppWrapper(itemType=" + this.f242630a + ", userAuthApp=" + this.f242631b + ')';
    }
}
