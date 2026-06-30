package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class un implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f287248d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f287249e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f287250f;

    public un(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287249e = 0;
        this.f287250f = x63.g.G(f9Var);
        this.f287249e = go.d.f355229a.d(f9Var.Q0(), f9Var.m124847x74d37ac6());
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un unVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) obj;
        if (this.f287250f != unVar.f287250f || this.f287249e != unVar.f287249e) {
            return false;
        }
        java.lang.Boolean bool = this.f287248d;
        java.lang.Boolean bool2 = unVar.f287248d;
        return (bool == null && bool2 == null) || (bool != null && bool2 != null && bool.booleanValue() == bool2.booleanValue());
    }
}
