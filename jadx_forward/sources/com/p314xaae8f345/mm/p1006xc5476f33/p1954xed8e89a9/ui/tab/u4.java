package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f236142a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f236143b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 f236144c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f236145d;

    public u4(int i17, boolean z17, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var, boolean z18) {
        this.f236142a = i17;
        this.f236143b = z17;
        this.f236144c = w1Var;
        this.f236145d = z18;
    }

    /* renamed from: equals */
    public boolean m67678xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u4 u4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u4) obj;
        return this.f236142a == u4Var.f236142a && this.f236143b == u4Var.f236143b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f236144c, u4Var.f236144c) && this.f236145d == u4Var.f236145d;
    }

    /* renamed from: hashCode */
    public int m67679x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f236142a) * 31) + java.lang.Boolean.hashCode(this.f236143b)) * 31;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var = this.f236144c;
        return ((hashCode + (w1Var == null ? 0 : w1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f236145d);
    }

    /* renamed from: toString */
    public java.lang.String m67680x9616526c() {
        return "PhotoGuideAsyncResult(identity=" + this.f236142a + ", sceneEnabled=" + this.f236143b + ", wording=" + this.f236144c + ", hasPhoto=" + this.f236145d + ')';
    }
}
