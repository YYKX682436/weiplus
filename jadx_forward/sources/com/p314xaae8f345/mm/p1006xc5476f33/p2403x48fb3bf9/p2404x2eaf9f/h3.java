package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f263378a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f263379b;

    public h3(boolean z17, boolean z18) {
        this.f263378a = z17;
        this.f263379b = z18;
    }

    /* renamed from: equals */
    public boolean m74152xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3) obj;
        return this.f263378a == h3Var.f263378a && this.f263379b == h3Var.f263379b;
    }

    /* renamed from: hashCode */
    public int m74153x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f263378a) * 31) + java.lang.Boolean.hashCode(this.f263379b);
    }

    /* renamed from: toString */
    public java.lang.String m74154x9616526c() {
        return "OverrideUrlResult(override=" + this.f263378a + ", result=" + this.f263379b + ')';
    }
}
