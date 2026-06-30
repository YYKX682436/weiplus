package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s8 f282736a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f282737b;

    /* renamed from: c, reason: collision with root package name */
    public final fk4.u f282738c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282739d;

    public mb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s8 currentPlayMode, boolean z17, fk4.u uVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentPlayMode, "currentPlayMode");
        this.f282736a = currentPlayMode;
        this.f282737b = z17;
        this.f282738c = uVar;
        this.f282739d = f9Var;
    }

    /* renamed from: equals */
    public boolean m79612xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb mbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) obj;
        return this.f282736a == mbVar.f282736a && this.f282737b == mbVar.f282737b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282738c, mbVar.f282738c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282739d, mbVar.f282739d);
    }

    /* renamed from: hashCode */
    public int m79613x8cdac1b() {
        int hashCode = ((this.f282736a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f282737b)) * 31;
        fk4.u uVar = this.f282738c;
        int hashCode2 = (hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282739d;
        return hashCode2 + (f9Var != null ? f9Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m79614x9616526c() {
        return "DebugDependencies(currentPlayMode=" + this.f282736a + ", isPlayRawVideo=" + this.f282737b + ", downloader=" + this.f282738c + ", currentMsg=" + this.f282739d + ')';
    }
}
