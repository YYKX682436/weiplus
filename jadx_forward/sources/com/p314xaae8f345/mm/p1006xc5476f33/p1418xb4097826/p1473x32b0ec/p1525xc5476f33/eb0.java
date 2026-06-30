package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class eb0 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f193927a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f193928b;

    public eb0(mn0.b0 b0Var, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614) {
        this.f193927a = b0Var;
        this.f193928b = c10850xc00cf614;
    }

    /* renamed from: equals */
    public boolean m56933xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0 eb0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193927a, eb0Var.f193927a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193928b, eb0Var.f193928b);
    }

    /* renamed from: hashCode */
    public int m56934x8cdac1b() {
        mn0.b0 b0Var = this.f193927a;
        int hashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f193928b;
        return hashCode + (c10850xc00cf614 != null ? c10850xc00cf614.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56935x9616526c() {
        return "LivePlayerParams(player=" + this.f193927a + ", view=" + this.f193928b + ')';
    }
}
