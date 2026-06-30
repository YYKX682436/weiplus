package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f213419a;

    /* renamed from: b, reason: collision with root package name */
    public final db5.h4 f213420b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f213421c;

    public dc(boolean z17, db5.h4 h4Var, boolean z18) {
        this.f213419a = z17;
        this.f213420b = h4Var;
        this.f213421c = z18;
    }

    /* renamed from: equals */
    public boolean m62607xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dc dcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dc) obj;
        return this.f213419a == dcVar.f213419a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213420b, dcVar.f213420b) && this.f213421c == dcVar.f213421c;
    }

    /* renamed from: hashCode */
    public int m62608x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f213419a) * 31;
        db5.h4 h4Var = this.f213420b;
        return ((hashCode + (h4Var == null ? 0 : h4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f213421c);
    }

    /* renamed from: toString */
    public java.lang.String m62609x9616526c() {
        return "CustomTopMemuConfig(isShowTopMenuItem=" + this.f213419a + ", topMemuItem=" + this.f213420b + ", wxContactFirst=" + this.f213421c + ')';
    }
}
