package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129090a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129091b;

    public v1(boolean z17, boolean z18) {
        this.f129090a = z17;
        this.f129091b = z18;
    }

    /* renamed from: equals */
    public boolean m32167xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1) obj;
        return this.f129090a == v1Var.f129090a && this.f129091b == v1Var.f129091b;
    }

    /* renamed from: hashCode */
    public int m32168x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f129090a) * 31) + java.lang.Boolean.hashCode(this.f129091b);
    }

    /* renamed from: toString */
    public java.lang.String m32169x9616526c() {
        return "ServicePreloadExtraArgs(skipPreloadAdWorker=" + this.f129090a + ", skipPreloadSkyline=" + this.f129091b + ')';
    }
}
